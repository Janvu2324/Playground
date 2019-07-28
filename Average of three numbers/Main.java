import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int sum,avg;
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
     int num2 = in.nextInt();
      int num3 = in.nextInt();
     sum=num1+num2+num3;
      avg=sum/3;
      System.out.println(avg);
	}
}



