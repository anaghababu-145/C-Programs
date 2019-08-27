#include<stdio.h>
int main()
{
  int arr_size;
  scanf("%d",&arr_size);
  int arr[10];
  for(int idx=0;idx<=arr_size;idx++)
  {
    scanf("%d",&arr[idx]);
  }
  int largest;
  if(arr[0]>arr[1])
  {
    largest=arr[0];
  }
  else
  {
    largest=arr[1];
  }
  for(int idx=2;idx<=arr_size-1;idx++)
  {
    if(largest<arr[idx])
    {
      largest=arr[idx];
    }
  }
  printf("%d",largest);
  return 0;
}