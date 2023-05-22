import java.util.ArrayList;

public class Casa extends Imoveis{
    private boolean sobrado;
    private boolean garagem;

    public Casa(boolean sobrado, double metros, boolean garagem, boolean design, String estilo,double valorFinal) {
        this.sobrado = sobrado;
        this.metros = metros;
        this.garagem = garagem;
        this.design = design;
        this.estilo = estilo;
        this.valorFinal = valorFinal;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public boolean isSobrado() {
        return sobrado;
    }

    public void setSobrado(boolean sobrado) {
        this.sobrado = sobrado;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public boolean isGaragem() {
        return garagem;
    }

    public void setGaragem(boolean garagem) {
        this.garagem = garagem;
    }

    public boolean isDesign() {
        return design;
    }

    public void setDesign(boolean design) {
        this.design = design;
    }

    @Override
    public String toString() {
        return "Sobrado: " + (sobrado ? "Sim" : "Não") +
                ", Metros: " + metros +
                ", Garagem: " + (garagem ? "Sim" : "Não") +
                ", Design: " + (design ? "Sim" : "Não") +
                ", Estilo escolhido: " + estilo +
                ", Valor final: R$" + valorFinal +
                '\n';
    }
}
