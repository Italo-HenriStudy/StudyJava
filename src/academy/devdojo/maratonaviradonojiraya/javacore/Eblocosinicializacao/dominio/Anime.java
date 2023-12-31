package academy.devdojo.maratonaviradonojiraya.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1- É alocado espaço em memória pro objeto
    // 2- Cada atributo de classe é criado e inicializado com valores default ou o que foi passado
    // 3- Bloco de inicialização é executado
    // 3- Construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        this.episodios = new int[12];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        System.out.println("Dentro de um construtor sem argumentos");
        for (int ep:
             this.episodios) {
            System.out.print(ep + " ");
        }
        System.out.println();
    }
    public String getNome(){
        return this.nome;
    }

    public int[] getEpisodios() {
        return this.episodios;
    }
}
