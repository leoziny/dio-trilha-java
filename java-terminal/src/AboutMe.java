/*
* UM exemplo de como passar os args(Argumentos) diretamente como parametro para as váriaveis
* podendo ser tanto via JSON como entrada de dados via terminal
public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}*/
import java.util.Locale; // importantdo a biblioteca Locale para definir o estilo de numeros e etc... dependendo da localização
import java.util.Scanner; // importando a bibliteoca scanner que reconhece  a entrada de dados a partir do console.

public class AboutMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US); // criando um scanner que vai receber a entrada de dados e com sua localização de US

        System.out.println("Digite seu Nome: ");
        String nome = sc.next(); //pegando os dados que a pessoa digitar em formato de String

        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = sc.next();//pegando os dados que a pessoa digitar em formato de String

        System.out.println("Digite sua Idade: ");
        int idade = sc.nextInt(); //pegando os dados que a pessoa digitar em formato de numero Inteiro

        System.out.println("Digite sua Altura: ");
        double altura = sc.nextDouble();//pegando os dados que a pessoa digitar em formato de numero fracionado

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}

