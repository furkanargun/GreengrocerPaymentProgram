import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total, perPear=2.14,perApple=3.67,perTomato=1.11,perBanana=0.95,perAubergine=5.0;
        int pear, apple, tomato, banana, aubergine;
        Scanner sc = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        pear = sc.nextInt();
        System.out.print("Elma Kaç Kilo? : ");
        apple = sc.nextInt();
        System.out.print("Domates Kaç Kilo? : ");
        tomato = sc.nextInt();
        System.out.print("Muz Kaç Kilo? : ");
        banana = sc.nextInt();
        System.out.print("Patlıcan Kaç Kilo? : ");
        aubergine = sc.nextInt();

        total = pear*perPear + apple*perApple + tomato*perTomato + banana*perBanana + aubergine*perAubergine;
        System.out.println("Toplam Tutar: " + total + " TL");
    }
}