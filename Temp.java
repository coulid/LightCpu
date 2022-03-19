import java.util.*;
public class Temp{
	//function to add two very**100 numbers
	//function call : new Temp().add("str","str");
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
		String carry="0";	
		String temp=new Temp().dcmAdder();//<<<<<	မှားနေသည်

		result+=temp[0];
		carry=temp[1];
		temp="";
		while(!xl.isEmpty()){
			
			if(yl.isEmpty() && !xl.isEmpty()){
				temp =new Temp().add(Integer.toString(Character.getNumericValue(xl.pop())),carry);
			}
			else if(!yl.isEmpty() && !carry.equals("0")){
				temp =new Temp().add(Integer.toString(Character.getNumericValue(xl.pop())+Character.getNumericValue(yl.pop())),carry);
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


	public String[] dcmAdder(String x,String y){
		//init
		String result="";
		//swap
		if(x.length()<y.length()){
			String temp=x;
			x=y;
			y=temp;
		}

		//init
		String temp="";
		String carry="0";
		for(int a=x.length()-1,b=y.length()-1;a>=0;b=(a==b)?(b-1):(b),a--){
			if(a!=b){
				result+=x.charAt(a);
			}
			else{
				if (!carry.equals("0")){
					temp=new Temp().add(Integer.toString(Character.getNumericValue(x.charAt(a))+Character.getNumericValue(y.charAt(b))),carry);
					result+=temp.charAt(temp.length()-1);
				}
				
				if(temp.length()>1){
					carry="";
					for(int c=0;c<temp.length()-1;c++){
						carry+=temp.charAt(c);
					}
				}
				else{
					carry="0";
				}
				temp="";
			}
		}
		return new String[]{result,carry};
	}

	public static void main(String[]args){
		String x=new Temp().dcmAdder("100","10000000");
	}

}

