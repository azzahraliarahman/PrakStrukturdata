package minggu5;

public class MainUjian {
    public static void main(String args[]) {
        NilaiMahasiswa[] data = new NilaiMahasiswa[8];
        data[0] = new NilaiMahasiswa("Ahmad", "220101001", 2022, 78, 82);
        data[1] = new NilaiMahasiswa("Budi", "220101002", 2022, 85, 88);
        data[2] = new NilaiMahasiswa("Cindy", "220101003", 2021, 90, 87);
        data[3] = new NilaiMahasiswa("Dian", "220101004", 2021, 76, 79);
        data[4] = new NilaiMahasiswa("Eko", "220101005", 2023, 92, 95);
        data[5] = new NilaiMahasiswa("Fajar", "220101006", 2020, 88, 85);
        data[6] = new NilaiMahasiswa("Gina", "220101007", 2023, 80, 82);
        data[7] = new NilaiMahasiswa("Hadi", "220101008", 2020, 82, 84);

        int nilaiMax = tertinggiDC(data, 0, data.length - 1);
        int nilaiMin = terendahDC(data, 0, data.length - 1);

        System.out.println("Rata-rata nilai UAS: " + rataRataUAS(data));
        System.out.println("Nilai UTS tertinggi: " + nilaiMax);
        System.out.println("Nilai UTS terendah: " + nilaiMin);
    }

    static double rataRataUAS(NilaiMahasiswa[] mhs) {
        double total = 0;
        for (NilaiMahasiswa m : mhs) {
            total += m.nilaiUAS;
        }
        return total / mhs.length;
    }

    static int tertinggiDC(NilaiMahasiswa[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int compare = tertinggiDC(mhs, l, mid);
        int compare2 = tertinggiDC(mhs, mid + 1, r);
        return Math.max(compare, compare2);

    }

    static int terendahDC(NilaiMahasiswa[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int compare = terendahDC(mhs, l, mid);
        int compare2 = terendahDC(mhs, mid + 1, r);
        return Math.min(compare, compare2);
    }

}