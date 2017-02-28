import java.util.Scanner;


public class NaturalNum {
public static void main(String args[]){
	
	float temp=0;
	float a[]=new float[5];
	Scanner s=new Scanner(System.in);
	for(int i=0;i<a.length;i++){
		a[i]=s.nextFloat();
		
	 temp=a[i]+temp;
	}
	
	System.out.println("sum of natural nukmbers"+temp);
}
}
