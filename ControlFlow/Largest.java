package controlFlow;

public class Largest {

	public static void main(String[] args) {
		// Declaring Variable
		double n1=2.1,n2=3,n3=5.5,largest=0;
		if (n1>=n2)
		  {
			 if(n1>=n3)
			  {
				  largest=n1;
			  }
			 else
			 {
				 largest =n3;
			 }
		  }
		else
		{
			largest= n3;
		}
		System.out.println("largest"+largest);
	}

}
