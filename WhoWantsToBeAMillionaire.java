// Muhammad Reza Faturrahman - 2501977626

import java.util.Scanner;

public class WhoWantsToBeAMillionaire{
    static Scanner Input = new Scanner(System.in);
    
    public static void main(String[] args){
        int benar = 0;
        int salah = 0;
        int soal = 5;
        
        System.out.println("\n=== Who Wants To Be A Millionaire ===\n");
        
        // perja = Pertanyaan & Jawaban
        String[][] perja = {
            {"Apakah nama awal dari Manchester United ketika pertama kali berdiri?", "\nA. Newton Heath LYR FC \t\tB. Red Devils \nC. Manchunian \t\t\tD. United FC of Manchester", "A"},
            {"Pada tahun berapakah Indonesia merdeka?", "\nA. 16 Agustus 1945 \t\tB. 17 Agustus 1954 \nC. 1 Juli 1945 \t\t\tD. 17 Agustus 1945", "D"},
            {"Apakah mata uang negara Jepang", "\nA. Rupiah \t\tB. Rupee \nC. Yen \t\t\tD. Won", "C"},
            {"Siapakah pengarang novel Harry Potter?", "\nA. George R. R. Martin \t\tB. J. K. Rowling \nC. William Shakespeare \t\tD. Stephen King", "B"},
            {"Mana yang paling besar?", "\nA. Gigabyte \t\tB. Terabyte \nC. Byte \t\tD. Megabyte", "B"}
        };
        String[] jawabanUser = new String[(int) soal];
        
        for(int i = 0; i < 5; i++){
            System.out.print("" + (i+1) + ". " + perja[i][0] + " " + perja[i][1]);
            System.out.print("\nMasukkan Jawaban Anda (A s/d D): ");
            jawabanUser[i] = String.valueOf(Input.next().charAt(0));
            
            if(perja[i][2].equals(jawabanUser[i].toUpperCase())){
                System.out.println("\nJawaban Anda benar!");
                benar++;
            }
            else{
                System.out.println("\nSalah. Jawaban yang benar adalah " + perja[i][2]);
                salah++;
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.print("=== JAWABAN & HASIL PESERTA ===");
        System.out.print("\n\n");
        
        for(int i = 0; i < 5; i++){
            System.out.print((i+1) + ". " + jawabanUser[i].toUpperCase() + " -> ");
            
            if(perja[i][2].equals(jawabanUser[i].toUpperCase())){
                System.out.print("Benar");
            }
            else{
                System.out.print("Salah");
            }
            System.out.print("\n");
        }
        System.out.println("\nJawaban yang benar: " + benar);
        System.out.println("Jawaban yang salah: " + salah);
        System.out.println("Hasil: " + (benar * 20));
        System.out.print("\n=== Ujian Menguji Ingatanmu, Kehidupan Menguji Pembelajaranmu ===\n");
        System.exit(0);
    }
}