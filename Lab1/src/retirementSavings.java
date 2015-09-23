/*Cisc181 Lab1
 * Thompson, Alex
 */
import java.util.Scanner; 
import org.apache.poi.ss.formula.functions.FinanceLib;

public class retirementSavings {
	public static void main(String[] args){
		
		//Asking user for input variables
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter years to work");
		int yearsW = reader.nextInt();
		System.out.print("Enter annual return before retirement");
		Float annualW = reader.nextFloat();
		System.out.print("Enter number of years after retirement");
		int yearsR = reader.nextInt();
		System.out.print("Enter expected SSI income");
		int ssi = reader.nextInt();
		System.out.print("Enter annual return after retirement");
		Float annualR = reader.nextFloat();
		System.out.print("Enter income after retirement");
		int income = reader.nextInt();
		
		//Calculates PV value
		double PV;
		double r = (annualR/12);
		double n = 20*12;
		double y = income - ssi;
		double f = 0;
		PV = FinanceLib.pv(r,n,y,f, false);
		
		System.out.println(PV);
		
		//Calculates PMT Value
		double PMT;
		r = (annualW/12);
		n = 23*12;
		double p = 0;
		f = PV;
		PMT = FinanceLib.pmt(r, n, p, f, false);
			
		System.out.println(PMT);
		
	}

}
