import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FCFS {

	private Scanner sc;

	public void execute()
	{
		sc = new Scanner(System.in);
		 System.out.println("Enter Number of Pages:");
		 int numPages=sc.nextInt();
		 int pages[]=new int[numPages];
		 System.out.println("Enter Reference String: ");
		 for(int i=0;i<numPages;i++)
		 {
			 pages[i]=sc.nextInt();
		 }
		 
		 System.out.println("Enter Number of Frames");
		 int capacity=sc.nextInt();
		 
		 //To represent set of current pages
		 HashSet<Integer> frames=new HashSet<>(capacity);
		 
		 //To store pages o=in FIFO manner
		 Queue<Integer> index=new LinkedList<>();
		 int pageFaults=0;
		 int hits=0;
		 for(int i=0;i<numPages;i++)
		 {
			 if(frames.size()<capacity) //check if set can hold n=more pages
			 {
				 //IF page not present insert into set and increment pagefault
				 if(!frames.contains(pages[i])) 
				 {
					 frames.add(pages[i]);
					 index.add(pages[i]); //push current page into queue
					 pageFaults++;
					// System.out.println(pageFaults);
					// frames.forEach(System.out::print);
					 for(int j:index)
						 System.out.print(j+"\t");
					 System.out.println();
				 }
				 else
				 {
					 hits++;
				 }
			 }
			 else //set is full,need replacement
			 {
				 if(!frames.contains(pages[i])) //frame is not present present
				 {
					 int val=index.peek();
					 index.poll();
					 frames.remove(val);
					 
					 frames.add(pages[i]);
					 index.add(pages[i]);
					 pageFaults++;
					 for(int j:index)
						 System.out.print(j+"\t");
					 System.out.println();
				 }
				 else //frame is present in set
				 {
					 hits++;
				 }
			 }
		 }
		 
		 System.out.println("Number of Page Faults : "+pageFaults);
		 System.out.println("Hits:\t"+hits);
		 System.out.println("hit ratio: "+((double)hits/(double)numPages));

	}
}
/*
Enter Number of Pages:
12
2 3 2 1 5 2 4 5 3 2 5 2
Enter Number of Frames
3
1
2
3
4
5
6
7
8
9
Number of Page Faults : 9
Hits:	3
hit ratio: 0.25
*/