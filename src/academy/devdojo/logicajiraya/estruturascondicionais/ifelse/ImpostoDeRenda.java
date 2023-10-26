package academy.devdojo.logicajiraya.estruturascondicionais.ifelse;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        float salario = 1500.50F;

        if (salario <= 2112F) {
            System.out.println("Isento");
        } else if (salario > 2112F && salario <= 2826.65) {
            System.out.println("IR = 7,5%");
        } else if (salario > 2826.65 && salario <= 3751.05) {
            System.out.println("IR = 15%");
        } else if (salario > 3751.05 && salario <= 4664.68) {
            System.out.println("IR = 22,5%");
        } else {
            System.out.println("IR = 27.5%");
        }
    }
}
