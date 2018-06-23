package ClonningUsingDeserializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		System.out.println("------------Using deserizalization------------------");
		//Serialize -- OOS (FOS)  FOS(file) == Writeobject
				//DSerialize -- OIS (FIS)  FIS(file)== readobject
				//Emp e1= new Emp(10,"emp1",new Address(101010,"Latur"));
		/*FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.close();
		fos.close();
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e2 = (Emp)ois.readObject(); // Clonning an object using deserization
		ois.close();
		fis.close();	
		System.out.println(e1==e2);*/
		
		Student s1=new Student(101,new Address(415402,"Pune"));
		
		FileOutputStream fos=new FileOutputStream("xyz.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream("xyz.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s2=(Student)ois.readObject();
		ois.close();
		fis.close();
		
		System.out.println(s1==s2);
		System.out.println(s1.getSid()==s2.getSid());
		System.out.println(s2.getSaddr());
		System.out.println(s2.getSid());
		
		
		
		
		
		
		
		
		
		
		
	}

}
