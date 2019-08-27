/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int sum(int list[],int size);
int main()
{
  int size,list[10],i;
  scanf("%d",&size);
  for(i=0;i<size;i++)
  {
    scanf("%d",&list[i]);
  }
  sum(list,size);
  return 0;
}
int sum(int list[],int size)
{
  int i,batch_1=0,batch_2=0;
  for(int  i=0;i<size/2;i++)
  {
    batch_1=batch_1+list[i];
  }
  for(int  i=size/2;i<size;i++)
  {
    batch_2=batch_2+list[i];
  }
  if(batch_1==batch_2)
  {
printf("Perfect Batch");
  }
  else
  {
printf("Not a Perfect Batch");
  }
}