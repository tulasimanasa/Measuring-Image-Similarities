import java.util.*;
class Great{
public static void main(String args[])
{
int i,j,max=0,x;
x=args.length;
 int a[][]=new int[3][3];
if(x!=9)
{
System.out.println(" Please enter 9 integer numbers");
}
if(x==9)
{
int k=0;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=Integer.parseInt(args[k]);
k++;
}
}
System.out.println("The given array is:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(a[i][j]>max)
{
max=a[i][j];
}
}
}
System.out.println("The biggest number in the given array is:"+max);
}
}
}