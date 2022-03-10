import java.util.*;
public class BasicCalculations{
	public String add(String x,String y){
		//Inatilize 
		String result="";
		LinkedList<Character>tempResult=new LinkedList<Character>();
		LinkedList<Character>xList=new LinkedList<Character>(); 
		LinkedList<Character>yList=new LinkedList<Character>(); 
		byte temp1=0;
		String temp2="";
		//convert str(x) to char arr
		char []temp0 =x.toCharArray();
		//push x  char array into LinkedList xList
		for(int a=0;a<temp0.length;a++){
			xList.push(temp0[a]);
		}
		//convert str(y) to char arr
		temp0 =y.toCharArray();
		//push y  char array into LinkedList yList
		for(int a=0;a<temp0.length;a++){
			yList.push(temp0[a]);
		}
		/////////////////////////////////////////////////////
		
		while(!xList.isEmpty()|!yList.isEmpty()){
			
		

			System.out.println(tempResult.toString());
		}
		return result;
		
	}
	public static void main(String[]args){
		BasicCalculations x=new BasicCalculations();
		x.add("99","99");
	}

}
