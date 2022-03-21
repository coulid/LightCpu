import java.util.*;
public class BasicOperations{
	//function to add two very**100 numbers
	//function call : new BasicOperations().add("str","str");
	//return 	: String 
	public String add(String x,String y){
		String result="";
		x=new StringBuilder(x).reverse().toString();
		y=new StringBuilder(y).reverse().toString();
		
		if(x.length()<y.length()){
			String temp=x;
			x=y;
			y=temp;
		}
		//check
		//System.out.println(x);
		//System.out.println(y);
		//init
		String temp="0";
		String carry="0";
		for(int a=0;a<x.length();a++){
			if(a<y.length()){
				temp=Integer.toString(Character.getNumericValue(x.charAt(a))+Character.getNumericValue(y.charAt(a)));
			}
			else{
				temp=Character.toString(x.charAt(a));
			}
			//if(carry!="0"){
			//	temp=new BasicOperations().add(temp,carry);
			//}
			if(carry!="0"){
				temp=new BasicOperations().add(temp,carry);
			//	System.out.println(carry);
			}
			

			carry="";
			if(temp.length()>=2){
				for(int b=0;b<temp.length()-1;b++){
					carry+=temp.charAt(b);
				}
			}
			else{
				carry="0";
			}
			result+=temp.charAt(temp.length()-1);
			temp="0";
			//System.out.println(result);
		}
		if (carry!="0"){
			result+=carry;
		}

		return new StringBuilder(result).reverse().toString();
	}





	public String multiply(String x,String y){
		//swap
		if(x.length()<y.length()){
			String temp=x;
			x=y;
			y=temp;
		}
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
	
	public static void main(String args[]){
		long startTime=System.nanoTime();
		String e=new BasicOperations().pow("314","314");
		long endTime=System.nanoTime();
		System.out.println(endTime-startTime);
		System.out.println(e);
	}


}

