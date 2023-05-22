// Classe que representa um componente do orçamento
public class Apartamento extends Imoveis{
    public Apartamento(double metros, boolean design, String estilo,double valorFinal) {
        this.metros = metros;
        this.design = design;
        this.valorFinal = valorFinal;
        this.estilo = estilo;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public boolean isDesign() {
        return design;
    }

    public void setDesign(boolean design) {
        this.design = design;
    }

    public String toString() {
        return "Metros: " + metros +
                ", Design: " + design +
                ", Estilo escolhido: " + estilo +
                ", Valor final: R$" + valorFinal +
                "\n";
    }
}