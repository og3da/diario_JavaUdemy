package entities.enums;
/*
ESSE É O TIPO ENUM, ELE CONTÉM CONSTANTES, OU SEJA, VALORES QUE NÃO MUDAM.
CRIAMOS ESSE ENUM PARA REPRESENTAR AS ETAPAS DO PROCESSO DE UMA LOJA ->
(pagamento pendente, processando, enviado, entregue)
 */

public enum OrderStatus {

    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED;
}
