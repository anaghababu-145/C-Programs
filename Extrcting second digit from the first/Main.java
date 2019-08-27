#include <stdio.h>
int main() {
	int n,second_digit;
  scanf("%d",&n);
  while(n>=100)
  {
   n/=10;
  }
  second_digit=n%10;
  printf("%d",second_digit);
	return 0;
}