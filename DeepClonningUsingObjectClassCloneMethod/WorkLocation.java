package DeepClonningUsingObjectClassCloneMethod;

public class WorkLocation implements Cloneable{
	
	public WorkLocation(int wpicode, String wname) {
		super();
		this.wpicode = wpicode;
		this.wname = wname;
	}
	public WorkLocation() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int wpicode;
	private String wname;
	@Override
	public String toString() {
		return "WorkLocation [wpicode=" + wpicode + ", wname=" + wname + "]";
	}
	public int getWpicode() {
		return wpicode;
	}
	public void setWpicode(int wpicode) {
		this.wpicode = wpicode;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public WorkLocation clone()throws CloneNotSupportedException{
		return (WorkLocation) super.clone();
	}

}
