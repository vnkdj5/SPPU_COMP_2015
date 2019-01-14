import java.util.Scanner;


public class BankersAlgorithm {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
	int m,n;
	
	System.out.println("Enter Number of resources:");
	m=sc.nextInt();
	
	System.out.println("ENter Number of  processes:");
	n=sc.nextInt();
	//CREATE ALL REQUIRED DATA STRUCTURES
	int AVAILABLE[]=new int[m];
	int MAX[][]=new int[n][m];
	int ALLOCATION[][]=new int[n][m];
	int NEED[][]=new int[n][m];

	int WORK[]=new int[m];
	boolean FINISH[]=new boolean[n];
	
	System.out.println("Enter Available Resources: ");
	for(int i=0;i<m;i++)
	{
		AVAILABLE[i]=sc.nextInt();
		//Safety 1.1 initialize WORK=AVAILABLE
		WORK[i]=AVAILABLE[i]; 
	}
	
	System.out.println("Enter MAX ARRAY: ");
	accessinput(MAX, n, m);
	/*System.out.println("MAX ARRAY IS: ");
	displayArray(MAX, n, m);
	
	*/
	System.out.println("Enter ALLOCATION MATRIX: ");
	accessinput(ALLOCATION, n, m);
	
	//calculate NEED=MAX-ALLOC;
	NEED=calculateNeed(MAX, ALLOCATION, n, m);
	
	//Safety 1.2 initialize FINISH=false
	for(int i=0;i<n;i++)
	{
		FINISH[i]=false;
	}
	
//Safety 2 CHECK CONDITION
	int safeSeq[]=new int[n];
	int count=0;
	
	while(count<n)
	{
		boolean found=false;
		 for(int i=0;i<n;i++)  
		 {
			 if(FINISH[i]==false) //CONDITION 2.a) FINISH[i]=false find NOT FINISHED PROCESS
			 {
				 int j=0;
				 for(j=0;j<m;j++)
				 {					//CONDITION 2.b) FIND PROCESS WHICH CAN BE RUN WITH AVAILABLE RESOURCES
					 if(NEED[i][j]>WORK[j])
						 break;
				 }
				 if(j==m) //IF ALL RESOURCES FOR PROCESS i SATSFIED
				 {
					 for(int k=0;k<m;k++)
					 {
						 WORK[k]+=ALLOCATION[i][k]; //FREE RESOURCES
						 
					 }
					 FINISH[i]=true; //FINISH PROCESS
					 safeSeq[count++]=i; //ADD to safe sequences
					 found=true; //DISABLE TERMINATING CONDITION
				 }
			 }
		 }
		 if (found==false) {
			System.out.println("Cannot FIND NEXT PROCESS.\nExiting");
			break;
		}
	}
	System.out.println("SAFE SEQUENCE");
	int i = 0;
	for (i=0; i < n-1 ; i++)
        System.out.print(safeSeq[i]+" --> ");
	System.out.print(safeSeq[i]+" ");
	

	}
	
	public static int[][] calculateNeed(int max[][],int alloc[][], int n,int m)
	{
		int need[][]=new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				need[i][j]=max[i][j]-alloc[i][j];
		return need;
		
	}
	
	public static void accessinput(int arr[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				try
				{
				arr[i][j]=sc.nextInt();
				}
				catch(Exception e)
				{
					System.out.println(i+" "+j);
				}
			}
		}
	}
	
	public static void displayArray(int arr[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
}
