package ExamMenuDalamMenuArray1dan2DimensiSortDanSearch;

import java.util.Scanner;
import java.util.Arrays;


public class Week3_MenuArray1dan2_SortingDanSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // cobadulu bos

        // penampung nilai yang sementara di value null
        int[] dataArray1 = null;
        int [][] dataArray2 = null;


        Character submenu1;
        Character submenu2;
        int menu;

        while (true){// membuat kondisi yang tidak bisa terpenuhi dan apabila  terpenuhi program akan brhenti
            System.out.println("\n Menu : ");
            System.out.println(" 1. Array 1 dimensi ");
            System.out.println(" 2. Array 2 dimensi ");
            System.out.println(" 3. exit ");

            System.out.print(" input nomor menu : ");
            menu = input.nextInt(); // value menu akan mengikuti inputan user ini

            switch (menu){
                case 1: // case untuk masuk ke array 1 dimensi
                    while (true){// membuat kondisi yang tidak bisa terpenuhi dan apabila  terpenuhi program akan brhenti
                        System.out.println("\n SubMenu : ");
                        System.out.println(" a. input Array 1 dimensi ");
                        System.out.println(" b. sort Array 1 dimensi ");
                        System.out.println(" c. search Array 1 dimensi ");
                        System.out.println(" d. exit submenu");

                        System.out.print(" input huruf submenu : ");
                        submenu1 = input.next().charAt(0); // value menu akan mengikuti inputan user ini
                        switch (submenu1){
                            case 'a':
                                System.out.print("Masukkan Panjang Array Integer : ");
                                int panjang = input.nextInt();
                        
                                dataArray1 = new int[panjang];

                                for (int i = 0; i < panjang; i++ ){
                                    System.out.print("data Array ke " + "[ " + i +" ] : ");
                                    dataArray1[i] = input.nextInt();
                                }
                        
                                // menampilkan dengan foreach
                                System.out.println("panjang array integer adalah " + panjang);
                                System.out.print("Isi Array Adalah : [ ");
                                for (int nilai : dataArray1) {
                                    System.out.print(nilai + " ");
                                }
                                System.out.println(" ]");
                                break;
                            case 'b':
                                //Menampilkan Data Sebelum Sorting
                                System.out.println("Data Sebelum Di Sorting");
                                //Proses Menampilkan Data
                                for(int nilai : dataArray1){
                                    System.out.print(nilai + " ");
                                }
                                
                                if (dataArray1.length == 0) {
                                    System.out.println("Array belum diinputkan!");
                                   break;
                                }

                                 // Algoritma Sorting Binary Search
                                for (int i = 0; i < dataArray1.length - 1; i++) {
                                    for (int j = 0; j < dataArray1.length - 1 - i; j++) {
                                        if (dataArray1[j + 1] < dataArray1[j]) {
                                            int temp = dataArray1[j];
                                            dataArray1[j] = dataArray1[j + 1];
                                            dataArray1[j + 1] = temp;
                                        }
                                    }
                                }
                                
                                
                                System.out.println();
                                //	Tampilkan hasil akhir
                                System.out.println("Hasil akhir setelah di sorting: "+ Arrays.toString(dataArray1));
                                break;
                            case 'c':
                                 // Algoritma Binary Search
                                 System.out.print("Masukkan Target yang diinginkan : ");
                                 int target = input.nextInt();
 
                                 int left = 0;
                                 int middle;
                                 int right = dataArray1.length - 1;
                                 while (left <= right) {
                                     middle = (left + right) / 2;
                                     if (dataArray1[middle] == target) {
                                         System.out.println("Target " + target + " berada pada index ke- " + middle);
                                         break;
                                     } else if (dataArray1[middle] < target) {
                                         left = middle + 1;
                                     } else if (dataArray1[middle] > target) {
                                         right = middle - 1;
                                     }
                                 }
                                 if ( left > right){
                                     System.out.println("target not found ");
                                 }
                                break;
                            case 'd':
                                // keluar dari loop submenu
                                break;
                            default:
                                System.out.println("not found");
                            }
                            
                            // keluar dari loop submenu jika user memilih kembali ke menu utama
                            if (submenu1 == 'd') {
                                break;
                            }                                                              
                    }
                    continue; // kembali ke awal loop utama setelah keluar dari loop submenu

                case 2:
                    while (true) {
                        System.out.println("\n SubMenu : ");
                        System.out.println(" a. input Array 2 dimensi ");
                        System.out.println(" b. sort Array 2 dimensi ");
                        System.out.println(" c. search Array 2 dimensi ");
                        System.out.println(" d. exit submenu");

                        System.out.print(" input huruf submenu : ");
                        submenu2 = input.next().charAt(0);

                        switch (submenu2) {
                            case 'a':

                                System.out.print("Masukkan baris Array Integer : ");
                                int baris = input.nextInt();
                                System.out.print("Masukkan kolom Array Integer : ");
                                int kolom = input.nextInt();

                                dataArray2 = new int[baris][kolom];
                                
                                for (int i = 0; i < baris; i++ ){
                                    for (int j =  0; j < kolom; j++){
                                        System.out.print("index ke " + "[ " + i +" ] " + "[ " + j + " ] : ");
                                        dataArray2[i][j] = input.nextInt();
                                    }
                                }
                        
                                // menampilkan data yang ada dalam array
                                System.out.println("Baris dan kolom yang dimasukkan adalah : ");
                                for (int i = 0; i < baris; i++) {
                                    for (int j = 0; j < kolom; j++) {
                                        System.out.print(dataArray2[i][j] + "  ");
                                    }
                                    System.out.println();
                                }
                                break;

                            case 'b':
                                /*
                                *  Algoritma untuk sorting array 2 dimensi per baris
                                * 1. mengubah array 2 dimensi menjadi 1 dimensi
                                * 2. lalu setelah jadi 1 dimensi di sorting
                                * 3. setelah di sorting dijadiin lagi dari array 1 dimensi jadi 2 dimensi
                                * */



                                System.out.println("\nPanjang Array Adalah : {" + dataArray2.length+"}{" + dataArray2[0].length+"}");
                                System.out.println("Nilai Array Sebelum Sorting Adalah : ");
                                //Proses Untuk Menampilkan Data Array 2 Dimensi
                                for (int i =0; i<dataArray2.length;i++){
                                    for(int j = 0; j<dataArray2[i].length;j++){
                                        System.out.print(dataArray2[i][j] + "\t");
                                    }
                                    System.out.println();
                                }

                                if (dataArray2.length == 0) {
                                    System.out.println("Array belum diinputkan!");
                                    break;
                                }

                                // Algoritma untuk booble sort
                                int[] arrDuaDim = new int[dataArray2.length * dataArray2[0].length];
                                int k = 0;
                                for (int i = 0; i < dataArray2.length; i++) {
                                    for (int j = 0; j < dataArray2[0].length; j++) {
                                        arrDuaDim[k] = dataArray2[i][j];
                                        k++;
                                    }
                                }
                                Arrays.sort(arrDuaDim);

                                //output sorting
                                System.out.println("Array setelah di sorting adalah");
                                k = 0;
                                for (int i = 0; i < dataArray2.length; i++) {
                                    for (int j = 0; j < dataArray2[0].length; j++) {
                                        dataArray2[i][j] = arrDuaDim[k];
                                        System.out.print(dataArray2[i][j] + " ");
                                        k++;
                                    }
                                    System.out.println();
                                }
                                break;

                            case 'c': //seaching
                                if (dataArray2.length == 0) {
                                    System.out.println("Array belum diinputkan!");
                                    break;
                                }
                                System.out.print("Masukkan angka yang akan di searching : ");
                                int hasil = input.nextInt();
                                boolean search = false;
                                for (int i = 0; i < dataArray2.length; i++) {
                                    for (int j = 0; j < dataArray2[0].length; j++) {
                                        if (dataArray2[i][j] == hasil) {
                                            System.out.println(hasil + " ditemukan pada index [" + i + "," + j + "]");
                                            search = true;
                                            break;
                                        }
                                    }
                                    if (search) {
                                        break;
                                    }
                                }
                                if (!search) {
                                    System.out.println(hasil + "angka tidak ada di array.");
                                }
                                break;
                            case 'd':
                                // keluar dari loop submenu2
                                break;
                            default:
                                System.out.println("pilihan tidak valid");
                            }
                            
                            // keluar dari loop submenu2 jika user memilih kembali ke menu utama
                            if (submenu2 == 'd') {
                                break;
                            }    

                            continue; // kembali ke awal loop utama setelah keluar dari loop submenu2

                                                        
                        }

                case 3:
                        // keluar dari loop utama
                    System.out.println("Terima kasih");
                    return;
                
                default:
                    System.out.println("Pilihan tidak valid");
                    break;






                    }

                        }






                    }

            }



    


