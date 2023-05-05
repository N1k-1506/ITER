import java.util.Scanner;
public class HQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       		System.out.println("Enter the length of first array:");
        	int []a=new int[sc.nextInt()];
        	System.out.println("Enter the length of second array:");
        	int []b=new int[sc.nextInt()];
        	System.out.print("Enter the elments of first array: ");
        	for(int i=0;i<a.length;i++){
            		a[i]=sc.nextInt();
        	}
        	System.out.print("Enter the elements of second array: ");
        	for(int j=0;j<b.length;j++){
           		b[j]=sc.nextInt();
       	 	}
        	System.out.print("Dot product: ");
        	int[]c=new int[a.length];
        	for(int i=0;i<a.length;i++){
            		c[i]=a[i]*b[i];
            		System.out.print(c[i]+" ");
        
		}

}
