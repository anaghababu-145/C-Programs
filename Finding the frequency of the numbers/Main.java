#include<stdio.h>
int main()
{
    int n,i,k;
	scanf("%d",&n);
	scanf("%d",&k);
	int a[n],freq[k];           
	for(i=1;i<=n;i++)
		scanf("%d",&a[i]);
    for(i=1;i<=k;i++)
        freq[i]=0;
    for(i=1;i<=n;i++)
        freq[a[i]]++;    
    for(i=1;i<=k;i++)
        printf("%d %d\n",i,freq[i]);
}