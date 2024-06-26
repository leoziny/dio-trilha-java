import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidos exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");

        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidos {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidos();

        }
        int contagem = parametroDois - parametroUm;
        for (int index = 1; index <= contagem; index++) {
            System.out.println(index);
        }
    }
}