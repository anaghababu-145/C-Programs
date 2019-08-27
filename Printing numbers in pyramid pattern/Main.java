#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int val=1;
  for(int i=1;i<=n;i++)
  {
    for(int space=1;space<=n-i;space++)
    {
      printf(" ");
    }
    for(int j=1;j<=i;j++)
    {
printf("%d ",val);
      val++;
    }
    printf("\n");
  }
	return 0;
}