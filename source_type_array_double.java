import java.util.Scanner;

public class source_type_array_double {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		double[] data = new double[4];
		//INISIALISASI VALUE
		data[0]= 23.122;
		data[1]= 12.5;
		data[2]= 7.73;
		data[3]= 4.43;
		//OPERASI VARIABEL
		double P = data[0] + data[1];
		//MENAMPILKAN NILAI
		System.out.println("---- operasi matematika------");
		System.out.println(" L : " + data[0]);
		System.out.println(" M : " + data[1]);
		System.out.println(" N : " + data[2]);
		System.out.println(" O : " + data[3]);
		System.out.println(" P : " + P);
		//MENGAMBIL IMPUT DARI KEYBOARD	
		double[] data2= new double[2];
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Tambahkan angka Desimal : ");
		data2[0] = keyboard.nextDouble();
		data2[1] = keyboard.nextDouble();
		System.out.println(" Q : " + data2[0]);
		System.out.println(" R : " + data2[1]);


	}

}
