package basic.pro;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTapVeMang {

	public static void main(String[] args) {
/*
 * Bài toán 1: Viết chương trình nhập vào một mảng gồm n số nguyên và thực hiện các công việc sau:
a. Xuất các giá trị của mảng ra
b. Tìm min, max
c. Tìm các số nguyên tố có trong mảng
d. Sắp xếp mảng theo thứ tự tăng dần
*/
		int n;
		System.out.print("Nhap so phan tu mang: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int M[] = new int[n];
		System.out.print("Nhap mang: ");
		for(int i=0;i<n;i++)
		{
			M[i] = sc.nextInt();
		}
		System.out.print("In mang: ");
	// a. Xuat cac gia tri cua mang:
		for(int i=0;i<n;i++)
		{
			System.out.print(M[i]+" ");
		}
	// b. Tim max, min
		int max = M[0];
		for(int i=0;i<n;i++)
		{
			if(max<M[i])
				max = M[i];
		}
		System.out.println("\nMax = "+max);
		
		int min = M[0];
		for(int i=0;i<n;i++)
		{
			if(min>M[i])
				min = M[i];
		}
		System.out.print("Min = "+min);
		//-------------------Tim cac so nguyen to co trong mang------------------------//
		System.out.print("\nc. Các số nguyên tố có trong mảng: ");
		for(int i=0;i<n;i++)
		{
			int count = 0;
			for(int j=1;j<=Math.sqrt(M[i]);j++)
			{
				if(M[i]!=1&&M[i]%j==0)
					count++;
			}
			if(count==1)
				System.out.print(M[i]+" ");
		}
//-------------------Sắp xếp mảng theo thứ tự tăng dần------------------------//
		System.out.print("\nd. Mảng sau khi sắp xếp: ");
		Arrays.sort(M);
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(M[i]+" ");
		}
	}

		
}
