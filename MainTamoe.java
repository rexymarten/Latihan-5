import java.util.Scanner;
public class MainTamoe {
    private static Object[] bukutamu;
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Maksimal Tamu\t: ");
        int jmlh = scn.nextInt();
        bukutamu1 buku[] = new bukutamu1[jmlh];
int banyak = 0;        
    do{
        System.out.println("-----------GUEST BOOK DIES NATALIS FILKOM-----------");
        System.out.println("Anda mendapat nomor ID\t:"+bukutamu1.idTamu());
        
        System.out.println("Nama Lengkap\t\t:");
        String n = in.next();
        System.out.println("Alamat Rumah / Kos\t:");
        String m = in.next();
        System.out.println("Nomor Telepon / Handphone\t:");
        String o = in.next();
        System.out.println("E-mail\t\t:");
        String p = in.next();
        bukutamu1[] tamu = null;
        
        tamu[banyak] = new bukutamu1(n,m,o,p);
        banyak++;
        
    }
    while (banyak<jmlh);{
        for(int a=0;a<banyak;a++);
          
        bukutamu[a].Display();
    }
        System.out.println("=========================");
    }
    

