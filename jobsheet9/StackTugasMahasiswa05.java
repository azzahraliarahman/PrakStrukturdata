package jobsheet9;

public class StackTugasMahasiswa05 {
    // atribut
    Mahasiswa05[] stack;
    int top;
    int size;
    
    //Inisialisasi maks data dalam stack & mengeset indeks dari awal pointer top
    public StackTugasMahasiswa05(int size) {
        this.size = size;
        stack = new Mahasiswa05[size];
        top = -1;
    }
    
    //menegecek apakah tugas penuh atau tidak
    public boolean isfull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    
    //mengecek apakah tugas kosong atau tidak
    public boolean isempty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa05 m) {
        if (!isfull()) {
            top++;
            stack[top] = m;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
//Mengeluarkan tugas mahasiswa yang paling atas dari stack untuk dinilai
    public Mahasiswa05 pop() {
        if (!isempty()) {
            Mahasiswa05 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    //Melihat tugas mahasiswa yang paling atas tanpa mengeluarkannya dari stack
    public Mahasiswa05 peek() {
        if (!isempty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    //Menampilkan semua tugas mahasiswa yang ada dalam stack
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println("Nama: " + stack[i].nama + "\tNIM: " + stack[i].nim + ", Kelas: " + "\t" + stack[i].kelas + ", Nilai: " + stack[i].nilai);
        }

        System.out.println();

}
}
