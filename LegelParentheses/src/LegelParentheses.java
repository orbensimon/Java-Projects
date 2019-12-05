import java.util.Scanner;

public class LegelParentheses{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.println("Plz enter a string:");
		String str=input.nextLine();
		int size,i,left=0,right=0;
		size=str.length();
		for(i=0;i<size;i++){
			if(str.charAt(i)=='(')
				left++;
			else if(str.charAt(i)==')')
				right++;
		}
		if(left==right)
			System.out.println("Legal!");
		else
			System.out.println("Ilegal!");
		input.close();
	}
}
