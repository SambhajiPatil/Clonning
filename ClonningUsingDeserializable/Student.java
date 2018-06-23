package ClonningUsingDeserializable;

import java.io.Serializable;

public class Student implements Serializable
{
  public Student(int sid, Address saddr) {
		super();
		this.sid = sid;
		this.saddr = saddr;
	}
public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

private int sid;
  private Address saddr;
@Override


public String toString() {
	return "\n Student [sid=" + sid + ", saddr=" + saddr + "]";
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public Address getSaddr() {
	return saddr;
}	
public void setSaddr(Address saddr) {
	this.saddr = saddr;
}
  


}
