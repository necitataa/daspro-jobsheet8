import java.util.Scanner;

public class tugas323 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
        
        if (jumlahToko <= 0) {
            System.out.println("Jumlah toko harus minimal 1.");
        } else {
            int totalBarangSeluruhToko = 0;
            int maxBarangToko = -1;
            int tokoTerbanyak = 0;
            
            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("\nToko " + i);
                System.out.print("Masukkan jumlah pelanggan: ");
                int jumlahPelanggan = sc.nextInt();
                
                int totalBarangToko = 0;
                
                for (int j = 1; j <= jumlahPelanggan; j++) {
                    System.out.print("Masukkan jumlah barang yang dibeli pelanggan " + j + ": ");
                    int jumlahBarang = sc.nextInt();
                    totalBarangToko += jumlahBarang;
                }
                
                System.out.println("Toko " + i + " pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);
                
                totalBarangSeluruhToko += totalBarangToko;
                
                // Menentukan toko dengan barang terbanyak (jika sama, pilih yang nomor lebih kecil dengan tanda '>')
                if (totalBarangToko > maxBarangToko) {
                    maxBarangToko = totalBarangToko;
                    tokoTerbanyak = i;
                }
            }
            
            System.out.println("\nTotal barang seluruh toko: " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        
        sc.close();
    }
}
