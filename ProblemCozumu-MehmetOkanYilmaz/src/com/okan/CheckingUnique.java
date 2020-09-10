package com.okan;
/*
 * mehmet okan yılmaz tarafından yazıldı
 */

import java.util.HashSet;
import java.util.Scanner;

public class CheckingUnique {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner tanımlandı.
		boolean next = true; // While koşulu tanımlandı.
		while (next) {
			System.out.println("Please enter a word:");
			String str = sc.next().toLowerCase(); // Kullanıcıdan test edilecek kelime alınıyor ve küçük harfe dönüştürülüyor.
			System.out.println("(\"" + str + "\") => " + new CheckingUnique().isUnique(str)); // test edilip sonucu
																								// ekrana yazdırılıyor.
			System.out.print("If you would like to try anotherone please type Y/y: ");
			String cont = sc.next(); // Yeni bir test isteği soruluyor.
			if (!cont.equalsIgnoreCase("Y"))
				next = false; // İstek değerlendiriliyor.
		}
		System.out.println("The program has been stopped."); // program sonlandırılıyor.
		sc.close(); // Scanner kapatılıyor

	}

	public boolean isUnique(String string) {
		/*
		 * Unique olma durmu şöyle kontrol ediliyor: Girilen kelime harflarine ayrılarak
		 * bir Hash Set içine aktarılıyor. Eğer kelime tekrar eden harfler içeriyorsa
		 * Hash Set yapısı gereği bunları ikinci kez almıyor. Hash Set eleman sayısıyla
		 * kelime uzunluğu eşit ise true sonucu dönüyor. Aksi durumda false sonucu
		 * dönüyor. Bu sayede kontrol sağlanmış oluyor. Boş kelime (0 elemanlı string)
		 * kontrolü yapılmadı (unit testte boş veri girişinde true yanıtı dönüyor).
		 */
		HashSet<String> chars = new HashSet<String>(); // Her kontrol durumu için yeni bir HAsh Set tanımlanıyor.
		for (int i = 0; i < string.length(); i++) {
			chars.add(string.charAt(i) + ""); // Girilen kelimenin harfleri ayrıştırılarak Hash Set'e ekleniyor.
		}

		return string.length() == chars.size(); // Hash Set ve kelimenin uzunluğu karşılaştırılıyor.
	}

}
