
public class TableRow {
String symbol;
int addess,index;
public String getSymbol() {
	return symbol;
}
public TableRow(String symbol, int addess) {
	super();
	this.symbol = symbol;
	this.addess = addess;
	index=0;
}
public void setSymbol(String symbol) {
	this.symbol = symbol;
}
public TableRow(String symbol, int addess, int index) {
	super();
	this.symbol = symbol;
	this.addess = addess;
	this.index = index;
}
public int getAddess() {
	return addess;
}
public void setAddess(int addess) {
	this.addess = addess;
}
public int getIndex() {
	return index;
}
public void setIndex(int index) {
	this.index = index;
}
}
