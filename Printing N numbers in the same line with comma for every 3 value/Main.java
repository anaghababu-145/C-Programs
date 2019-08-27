#include <stdio.h>
int main() {
	int n,startcount;
  scanf("%d",&n);
  for(int startcount=1;startcount<=n;startcount++)
  {
    printf("%d",startcount);
    if((startcount%3==0)&&(startcount!=n))
    {
      printf(",");
    }
  }
	return 0;
}