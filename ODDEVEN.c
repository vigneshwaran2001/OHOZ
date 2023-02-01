// Online C compiler to run C program online
#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);
    int i=0,j=0,a[n];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int odd[100],even[100],o=0,e=0;
    for(i=0;i<n;i++){
        if(a[i]%2==0){
            even[e++]=a[i];
        }
        else
        {
            odd[o++]=a[i];
        }
    }
    for(i=0;i<e;i++ ){
        printf("%d ",even[i]);
    }
    printf("\n");
    for(i=0;i<o;i++){
        printf("%d ",odd[i]);
    }
    return 0;
}
