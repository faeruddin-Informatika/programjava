import java.util.Scanner;

public class tipe_data_long {

	public static void main(String[] args) {
		// Mendeklarasi Variabel
		int j;
		int k;
		int l;
		//Inisialisasi Value
		j = 15000000;
		k = 22000000;
		//Operasi Variabel
		l =(int) (j+k);
		//Menampilkan nilai Variabel
		System.out.println(l);
		//Mengambil Variabel dari Input Keyboard
		Scanner keyboard = new Scanner(System.in);
		System.out.println("memasukkan nilai 1");
		long m = keyboard.nextLong();
		System.out.println("memasukkan nilai 2");
		long n = keyboard.nextLong();
		//Penjumlahan
		long O=(long) (m+n);
		System.out.println("hasil " + O);
		
	}

}
