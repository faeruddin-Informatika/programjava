import java.util.Scanner;

public class source_code_Byte {

	public static void main(String[] args) {
		// Deklarasi Variabel
		byte m;
		byte n;
		//Inisialisasi variabel
		m = 40;
		n = -10;
		//Mengambil Variabel dari Input Keyboard
		byte o;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Masukkan Nilai O");
		o = keyboard.nextByte();
		System.out.println("O : " + o);
		//Operasi Variabel
		byte l = (byte) (m + n - o);
		//Menampilkan Nilai Variabel
		System.out.println(" Hasil Operasi");
		System.out.println("L : " + l);
		System.out.println("M : " + m);
		System.out.println("N : " + n);
		System.out.println("O : " + o);
		
	}

}
