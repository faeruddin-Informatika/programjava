import java.util.Scanner;

public class source_type_array_string {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		String[] mahasiswa = new String[6];
		//INISIALISASI VALUE
		mahasiswa[0] = "faeruddin";
		mahasiswa[1] = "aswad";
		mahasiswa[2] = "sayyidah nafisah";
		mahasiswa[3] = "nadra";
		mahasiswa[4] = "arnoldus renaldi";
		mahasiswa[5] = "ruslan";
		//OPERASI VARIABEL
		System.out.println("....DAFTAR Alamat....");
		String[] alamat = {"kamp baru","tammangalle","mamasa","kekkes","toraja","sendana"};
		for (String element: alamat) {System.out.println(element);}
		//MENAMPILKAN HASIL
		System.out.println("....PEMILIK Alamat....");
		for(int i=0;i<mahasiswa.length;i++){System.out.println((mahasiswa[i]));};
		//MENGAMBIL IMPUT DARI KEYBOARD
	    String[] mahasiswa_tambahan = new String[5];
	    Scanner keyboard = new Scanner(System.in);
	    for( int i = 0; i < mahasiswa_tambahan.length; i++ )
	    {System.out.print(i);
	    mahasiswa_tambahan[i] = keyboard.nextLine();}
	    System.out.println("--mahasiswa tambahan--");
	    for(int i=0;i<mahasiswa_tambahan.length;i++){System.out.println(mahasiswa_tambahan[i]);};



	}

}
