package com.selenium.interviewpractice;

public class Test2 {
	
	public static void main(String[]args) {
		
		for(int j=100;j<=200;j++) {
			
			String temp = j+"";
			if(temp.length()>1) {
				for(int k=1;k<temp.length();k++){
					int counter = 1;
					if(temp.charAt(0)==temp.charAt(k)) {
						counter++;
					}
					else {
						System.out.println(temp);
					}
				
					
				}
			}
			
			
		}
	}

}
