public class PageReplacement {

	public static void main(String[] args) {
		
		FCFS fcfs=new FCFS();
		//fcfs.execute();
		
		LRU lru=new  LRU();
		//lru.execute();
		
		Optimal optimal=new Optimal();
		optimal.execute();
	}

}
