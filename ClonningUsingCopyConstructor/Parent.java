package ClonningUsingCopyConstructor;

public class Parent {
	
	public String name;
	public int mob;
	public Address ad;
	public Parent(Parent p) {
		super();
		this.name =p. name;
		this.mob = p.mob;
		this.ad = p.ad;
	}
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\n Parent [name=" + name + ", mob=" + mob + ", ad=" + ad + "]";
	}
	
	
	
	
	

}
