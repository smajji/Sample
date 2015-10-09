public class FibonacciTest {
	static int  i=0;
	public static long Fibonacci(long d, long n1, long n2) {
//		System.out.println(i++);
		System.out.println(n1);
		if (d == 0)
			return n1;
		else
			return Fibonacci(d - 1, n2, n2 + n1);
	}

	public static void main(String s[]) {
		System.out.println(Fibonacci(10, 0, 1));
	}
}
