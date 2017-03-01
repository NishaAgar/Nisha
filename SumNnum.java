import java.util.Scanner;


public class SumNnum {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int sum=0;
	int n[]=new int[4];
	for(int i=0;i<n.length;i++){
		n[i]=s.nextInt();
		if(i<n.length){
			sum=sum+n[i];
		}
	}
	System.out.println("sum numbers" + " " +sum);
}
}
