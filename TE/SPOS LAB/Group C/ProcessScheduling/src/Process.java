import java.util.Comparator;

public class Process {
String name;
int BT,WT,AT,CT,TAT,remBT,priority;
boolean flag;
public Process(String name,int burst,int AT)
{
	this.name=name;
	BT=burst;
	this.AT=AT;
	WT=CT=TAT=0;
	remBT=BT;
	priority=0;
}
public Process(String name,int burst,int AT,int PR)
{
	this.name=name;
	BT=burst;
	this.AT=AT;
	WT=CT=TAT=0;
	remBT=BT;
	priority=PR;
	flag=false;
}
public void display()
{
	System.out.println(name+"\t"+BT+"\t"+AT+"\t"+CT+"\t"+TAT+"\t"+WT+"\t"+priority);
}
}

//Class for sorting Processes
class SortByArrival implements Comparator<Process>
{

	@Override
	public int compare(Process p1, Process p2) {
		
		return p1.AT-p2.AT;
	}
	
}

class SortByPriority implements Comparator<Process>
{

	@Override
	public int compare(Process o1, Process o2) {
		
		return o1.priority-o2.priority;
	}
	
}