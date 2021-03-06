import java.util.Scanner;

public class loan_calculator
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		//your code goes here
        int restante = amount;
		for (int m = 1; m <= 6; m++) {
			int pay = (int)Math.ceil(10/100.0*restante);
			restante -= pay;
		}
		System.out.println(restante);	
	}
}