package ClonningUsingApacheCommonsLibFile;

import org.apache.commons.lang.SerializationUtils;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Student s1= new Student(101,new Address(1452789,"Pune"));
		
		System.out.println("using ApacheCommons Lib ");
		//SerializationUtils
		
		Student sclone=(Student)SerializationUtils.clone(s1);
		
		System.out.println(sclone==s1);
		
		
		
		
	}

}
