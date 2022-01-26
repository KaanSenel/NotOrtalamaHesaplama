import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int mat,fizik,kimya,turkce,muzik,tarih;
        double sonuc;

        Scanner input= new Scanner(System.in);
        System.out.println("NOT ORTALAMASI HESAPLAMA");
        System.out.println("------------------------");

        System.out.print("Matematik notunuzu giriniz:");
        mat=input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik=input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya=input.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce=input.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik=input.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih=input.nextInt();

        sonuc=(mat+fizik+kimya+turkce+muzik+tarih)/6.0;
        System.out.println("Ortalamanız :"+new DecimalFormat("##.#").format(sonuc));
        System.out.println(sonuc>60 ? "Sınıfı Geçti" : "Sınıfta kaldı");
    }
}
