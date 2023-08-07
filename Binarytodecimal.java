import java.util.Scanner;
class Main 
{
public static void main(String args[]) {
	try (Scanner scn = new Scanner(System.in)) {
        System.out.println("Enter a Binary Number : ");
		long binaryNumber = scn.nextLong();
		long decimalNumber = BinaryToDecimal(binaryNumber);
		System.out.println("Binary Number : " + binaryNumber);
		System.out.println("Decimal Number Equivalent : " + decimalNumber);
    }
    }
public static long BinaryToDecimal(long binaryNum)
	{
	long decimalEquivalent = 0;
	long lastDigit = 0;
	int power = 0;
    while(binaryNum > 0)
		{
		lastDigit = binaryNum % 10;
		decimalEquivalent += lastDigit * Math.pow(2, power);
		power++;
		binaryNum /= 10;
		}

		return decimalEquivalent;
	}
}
