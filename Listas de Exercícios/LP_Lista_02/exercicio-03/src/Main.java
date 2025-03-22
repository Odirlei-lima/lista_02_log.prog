import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        number = in.nextDouble();

       result = number / 5;
        System.out.println("A quinta parte do número é : " + result);


    }
}