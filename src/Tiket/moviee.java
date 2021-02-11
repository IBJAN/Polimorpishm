package Tiket;

public class moviee {
    private String judul;
    private int tahun;
    private String negara;

//  nilai default untuk negara jika objeknya klas parent dan anak
    public void negara(){
        System.out.println("Default");

    }
    public void tahun(){
        System.out.println("Default");

    }



    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }



}
