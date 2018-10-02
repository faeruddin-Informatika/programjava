import java.util.Scanner;

public class source_code_char {

	public static void main(String[] args) {
		// Deklarasi Variabel
		int nilai_1,nilai_2,nilai_3;
		char nilai1='M';
		char nilai2='N';
		//Inisialisasi Value
		nilai_1 = 30;
		nilai_2 = 70;
		//Operasi Variabel
		nilai_3 = 70-30;
		//Menampilkan Hasil
		if(nilai_1 >= 60){System.out.println("nilai 1 : " + nilai1);}
		else{System.out.println("nilai 1: " + nilai2);}
		if(nilai_2 >= 60){System.out.println("nilai 2 : " + nilai1);}
		else{System.out.println("nilai 2: " + nilai2);}
		if(nilai_3 >= 60){System.out.println("nilai 3 : " + nilai1);}
		else{System.out.println("nilai 3: " + nilai2);}
		System.out.println("..karena..");
		System.out.println("nilai 1 : " + nilai_1);
		System.out.println("nilai 2 : " + nilai_2);
		System.out.println("nilai 3 : " + nilai_3);
		//Mengambil Input dari Keyboard
		int O;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Masukkan nilai anda : ");
		O = keyboard.nextInt();
		if(O>=60){System.out.println("selamat nilai anda: " + nilai1);}
		else{System.out.println("selamat nilai anda: " + nilai2);}
		
		

	}

}
