import java.util.Scanner;

public class source_type_array_float {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL 
		float[] data = new float[4];
		//INISIALISASI VALUE
		data[0] = 40;
		data[1] = 22000;
		data[2] = 321;
		//OPERASI VARIABEL
		data[3] = data[0] + data[2];
		//MENAMPILKAN NILAI VARIABEL
		System.out.println("----nilai variabel----");
		System.out.println("M : " + data[0]);
		System.out.println("N : " + data[1]);
		System.out.println("O : " + data[3]);
		//MENGAMBIL INPUT DARI KEYBOARD
		float[] data2 = new float[2];
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Tambahkan data : ");
		data2[0] = keyboard.nextFloat();
		data2[1] = keyboard.nextFloat();
		System.out.println("P : " + data[0]);
		System.out.println("Q : " + data[1]);

	}

}
