import java.util.Scanner;

public class source_code_short {

	public static void main(String[] args) {
		// Deklarasi Variabel
		short m;
		short n;
		short o;
		// Inisialisasi Value
		m = 2000;
		n = 1300;
		//Operasi Variabel
		o =(short)(m+n);
		//Menampilkan Hasil
		System.out.println("m : " + m);
		System.out.println("n : " + n);
		System.out.println("o : " + o);
		//Mengambil Input dari Keyboard
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Tambahkan data");
		float p;
		p = keyboard.nextShort();
		System.out.println("p : " + p);

	}

}
