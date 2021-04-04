package pkg;

import javax.swing.JOptionPane;

public class divide_and_conquer {

	
	public static int shift_zero(int var,int shift) {
		int i=0;
		while(i<shift) {
				var=var*10;
			i++;
		}
		return var;
	}
	public static int string_to_int(String str) {
		int i = Integer.parseInt(str);
		return i;
	}
	public static int multiplication(String first_value,String second_value ) {
		
		if(first_value.length()%2 != 0) {
			first_value="0"+first_value;	
		}
		if(second_value.length() %2 !=0) {
			second_value="0"+second_value;
		}		
		int i=0;
		int sum=0;
		while(i<first_value.length()) {
			String f_str=""+first_value.charAt(i);
				   f_str=f_str+first_value.charAt(i+1);
				   int len_first=first_value.length()-(i+2);
				   int j=0;
				   while(j<second_value.length()) 
				   {  
					   		String s_str=""+second_value.charAt(j);
					   		s_str=s_str+second_value.charAt(j+1);
					   		  
					   		int len_second=second_value.length()-(j+2);
					   		int all=len_first+len_second;

					   		int var=string_to_int(f_str);
					   		int var1=string_to_int(s_str);
					   		  
					   		sum=sum+shift_zero(var*var1,all);	   				 				   		  
					   j=j+2;
				   }
			i=i+2;
		}
		return sum;
	}
	public static void main(String[] args) {
		//String multiplicant ="4899";
		String multiplicant =JOptionPane.showInputDialog("Enter a First Number: ");
		//System.out.println(multiplicant);
		//String multiplyer="4599";
		String multiplyer= JOptionPane.showInputDialog("Enter a Second Number: ");
		//System.out.println(multiplyer);
		int result=multiplication(multiplicant,multiplyer);
		System.out.println("Result: "+result);
		
		//multiplication()
	}
}
