package Main;

import java.util.Scanner;

public class Banka {

    private int alınan_para;
    static int ödenen_para;
    static double kalan_borc;
    static int taksit_sayısı;
    static int taksit_miktarı;
    static double faiz_oranı;

    static Scanner klavye = new Scanner(System.in);

    Banka(int alınan_para) {

    }

    public static void borcHesapla(int alınan_para, int ödenen_para, int taksit_sayısı) {
        System.out.println("1000 TL borcunuz var. peşin olarak ödediğiniz miktarı TL cinsinden yazınız: ");
        ödenen_para = klavye.nextInt();

        System.out.println("kaç taksit ile ödemek istersiniz? ");
        taksit_sayısı = klavye.nextInt();
        kalan_borc = (alınan_para - ödenen_para);
        System.out.println("kalan borç: " + kalan_borc);
    }

    public static double faizHesapla(int kalan_borc, int taksit_sayısı) {
        double faiz = 0;
        if (taksit_sayısı < 12) {
            faiz_oranı = 0;
            faiz = kalan_borc / taksit_sayısı;
        } else {
            faiz_oranı = 0.5;
            faiz = kalan_borc * 0.5 + kalan_borc / taksit_sayısı;
        }

        return faiz;
    }

    public static double taksitHesapla(double kalan_borc, int taksit_sayısı) {
        double taksit = kalan_borc / taksit_sayısı;
        return taksit;
    }

    public static void borcSil(int ödenen_para, int kalan_borc) {
        kalan_borc = kalan_borc - ödenen_para;

    }

    public static void main(String[] args) {

        System.out.println("bankamızın kaç yıllık üyesisiniz? ");
        int üyelik_süre = klavye.nextInt();

        if (üyelik_süre >= 12) {
            System.out.println("bir yıldan fazla süredir müşterimiz olduğunuz için sizleri SIFIR FAİZ ile destekliyoruz...\n işlemlerinize sıfırFaiz departmanımızdan devam ediyorsunuz...");

            SıfırFaiz sıfırFaiz = new SıfırFaiz(ödenen_para);

        } else {
            //Banka();
        }

        borcHesapla(1000, 100, 3);
    }
}
/**
 * Soru-1: bankalardaki faiz sorununa çözüm olacak bir soru hazırlayalım. Banka
 * isimli bir temel sınıf oluşturunuz. Bu sınıfın alınan para, ödenen para,
 * kalan borç, taksit sayısı, taksit miktarı isimli özellikleri bulunmalıdır.
 * alınan para özelliği private olarak tanımlanmalı. Bu sınıfın alınan para
 * özelliğini parametre olarak alan bir yapıcı (constructor) metodu
 * bulunmalıdır. bı yapıcı metod ödenen para ve taksit sayısı özelliklerine ilk
 * değerler atamalıdır. Banka sınıfının borç hesapla(), faiz hesapla(), taksit
 * hesapla(), borcSil() isimli metodları bulunmalıdır. Ayrıca temel sınıftan
 * SıfırFaiz isimli bir sınıf türetiniz. bu sınıf ise faizsiz kredi vermeli. BU
 * SINIF alınan paraya belirli oranlara göre herhangi bir ekleme yapmamalı.
 * bankanın 1 yıldan fazla süredir müşterisi olan kullanıcılar bu kısıma
 * yönlendirilip işlemlerine buradan devam etmelidir. KOLAY
 * GELSİN...BAŞARILAR... ::: FIRAT ÜNİVERSİTESİ TEKNOLOJİ FAKÜLTESİ YAZILIM
 * MÜHENDİSLİĞİ ALGORİTMA VE PROGRAMLAMA II 1. SORU :::
 */
