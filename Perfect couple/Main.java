#include<stdio.h>
#include<stdlib.h>
void check_sum_and_display(int arr[], int size, int elem);
int main()
{
    // Get the size of an array
    int size;
    scanf("%d", &size);
    
    // Get the array elements
    int arr[50], i;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    // Get the sum value (to check with an array elements)
    int elem;
    scanf("%d", &elem);
    
  	// Function call to check the sum of any two elements in an array equal to given sum 
  	// and display the same
    check_sum_and_display(arr, size, elem);
    return 0;
}

void check_sum_and_display(int arr[], int size, int elem)
{
  int i,j,flag=0,sum=0;
  for(i=0;i<size;i++)
  {
    for(j=i+1;j<size;j++)
    {
      sum=arr[i]+arr[j];
      if(sum==elem)
      {
        printf("Perfect couple: %d %d",arr[i],arr[j]);
        flag=1;
        break;
      }
    }
  }
  if(flag!=1)
  {
    printf("No perfect couple found!");
  }
}