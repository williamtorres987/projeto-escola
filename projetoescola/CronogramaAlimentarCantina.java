package projetoescola;

public class CronogramaAlimentarCantina {
    private String cardapio;
    private String bebida;
    private String fruta;

    public String getCardapio() {
        return cardapio;
    }

    public void setCardapio(String cardapio) {
        this.cardapio = cardapio;
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

    public String avisoMerenda(){
        return "Hora do rango!";
    }
}
