
public class ReverseNum {

	public static void main(String[] args) {
		ReverseNum in = new ReverseNum();
		int rev = in.revNum(346);
		System.out.println(rev);
	}

	
	public int revNum(int i) {
	int rev=0;
	do {
	rev = (rev*10) + i %10; //6	 , 0+6=6   60+ 34%10= 4  , 64*10=640+3%10=3, 640+3=643
	i = i /10; //34  34/10 = 3  3/10=0.3
	}while(i!=0);
	return rev;
}
}