#include<stdio.h>
int main()
{
  int i,arr_size;
  scanf("%d",&arr_size);
  int arr[arr_size];
  for(i=0;i<arr_size;i++)
  {
scanf("%d",&arr[i]);
  }
  for(i=0;i<arr_size;i++)
  {
    if(arr[i]!=0)
    {
printf("%d ",arr[i]);
    }
  }
  for(i=0;i<arr_size;i++)
  {
    if(arr[i]==0)
    {
printf("%d ",arr[i]);
    }
  }
  return 0;
}