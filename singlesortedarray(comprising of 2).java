import java.util.Scanner;
class single
{
	static int k=0;
	public static void main(String args[])
   {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements in A:");
		int na=sc.nextInt();
		int A[]=new int[na];
		System.out.println("Enter the values in A:");
		for(int i=0;i<na;i++){
			A[i]=sc.nextInt();
		}
		line();
		System.out.println("Enter the no. of elements in B:");
		int nb=sc.nextInt();
		int B[]=new int[nb];
		System.out.println("Enter the values in B:");
		for(int i=0;i<nb;i++){
			B[i]=sc.nextInt();
		}
		line();
		//sorting begins in A and B
		for(int i=0;i<na;i++){//sorting A
			for(int j=i+1;j<na;j++){
				if(A[i]>A[j]){
				int t=A[i];
				A[i]=A[j];
				A[j]=t;
				}
			}
		}
		for(int i=0;i<nb;i++){//sorting B
			for(int j=i+1;j<nb;j++){
				if(B[i]>B[j]){
				int t=B[i];
				B[i]=B[j];
				B[j]=t;
				}
			}
		}
		//sorting ends 
		//print sorted array
		System.out.println("Sorted list A:");
		for(int i=0;i<na;i++){
			System.out.println(""+A[i]);
		}
		line();
		System.out.println("Sorted list B");
		for(int i=0;i<nb;i++){
			System.out.println(""+B[i]);
		}
		line();
		line();
		int nc=na+nb;
		//storing the values in single array
		int C[]=new int[nc];
		for(int i=0;i<na;i++){
			C[i]=A[i];
			
		}
		do{
		for(int j=na;j<nc;j++){
			C[j]=B[k];
			k++;
			}		
			
		}
		while (k<nb);
		//sorting C
		for(int i=0;i<nc;i++){//sorting A
			for(int j=i+1;j<nc;j++){
				if(C[i]>C[j]){
				int t=C[i];
				C[i]=C[j];
				C[j]=t;
				}
			}
		}
		//displaying the single array
			for(int i=0;i<nc;i++)
			{
			System.out.println(""+C[i]);
		}
	}
		public static void line()
	{
		System.out.print("................................");
		System.out.println(" ");
		
	}
}
	
	
