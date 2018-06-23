package ShallowClonningUsingObjectClassCloneMethod;

public class Student implements Cloneable
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
	return "Student [sid=" + sid + ", saddr=" + saddr + "]";
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
  
public Student clone()throws CloneNotSupportedException{
	return (Student) super.clone();
	
}

}
