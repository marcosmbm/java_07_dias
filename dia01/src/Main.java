import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner firstNumberScanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        Double firstNumber = firstNumberScanner.nextDouble();

        Scanner secondNumberScanner = new Scanner(System.in);
        System.out.println("Digite o segundo número: ");
        Double secondNumber = secondNumberScanner.nextDouble();

        Double soma = firstNumber + secondNumber;

        System.out.println("A soma é: "+soma);
    }
}