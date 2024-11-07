// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * lim);
		int b = (int) (Math.random() * lim);
		int c = (int) (Math.random() * lim);
		System.out.println(a + " " + b + " " + c);
		int minimum = Math.min(Math.min(a, b), c);
		int maximum = Math.max(Math.max(a, b), c);
		int middle = a + b + c - minimum - maximum;
		System.out.println(minimum + " " + middle + " " + maximum);
	}
}
