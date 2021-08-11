package basic.pro;

import java.util.Arrays;

public class ThaoTacMang {

	public static void main(String[] args) {
		int M[]=new int[4];
		M[0]=12;
		M[1]=31;
		M[2]=40;
		M[3]=37;
		System.out.println("Mang cua ban la: ");
		for(int i=0;i<M.length;i++)
		{
			System.out.print(M[i]+"\t");
		}
		Arrays.sort(M);
		System.out.println("\nMang sau khi sap xep la:");
		for(int i=0;i<M.length;i++)
		{
			System.out.print(M[i]+"\t");
		}
		System.out.println("\nCac so nguyen to la:");
		for(int i=0;i<M.length;i++)
		{
			int dem=0;
			for(int j=1;j<=Math.sqrt(M[i]);j++)
			{
				if(M[i]!=1 && M[i]%j==0)
					dem++;
			}
			if(dem==1)
				System.out.print(M[i]+"\t");
		}
	}

}
