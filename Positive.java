
public class Positive {

	public static void main(String[] args) {
		int a[]=new int[]{2,3,4,1,0,-1};
		
		for(int i=0;i<a.length;i++){
			if(a[i]>0){
				System.out.println("postive num"+ a[i]);
			
			}
			else if(a[i]==0){
				System.out.println("zero"+a[i]);
			}
			else
			{
				System.out.println("negative"+a[i]);
			}
			
	}
		

	}

}
