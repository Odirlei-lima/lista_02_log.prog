import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vel_m, vel_Km;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a velocidade em metros por segundo");

        vel_Km = in.nextDouble();

        vel_Km = (vel_m * 3.6);

        System.out.println("A velocidade em Km/h "+vel + vel_m);
    }
}