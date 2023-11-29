import java.util.Scanner;
public class TestFraction {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Entre le numerateur de la premiere fraction");
            int num1 = input.nextInt();
            System.out.println("Entre le denominateur de la premiere fraction");
            int denom1 =input.nextInt();
            System.out.println("Entre le numerateur de la deuxieme fraction");
            int num2 = input.nextInt();
            System.out.println("Entre le denominateur de la deuxieme fraction");
            int denom2 =input.nextInt();
            Rational frac1 = new Rational(num1,denom1);
            Rational frac2 = new Rational(num2, denom2);
            System.out.println("fraction1 : " + frac1);
            System.out.println("fraction2 : " + frac2);
            frac1.multi(frac2);
            System.out.println("le resulta de la multilplication est : " + frac1);
        }
    }
}