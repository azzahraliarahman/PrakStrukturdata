package minggu5;

import java.util.Scanner;

public class faktorial {

    int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto *= i;
        }
        return fakto;

    }

    int faktorialDC(int n) {
        if (n == 0) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        faktorial fk = new faktorial();
        System.out.println("Nilai faktorial" + nilai + " mengggunakan BF" + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial" + nilai + " mengggunakan DC" + fk.faktorialDC(nilai));
        input.close();

    }

}
