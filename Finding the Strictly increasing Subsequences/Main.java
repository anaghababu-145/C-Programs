#include<stdio.h>
int increasing_sub_array(int size,int a[],int sum_ar);
int main()
{
	//Try out your code here
  int size,i,idx1,idx2;
  scanf("%d",&size);
  int a[size];
  for(i=0;i<size;i++)
  {
    scanf("%d",&a[i]);
  }
  int sum_ar[3*size];
  increasing_sub_array(size,a,sum_ar);
	return 0;
}
int increasing_sub_array(int size,int a[],int sum_ar)
{
for(int idx1=0;idx1<=size-1;idx1++)
  {
  int key=a[idx1];
  int flag=1;
  for(int idx2=idx1+1;idx2<=size-1;idx2++)
  {
  if(a[idx2]>key)
  {
    for(int idx3=idx1;idx3<=idx2;idx3++)
  {
      if(a[idx3]>a[idx2])
        flag=0;
    }
    if(flag==1)
      printf("%d,%d\n",key,a[idx2]);
  }
    flag=1;
  }
}
  return 0;
}