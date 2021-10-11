import java.util.Scanner;
public class praktikumPer4 {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		String nama,alamat;
		char tipe;
		int bayar,kembalian,harga;

		System.out.println("Tipe A : Rp 5,000,000");
		System.out.println("Tipe B : Rp 2,000,000");
		System.out.println("Tipe C : Rp 1,000,000");

		System.out.print("Masukkan nama : ");
		nama = input.nextLine();
		System.out.print("Masukkan alamat : ");
		alamat = input.nextLine();
		System.out.print("Masukkan tipe pesawat : ");
		tipe = input.next().charAt(0);
		System.out.print("Total Bayar : ");
		bayar = input.nextInt();

		if (tipe == 'A'){
			harga = 5000000;
		} else if (tipe == 'B'){
			harga = 2000000;
		} else {
			harga = 1000000;
		}

		kembalian = bayar - harga;

		System.out.println("Nama : " +nama);
		System.out.println("Alamat : " +alamat);
		System.out.println("Kembalian : " +kembalian);


	}
} 