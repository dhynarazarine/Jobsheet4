import java.util.Scanner;
public class MainFaktorial24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("==========================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
    
        Faktorial24 [] fk = new Faktorial24[elemen];
        for (int i = 0; i < elemen; i++){
            fk[i] = new Faktorial24();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("==========================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + "adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("==========================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + "adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("================================================");
    }
}