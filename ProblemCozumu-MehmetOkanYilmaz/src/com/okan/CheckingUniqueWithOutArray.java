package com.okan;
/*
 * mehmet okan yılmaz tarafından yazıldı
 */
import java.util.Scanner;

public class CheckingUniqueWithOutArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner tanımlandı.
		boolean next = true; // While koşulu tanımlandı.
		while (next) {
			System.out.println("Please enter a word:");
			String str = sc.next().toLowerCase(); // Kullanıcıdan test edilecek kelime alınıyor ve küçük harfe dönüştürülüyor.
			
			System.out.println("(\"" + str + "\") => " + new CheckingUniqueWithOutArray().isUnique(str)); // test edilip
																											// sonucu
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
		 * Bu yöntemde ise harflerin eşsiz olma durumu her bir harfin kelimedeki diğer
		 * harflerle kıyaslanması şeklinde kontrol ediliyor. Eğer herhangi bir harf kelimenin bir başka harfiyle eşleşirse false, eşleşmezse true döner.
		 */
		for (int i = 0; i < string.length(); i++) {
			for (int j = i + 1; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j)) {
					return false;
				}

			}
		}
		return true;
	}
}
