import java.util.Scanner;

class Promote
{
	public static void main(String args[])
	{
		Scanner scin= new Scanner(System.in);
		System.out.println("Enter byte value : ");
		byte b = scin.nextByte(); // 42;
		System.out.println("Enter char value : ");
		char c=scin.next().charAt(0); //  'a';
		System.out.println("Enter short value : ");
		short s=scin.nextShort(); // 1024;
		System.out.println("Enter integer value : ");
		int i=scin.nextInt(); //  50000;
		System.out.println("Enter float value : ");
		float f=scin.nextFloat(); // 5.67f;
		System.out.println("Enter double value : ");
		double d=scin.nextDouble(); // .1234;
		
		double result = (f * b) + (i / c) - (d * s);
		System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
		System.out.println("result = " + result);
	}

}


/*

E:\JDK\javaprograms>java Promote
Enter byte value :
42
Enter char value :
a
Enter short value :
1024
Enter integer value :
50000
Enter float value :
5.67
Enter double value :
.1234
238.14 + 515 - 126.3616
result = 626.7784146484375

*/