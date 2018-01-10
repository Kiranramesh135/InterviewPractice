package com.java.interviewpractice;

public class ArrayLeftRotation {
	
	public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
//        int a[] = new int[n];
		
		int a[] = {1,2,3,4,5,6};
		
		int c[] = new int[a.length];
		int n = a.length;
		int k = 2;
//        for(int a_i=0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
        
        for(int i=0;i<n;i++) {
            int b = i-k;
            if(b<0) {
                b = n+b;
            }
            c[b] = a[i];
        }
        
        for(int j:c) {
        	System.out.print(j+" ");
        }
    }

}
