#include <stdio.h>
int greatest2(int n1, int n2);
int main(){
	int n1, n2, n3;
	scanf("%d%d%d", &n1, &n2, &n3);
	int greatest = greatest2(n1, n2);
	printf("%d", greatest2(greatest, n3));
  	return 0;
}
int greatest2(int n1, int n2){
    int max = 0;
    if(n1 > n2){
        max = n1; 
    }
    else{
        max = n2;
    }
    return max;
}