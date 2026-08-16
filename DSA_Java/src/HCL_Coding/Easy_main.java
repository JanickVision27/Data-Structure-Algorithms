package HCL_Coding;

public class Easy_main {
	public static void main(String[] args) {
//		SwapTwoNum(5, 9);
//		ReverseNum("");
//		palindrome("radar");
//		FindLarSmal(new int[] { 10, 5, 3, 25 });
//		checkPrimeNum(9);
		findFactorial(5);

	}

	public static void SwapTwoNum(int a, int b) {
		System.out.println("Before Values Changing A: " + a);
		System.out.println("Before Values Changed B: " + b);

		int temp = a;
		a = b;
		b = temp;

		System.out.println("Values After changed A: " + a);
		System.out.println("Values After Changed B: " + b);
	}

	public static void ReverseNum(String word) {
		StringBuilder sb = new StringBuilder();

		for (int i = word.length() - 1; i >= 0; i--) {
			char ch = word.charAt(i);
			sb.append(ch);
		}

		System.out.println(sb);

	}

	public static void checkPrimeNum(int num) {
		boolean is_Prime = true;

		if (num <= 1) {
			is_Prime = false;
		} else {
			for (int i = 2; i * i <= num; i++) {
				if (num % i == 0) {
					is_Prime = false;
					break;
				}
			}

		}
		
		if(is_Prime) {
			System.out.println("This is a Prime Number: " + num);
		}
		else {
			System.out.println("This is not a Prime Number: " + num);
		}

	}
	
	public static void findFactorial(int num) {
		int sum = 1;
		
		if(num < 1) {
			System.out.println("This is not a Factorial");
		}
		
		for(int i = num; i >= 1; i--) {
			sum  = sum * i;
		}
		System.out.println("Total Factorial: " + sum);
	}
	
	

	public static void FindLarSmal(int[] val) {
		int check_max = val[0];
		int check_min = val[0];

		for (int i = 0; i < val.length; i++) {
			if (val[i] > check_max) {
				check_max = val[i];
			}

			if (val[i] < check_min) {
				check_min = val[i];
			}

		}

		System.out.println("Maximum Value in an array: " + check_max);
		System.out.println("Minimum Value in an Array: " + check_min);

	}
	

	public static void palindrome(String word) {
//		String real = word;
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i = word.length() - 1; i >= 0; i--) {
//			char ch = word.charAt(i);
//			sb.append(ch);
//		}
//		
//		String reverseWrd = sb.toString();
//		
//		if(real.equals(reverseWrd)) {
//			System.out.println("This is a Palindrome");
//		}
//		else {
//			System.out.println("This is not a Palindrome");
//		}

		int left = 0;
		int right = word.length() - 1;

		while (left < right) {
			if (word.charAt(left) != word.charAt(right)) {
				System.out.println("This is not a Palindrome");
				break;
			}
			left++;
			right--;
		}

		System.out.println("This is a Palindrome one");

	}
}
