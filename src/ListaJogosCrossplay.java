import java.util.Scanner;

public class ListaJogosCrossplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nmrDeJogos;

        System.out.print("Digite o número de jogos que deseja adicionar: ");
        nmrDeJogos = sc.nextInt();

        String[] listaJogos = new String[nmrDeJogos];

        for (int i = 0; i < listaJogos.length; i++) {
            System.out.print("Digite o nome do [" + (i + 1) + "] jogo: ");
            listaJogos[i] = sc.next();
        }

        for (int i = 0; i < nmrDeJogos; i++) {
            System.out.println("[" + (i + 1) + "]: " + listaJogos[i] + " ");
        }

        // Escolhendo o índice aleatório para o array `listaJogos`:
        int randomIndex = (int) Math.floor(Math.random() * listaJogos.length);
        // Indexando o elemento aleatório de `listaJogos` a partir do índice:
        String jogoAleatorio = listaJogos[randomIndex];

        System.out.println("O Jogo escolhido pelo Algoritmo foi: " + jogoAleatorio);

        System.out.println("\n<PROGRAMA ENCERRADO/>");
    }
}
