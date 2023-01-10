import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            try {
                int numero = scanner.nextInt();
                System.out.println("Tabela de multiplicação de " + numero);
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero
                            + " x "
                            + i
                            + " = "
                            + (numero * i));
                }
            } catch (InputMismatchException e) {
                System.out.println("O valor informado não é um número!");
            }
        }
    }
}
