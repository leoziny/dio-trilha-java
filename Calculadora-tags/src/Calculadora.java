/**
 * Classe Calculadora
 *
 * Esta classe fornece métodos para realizar operações básicas de matemática
 * como adição, subtração, multiplicação e divisão.
 *
 * @author leonardo gomes
 * @version 1.0
 * @since 2024
 */
public class Calculadora {

    /**
     * Método para somar dois números
     *
     * Este método recebe dois números inteiros como parâmetros e retorna a soma desses números.
     *
     * @param num1 O primeiro número
     * @param num2 O segundo número
     * @return A soma de num1 e num2
     */
    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Método para subtrair dois números
     *
     * Este método recebe dois números inteiros como parâmetros e retorna a diferença do primeiro número pelo segundo.
     *
     * @param num1 O primeiro número
     * @param num2 O segundo número
     * @return A subtração de num1 por num2
     */
    public int subtrai(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Método para multiplicar dois números
     *
     * Este método recebe dois números inteiros como parâmetros e retorna o produto desses números.
     *
     *
     * @param num1 O primeiro número
     * @param num2 O segundo número
     * @return A multiplicação de num1 por num2
     */
    public int multiplica(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Método para dividir dois números
     *
     * Este método recebe dois números inteiros como parâmetros e retorna a divisão do primeiro número pelo segundo.
     *
     * @param num1 O primeiro número
     * @param num2 O segundo número
     * @return A divisão de num1 por num2
     * @throws ArithmeticException Se o divisor é zero
     */
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisor não pode ser zero");
        }
        return num1 / num2;
    }
}
