package projetoescola;

import java.util.Scanner;

public class CronogramaAlimentarCantina {
    private String salgado;
    private String bebida;
    private String fruta;

    public String getSalgado() {
        return salgado;
    }

    public void setSalgado(String salgado) {
        this.salgado = salgado;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public void avisoCardapioePrecos() {
        System.out.println( "Salgados: " +
                " Coxinha - R$ 5,00" +
                " Empada - R$ 4,50" +
                " Bebidas:" +
                " Coca 300 ml - R$ 2,50" +
                " Café 250 ml - 1,50" +
                " Frutas:" +
                " Banana - Retirar de graça na cantina" +
                " Bergamota - Retirar de graça na cantina");
    }

    public void pedidosCantina(Scanner scanner) {
        System.out.println("Informe o salgado que você deseja comprar:  ");
        salgado = scanner.next();
        System.out.println("Informe a bebida que você deseja comprar:  ");
        bebida = scanner.next();
        System.out.println("Informe a fruta que você deseja retirar na cantina: ");
        fruta = scanner.next();

    }
}