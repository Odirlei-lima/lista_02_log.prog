import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double vel_Km, vel_m ;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade em Km/h ");
        vel_Km = in.nextDouble();

        vel_m = (vel_Km/3.6);

        System.out.println("A velocidade em m/s é " + vel_m);

    }
}