package arrayDemo;

public class jaggedArray {

	public static void main(String[] args) {
		// in jagged array length of row and coloumn is not same
		int arr[][]=new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[4];
	    arr[2]=new int[5];
	    int count =5;
	    // print jagged array element
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=0;j<arr[i].length;j++)
	    	{
	    		arr[i][j]= count++;
	    		System.out.print(arr[i][j]+" ");
	    		
	    	}
	    	System.out.println();
	    }
	    
	}

}
