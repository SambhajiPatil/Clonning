package ClonningUsingCopyConstructor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Child c= new Child();
		c.x=10;
		c.y=20;
		c.z=30;
		Parent p1 = new Parent();
		p1.x=10;
		p1.y=20;
		Parent clone = c;
		Parent cloned = new Child(c);
		Parent cloned2 = new Parent(p1);*/

		Address ad1=new Address(1124859,"pune");
		Parent p=new Parent();
		
		p.name="patil";
		p.mob=46123;
		p.ad=ad1;
		
		Child c=new Child();
		/*c.name="patil";
		c.mob=456123;
		c.ad=ad1;*/
		
		c.rollno=10;
		
		
		Parent cl1=new Child(p,c.rollno);
		//Parent cl1=new Child(c);
		Parent cl2=new Parent(p);
		
		
		System.out.println(cl1==cl2);
		
		System.out.println(cl1.name==cl2.name);
		System.out.println(cl1);
		System.out.println(cl2);
		
		
	}

}
