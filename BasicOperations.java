import java.util.*;
public class BasicOperations{
	//function to add two very**100 numbers
	//function call : new BasicOperations().add("str","str");
	//return 	: String 
	public String add(String x,String y){
		//init
		String result="";
		LinkedList<Character> xl=new LinkedList<Character>();
		LinkedList<Character> yl=new LinkedList<Character>();

		//swap the numbers by conditions
		if(x.length()<y.length()){
			String temp=y;
			y=x;
			x=temp;
		}

		//set the numbers into linked list
		for(int a=0;a<x.length();a++){
			xl.push(x.charAt(a));
		}
		for(int a=0;a<y.length();a++){
			yl.push(y.charAt(a));
		}
		//check Point
		//System.out.println(xl);
		//System.out.println(yl);
		
		//init
		String temp="";
		String carry="0";	
		while(!xl.isEmpty()){
			
			if(yl.isEmpty() && !xl.isEmpty()){
				temp =new BasicOperations().add(Integer.toString(Character.getNumericValue(xl.pop())),carry);
			}
			else if(!yl.isEmpty() && !carry.equals("0")){
				temp =new BasicOperations().add(Integer.toString(Character.getNumericValue(xl.pop())+Character.getNumericValue(yl.pop())),carry);
			}
			else{
				temp =Integer.toString(Character.getNumericValue(xl.pop())+Character.getNumericValue(yl.pop()));
			}

			result += temp.charAt(temp.length()-1);
			if(temp.length()>1){
				carry="";
				for(int a=0;a<temp.length()-1;a++){
					carry+=temp.charAt(a);
				}
			}
			else{
				carry="0";
			}
			temp="";


		}
		if(!carry.equals("0")){
			for(int a=carry.length()-1;a>=0;a--){
				result+=carry.charAt(a);
			}
		}
		return new StringBuilder(result).reverse().toString();
		}

		public String multiply(String x,String y){
			//init
			String result="";
			String temp="0";
			for(String a="0";!a.equals(y);a=new BasicOperations().add(a,"1")){
				temp = new BasicOperations().add(x,temp);	
			}
			result = temp;
			return result;

		}
		public String pow(String x,String y){
			//init 
			String result="";
			String temp="1";
			for(String a="0";!a.equals(y);a=new BasicOperations().add(a,"1")){
				temp = new BasicOperations().multiply(x,temp);
			}
			result=temp;

			return result;

		}
		



	public static void main(String[]args){
		String x=new BasicOperations().multiply("299792458","6");
		System.out.println(x);
	}
}

