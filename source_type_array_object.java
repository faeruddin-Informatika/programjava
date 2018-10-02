import java.util.Scanner;

public class source_type_array_object {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		Object[] animals= new Object[2];
		//INISIALISASI VALUE
		animals[0] = "horse";
		animals[1] = "crocodile";
		//MENAMPILKAN HASIL
		System.out.println("jenis peliharaan saya : " + animals[0]);
		System.out.println("jenis peliharaan saya : " + animals[1]);
		//MENGAMBIL IMPUT DARI KEYBOARD
		Object[] animals1= new Object[2];
		Scanner keyboard = new Scanner(System.in);
		System.out.println("masukkan nama kuda :");
		animals1[0] = keyboard.next();
		System.out.println("masukan nama buaya :");
		animals1[1] = keyboard.next();
		System.out.println("nama kuda saya : " + animals1[0]);
		System.out.println("nama kuda saya : " + animals1[1]);


	}

}
