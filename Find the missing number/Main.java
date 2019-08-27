#include<stdio.h>
int main()
{
  //Type your code here
  int arr_size;
  scanf("%d",&arr_size);
  int arr[arr_size];
  for(int i=1;i<=arr_size;i++)
  {
    scanf("%d",&arr[i]);
  }
  int j=1,flag;
  for(int i=1;i<=arr_size;i++)
  {
    flag=0;
    if(j==arr[i])
    {
      flag=1;
    }
    else
    {
      flag=0;
      break;
    }
    j++;
  }
  if(flag==0)
    {
      printf("%d",j);
    }
    
  return 0;
}