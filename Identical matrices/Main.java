#include<stdio.h>
int main()
{
	//Try out your code here
  int r,c,i,j;
  scanf("%d%d",&r,&c);
  int mat1[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&mat1[i][j]);
    }
  }
  int mat2[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&mat2[i][j]);
    }
  }
  int flag=1;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(mat1[i][j]!=mat2[i][j])
      {
        flag=0;
      break;
      }
    }
  }
  if(flag==1)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
	return 0;
}