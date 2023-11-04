package academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private int numero;
    private Time time;
    public Jogador(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }
    public void imprime() {
        System.out.println(this.nome + " " + this.numero);
        if (time != null) {
            System.out.println(time.getNome());
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
