package DeepClonningUsingObjectClassCloneMethod;

public class Employee implements Cloneable
{

	public Employee(int emp_id, String emp_name, WorkLocation wl) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.wl = wl;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int emp_id;
	private String emp_name;
	
	private WorkLocation wl;

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", wl=" + wl + "]";
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public WorkLocation getWl() {
		return wl;
	}

	public void setWl(WorkLocation wl) {
		this.wl = wl;
	}
	
	public Employee clone()throws CloneNotSupportedException{
		Employee temp= (Employee) super.clone();
			
		
		//temp.wl=this.wl.clone();
		
		
		WorkLocation wlclone=temp.getWl();
		WorkLocation wlclome2=wlclone.clone();
		temp.setWl(wlclome2);
		
		
		return temp;
	}
	
}
