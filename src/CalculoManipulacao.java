public class CalculoManipulacao {
    public static void main(String[] args) {
        double loteDeComprimidos = 200;
        int principioAtivo = 50;
        double porcentagem = 0.6D;
        int valorGrama = 1000;

        double calculo = (principioAtivo / porcentagem) * loteDeComprimidos;
        double conversaoParaGrama = calculo / valorGrama;

        System.out.println(conversaoParaGrama);
    }
}
