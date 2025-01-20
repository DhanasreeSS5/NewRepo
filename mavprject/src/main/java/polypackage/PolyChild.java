package polypackage;

public class PolyChild extends PolyParent{
	public void calc(int a,int b)
	{
		super.calc(10,8);
		int sub=a-b;
		System.out.println("Difference="+sub);
	}
	public void sum(int a,int b)
	{
		super.sum(40, 2);
		int div=a/b;
		System.out.println("Division="+div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyChild obj=new PolyChild();
		obj.calc(10,5);
		obj.sum(80, 2);
		//PolyParent obj1=new PolyParent();
		//obj1.calc(5, 20);
		
		

	}

}
