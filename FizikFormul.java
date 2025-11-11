/*
 * Ad Soyad: [ADINIZI BURAYA YAZIN]
 * Ogrenci No: [OGRENCI NUMARANIZI BURAYA YAZIN]
 * Tarih: [TARIHI BURAYA YAZIN]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class FizikFormul {

    // Sabit: Yercekimi ivmesi
    final static double GRAVITY = 9.8; // m/s²

    // METOT 1: Hız hesapla (v = s / t)
    public static double calculateVelocity(double distance, double time) {
        // v = mesafe / zaman
        return 0.0; // Degistirin
    }

    // METOT 2: İvme hesapla (a = Δv / t)
    public static double calculateAcceleration(double velocityChange, double time) {
        // a = hiz degisimi / zaman
        return 0.0; // Degistirin
    }

    // METOT 3: Kuvvet hesapla (F = m * a)
    public static double calculateForce(double mass, double acceleration) {
        // F = kutle * ivme
        return 0.0; // Degistirin
    }

    // METOT 4: İş hesapla (W = F * d)
    public static double calculateWork(double force, double distance) {
        // W = kuvvet * mesafe
        return 0.0; // Degistirin
    }

    // METOT 5: Güç hesapla (P = W / t)
    public static double calculatePower(double work, double time) {
        // P = is / zaman
        return 0.0; // Degistirin
    }

    // METOT 6: Kinetik enerji (KE = 0.5 * m * v²)
    public static double calculateKineticEnergy(double mass, double velocity) {
        // KE = 0.5 * kutle * (hiz * hiz)
        // Math.pow(velocity, 2) kullanabilirsiniz
        return 0.0; // Degistirin
    }

    // METOT 7: Potansiyel enerji (PE = m * g * h)
    public static double calculatePotentialEnergy(double mass, double gravity, double height) {
        // PE = kutle * yercekimi * yukseklik
        return 0.0; // Degistirin
    }

    // METOT 8: Momentum (p = m * v)
    public static double calculateMomentum(double mass, double velocity) {
        // p = kutle * hiz
        return 0.0; // Degistirin
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== FIZIK FORMUL ASISTANI ===");
        System.out.println();

        // TEMEL OLCUMLER
        System.out.println("TEMEL OLCUMLER:");
        System.out.print("Kutle (kg): ");
        double mass = input.nextDouble();

        System.out.print("Mesafe (m): ");
        double distance = input.nextDouble();

        System.out.print("Zaman (s): ");
        double time = input.nextDouble();

        System.out.print("Hiz degisimi (m/s): ");
        double deltaV = input.nextDouble();

        System.out.print("Yukseklik (m): ");
        double height = input.nextDouble();

        // HESAPLAMALARI YAP - Metotlari cagir
        // 1. Hiz (v) hesaplanmali (KE ve Momentum icin gerekli)
        // 2. Ivme (a) hesaplanmali (Kuvvet icin gerekli)
        // 3. Kuvvet (F) hesaplanmali (Is icin gerekli)
        // 4. Is (W) hesaplanmali (Guc icin gerekli)
        // ... digerlerini hesaplayin
  


        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.println("\nHIZ ve HAREKET:");
        System.out.printf("  Hiz (v = s/t)             : %.2f m/s\n", velocity);
        System.out.printf("  Ivme (a = Δv/t)           : %.2f m/s²\n", acceleration);

        System.out.println("\nKUVVET ve IS:");
        System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", force);
        System.out.printf("  Is (W = F*d)              : %.2f J\n", work);
        System.out.printf("  Guc (P = W/t)             : %.2f W\n", power);

        System.out.println("\nENERJI:");
        System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", kineticEnergy);
        System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", potentialEnergy);
        // Toplam enerji = KE + PE
        System.out.printf("  Toplam Enerji             : %.2f J\n", (kineticEnergy + potentialEnergy)); 

        System.out.println("\nMOMENTUM:");
        System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", momentum);

        System.out.println("\n========================================");

        input.close();
    }
}


package v1;
import  java.util.Scanner;

public class FizikFormul {
    // yer çekimi sabiti
    final static double YER_CEKIMI = 9.8;
    // hız hesabı
    public static double calculateVelocity(double mesafe, double zaman){
        double hiz = (mesafe/zaman);
        return hiz;
    }
    // ivme hesabı
    public static double calculateAcceleration(double hiz_degisimi, double zaman){
        double ivme = hiz_degisimi / zaman;
        return ivme;
    }
    // kuvvet hesabı
    public static double calculateForce(double kutle, double ivme) {
        double kuvvet = kutle*ivme;
        return kuvvet;
    }
    //iş hesabı
    public static double calculateWork(double kuvvet, double mesafe) {
        double is = kuvvet*mesafe;
        return is;
    }
    //Güç hesabı
    public static double calculatePower(double is, double zaman) {
        double guc = is/zaman;
        return guc;
    }
    //Kinetik Enerji hesabı
    public static double calculateKineticEnergy(double kutle, double hiz) {
        double kinetik_enerji = 0.5 * kutle * Math.pow(hiz, 2);
        return kinetik_enerji;
    }
    //Potansiyel Enerji hesabı
    public static double calculatePotentialEnergy(double kutle, double YER_CEKIMI, double yukseklik) {
        double potansiyel_enerji =
        YER_CEKIMI* yukseklik * kutle;
        return potansiyel_enerji;
    }
    // Momentum hesabı
    public static double calculateMomentum(double kutle, double hiz) {
        double momentum = kutle * hiz;
        return momentum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // kullanıcıdan veriler alalım
        System.out.printf("\nKütleyi giriniz(kg): ");
        double kutle = input.nextDouble();
        System.out.printf("\nZamanı giriniz(s): ");
        double zaman = input.nextDouble();
        System.out.printf("\nMesafeyi giriniz(m): ");
        double mesafe = input.nextDouble();
        System.out.printf("\nYukseklik giriniz(m): ");
        double yukseklik = input.nextDouble();
        System.out.printf("\nHız Değişimini giriniz(m/s): ");
        double hiz_degisimi = input.nextDouble();

        System.out.printf("\n\n=================================== ");
        System.out.printf("\n       HESAPLAMA SONUÇLARI          ");
        System.out.printf("\n=================================== ");
        System.out.printf("\n\nHIZ VE HAREKET:");
        System.out.printf("\nHız (v=s/t)             :  %.2f m/s" , calculateVelocity(mesafe, zaman));
        System.out.printf("\nİvme (a=Δv/t)           :  %.2f m/s²" , calculateAcceleration(hiz_degisimi, zaman));
        System.out.printf("\n\nKUVVET VE İŞ:");
        double ivme = calculateAcceleration(hiz_degisimi,zaman);
        System.out.printf("\nKuvvet (F=m*a)          :  %.2f N"  , calculateForce(kutle,ivme));
        double kuvvet = calculatePower(ivme, kutle);
        System.out.printf("\nİş (W=F*d)              :  %.2f J" , calculateWork(kuvvet,mesafe));
        double is = calculateWork(kuvvet,mesafe);
        System.out.printf("\nGüç(P=W/t)              :  %.2f W" , calculatePower(is,zaman));
        System.out.printf("\n\nENERJİ");
        double hiz = calculateVelocity(mesafe, zaman);
        System.out.printf("\nKinetik Enerji (KE)     :  %.2f J" , calculateKineticEnergy(kutle,hiz));
        System.out.printf("\nPotansiyel Enerji (PE)  :  %.2f J" , calculatePotentialEnergy(kutle,YER_CEKIMI,yukseklik));
        double toplam_enerji = calculateKineticEnergy(kutle,hiz) + calculatePotentialEnergy(kutle,YER_CEKIMI,yukseklik);
        System.out.printf("\nToplam Enerji           :  %.2f J" , toplam_enerji);
        System.out.printf("\n\nMOMENTUM:");
        System.out.printf("\nMomentum (p=m*v)        :  %.2f kg.m/s" , calculateMomentum(kutle,hiz));
        System.out.printf("\n===================================");
        input.close();
    }
}
