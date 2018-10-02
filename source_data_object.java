import java.util.Scanner;

public class source_data_object {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		Object horse = new Object();
		Object crocodile = new Object();
		//INISIALISASI VALUE
		horse = "brayen";
		crocodile = "oyen";
		//MENAMPILKAN HASIL
		System.out.println("nama kuda saya : " + horse);
		System.out.println("nama buaya saya : " + crocodile);
		//MENDAPATKAN INPUT DARI KEYBOARD
		Object turtle = new Object();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("masukkan nama kura-kura :");
		turtle = keyboard.next();
		System.out.println("Nama kura-kura saya : " + turtle);


	}

}
