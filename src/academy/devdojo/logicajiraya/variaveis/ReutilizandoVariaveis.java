package academy.devdojo.logicajiraya.variaveis;

public class ReutilizandoVariaveis {
    public static void main(String[] args) {
        float salario = 2500.00F;
        float porcentagem = 30;
        float resultado =  salario * (porcentagem / 100);
        System.out.println(porcentagem + "% de " + salario + " eh = " + resultado);
        porcentagem = 15;
        resultado = salario * (porcentagem / 100);
        System.out.println(porcentagem + "% de " + salario + " eh = " + resultado);
        porcentagem = 5;
        resultado = salario * (porcentagem / 100);
        System.out.println(porcentagem + "% de " + salario + " eh = " + resultado);
    }
}
