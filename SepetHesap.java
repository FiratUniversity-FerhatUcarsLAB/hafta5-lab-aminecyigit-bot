/*
 * Ad Soyad: Amine Ceren Yiğit
 * Ogrenci No: 250541048
 * Tarih: 12 Kasım 2025
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesap {

    // Sabitler
    final static double VAT_RATE = 0.18;      // KDV Oranı (%18)
    final static double SHIPPING_FEE = 29.99; // Sabit kargo ücreti (TL)

    // METOT 1: Bir urunun toplam fiyatini hesaplar (fiyat * adet)
    public static double calculateLineTotal(double price, int quantity) {
        // Satir Toplami = fiyat * adet
        return 0.0; // Degistirin
    }

    // METOT 2: Sepetteki 3 urunun ara toplamini hesaplar
    public static double calculateSubtotal(double line1, double line2, double line3) {
        // Ara Toplam = urun1 + urun2 + urun3
        return 0.0; // Degistirin
    }

    // METOT 3: Indirim tutarini hesaplar
    public static double calculateDiscountAmount(double subtotal, double discountPercentage) {
        // Indirim Tutari = araToplam * (indirimYuzdesi / 100)
        return 0.0; // Degistirin
    }

    // METOT 4: Indirimli fiyati hesaplar (araToplam - indirimTutari)
    public static double applyDiscount(double subtotal, double discountAmount) {
        // Indirimli Toplam = araToplam - indirimTutari
        return 0.0; // Degistirin
    }

    // METOT 5: KDV tutarini hesaplar (indirimliTutar * kdvOrani)
    public static double calculateVAT(double discountedTotal, double vatRate) {
        // KDV Tutari = indirimliTutar * VAT_RATE
        return 0.0; // Degistirin
    }

    // METOT 6: Genel toplami hesaplar (indirimliTutar + kdv + kargo)
    public static double calculateGrandTotal(double discountedTotal, double vatAmount, double shippingFee) {
        // Genel Toplam = indirimliTutar + kdvTutari + kargoUcreti
        return 0.0; // Degistirin
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== E-TICARET SEPET HESAPLAYICI ===");
        System.out.println("\nLutfen 3 urunun bilgilerini girin:");

        // URUN 1 Bilgileri
        System.out.println("\nURUN 1:");
        System.out.print("  Birim Fiyat (TL): ");
        double price1 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty1 = input.nextInt();

        // URUN 2 Bilgileri
        System.out.println("\nURUN 2:");
        System.out.print("  Birim Fiyat (TL): ");
        double price2 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty2 = input.nextInt();

        // URUN 3 Bilgileri
        System.out.println("\nURUN 3:");
        System.out.print("  Birim Fiyat (TL): ");
        double price3 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty3 = input.nextInt();

        // Indirim Bilgisi
        System.out.println("\nIndirim Kuponu Yuzdesi (%): ");
        double discountPercent = input.nextDouble();

        // HESAPLAMALARI YAP - Metotlari cagir
        // 1. Urunlerin satis toplamlarini hesapla
    

        // 2. Ara toplami hesapla

        // 3. Indirim tutarini hesapla
      

        // 4. Indirimli toplami hesapla
      

        // 5. KDV tutarini hesapla (Indirimli toplam uzerinden)
      

        // 6. Genel toplami hesapla


        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("           SIPARIS OZETI");
        System.out.println("========================================");

        System.out.printf("Urun 1 Toplam (%.2f TL x %d): %.2f TL\n", price1, qty1, line1Total);
        System.out.printf("Urun 2 Toplam (%.2f TL x %d): %.2f TL\n", price2, qty2, line2Total);
        System.out.printf("Urun 3 Toplam (%.2f TL x %d): %.2f TL\n", price3, qty3, line3Total);
        System.out.println("----------------------------------------");
        System.out.printf("Ara Toplam                   : %.2f TL\n", subtotal);

        System.out.printf("\nIndirim Tutari (%%%.0f)         : -%.2f TL\n", discountPercent, discountAmount);
        System.out.printf("Indirimli Toplam             : %.2f TL\n", discountedTotal);

        System.out.printf("\nKDV Tutari (%%%.0f)             : +%.2f TL\n", (VAT_RATE * 100), vatAmount);
        System.out.printf("Kargo Ucreti                 : +%.2f TL\n", SHIPPING_FEE);
        System.out.println("----------------------------------------");
        System.out.printf("GENEL TOPLAM                 : %.2f TL\n", grandTotal);
        System.out.println("========================================");

        input.close();
    }
}

package v1;
import java.util.Scanner;

public class SepetHesap {
    // Sabitler
    final static double KDV_ORANI = 0.18;      // KDV Oranı (%18)
    final static double KARGO = 29.99; // Sabit kargo ücreti (TL)

    // Ürün toplam Hesabı
    public static double calculateLineTotal(double fiyat,int adet){
        double toplam_fiyat = fiyat * adet;
        return toplam_fiyat;
    }
    //Üç ürünün ara toplamının Hesabı
    public static double calculateSubttotal(double urun1,double urun2, double urun3){
        double ara_toplam = urun1 + urun2 + urun3;
        return ara_toplam;
    }
    //İndirim tutarının hesabı
    public static double calcateDiscountAmount(double ara_toplam, double indirim_yuzdesi ){
        double indirim_tutarı = ara_toplam * (indirim_yuzdesi / 100);
        return indirim_tutarı;
    }
    //İndirimli fiyat hesabı
    public static double applyDiscount(double ara_toplam, double indirim_tutari ){
        double indirimli_fiyat = ara_toplam - indirim_tutari;
        return indirimli_fiyat;
    }
    //KDV tutarı hesabı
    public static double calculateVAT(double indirimli_fiyat , double KDV_ORANI){
        double kdv_tutari = indirimli_fiyat * KDV_ORANI;
        return kdv_tutari;
    }
    //Genel toplam hesabı
    public static double calculateGrandTotal(double indirimli_fiyat, double kdv_tutari,double KARGO ){
        double genel_toplam = indirimli_fiyat + kdv_tutari + KARGO;
        return genel_toplam;
    }
    public static void  main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("\nLütfen üç ürünün bilgilerini giriniz ");
        //Ürün 1 bilgileri
        System.out.print("\nÜRÜN1");
        System.out.print("\nBirim Fiyat (TL): ");
        double fiyat1 = input.nextDouble();
        System.out.print("Adet: ");
        int adet1 = input.nextInt();

        //Ürün 2 bilglileri
        System.out.print("\nÜRÜN2:");
        System.out.print("\nBirim Fiyatı (TL): ");
        double fiyat2 = input.nextDouble();
        System.out.print("Adet: ");
        int adet2 = input.nextInt();

        //Ürün 3 bilgileri
        System.out.print("\nÜRÜN3:");
        System.out.print("\nBirim Fiyat (TL): ");
        double fiyat3 = input.nextDouble();
        System.out.print("Adet: ");
        int adet3 = input.nextInt();

        //İndirim Kuponu bilgisi
        System.out.print("\nİndirim Kuponu Bilgisi giriniz (%): ");
        double indirim_yuzdesi = input.nextDouble();

        double urun_1 = fiyat1 * adet1;
        double urun_2 = fiyat2 * adet2;
        double urun_3 = fiyat3 * adet3;
        double ara_toplam = urun_1 + urun_2 + urun_3;
        double indirim_tutari = ara_toplam * (indirim_yuzdesi / 100);;
        double indirimli_fiyat = ara_toplam - indirim_tutari;
        double kdv_tutari = indirimli_fiyat * KDV_ORANI;
        double genel_toplam = indirimli_fiyat + KARGO + kdv_tutari;

        System.out.println("======================================");
        System.out.println("          SİPARİŞ ÖZETİ            ");
        System.out.println("======================================");
        System.out.printf("\nÜrün 1 toplam (%.2f TL * %d)    : %.2f TL", fiyat1,adet1,urun_1);
        System.out.printf("\nÜrün 2 toplam (%.2f TL * %d)     : %.2f TL", fiyat2,adet2,urun_2);
        System.out.printf("\nÜrün 3 toplam (%.2f TL * %d)    : %.2f TL ", fiyat3,adet3,urun_3);
        System.out.print("\n------------------------------------");
        System.out.printf("\nAra Toplam                      : %.2f TL", ara_toplam);
        System.out.printf("\nİndirim tutarı(%%%.0f)             : -%.2f TL",indirim_yuzdesi ,indirim_tutari);
        System.out.printf("\nİndirimli Toplam                : %.2f TL", indirimli_fiyat);
        System.out.printf("\nKDV Tutarı (%%%.0f)                : +%.2f TL",(KDV_ORANI*100),kdv_tutari);
        System.out.printf("\nKargo Ücreti                    : +%.2f TL",KARGO);
        System.out.println("\n---------------------------------------");
        System.out.printf("\nGENEL TOPLAM                    : %.2f TL", genel_toplam);
        System.out.print("\n===========================================");
        
        input.close();
    }
}

