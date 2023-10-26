package academy.devdojo.logicajiraya.estruturascondicionais.ifelse;

public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 4700.0F;
        float porcentagem;
        float resultado;

        if (salario > 4500){
            porcentagem = 30;
            resultado = salario * (porcentagem / 100);
            System.out.println(porcentagem + "% de " + salario + " eh = " + resultado);
        } else {
            porcentagem = 15;
            resultado = salario * (porcentagem / 100);
            System.out.println(porcentagem + "% de " + salario + " eh = " + resultado);
        }
    }
}