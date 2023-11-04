package academy.devdojo.logicajiraya.Avariaveis;

public class PorcentagemSalario {
    public static void main(String[] args){
        //valores decimais no Java por padrão são double
        float salario = 2500.00F;
        float porcentagem = 30;
        float resultado =  salario * (porcentagem / 100);
        System.out.println(porcentagem + "% de " + salario + " eh = " + resultado);
    }
}
