package CM1;

public class Peminjaman {

    Mhs mhs;
    Buku buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    public Peminjaman(Mhs mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void tampilPeminjaman() {
        System.out.println(mhs.nama + "| " + buku.judulBuku + " | Lama : " + lamaPinjam + "  | Terlambat: " + terlambat + "  | Denda: Rp " + denda);
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
   
        }
    }
    
    


