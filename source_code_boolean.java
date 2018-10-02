import java.util.Scanner;

public class source_code_boolean {

	public static void main(String[] args) {
		// Deklarasi Variabel
		int a;
		int b;
		//Inisialisasi Variabel
		a = 2;
		b = 14;
		//Operasi Variabel Logika AND & OR
		boolean test_and = false;
		boolean test_or = false;
		test_and = (a < 14) && (b++ < 13);
		test_or = (a < 14)|| (b++ < 13);
		//Menampilkan Variabel & test
		System.out.println(" a : " + a);
		System.out.println(" b : " + b);
		System.out.println(" Logika AND : " + test_and);
		System.out.println(" Logika OR : " + test_or);
		//Mendapatkan input dari keyboard
		int c;
		boolean and = false;
		boolean or = false;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Masukkan nilai variabel");
		System.out.print("c :");
		c = keyboard.nextInt();
		and = (c < 14) && (b++ < c);
		or = (c < 14)|| (b++ < c);
		System.out.println("c : " + c);
		System.out.println(" Logika AND : " + and);
		System.out.println(" Logika OR : " + or);

	}

}
