import java.util.Scanner ;
public class HkA
{

public static void main(String[] args)
{
System.out.println("============================================================");
System.out.println("                 Hukum Archimedes(Fa=pf*g*Vf)               ");
System.out.println("============================================================");
Scanner Scan= new Scanner(System.in); 

 int x=1;
        while(x >= 1){
System.out.print("Masukan pf(Kg/m3) : ");
double pf=Scan.nextDouble();
System.out.print("Masukan g(m/s2) : ");
double g=Scan.nextDouble();
System.out.print("Masukan Vf(m3) : ");
double Vf=Scan.nextDouble();
System.out.print("Masukan Mb(kg) : ");
double Mb= Scan.nextDouble();
double pb= Mb/Vf;
System.out.println("Massa jenis benda(pb) : "+pb+" Kg/m3 ");
double Fa= pf*g*Vf;
System.out.println("Nilai gaya angkat(Fa) : "+Fa+" N ");


if (pb==pf){
System.out.println("Benda Melayang");
}
else if (pb<=pf){
System.out.println("Benda Terapung");
}
else { 
System.out.println("Benda Tenggelam");
}
System.out.println("apakah anda ingin Mengulang Perhitungan? jika YA tekan angka yang bukan 0 dan jika TIDAK tekan angka 0");
int masuk = Scan.nextInt();
if(masuk==0) break;
}}}