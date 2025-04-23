import java.util.*;
import java.io.*;
class star
{
	void solid_rectangle()
{
	int n=4;
	int m=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=m;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
void half_pyramid()
{
	int n=4;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
void triangle_01()
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if((i+j)%2==0 )
				{
					System.out.print("1");
				}
			else
				{
					System.out.print("0");
				}
			
		}
		System.out.println();
	}
}

void half_pyramid_with_number()
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}
void floyds_triangle()
{
	int n=4;
	int a=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" "+a);
			a++;
		}
		System.out.println();
	}
}
void inverse_half_pyramid()
{
	int n=4;
	for(int i=n;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
void inverse_half_pyramid_with_number()
{
	int n=4;
	for(int i=n;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}
void inverted_half_pyramid()
{
	int n=4;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}

		System.out.println();
	}
}
void inverted_half_pyramid_with_number()
{
	int n=4;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}

		System.out.println();
	}
}

	void hollow_rectangle()
{
	int n=4;
	int m=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=m;j++)
		{
			if(i==1 || i==n || j==1 || j==m)
				{
					System.out.print("*");
				}
			else
				{
					System.out.print(" ");
				}
			
		}
		System.out.println();
	}
}
	void butterfly()
{
	int n=4;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{	
			System.out.print("*");				
		}
		int spaces=2 * (n-i);
		for(int j=1;j<=spaces;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");	
		}
		System.out.println();
	}
	for(int i=n-1;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		int spaces=2 * (n-i);
		for(int j=1;j<=spaces;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");	
		}
		System.out.println();
	}
}
	void solid_rhombus()
{
	int n=5;
	for(int i=n-1;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=5;j++)
		{
			System.out.print("*");
		}
		System.out.println();	
	}
}
	void hollow_rhombus()
{
	int n=5;
	for(int i=n-1;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=5;j++)
		{
		if(j==1|| j==5 ||i==1 ||i==n-1)
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
		}

		System.out.println();	
	}
}
void number_pyramid()
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		int spaces= n-i;
		for(int j=1;j<=spaces;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+ " ");	
		}
		System.out.println();
	}


}
	void palindromic()
{	
	int n=5;
	for(int i=1;i<=n;i++)
	{
		int spaces= n-i;
		for(int j=1;j<=spaces;j++)
		{
			System.out.print(" ");
		}

		for(int j=i;j>=1;j--)
		{
			System.out.print(j);	
		}
		for(int j=2;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}

}
	void daimond()
{
	int n=4;
	for(int i=1;i<=n;i++)
	{
		int spaces= n-i;
		for(int j=1;j<=spaces;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		for(int j=2;j<=i;j++)
		{
			System.out.print("*");
		}

	System.out.println();
	}	
for(int i=n-1;i>=1;i--)
	{
		int spaces= n-i;
		for(int j=1;j<=spaces;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		for(int j=2;j<=i;j++)
		{
			System.out.print("*");
		}

	System.out.println();
	}			
}
}
class patten
{
	public static void main(String args[])
	{
		star st=new star();
		System.out.println("Solid Rectangle:- ");
		st.solid_rectangle();
		System.out.println("\nHollow Rectangle:- ");
		st.hollow_rectangle();
		System.out.println("\nHalf Pyramid:- ");
		st.half_pyramid();
		System.out.println("\nInverse Half Pyramid:- ");
		st.inverse_half_pyramid();
		System.out.println("\nInverted Half Pyramid:- ");
		st.inverted_half_pyramid();
		System.out.println("\nHalf Pyramid with Number:- ");
		st.half_pyramid_with_number();
		System.out.println("\nInverted Half Pyramid with Number:- ");
		st.inverted_half_pyramid_with_number();
		System.out.println("\nInverse Half Pyramid with Number:- ");
		st.inverse_half_pyramid_with_number();
		System.out.println("\nFlod's Triangle:- ");
		st.floyds_triangle();
		System.out.println("\n0-1 Triangle:- ");
		st.triangle_01();
		System.out.println("\nButterfly Pattern:- ");
		st.butterfly();
		System.out.println("\nSolid Rhombus:- ");
		st.solid_rhombus();
		System.out.println("\nHollow Rhombus:- ");
		st.hollow_rhombus();
		System.out.println("\nNumber Pyramid:- ");
		st.number_pyramid();
		System.out.println("\nPalindromic pattern:- ");
		st.palindromic();
		System.out.println("\nDaimond pattern:- ");
		st.daimond();


	}
}
