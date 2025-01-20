import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner informacao = new Scanner(System.in);
        System.out.println("Nome do Cliente");
        String nome = informacao.nextLine();

        System.out.println("Idade");
        int idade = informacao.nextInt();

        informacao.nextLine();

        System.out.println("Tipo de conta");
        String tipoDeConta = informacao.nextLine();

        int saldo = 0;

        System.out.println("\n ********************** BEM VINDO AO START BANK *********************");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " Anos");
        System.out.println("Conta: " + tipoDeConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("******************************************************************** \n");

        String menu = """
                - ESCOLHA UMA OPÇÃO:
                
                1 - Consultar Saldo
                2 - Receber Valor
                3 - Enviar Valor
                4 - Sair
                """;
        System.out.println(menu);
        int escolha = informacao.nextInt();
        int valor;

        while (escolha != 4) {


            switch (escolha) {
                case 1:
                    System.out.println("Seu saldo atual é R$: " + saldo);
                    System.out.println(menu);
                    escolha = informacao.nextInt();


                    break;
                case 2:
                    System.out.println("Digite um valor: ");
                    valor = informacao.nextInt();

                    if (valor <= 0) {
                        System.out.println("ERROR valor invalido \n");
                    } else {
                        saldo = saldo + valor;
                        System.out.println("Saldo atual é R$ " + saldo);
                        System.out.println(menu);
                        escolha = informacao.nextInt();
                    }
                    break;
                case 3:
                    System.out.println("Digite um valor: ");
                    valor = informacao.nextInt();
                    if (valor > saldo) {
                        System.out.println("Saldo insuficiente \n");
                    } else {
                        saldo = saldo - valor;
                        System.out.println("Você sacou R$ " + valor);
                        System.out.println("Saldo atual é R$ " + saldo);
                        System.out.println(menu);
                        escolha = informacao.nextInt();
                    }
                    break;
                default:
                    System.out.println("\n Opção invalida \n");
                    System.out.println(menu);
                    escolha = informacao.nextInt();

            }
        }

        System.out.println(" Encerrando...");

    }
}