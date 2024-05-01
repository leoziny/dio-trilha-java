import java.util.InputMismatchException;
import java.util.Scanner;

public class SimulacaoBancaria {
    private static int saldo = 0;

    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Escolha uma opção: ");
                System.out.println("[1] Depositar ");
                System.out.println("[2] Sacar ");
                System.out.println("[3] Consultar Saldo ");
                System.out.println("[0] Encerrar sessão ");

                int opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        try {
                            depositar(sc);
                        } catch (InputMismatchException ex) {
                            System.out.println("Digite um valor, não pode possuir textos ou caracteres.");

                        }
                        break;
                    case 2:
                        try {
                            sacar(sc);

                        } catch (InputMismatchException ex) {
                            System.out.println("Digite um valor, não pode possuir textos ou caracteres.");

                        }
                        break;
                    case 3:
                        consultarSaldo();
                        break;
                    case 0:
                        System.out.println("Muito obrigado por fazer parte do banco Milk Money, Estamos encerrando a sessão...");
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }

        } catch (InputMismatchException ex) {
            System.out.println("Digite um valor, não pode possuir textos ou caracteres.");
        }
    }

    private static void depositar(Scanner sc) throws InputMismatchException {
        System.out.println("Só é possivel realizar depositos das seguintes notas: 5, 10, 20, 50, 100: ");
        System.out.print("Deseja depositar quanto: ");
        int dinheiroDepositado = sc.nextInt();
        if (isValorDepositoValido(dinheiroDepositado)) {
            saldo += dinheiroDepositado;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    private static boolean isValorDepositoValido(int valor) {
        return valor > 0 && valor % 5 == 0 && valor <= 1000;
    }

    private static void sacar(Scanner sc) throws InputMismatchException {
        System.out.println("Só é possivel realizar saques das seguintes notas: 5, 10, 20, 50, 100: ");
        System.out.print("Deseja sacar quanto: ");
        int dinheiroSacado = sc.nextInt();
        if (isValorSaqueValido(dinheiroSacado)) {
            saldo -= dinheiroSacado;
            contagemNotasSaque(dinheiroSacado);

            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    private static boolean isValorSaqueValido(int valor) {
        return valor > 0 && valor % 5 == 0 && valor <= saldo && valor <= 1000;
    }

    private static void contagemNotasSaque(int valorSacado) {
        int[] notasTemporarias = {200, 100, 50, 20, 10, 5};
        int quantidade;
        for (int nota : notasTemporarias) {
                quantidade = valorSacado / nota;
            if (quantidade > 0) {
                System.out.printf("%d nota(s) de %d%n", quantidade, nota);
                valorSacado %= nota;
            }
        }
    }
        private static void consultarSaldo () {
            System.out.printf("Seu saldo atual é de %d Reais %n", saldo);
        }


}

