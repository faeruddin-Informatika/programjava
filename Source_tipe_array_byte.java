import java.util.Scanner;

public class Source_tipe_array_byte {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		byte[] f = new byte[4];
		//INISIALISASI VALUE
		f[0] = 80;
		f[1] = 40;
		f[2] = 20;
		//OPERASI VARIABEL
		f[3] = 80-30;
		//MENAMPILKAN HASIL
		System.out.println("F1 : " + f[0]);
		System.out.println("F2 : " + f[1]);
		System.out.println("F3 : " + f[2]);
		System.out.println("F4 : " + f[3]);
		//MENGAMBIL IMPUT DARI KEYBOARD
		String[] angka_tambahan = new String[5];
		Scanner keyboard = new Scanner(System.in);
		for( int i = 0; i < angka_tambahan.length; i++ )
		{System.out.print(i);
		angka_tambahan[i] = keyboard.nextLine();}
		System.out.println("-angka tambahan--");
		for(int i=0;i<angka_tambahan.length;i++)
		{System.out.println(angka_tambahan[i]);};


	}

}
