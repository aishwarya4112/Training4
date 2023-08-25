
public class FibonacciCode {

	public static void main(String[] args) {
		int n = 20, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci seires till"  + n +  "Term:");
		
		for(int i = 1; i<=n; ++i) {
			System.out.print(firstTerm + " ,");
		
		int nextTerm = firstTerm + secondTerm;
		firstTerm = secondTerm;
		secondTerm = nextTerm;

	}}

}
