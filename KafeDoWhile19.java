import java.util.Scanner;
public class KafeDoWhile19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti ;
        String namaPelanggan;
        int hargakopi = 12000, hargateh = 7000, hargaroti = 20000, totalharga;
    
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar) ; ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            
            totalharga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
            System.out.println("Total yang harus dibayar: Rp " + totalharga);
            sc.nextLine();
        } while (true);
        
        System.out.println("Semua transaksi selesai.");

        
    
}
}