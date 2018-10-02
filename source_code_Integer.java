import java.util.Scanner;

public class source_code_Integer {

	public static void main(String[] args) {
		// Deklarasi Variabel
		int t;
		int u;
		int v;
		//Inisialisasi Value
		t = 21;
		u = 32;
		v = 32;
		//Operasi Variabel
		int w = u + v / 2 - t * 3;
		//Menampilkan nilai variabel
		System.out.println("...Nilai Variabel...");
		System.out.println("t : " + t);
		System.out.println("u : " + u);
		System.out.println("v : " + v);
		System.out.println("w : " + w);
		//Mengambil Variabel dari input keyboaard
		int f;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Masukkan bilangan untuk menambah variabel : ");
		f = keyboard.nextInt();
		System.out.println("f : " + f);
		
		
		

	}

}
