import java.util.*;
public class BasicOperations2{
	public byte[] stringToBytes(String x){
		byte []temp=new byte[x.length()];
		for(int a=0;a<x.length();a++){
			temp[a]=(byte)Character.getNumericValue(x.charAt(a));
		}
		return temp;
	}
	public String bytesToString(byte[]x){
		String temp="";
		for(int a=0;a<x.length;a++){
			temp+=a;
			
		}

		return temp;
	}
	
	public byte[] reverse(byte []x){
		byte[]temp=new byte[x.length];
		for(int a=x.length-1;a>=0;a--){
			temp[a]=x[x.length-a-1];
		}
		return temp;


	};
	public String add(byte[]x,byte[]y){
		if(x.length<y.length){
			byte[]temp=x;
			x=y;
			y=temp;
		}
		x=new BasicOperations2().reverse(x);
		y=new BasicOperations2().reverse(y);
		byte[]result=new byte[x.length+1];
		byte temp=0;
		byte carry=0;
		for (int a=0;a<x.length;a++){
			if(a<y.length){
				temp=(byte)(x[a]+y[a]+carry);
			}
			else{
				temp=(byte)(x[a]+carry);
			}
			carry=(byte)(temp/10);
			result[a]=(byte)(temp%10);
			
			//System.out.println(x[a]+"+"+y[a]+" "+carry+" "+result[a]);
		}
		return new BasicOperations2().bytesToString(new BasicOperations2().reverse(result));
	}



	public static void main(String[]args){
		byte[]x=new BasicOperations2().stringToBytes("18470912784097097082904790124709790124709740917409");
		byte[]y=new BasicOperations2().stringToBytes("299792458");
		String z=new BasicOperations2().add(x,y);
		System.out.print(z);
	}
	
}
