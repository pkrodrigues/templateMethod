package org.example;

public class ClienteVip extends Cliente {
    public String verificarChekin() {
        if((this.isStatus()==true) && (this.getAvaliacao()>=3)){
            return "Chekin autorizado";
        }else{
            return "Não autorizado";
        }
    }

    public String getTipo(){
        return "Cliente Vip";
    }
}
