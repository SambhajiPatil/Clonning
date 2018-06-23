package ShallowClonningUsingObjectClassCloneMethod;

import java.lang.*;

public class TestShallow {

	public static void main(String[] args) throws CloneNotSupportedException
	
	{
		// TODO Auto-generated method stub
		Address ads1=new Address(123,"Pune");
		
		Student s1=new Student(101,ads1); 
			
		Student s2= s1.clone();
		
		System.out.println(s1);
		System.out.println("---------------------------------");
		
		
		
		
		System.out.println(s2);
		System.out.println("---------------------------------");
		s2.setSid(23);
		s2.setSaddr(null);
		System.out.println(s2);
		
		System.out.println(s1==s2);
		System.out.println(s1.getSid()==s2.getSid());
		System.out.println(s1.getSaddr()==s2.getSaddr());
	

	}
	
	

}
