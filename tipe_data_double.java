import java.util.Scanner;

public class tipe_data_double {

	public static void main(String[] args) {
		// Deklarasi Variabel
		double a;
		double b;
		//Inisialisasi Value
		a = 23.122;
		b = 12.5;
		//operasi variabel
		double c = a + b;
		//Menampilkan nilai
		System.out.println("...Operasi Matematika...");
		System.out.println(" A : " + a);
		System.out.println(" B : " + b);
		System.out.println(" C : " + c);
		//Mengambil input dari keyboard
		double d;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Tambahkan Angka Desimal : ");
		d = keyboard.nextDouble();
		System.out.println();
		d = keyboard.nextDouble();
		System.out.println(" D : " + d);

	}

}
