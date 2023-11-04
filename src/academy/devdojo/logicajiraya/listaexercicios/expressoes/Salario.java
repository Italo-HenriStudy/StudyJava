package academy.devdojo.logicajiraya.listaexercicios.expressoes;

import java.util.Scanner;

public class Salario {

//    Baseado nas fórmulas abaixo, desenvolva uma rotina que calcule o salário líquido de
//    um funcionário. Após o cálculo o programa deve apresentar o salário base e o salário
//    líquido calculado.

//    SB = HT * VH
//    TD = (PD / 100) * SB
//    SL = SB − TD

//    Onde:
//      SB = Salário Base
//      HT = Horas Trabalhadas
//      VH = Valor Hora de trabalho
//      TD = Total de Descontos
//      PD = Percentual de Desconto
//      SL = Salário Líquido

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double SB;
        int HT;
        double VH;
        double TD;
        double PD;
        double SL;

        System.out.print("Digite suas horas trabalhadas: ");
        HT = sc.nextInt();

        System.out.print("Digite o valor da hora de trabalho: ");
        VH = sc.nextDouble();

        SB = HT * VH;

        PD = 30;
        TD = (PD / 100) * SB;

        SL = SB - TD;

        System.out.println("-----------");
        System.out.println("Salario Base: " + SB);
        System.out.println("Percentual de desconto: " + TD);
        System.out.println("Salario Liquido: " + SL);
    }
}
