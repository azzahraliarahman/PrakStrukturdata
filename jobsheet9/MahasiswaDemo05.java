package jobsheet9;

public class MahasiswaDemo05 {
    public static void main(String[] args) {
        //instasiasi stack tugas mahasiswa dengan kapasitas 5
        StackTugasMahasiswa05 stack = new StackTugasMahasiswa05(5);
        //Deklarasi scanner nama variabel scan bertipe int
        java.util.Scanner scan = new java.util.Scanner(System.in);

        //Menu untuk fasilitas pengguna dalam memilih operasi stack dalam mengelola tugas menggunakan do-while
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Tugas Mahasiswa");
            System.out.println("2. Nilai Tugas Mahasiswa");
            System.out.println("3. Lihat Tugas Mahasiswa Teratas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    if (!stack.isfull()) {
                        Mahasiswa05 m = new Mahasiswa05();
                        System.out.print("Masukkan NIM: ");
                        m.nim = scan.nextLine();
                        System.out.print("Masukkan Nama: ");
                        m.nama = scan.nextLine();
                        System.out.print("Masukkan Kelas: ");
                        m.kelas = scan.nextLine();
                        stack.push(m);
                    } else {
                        System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
                    }
                    break;
                case 2:
                    if (!stack.isempty()) {
                        Mahasiswa05 m = stack.pop();
                        System.out.print("Masukkan nilai untuk " + m.nama + ": ");
                        int nilai = scan.nextInt();
                        m.tugasDinilai(nilai);
                        System.out.println("Tugas " + m.nama + " dinilai dengan nilai: " + m.nilai);
                    } else {
                        System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
                    }
                    break;
                case 3:
                    if (!stack.isempty()) {
                        Mahasiswa05 m = stack.peek();
                        System.out.println("Tugas teratas:");
                        System.out.println("NIM: " + m.nim);
                        System.out.println("Nama: " + m.nama);
                        System.out.println("Kelas: " + m.kelas);
                    } else {
                        System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
                    }
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu yang tersedia.");
            }
        } while (pilihan != 4);
    }
}
