#include<stdio.h>
int main()
{
        int i, j, temp, size, a[100],k;
        scanf("%d", &size);
        for (i = 0; i < size; ++i)
        {
            scanf("%d", &a[i]);
        }
        scanf("%d",&k);
  for (i = 0; i < size; ++i) 
        {
            for (j = i + 1; j < size; ++j)
            {
                if (a[i] < a[j]) 
                {
                    temp =  a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        } 
for(i=0;i<size;i++)
{
  if(i==k-1)
  {
    printf("%d",a[i]);
  }
}
}