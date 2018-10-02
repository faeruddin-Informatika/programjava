import java.util.Scanner;

public class source_code_string {

	public static void main(String[] args) {
		// Deklarasi Variabel
		String nama, nim, jurusan;
		//Inisialisasi Value
		nama = "Faeruddin";
		nim = "DO217325";
		jurusan = "Teknik Informatika";
		//Operasi Variabel
		String kelas1 = "informatika";
		String kelas2 = "B";
		//Menampilkan Hasil
		System.out.println("Data Mahasiswa");
		System.out.println("Nama : " + nama);
		System.out.println("Nim : " + nim);
		System.out.println("Kelas : " + (kelas1 + kelas2));
		System.out.println("jurusan : " + jurusan);
		//Mengambil Variabel dari Input Keyboard
		String alamat;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("masukkan alamat : ");
		alamat = keyboard.next();
		System.out.println("alamat : " + alamat);

	}

}
