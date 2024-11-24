import java.util.Scanner;

public class bai6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Chon 1 dang toan de giai: ");
		System.out.println("1. Phuong trinh bac 1");
		System.out.println("2. He phuong trinh bac 1");
		System.out.println("3. Phuong trinh bac 2");
		System.out.println("4. Thoat");
				
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			GiaiPTBacMot(sc);
			break;
		case 2:
			GiaiHePTBacMot(sc);
			break;
		case 3:
			GiaiPTBacHai(sc);
			break;
		case 4:
			System.out.println("End");
			break;
		default:
			System.out.println("Invalid");
		}
		sc.close();		
				
	}

	private static void GiaiPTBacMot(Scanner sc) {
		System.out.println("ax+b=0");
		System.out.print("a: ");
		double a = sc.nextDouble();
		System.out.print("b: ");
		double b = sc.nextDouble();
		
		if (a == 0) {
			System.out.println("Warning: a != 0");
		} else {
			double x = -b / a;
			System.out.println("Nghiem cua pt " + a + "x + " + b +" = 0 la x = " + x);
		}
	}
	private static void GiaiHePTBacMot(Scanner sc) {
		System.out.println("HPT bac 1");
		System.out.print("a11: ");
		double a11 = sc.nextDouble();
		System.out.print("a12: ");
		double a12 = sc.nextDouble();
		System.out.print("b1: ");
		double b1 = sc.nextDouble();
		System.out.print("a21: ");
		double a21 = sc.nextDouble();
		System.out.print("a22: ");
		double a22 = sc.nextDouble();
		System.out.print("b2: ");
		double b2 = sc.nextDouble();
		
		double D = a11 * a22 - a12 * a21;
		double D1 = b1 * a22 - b2 * a12;
		double D2 = a11 * b2 - a21 * b1;

		if (D == 0) {
			if (D1 == 0 && D2 == 0) {
				System.out.println("Vo so nghiem");
			} else {
				System.out.println("Vo nghiem");
			}
		} else {

			double x1 = D1 / D;
			double x2 = D2 / D;
			System.out.println("He phuong trinh\n" + a11 + "x1 + " + a12 + "x2 = " + b1 +
					"\n" + a21 + "x1 + " + a22 + "x2 = " + b2 + "\n" +
					"x1 = " + x1 + "\n" +
					"x2 = " + x2);
		}
	}

	private static void GiaiPTBacHai(Scanner sc) {
		System.out.println("ax^2 + bx + c = 0");
		System.out.print("a: ");
		double a = sc.nextDouble();
		System.out.print("b: ");
		double b = sc.nextDouble();
		System.out.print("c: ");
		double c = sc.nextDouble();
		
		if (a == 0) {
			System.out.println("a != 0");
		} else {
			double D = b * b - 4 * a * c;
			
			if (D > 0) {
				double x1 = (-b + Math.sqrt(D)) / (2 * a);
				double x2 = (-b - Math.sqrt(D)) / (2 * a);
				System.out.println("x1 = " + x1 + " va x2 = " + x2 + "\n");		
			} else if (D == 0) {
				double x = -b / (2 * a);
				System.out.println("x = " + x);
			} else {
				System.out.println("Vo nghiem");
			}
		}
	}
}
