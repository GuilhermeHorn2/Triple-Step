package misc;

import java.util.ArrayList;
import java.util.Scanner;


public class main_misc2 {
	
	
	
	public static void main(String[] args) {
	//(a+b)%k = ((a % k)+(b % k)) % k    || ||
	
		System.out.println(stair_case(4));
	
	}	
	
	private static int stair_case(int n) {
		
		return stair_case(n,new int[n+1]); 
		
	}
	
	private static int stair_case(int n,int [] memo){
		
		if(n == 1) {
			// 1 = 1
			return 1;
		}
		if(n == 2) {
			// 1+1 = 2;2 = 2
			return 2;
		}
		if(n == 3) {
			// 1+1+1 = 3; 1 + 2 = 3; 2 + 1 = 3; 3 = 3
			return 4;
		}
		if(memo[n] != 0) {
			return memo[n];
		}
		int count = 0;
		for(int i = 1;i <= 3;i++){
			if(n-i > 0){
				count += stair_case(n-i);
			}
		}
		memo[n] = count;
		return count;
	}
	
	} 
	
