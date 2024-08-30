import java.util.Scanner;

public class Main {
    public static boolean fibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }

        int anterior1 = 0;
        int anterior2 = 1;
        int atual = anterior1 + anterior2;

        while (atual <= numero) {
            if (atual == numero) {
                return true;
            }
            anterior1 = anterior2;
            anterior2 = atual;
            atual = anterior1 + anterior2;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (fibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência Fibonacci" );
        }
        else {
            System.out.println("O número " + numero + " não pertence à sequência Fibonacci" );
        }
    }

}