#include<bits/stdc++.h>
using namespace std;

int main()
{
    int q; 
    scanf("%d",&q);
    for(int a = 0; a < q; a++)
    {
        int n,f=0,d=0; 
        scanf("%d",&n);
        int M[n][n],x[n],s,y=0,z[n],l;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            scanf("%d ",&M[i][j]);
       
        }
       for(int i=0;i<n;i++)
       {
           s=0;
           l=0;
            for(int j=0;j<n;j++)
                     s=s+M[j][i];                               
                  x[i]=s;      
           for(int j=0;j<n;j++)
                     l=l+M[i][j];       
               z[i]=l; 
       }
        for(int i=0;i<n;i++) 
        {
            d=0;
              for(int j=0;j<n;j++)
                if(x[i]==z[j]) d=1;
                  
                 f=f+d;   
        }
        if(f==n && d==1) 
           printf("Possible\n");
        else 
           printf("Impossible\n");
        
    }
    return 0;
}