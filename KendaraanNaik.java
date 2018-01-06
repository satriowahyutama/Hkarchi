import java.util.Scanner;
public class KendaraanNaik
    {
        public static void main(String args[])
        {
	    System.out.println(" Pilihan Kendaraan Yang Ingin dinaiki ");	
            System.out.println(" 1. Pesawat Terbang ");
            System.out.println(" 2. Kereta Api");
            System.out.println(" 3. Bus");
            System.out.println(" 4. Taksi");
            System.out.println(" 5. Mobil Pribadi");
            System.out.println(" 6. Motor");
            Scanner masuk = new Scanner(System.in);
            System.out.println("Masukan Pilihan Kendaraan : ");
            int ken = masuk.nextInt();
            switch (ken) 
            {
                case 1:
                    System.out.println(" 1. Pesawat Terbang ");
                    break;
                case 2:
                    System.out.println(" 2. Kereta Api ");   
                    break;
                case 3:
                    System.out.println(" 3. Bus"); 
                    break;
                case 4:
                    System.out.println(" 4. Taksi");
                    break;
                case 5:
                    System.out.println(" 5. Mobil Pribadi");
                    break;
                case 6:
                    System.out.println(" 6. Motor");
                    break;
                default:
                    System.out.println(" Anda Salah Memilih");
                    break;
             }
        }
    }