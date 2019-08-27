// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include<string.h>
// Main function
int main()
{
  // Enter your code here 
  char str[100];
  int c=0,count[26]={0},x;
  gets(str);
  while(str[c]!='\0')
  {
    if(str[c]>='a'&&str[c]<='z')
    {
      x=str[c]-'a';
      count[x]++;
    }
    c++;
  }
  for(c=0;c<26;c++)
  {
    if(count[c]!=0)
    {
    printf("%c%d ",c+'a',count[c]);
  }
  }
   return 0;
}