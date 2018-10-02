import java.util.Scanner;

public class source_code_array_boolean {

	public static void main(String[] args) {
			// Deklarasi Variabel
			int[] data = new int[4];
			//Inisialisasi Value
			data[0] = 14;
			data[1] = 7;
			data[2] = 8;
			data[3] = 4;
			//Operasi Variabel Logika AND & OR
			boolean test_and = false;
			boolean test_or = false;
			test_and = (data[0] < 14) && (data[1] < 13);
			test_or = (data[3]< 14)|| (data[4] < 13);
			//Menampilkan Hasil
			System.out.println("Nilai...");
			for(int i=0;i<data.length;i++){System.out.println((data[i]));};
			System.out.println(" Logika AND : " + test_and);
			System.out.println(" Logika OR : " + test_or);
			//Mengambil input dari keyboard
			int [] nilai = new int[4];
			boolean and = false;
			boolean or = false;
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Masukkan nilai variabel");
			System.out.print("nilai 1 : ");
			nilai[0] = keyboard.nextInt();
			System.out.print("nilai 2 : ");
			nilai[1] = keyboard.nextInt();
			System.out.print("nilai 3 : ");
			nilai[2] = keyboard.nextInt();
			System.out.print("nilai 4 : ");
			nilai[3] = keyboard.nextInt();
			and = (data[0] < 14) && (data[1] < 13);
			or = (data[2]< 14)|| (data[3] < 13);
			for(int i=0;i<nilai.length;i++){System.out.println((data[i]));};
			System.out.println(" Logika AND : " + and);
			System.out.println(" Logika OR : " + or);

	}

}
