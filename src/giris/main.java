package giris;
import java.util.Scanner ;



public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Değişkenleri belirledik
        double tutar, kdvOranı = 0.0,kdvTutar,kdvliTutar;


        System.out.print("Lütfen Hesaplamak İstediğiniz Tutarı Giriniz:");
        tutar = inp.nextDouble();

        //Koşul ifadesi
        kdvOranı=(tutar>1000) ? 0.08 :0.18;


        // KDV hesaplaması
         kdvTutar= tutar * kdvOranı;
         kdvliTutar= tutar + kdvTutar;


        System.out.println("Kdv'siz Tutar:"+ tutar);
        System.out.println("Kdv'li tutar:"+kdvliTutar);
        System.out.println("Kdv tutarı:"+kdvTutar);
        System.out.println("Kdv Oranı:"+kdvOranı);



    }
}





