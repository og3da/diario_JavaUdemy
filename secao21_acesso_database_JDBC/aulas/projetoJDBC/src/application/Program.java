package application;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;

        // CONSULTANDO DADOS
        /*Statement st = null; // var p/consulta SQL
        ResultSet rs = null; // var p/resultado da consulta

        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM department");

            while (rs.next()) {
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }*/

        // INSERINDO DADOS
        /*PreparedStatement st = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "INSERT INTO seller "
                            + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                            + "VALUES "
                            + "(?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS
            );

            st.setString(1, "Carl Purple");
            st.setString(2, "CarlPurple@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("22/04/1995").getTime()));
            st.setDouble(4, 3000);
            st.setInt(5, 4);

            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("done, id = " + id);
                }
            } else {
                System.out.println("No rows affected");
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }*/

        // ATUALIZANDO DADOS
        /*PreparedStatement st = null;

        try {
            conn = DB.getConnection();

            // comando SQL
            st = conn.prepareStatement(
                    "UPDATE seller "
                            + "SET BaseSalary = BaseSalary + ? "
                            + "WHERE "
                            + "(DepartmentId = ?)"
            );

            st.setDouble(1, 200);
            st.setInt(2, 2);

            int rowsAffected = st.executeUpdate();
            System.out.println("done, rows affected: " + rowsAffected);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }*/

        // DELETANDO DADOS
        /*PreparedStatement st = null;

        try {
            conn = DB.getConnection();

            // comando SQL
            st = conn.prepareStatement(
                    "DELETE FROM department "
                            + "WHERE "
                            + "Id = ?"
            );

            st.setInt(1, 2);

            int rowsAffected = st.executeUpdate();
            System.out.println("done, rows affected: " + rowsAffected);
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }*/

        // TRANSAÇÕES
        /*
        TRANSAÇÃO É UMA OPERAÇÃO QUE DEVE ACONTECER POR COMPLETO O COMANDO NO BANCO DE DADOS
        CASO TENHA ERRO NADA DEVE SER ALTERADO P/MANTER A CONSISTENCIA DO BANCO.

        NESSE CASO ESTAMOS FORÇANDO UM ERRO SQLException PARA FAZER ROLLBACK DA TRANSAÇÃO E NADA SER ALTERADO.
        PARA TESTAR A TRANSAÇÃO COM SUCESSO BASTA COMENTAR O BLOCO QUE FORÇA ERRO.
         */
        Statement st = null;

        try {
            conn = DB.getConnection();
            conn.setAutoCommit(false); // desativando auto confirmação de transações
            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            int x = 1;
            if (x < 2) {
                throw new SQLException("fake");
            }

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            conn.commit(); // confirmando transação

            System.out.println("rows1: " + rows1);
            System.out.println("rows2: " + rows2);
        } catch (SQLException e) {
            try {
                conn.rollback();
                throw new DbException("transaction rolled back, cause: " + e.getMessage());
            } catch (SQLException e1) {
                throw new DbException("Error trying to rollback, cause: " + e1.getMessage());
            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
