//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int baseSalary)
  {
    System.out.println("Base Salary: "+baseSalary);
  }
}
class CSE
{
  public void salary(int baseSalary)
  {
   System.out.println("CSE Faculty: "+(baseSalary+3000));
  }
}
class IT
{
  public void salary(int baseSalary)
  {
    System.out.println("IT Faculty: "+(baseSalary+5000));
  }
}
class ECE
{
  public void salary(int baseSalary)
  {
    System.out.println("ECE Faculty: "+(baseSalary+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int baseSalary=sc.nextInt();
    Faculty f=new Faculty();
    f.salary(baseSalary);
    CSE c=new CSE();
    c.salary(baseSalary);
    IT i=new IT();
    i.salary(baseSalary);
    ECE e=new ECE();
    e.salary(baseSalary);
  }
}