import java.util.Scanner;
public class parkir19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int durasi, jenis, total = 0;

        while (true) {
            System.out.println("Masukkan jenis kendaraan");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            
            jenis = sc.nextInt();
            
            if (jenis == 0) {
                break;
            }
            
            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid!");
                continue;
            }
            
            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();
            
            if (durasi > 5) {
                total += 12500;
            } else {
                if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }
            }
        }
        
        System.out.println("Total biaya parkir: Rp " + total);
    }
}
        
    
