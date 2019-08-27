import java.util.Scanner;
class Main { 
    public static void main(String args[]) 
    { 
        
        String str1;
        String str2;
        int no;
        Scanner sc=new Scanner(System.in);
        str1=sc.nextLine();
        str2=sc.nextLine();
        no=sc.nextInt();
     String str[]=str2.split(" ",no);
     for(int i=0;i<no;i++)
     System.out.println(str[i]);
    } 
} 