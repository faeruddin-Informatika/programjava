import java.util.Scanner;

public class source_code_float {

	public static void main(String[] args) {
		//Deklarasi Variabel
		float lebar;
		float tinggi;
		//inisialisasi Variabel
		lebar = (float) 2.25;
		tinggi = (float) 8.00;
		//Mengambil Input dari Keyboard
		float panjang;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Masukkan Nilai Panjang");
		panjang = keyboard.nextFloat();
		System.out.println("panjang : " + panjang );
		//Operasi Variabel
		float luas = panjang * lebar * tinggi;
		//Menampilkan Nilai dari Variabel
		System.out.println("Mencari Nilai Luas");
		System.out.println("Panjang : " + panjang);
		System.out.println("Lebar : " + lebar);
		System.out.println("Tinggi : " + tinggi);
		System.out.println("Luas : " + tinggi);
		
		

	}
}
