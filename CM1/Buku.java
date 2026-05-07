package CM1;

public class Buku {

    String kodeBuku;
    String judulBuku;
    int tahunTerbit;

    public Buku(String kode, String judul, int tahun) {
        this.kodeBuku = kode;
        this.judulBuku = judul;
        this.tahunTerbit = tahun;
    }

    void tampilBuku() {
        System.out.println("    Kode Buku: " + kodeBuku + " | Judul: " + judulBuku + " | Tahun Terbit: " + tahunTerbit);
    }
    
}
