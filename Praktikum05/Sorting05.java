package Praktikum05;

public class Sorting05 {

    int[] data;
    int jumData;

    // Constructor dipindah ke DALAM class dan namanya disamakan dengan nama class
    public Sorting05(int[] Data, int jmlDat) { // Tanda titik diubah menjadi koma
        jumData = jmlDat;
        data = new int[jumData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }
           public void bubbleSort() {
                for (int i = 0; i < jumData - 1; i++) {
                    for (int j = 0; j < jumData - i - 1; j++) {
                        if (data [j] > data[j + 1]) {
                            // Tukar data[j] dan data[j + 1]
                            int temp = data[j];
                            data[j] = data[j + 1];
                            data[j + 1] = temp;
                        }
                    }
                }
            }
                void tampilData() {
                    for (int i = 0; i < jumData; i++) {
                        System.out.print(data[i] + " ");
                    }
                    System.out.println();
                }

                    
            
    }

