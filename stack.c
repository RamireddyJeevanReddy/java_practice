#include <stdio.h>

int main(){
    int n;
    scanf("%d",&n);
    int a[n];
    int stack[n];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n;i++){
        stack[i]=0;
    }
    int comp=0;
    int push=0;
    int temp=0;
    int h=0;
    int u=n-1;
    if (a[h]>stack[u]){
        stack[u]=a[h];
        h=h+1;
        push =push+1;
        comp=comp+1;
    }
    
    
    
    while (h<n && u<n){
        if(a[h]>stack[u]){
            stack[u-1]=a[h];
            h=h+1;
            u=u-1;
            push=push+1;
        }
        else if (a[h]<stack[u]){
            stack[u]=temp;
            stack[u]=a[h];
            a[h]=temp;
            
        }
        comp=comp+1;
    }
    
    for(int i=0;i<n;i++){
        printf("%d\n",stack[i]);
    }
    
    // printf("%d",comp);
    // printf("%d",push);
}