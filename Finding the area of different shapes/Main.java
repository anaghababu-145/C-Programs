import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      int side,length,breadth,base,height,radius;
      Scanner sc=new Scanner(System.in);
      int no=sc.nextInt();
      switch(no)
      {
        case 1:
          side=sc.nextInt();
          int square=side*side;
          System.out.println(square);
          break;
        case 2:
          length=sc.nextInt();
          breadth=sc.nextInt();
          int rec=length*breadth;
          System.out.println(rec);
          break;
        case 3:
          base=sc.nextInt();
          height=sc.nextInt();
          int tri=base*height/2;
          System.out.println(tri);
          break;
        case 4:
          radius=sc.nextInt();
          System.out.println(3.14*radius*radius);
          break;
        default:
          System.out.println("Invalid input");
      }
          
    }
}