package academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professsores) {
        this.nome = nome;
        this.professores = professsores;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (professores == null) return;
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
