#include<stdio.h>
int subset(int arr_size,int arr[]);
int main()
{
  int arr_size;
  scanf("%d",&arr_size);
  int arr[arr_size];
  for(int i=0;i<arr_size;i++)
  {
    scanf("%d",&arr[i]);
  }
 
  subset(arr_size,arr);
  
   //for(int i=0;i<arr_size;i++)
  //{
    //printf("%d",arr[i]);
  //}
  return 0;
}
int subset(int arr_size,int arr[])
{
  for(int i=0;i<arr_size;i++)
  {
    for(int j=i+1;j<arr_size;j++)
    {
      for(int k=j+1;k<arr_size;k++)
      {
           printf("(%d, %d, %d) ",arr[i],arr[j],arr[k]);  
      }
    }
    if(i<arr_size-1)
    printf("\n");
  }
}