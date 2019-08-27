import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      int r,c,i,j,no;
      Scanner obj=new Scanner(System.in);
      r=obj.nextInt();
      c=obj.nextInt();
      for(i=1;i<=r;i++)
      {
        no=r;
        System.out.print(no);
      for(j=1;j<i;j++)
      {
        no--;
        System.out.print(no);
      }
      for(int k=1;k<=c-i;k++)
      {
        System.out.print(no);
        
      }
        System.out.println();
      }
      
    }
}