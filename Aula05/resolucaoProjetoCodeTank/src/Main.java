import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Faça um programa que receba 5 salários brutos de funcionários,
        sabendo-se que são descontados Imposto de Renda e INSS,
        calcule e mostre o total do salário líquido no referido mês.

        Obs.: Salário Bruto - Descontos = Salário Líquido.

        A saída do programa deve fornecer as seguintes informações:

        Salário bruto.
        Quanto pagou ao INSS.
        Quanto pagou de Imposto de Renda.
        Salário líquido.
        Calcule os descontos e o salário líquido com base nas tabelas abaixo:

        Salário	% Desconto INSS
        até 1.212,00	7,5%
        de 1212,01 até 2.427,35	9%
        de 2.427,36 até 3.641,03	12%
        de 3.641,04 até 7.087,22	14%

        Salário	% Desconto Imposto de Renda
        até 1.903,98	0%
        de 1.903,99 até 2.826,65	7,5%
        de 2.826,66 até 3.751,05	15%
        de 3.751,06 até 4.664,68	22,50%
        Acima de 4.664,68	27,50%

        */

        Scanner input = new Scanner(System.in);

        //Salarios
        double salario1 ;
        double salario2 ;
        double salario3 ;
        double salario4 ;
        double salario5 ;


        System.out.println(" Seja Bem Vindo ao sistema!");

        int funcionario = 1;
        while ( funcionario != 0){

            System.out.println("Digite o Primeiro Salário: R$");
            salario1 = input.nextDouble();

            System.out.println("Digite o Primeiro Salário: R$");
            salario2 = input.nextDouble();

            System.out.println("Digite o Terceiro Salário: R$");
            salario3 = input.nextDouble();

            System.out.println("Digite o Quarto Salário: R$");
            salario4 = input.nextDouble();

            System.out.println("Digite o Quinto Salário: R$");
            salario5 = input.nextDouble();


            // Salario Bruto
            double salarioBruto = ( salario1 + salario2 + salario3 + salario4 + salario5 ) / 5 ;
            System.out.println(" Salário Bruto é R$ " + salarioBruto);


            //Quanto pagou ao INSS
            /*
            Salário	% Desconto INSS
            até 1.212,00	7,5%
            de 1212,01 até 2.427,35	9%
            de 2.427,36 até 3.641,03	12%
            de 3.641,04 até 7.087,22	14%
            */

            double inss;
            if (salarioBruto <= 1212) {
                inss = salarioBruto * 0.075;
            } else if (salarioBruto <= 2427.35) {
                inss = salarioBruto * 0.09;
            } else if (salarioBruto <= 3641.03) {
                inss = salarioBruto * 0.12;
            } else if (salarioBruto <= 7087.22) {
                inss = salarioBruto * 0.14;
            } else {
                inss = salarioBruto * 0.14;
            }

            System.out.println(" Desconto INSS é R$ " + inss);

            //Quanto pagou de Imposto de Renda.
            /*
            Salário	% Desconto Imposto de Renda
            até 1.903,98	0%
            de 1.903,99 até 2.826,65	7,5%
            de 2.826,66 até 3.751,05	15%
            de 3.751,06 até 4.664,68	22,50%
            Acima de 4.664,68	27,50%
            */


            double impostoDeRenda;
            if (salarioBruto <= 1903.98) {
                impostoDeRenda = salarioBruto;
            } else if (salarioBruto <= 2826.65) {
                impostoDeRenda = salarioBruto * 0.075;
            } else if (salarioBruto <= 3751.05) {
                impostoDeRenda = salarioBruto * 0.15;
            } else if (salarioBruto <= 4664.68) {
                impostoDeRenda = salarioBruto * 0.225;
            } else {
                impostoDeRenda = salarioBruto * 0.275;
            }

            System.out.println(" Desconto Imposto de Renda é R$ " + impostoDeRenda);

            //Salário líquido
            double salarioLiquido = salarioBruto - inss - impostoDeRenda;
            System.out.println(" Salário Líquido é R$ " + salarioLiquido);

            System.out.println(" Para finalizar a consulta digite o número zero ou para uma nova consultar digite qualquer outro número ");
            funcionario = input.nextInt();


        }

        System.out.println(" Muito obrigado por usar nosso sistema ! ");

    }
}