#include<stdio.h>
int square(int n)
{
     return(n*n); 
}
int main()
{
     int number, answer;
     scanf("%d", &number);
     answer = square(number);  
     printf(" %d" ,answer);
}
