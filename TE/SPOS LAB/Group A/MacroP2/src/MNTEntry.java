
public class MNTEntry {
String name;
int pp,kp,mdtp,kpdtp;


public MNTEntry(String name, int pp, int kp, int mdtp, int kpdtp) {
	super();
	this.name = name;
	this.pp = pp;
	this.kp = kp;
	this.mdtp = mdtp;
	this.kpdtp = kpdtp;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPp() {
	return pp;
}
public void setPp(int pp) {
	this.pp = pp;
}
public int getKp() {
	return kp;
}
public void setKp(int kp) {
	this.kp = kp;
}
public int getMdtp() {
	return mdtp;
}
public void setMdtp(int mdtp) {
	this.mdtp = mdtp;
}
public int getKpdtp() {
	return kpdtp;
}
public void setKpdtp(int kpdtp) {
	this.kpdtp = kpdtp;
}

}
