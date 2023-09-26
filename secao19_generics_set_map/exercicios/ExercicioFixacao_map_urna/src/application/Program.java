package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<String, Integer> map = new LinkedHashMap<>();
            
            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String nomeCandidato = fields[0];
                String votos = fields[1];
                
                if (map.containsKey(nomeCandidato))
                	map.put(nomeCandidato, Integer.valueOf(votos) + map.get(nomeCandidato));
                else 
                	map.put(nomeCandidato, Integer.valueOf(votos));
                
                line = br.readLine();
            }
            
            System.out.println();
            for (String key : map.keySet()) {
    			System.out.println(key + ": " + map.get(key));
    		}

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }

}
