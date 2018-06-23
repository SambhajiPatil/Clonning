package DeepClonningUsingObjectClassCloneMethod;

public class TestDeep {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
		
		WorkLocation wl1=new WorkLocation(12345,"nashik");
		
		Employee e1=new Employee(1023,"ABC",wl1);
		
		Employee e2=e1.clone();
		System.out.println(e2);
	    System.out.println(e1);
		System.out.println("---------------------------------");
		
		//System.out.println(e1==e2);
		
		/*e2.setEmp_name("Suhas");*/
		
		//e2.setEmp_name("Suhas");
		e2.getWl().setWname("sangli");
        e2.getWl().setWpicode(406);
        
        e1.getWl().setWname("mumbai");
        e1.getWl().setWpicode(415406);
        
        System.out.println(e1);
        System.out.println(e2);
        
	}

}
 