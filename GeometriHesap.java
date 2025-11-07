/*
 * Ad Soyad: Amine Ceren Yiğit
 * Ogrenci No: 250541048
 * Tarih: 7 Kasım 2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {
    
    // METOT 1: Kare alani
    public static double calculateSquareArea(double side) {
        // Alan = kenar * kenar
        
        return 0.0; // Degistirin
    }
    
    // METOT 2: Kare cevresi
    public static double calculateSquarePerimeter(double side) {
        // Cevre = 4 * kenar
        
        return 0.0; // Degistirin
    }
    
    // METOT 3: Dikdortgen alani
    public static double calculateRectangleArea(double width, double height) {
        // Alan = genislik * yukseklik
        
        return 0.0; // Degistirin
    }
    
    // METOT 4: Dikdortgen cevresi
    public static double calculateRectanglePerimeter(double width, double height) {
        // Cevre = 2 * (genislik + yukseklik)
        
        return 0.0; // Degistirin
    }
    
    // METOT 5: Daire alani
    public static double calculateCircleArea(double radius) {
        // Alan = PI * r * r
        // Math.PI kullanabilirsiniz
        
        return 0.0; // Degistirin
    }
    
    // METOT 6: Daire cevresi
    public static double calculateCircleCircumference(double radius) {
        // Cevre = 2 * PI * r
        
        return 0.0; // Degistirin
    }
    
    // METOT 7: Ucgen alani (taban ve yukseklik ile)
    public static double calculateTriangleArea(double base, double height) {
        // Alan = (taban * yukseklik) / 2
        
        return 0.0; // Degistirin
    }
    
    // METOT 8: Ucgen cevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        // Cevre = a + b + c
        
        return 0.0; // Degistirin
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===");
        System.out.println();
        
        // KARE bilgileri
        System.out.println("KARE:");
        System.out.print("Kenar uzunlugu (cm): ");
        double squareSide = input.nextDouble();
        
        // DIKDORTGEN bilgileri
        System.out.println("\nDIKDORTGEN:");
        System.out.print("Kisa kenar (cm): ");
        double rectWidth = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double rectHeight = input.nextDouble();
        
        // DAIRE bilgileri
        System.out.println("\nDAIRE:");
        System.out.print("Yaricap (cm): ");
        double radius = input.nextDouble();
        
        // UCGEN bilgileri
        System.out.println("\nUCGEN:");
        System.out.print("Taban (cm): ");
        double base = input.nextDouble();
        System.out.print("Yukseklik (cm): ");
        double height = input.nextDouble();
        System.out.print("1. kenar (cm): ");
        double side1 = input.nextDouble();
        System.out.print("2. kenar (cm): ");
        double side2 = input.nextDouble();
        System.out.print("3. kenar (cm): ");
        double side3 = input.nextDouble();
        
        // HESAPLAMALARI YAP - Metotlari cagir
        
        
        
        
        
        
        
        
        
        
        
        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("         HESAPLAMA SONUCLARI");
        System.out.println("========================================");
        
        System.out.printf("\nKARE (kenar: %.1f cm):\n", squareSide);
        // Alan ve cevre yazdir
        
        
        System.out.printf("\nDIKDORTGEN (%.1f x %.1f cm):\n", rectWidth, rectHeight);
        // Alan ve cevre yazdir
        
        
        System.out.printf("\nDAIRE (yaricap: %.1f cm):\n", radius);
        // Alan ve cevre yazdir
        
        
        System.out.printf("\nUCGEN (taban: %.1f, yukseklik: %.1f cm):\n", base, height);
        // Alan ve cevre yazdir
        
        
        System.out.println("========================================");
        
        input.close();
    }
}




package v1;

import java.util.Scanner;

public class GeometrikHesap {
    final static double pi = 3.14159;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       //kare
        System.out.printf("\nKenar uzunluğu giriniz: ");
        double uzunluk = input.nextDouble();
        double kare_alan = calculateSquareArea(uzunluk);
        double kare_cevre = calculateSquarePerimeter(uzunluk);
        System.out.printf("Kare alan: " + calculateSquareArea(uzunluk));
        System.out.printf("\nKarenin çevresi: " + calculateSquarePerimeter(uzunluk));
        
        //dikdörtgen
        System.out.printf("\n\nKısa kenar uzunluğunu giriniz: ");
        double kisa_kenar = input.nextDouble();
        System.out.printf("Uzun kenar uzunluğunu giriniz: ");
        double uzun_kenar = input.nextDouble();
        double dikdortgen_cevre = calculateTrianglePerimeter(uzun_kenar,kisa_kenar);
        double dikdörtgen_alan = calculateRectangleArea(kisa_kenar, kare_alan);
        System.out.printf("\nDikdörtgen alanı: " +calculateRectangleArea(uzun_kenar,kisa_kenar));
        System.out.printf("\nDikdörtgen çevre: " +calculateTrianglePerimeter(uzun_kenar, kisa_kenar));
        
        // daire
        System.out.printf("\nYarıçapı(r) giriniz: ");
        double r = input.nextDouble();
        double daire_alani = calculateCircleArea(r);
        double daire_cevre = calculateCircleCircumference(r);
        System.out.printf("\nDaire Alan: " + calculateCircleArea(r));
        System.out.printf("\nDaire Çevre: " + calculateCircleCircumference(r));
        
        //üçgen
        System.out.printf("\nTaban uzunluğunu giriniz: ");
        double taban = input.nextDouble();
        System.out.printf("Yüksekliği giriniz: ");
        double yekseklik = input.nextDouble();
        System.out.printf("Birinci Kenar uzunluğu giriniz: ");
        double uzunluk_a = input.nextDouble();
        System.out.printf("İkinci Kenar uzunluğu giriniz: ");
        double uzunluk_b = input.nextDouble();
        System.out.printf("Üçüncü Kenar uzunluğu giriniz: ");
        double uzunluk_c = input.nextDouble();
        double ucgen_alani = calculateTriangleArea(taban,yekseklik);
        double ucgen_cevre = calculateTrianglePerimeter(taban,yekseklik);
        System.out.printf("Üçgen Alanı: " + calculateTriangleArea(taban,yekseklik));
        System.out.printf("\nÜçgenin Çevresi: " + calculateTrianglePerimeter(taban,yekseklik));
    }

    
    // kare alan
    public static double calculateSquareArea(double uzunluk) {
       double alan = Math.pow(uzunluk, 2);
       return alan ;
    }
    // kare çevre
    public static double calculateSquarePerimeter(double uzunluk) {
        return 4 * uzunluk;
    }
    // dikdörtgen alan
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }
    // dikdörtgen cevre
    public static double calculateTrianglePerimeter(double kisa_kenar, double uzun_kenar) {
        return 2*(kisa_kenar + uzun_kenar);
    }
    // daire alan
    public static double calculateCircleArea(double r) {
        return pi * Math.pow(r,2);
    }
    // daire cevre
    public static double calculateCircleCircumference(double r) {
        return 2 * Math.PI * r;
    }
    // üçgen alanı
    public static double calculateTriangleArea(double taban, double yukseklik) {
        return taban * yukseklik/2.0;
    }
    // üçgen cevre
        public static double calculateTrianglePerimeter(double uzunluk_a, double uzunluk_b, double uzunluk_c) {
        return uzunluk_a + uzunluk_b + uzunluk_c;
    }


}

