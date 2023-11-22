import java.util.Scanner;

public class latihan11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== PROGRAM MENGHITUNG BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("Pilih (1/2/3)");
        int bangunDatar = in.nextInt();
        if (bangunDatar == 1) {
            System.out.println("=== PERSEGI ===");
            System.out.println("Masukan Panjang Sisi:");
            double sisi = in.nextDouble();
            System.out.println("Luas Persegi nya Adalah:" + luasPersegi(sisi));
            System.out.println("Keliling Perseginya Adalah:" + kelilingPersegi(sisi));
        }
        else if (bangunDatar == 2) {
            System.out.println("=== SEGITIGA ===");
            System.out.println("Masukan Panjang Alas:");
            double alas = in.nextDouble();
            System.out.println("Masukan Panjang Tinggi:");
            double tinggi = in.nextDouble();
            System.out.println("Luas Segitiga nya Adalah:" + luasSegitiga(alas, tinggi));
            System.out.println("Keliling Segitiga nya Adalah:" + kelilingSegitiga(alas));
        }
        else if (bangunDatar == 3) {
            System.out.println("=== LINGKARAN ===");
            System.out.println("Masukan Panjang Jari-Jari:");
            double jariJari = in.nextDouble();
            System.out.println("Luas Lingkaran nya Adalah:" + luasLingkaran(jariJari));
            System.out.println("Keliling Lingkaran nya Adalah:" + kelilingLingkaran(jariJari));
        }
    }

    static double luasPersegi(double sisi) {
        return (sisi * sisi);
    }

    static double kelilingPersegi(double sisi) {
        return (sisi * 4);
    }

    static double luasSegitiga(double alas, double tinggi) {
        return 0.5 * (alas * tinggi);
    }

    static double kelilingSegitiga(double alas) {
        return (alas * 3);
    }

    static double luasLingkaran(double jariJari) {
        return 3.14 * (jariJari * 2);
    }

    static double kelilingLingkaran(double jariJari) {
        return 2 * 3.14 * (jariJari);
    }
}
