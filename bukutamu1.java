/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rexy
 */
public class bukutamu1 {

     private static String nama,alamat,email;
    private final String telpon;
    private static int id = 1;
    private static int jmlhtamu  = 0;
    public bukutamu1(String nm,String al,String em,String tel){
        nama = nm;
        alamat = al;
        telpon = tel;
        email = em;
        jmlhtamu++;
        
}
        public final String aksesNama(){
            return nama;
        }
public final String aksesAlamat(){
            return alamat;
}
public final String aksesEmail(){
            return email;
}
public final String aksesTelpon(){
            return telpon;
}

    public void Display(){
         System.out.println("Nama           : " +nama);
         System.out.println("Alamat         : " +alamat);
         System.out.println("Nomor Telepon  : "+ telpon);
         System.out.println("E-mail         :" + email);
    }
public static int idTamu(){
    return id;
}

}



