package org.example;

public class ClienteGold extends Cliente{
    public String verificarChekin() {
        if((this.isStatus()==true) && (this.getAvaliacao()>=3)){
            return "Chekin autorizado";
        }else{
            return "Não autorizado";
        }
    }
}
