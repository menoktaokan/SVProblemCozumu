package com.okan;

/*
 * mehmet okan yılmaz tarafından yazıldı
 */
import java.util.Scanner;

public class SumWithoutArithmeticOperators {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int x;
		int y;

		try {
			sc = new Scanner(System.in);
			System.out.print("Enter the numbers to be added\nFirst one: ");
			x = sc.nextInt();

			System.out.print("Second one: ");
			y = sc.nextInt();

			System.out.println("The Summation is: " + new SumWithoutArithmeticOperators().add(x, y));
		} catch (Exception e) {
			System.out.println("\nThis is not a number!");
		}

		System.out.println("Good bye!");
		sc.close();
		System.exit(0);

	}

	/*
	 * Dürüst olmak gerekirse daha önce hiç bitwise işlemlerini kullanarak aritmetik
	 * işlemleri yapmamıştım. Benim aklımda toplanacak sayılar (a ve b diyelim)
	 * kadar eleman içeren int tipinde arrayler oluşturp bu arraylerin elemanlarını
	 * 1 yapmak ve başka daha büyük bir arrayin (mesela 1000 büyüklüğünde) manipüle
	 * edilmesiyle sonuca ulaşmak geldi. Ancak her defasında bir iteratör gerekti ve
	 * bu sırada + işlemine ihtiyaç duydum. Bu sebeple aklımdaki yöntemi
	 * uygulayamadım. İnterntte küçük bir araştırma yapınca bunun daha önce çözülmüş
	 * bir problem olduğunu ve güvenilir bir yöntemi olduğunu gördüm. Bu yöntemi
	 * çözümüme ekledim. Bu yöntem global bir çözüm ve benim tarafımda yazılmamış
	 * olduğu için yöntemi açıklamaya ihtiyaç duymuyorum.
	 */
	public int add(int x, int y) {
		int carry;
		while (y != 0) {
			carry = x & y;
			x = x ^ y;
			y = carry << 1;
		}
		return x;
	}

}
