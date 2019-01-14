

public class Scheduling {

	public static void main(String[] args) {

	FCFS fcfs=new FCFS();
	//fcfs.execute();
	SJF sjf=new SJF();
	//sjf.execute();
	
	PriorityNonPreemptive pr=new PriorityNonPreemptive();
	//pr.execute();
	
	RoundRobin rr=new RoundRobin();
	rr.execute();
	
	}

}
