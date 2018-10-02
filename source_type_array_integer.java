import java.util.Scanner;

public class source_type_array_integer {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		int[] data= new int[4];
		//INISIALISASI VALUE
		data[0] = 21;
		data[1] = 32;
		data[2] = 32;
		//OPERASI VARIABEL
		data[3] = data[1] + data[2] / 2 - data[0] * 3;
		//MENAMPILAKAN NILAI VARIABEL
		System.out.println("---Nilai Variabel---");
		System.out.println("t : " + data[0]);
		System.out.println("u : " + data[1]);
		System.out.println("v : " + data[2]);
		System.out.println("w : " + data[3]);
		//MENGAMBIL VARIABEL DARI INPUT KEYBOARD
		int[] data2 = new int[2];
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Masukkan bilangan untuk menambah variabel : ");
		data2[0] = keyboard.nextInt();
		data2[1] = keyboard.nextInt();
		System.out.println("x : " + data[0]);
		System.out.println("x : " + data[1]);

	}

}
