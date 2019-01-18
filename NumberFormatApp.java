import java.text.NumberFormat;

public class NumberFormatApp
{

		static NumberFormat cf = 
		NumberFormat.getCurrencyInstance();

		public static void main(String[] args)
		{

			printMyAllowance();
			printCostofPaintBallGun();
		}

		public static void printMyAllowance()
		{
			double myAllowance = 5.00;
			cf = NumberFormat.getCurrencyInstance();
			System.out.println("My allowance: "
				+ cf.format(myAllowance));

		}

		public static void printCostofPaintBallGun()
		{
			double costOfPaintBallGun = 69.95;
			cf = NumberFormat.getCurrencyInstance();
			System.out.println("Cost of Paint Ball Gun: "
				+ cf.format(costOfPaintBallGun));

		}


}