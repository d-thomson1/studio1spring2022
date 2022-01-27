package studio1;
import support.cse131.ArgsProcessor;
public class Average {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		// TODO Auto-generated method stub
		int s0 = ap.nextInt("Enter value for s0");
		int s1 = ap.nextInt("Enter value for s1");
		double average = (double)(s1+s0)/2;
		System.out.println("average" + average);
	}

}
