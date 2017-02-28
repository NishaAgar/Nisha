import java.util.Scanner;


public class LargestNum {
public static void main(String args[]){
	int i=0;
	float a[]=new float[3];
	Scanner s=new Scanner(System.in);
	for(;i<a.length;i++){
		a[i]=s.nextFloat();
	if(a[0]<a[i]){
	a[0]=a[i];
	}
		}
	System.out.println("largest number"+a[0]);
	}
	
		
	
		
	}


