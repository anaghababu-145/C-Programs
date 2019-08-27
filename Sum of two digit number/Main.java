#include<stdio.h>
int main()
{
  int a,b,sum,n;
  scanf("%d",&n);
        sum=n%10;
        a=n/10;
        b=a+sum;
        printf("%d",b);
  return 0;
}