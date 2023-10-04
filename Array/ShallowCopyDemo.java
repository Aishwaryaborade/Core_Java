package arrayDemo;

import java.lang.reflect.Array;

public class ShallowCopyDemo {
	//Shallow copy
	//Shallow cloning is perform on multiple dimensional array it will show same memory location

	public static void main(String[] args) {
		int array[][]={ {2,4,6,8},
					{1,3,5,7},
		            {3,6,9,8}};
		int clonearray[][]=array.clone();//shallow copy is created
		System.out.println(array[1]==clonearray[1]);
		System.out.println(array[1]);
		System.out.println(clonearray[1]);
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(clonearray[i][j]+" ");
			}
			System.out.println();
		}
	}
}
