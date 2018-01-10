package com.java.interviewpractice;

public class Practice {

	public static void main(String[] args) {

//		factorial(6);
		// fibonacciWithoutRecursion(10);
		// fibonacciWithRecursion(10);
		// numberPalindrome(323);
		// stringPalindrome("malayalam");
		 primeNumber(16);
//		bubbleSort();
//		selectionSort();

	}

	public static void factorial(int n) {
		
		int f=1;
		for(int i=1;i<=n;i++) {
			f = f*i;
		}
		
		System.out.println(f);
		
	}

	public static void fibonacciWithoutRecursion(int count) {
		int n1 = 0, n2 = 1;
		int n3;

		System.out.println("Fibonacci series is as follows");
		System.out.print(n1 + "," + n2);

		for (int i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.print("," + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
	}

	public static void fibonacciWithRecursion(int count) {
		int n1 = 0, n2 = 1, n3 = 0;
		// int n1=0,n2=1;
		// int n3;

		// System.out.println("Fibonacci series is as follows");
		// System.out.print(n1+","+n2);
		if (count > 0) {
			n3 = n1 + n2;
			System.out.print("," + n3);
			n1 = n2;
			n2 = n3;
			fibonacciWithRecursion(count - 1);
		}
	}

	public static void numberPalindrome(int n) {
		int r, sum = 0, temp;

		temp = n;

		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}

		if (temp == sum) {
			System.out.println("Given number is a palindrome");
		}
		else {
			System.out.println("Given number is not a palindrome");
		}

	}

	public static void stringPalindrome(String s) {

		System.out.println("Actual String = " + s);
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println("Reverse string = " + rev);

		if (s.equals(rev)) {
			System.out.println("Given string is a palindrome");
		}
		else {
			System.out.println("Given string is not a palindrome");
		}
	}

	public static void primeNumber(int n) {
		
		int flag = 0;
		int m = n/2;
		
		for(int i=2; i<=m; i++) {
			if(n%i==0) {
				System.out.println("Given number is not a prime number");
				flag=1;
				break;
			}
			
		}
		if(flag==0) {
			System.out.println("Given number is a prime number");
		}
	}

	public static void bubbleSort() {

		int[] arr = { 3, 2, 5, 1, 4 };

		int n = arr.length, temp;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {

					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;

				}
			}
		}

		for (int a : arr) {

			System.out.print(a + " ");
		}

	}
	
	public static void selectionSort() {
		
		int[] n = {3,6,2,7,4,1};
		int index;
		
		for(int i=0;i<n.length-1;i++) {
			index = i;
			for(int j=i+1;j<n.length;j++) {
				if(n[j]<n[index]) {
					index = j;
				}
			}
			
			int smallestNum = n[index];
			n[index] = n[i];
			n[i] = smallestNum;
		}
		
		for(int k:n) {
			System.out.print(k+" ");
		}
	}
}
