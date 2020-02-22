import java.util.Scanner;
class Triangle
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter non zero no 1 :");
	int x=sc.nextInt();
	System.out.print("Enter non zero no 2 :");
	int y=sc.nextInt();
	System.out.print("Enter non zero no 3 :");
	int z=sc.nextInt();
	if((x<(y+z))&&(y<(z+x))&&(z<(x+y)))
{
	System.out.printf("the side %d and %d and %d can form triangle",x,y,z);
}
else
{
	System.out.print("Is Not Triangle");
}
}
}
