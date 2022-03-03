import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        
        LinkedList<String> saya = new LinkedList<String>();
        System.out.println("==========================");
        System.out.println("\tLINKED LIST");
        System.out.println("==========================");

        // Nama Lengkap
        saya.add("K ");
        saya.add("H ");
        saya.add("A ");
        saya.add("L ");
        saya.add("I ");
        saya.add("L ");
        saya.add("A ");
        saya.add("M ");
        saya.add("I ");
        saya.add("R ");

        System.out.println("Nama          : " + saya);
        System.out.println("Jumlah Elemen : " + saya.size() + "\n");

        // 1. tambah karakter lain
        System.out.println("1.Tambah data ");
        String[][] nama = {{"A", "L", "P", "H", "A"},{"B", "E", "T", "H" ,"A"}};
        System.out.print("Elemen yang ditambah : ");
        for(int i = 0; i < nama.length; i++){
            for(int j = 0; j < nama[i].length; j++ ){
                System.out.print(nama[i][j] + ", ");
            }
        }
        for(int k = 0; k < nama[0].length ; k++){
            String temp = nama[0][k];
            saya.addFirst(temp);
            String temp2 = nama[1][k];
            saya.addLast(temp2);
        }
        System.out.println("\n" + "Setelah penambahan elemen :" + saya);
        System.out.println("Jumlah Elemen : " + saya.size() + "\n");

        // 2.Sisip karakter
        System.out.println("2.Sisip data ");
        System.out.println("Sebelum penambahan elemen :" + saya);
        String[] sisip = {"O", "W", "L",};
        System.out.print("Karakter yang aka disisip pada indeks 9-11: " );
        int j = 0;
        do{
            System.out.print(sisip[j] + ", ");
            j++;
        }while(j < sisip.length);
        
        saya.set(9, sisip[0]);  
        saya.set(10, sisip[1]); 
        saya.set(11, sisip[2]);  
        System.out.println("\nSetelah penyisipan elemen :" + saya);
        System.out.println("Jumlah Elemen : " + saya.size() + "\n");

        // 3.Hapus karakter
        System.out.println("3.Hapus data ");
        System.out.println("Sebelum penghapusan elemen :" + saya);
        System.out.println("Indeks elemen yang akan dihapus : 1, 2, 3" );
        int i = 0;
        while(i < 3){
            saya.remove(i);
            i++;
        }
        System.out.println("Setelah penghapusan elemen " + saya);
        System.out.println("Jumlah Elemen : " + saya.size() + "\n");

        // 4.Fungsi push
        LinkedList<String> request = new LinkedList<String>();
        System.out.println("4.Push data ");
        System.out.println("Sebelum PUSH data :" + request);
        System.out.println("Karakter yang akan di-push : 4, 0, 4, !");
        request.push("! ");
        request.push("4 ");
        request.push("0 ");
        request.push("4 "); 
        request.push("D ");
        request.push("N "); 
        request.push("U ");
        request.push("F "); 
        request.push("O "); 
        request.push("T "); 
        request.push("N ");
        request.push("O "); 
          
        System.out.println("Setelah PUSH data " + request);
        System.out.println("Jumlah Elemen : " + request.size() + "\n");

        // 5. Fungsi pop
        System.out.println("5.POP data ");
        System.out.println("Sebelum POP data :" + request);
        int y = 0;
        while(y < 4){
            saya.pop();
            System.out.println("Elemen yang di-pop : "+ request.pop());
            y++;
        }
        System.out.println("Setelah PUSH data " + request);
        System.out.println("Jumlah Elemen : " + request.size() + "\n");

        
    }
}
