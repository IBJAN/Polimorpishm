package Aplikasi;
import Tiket.Marvel;
import Tiket.info;
import Tiket.moviee;
import Tiket.info;

public class main {
    public static void main(String[] args) {

//     pemanggilan objek dengan klas parent dan anak.
//     jika dengan klas parent maka  yg akan dipakai adalah yang ada pada method parent
        moviee n = new moviee();
        n.setJudul("spiderman");
        n.negara();
        n.setTahun(2000);

        System.out.println(n.getJudul());
        System.out.println(n.getTahun());

        System.out.println("=========================perbandingan polimorpishme 1================================");
        moviee m = new Marvel();
        m.setJudul("Iron man");
        m.negara();
        m.tahun();

        System.out.println(m.getJudul());
        System.out.println();





        System.out.printf("============================perbandingan polymorpishm 2=============================");
//        System.out.println(---------------------------Metode 2------------------------------------);

//  Solusi 2


//    hasil null
        moviee mov = new Marvel();

        info i = new info();
        i.informasi(m);

//        hasil modifikasi
moviee mo = new moviee();
        mo.setJudul("Captain America");
        mo.setTahun(2000);
        mo.setNegara("Amerika");

        info in = new info();
        in.informasi(mo);





    }
}
