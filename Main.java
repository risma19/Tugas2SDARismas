import java.io.*;
import java.util.Scanner;

public class Main {

    private static LinkedList list;

    public static void main(String[] args) throws IOException {
        list = new LinkedList();
        BufferedReader br = new BufferedReader(new FileReader("out.txt"));
        String str, title, name;
        int i;
        while ((str = br.readLine()) != null) {
            for (i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == ':') {
                    break;
                }
            }
            title = str.substring(i + 1, str.length());
            name = str.substring(0, i);
            list.add(new Data(name, title));
            i = 0;
        }do{
        list.SelectionSort();
        System.out.print("Silahkan pilih menu :\n---------------Linked List--------------- \n1.Tampilkan seluruh data Editor \n2.Cari berdasarkan Nama\n3.Cari Editor dan Judulnya\n4.keluar\n");
        option();
        br.close();
    }
        while(true);
    }

    public static void option() {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        try {
            
            
            
            // System.out.println("");
            if(value==1){
                list.display();
            }
            else if(value==2){
                System.out.print("\nMasukan nama yang anda cari :");
                    String nama = sc.next();
                    list.searchByName(nama);
            }
            else if(value==3){
                System.out.print("\nMasukan nama yang anda cari :");
                    String name = sc.next();
                    list.newSearch(name);
            }
            else if(value==4){
               System.exit(0);
            }
            else{
                    System.out.println("Pilihan tidak tersedia");
            }
        
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input salah, silahkan coba lagi");
            option();
        }
    }
}