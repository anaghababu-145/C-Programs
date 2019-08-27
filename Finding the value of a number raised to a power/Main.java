import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
          int base=sc.nextInt();
      int exp=sc.nextInt();
      int result=1;
      while(exp!=0)
      {
        result=result*base;
        exp--;
      }
      System.out.println(result);
    }
}