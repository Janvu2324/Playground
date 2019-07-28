import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
        int sod = sum_of_numbers(n);
	    System.out.print(sod); // Function call
	}
    // Function to find the sum of numbers
	public static int sum_of_numbers(int num)
	{
	    int sod = (num*num);
	    return sod;
	}
} // End of Main class