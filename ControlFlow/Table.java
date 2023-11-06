package controlFlow;

public class Table {
void tab1(int a, int b)
{
	if(b==11)
		System.exit(0);//0 representing successful termination
	else
	{
		System.out.println(a+"x"+b+"="+(a*b));
		b++;
		tab1(a,b);
	}
}
	public static void main(String[] args) {
		Table obj =new Table();
		obj.tab1(8, 1);
	}

}
