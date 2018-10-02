import java.util.Scanner;

public class source_type_array_long {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		long[] data= new long[3];
		//INISIALISASI VALUE
		data[0] = 15000000;
		data[1] = 22000000;
		//OPERASI VARIABEL
		data[2] = (long)(700000-2000000);
		//MENAMPILKAN HASIL
		System.out.println("J1 : " + data[0]);
		System.out.println("J2 : " + data[1]);
		System.out.println("J3 : " + data[2]);
		//MENGAMBIL IMPUT DARI KEYBOARD
		long[] data2 = new long[2];
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Tambahkan data Long : ");
		data[0] = keyboard.nextLong();
		data[1] = keyboard.nextLong();
		System.out.println("Data tambahan-----");
		System.out.println("J4 : " + data[0]);
		System.out.println("J4 : " + data[1]);


	}

}
