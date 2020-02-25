package Day9;

public class NestedMemberClass {
	
	int x=10;
	private int y=20;
	class  Member
	{
		int z= x+y;
	}
	
	public static void main(String[] args) {

NestedMemberClass NMC= new NestedMemberClass();
NestedMemberClass.Member M= NMC.new Member();
System.out.println("Member class Implementation Successful and the sum of x and y is:"+M.z);
	}

}
