package Lab01.Models;

public class Monstro {
    private String nome;
    private int poder;
    private int quantidadeDeTesouros;
    private int niveisPerdidos;

    public Monstro(String nome, int poder, int quantidadeDeTesouros, int niveisPerdidos) {
        this.nome = nome;
        this.poder = poder;
        this.quantidadeDeTesouros = quantidadeDeTesouros;
        this.niveisPerdidos = niveisPerdidos;
    }

    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    public int getQuantidadeDeTesouros() {
        return quantidadeDeTesouros;
    }

    public int getNiveisPerdidos() {
        return niveisPerdidos;
    }

    public void setNome(String nomeMonstro) {
        nome = nomeMonstro;
    }

    public void setPoder(int poderMonstro) {
        poder = poderMonstro;
    }

    public void setQuantidadeDeTesouros(int nTesouros) {
        quantidadeDeTesouros = nTesouros;
    }

    public void setNiveisPerdidos(int niveisPerdidosMonstro) {
        niveisPerdidos = niveisPerdidosMonstro;
    }

    public String toString() {
        String classeInformation = "MONSTER\n" + "Nome: " + nome + "\n" 
        + "Poder: " + poder + "\n"
        + "Quantidade de tesouros: " + quantidadeDeTesouros + "\n"
        + "Níveis perdidos: " + niveisPerdidos + "\n";
        return classeInformation;
    }
    
}
