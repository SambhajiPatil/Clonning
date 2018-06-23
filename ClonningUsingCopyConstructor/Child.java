package ClonningUsingCopyConstructor;

public class Child extends Parent{
	public Child(Parent p, int i) {
		super(p);
		this.rollno = i;
	}

	

	public int rollno;


	/*public Child(Child p) {
		super(p);
		this.rollno=p.rollno;
		}*/
		// TODO Auto-generated constructor stub
	

		

	public Child() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n Child [rollno=" + rollno + ", name=" + name + ", mob=" + mob + ", ad=" + ad + "]";
	}

	
	
	
	
}
