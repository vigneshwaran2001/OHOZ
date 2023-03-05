// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
       // int r=m,c=n;
    for(int i=0;i<m;i++){
        if(i%2==0){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            
        }
        else{
            for(int j=n-1;j>=0;j--)
            {
                System.out.print(a[i][j]+" ");
            }
        }
    }
    }
}
/*
java -cp /tmp/NDE4vu8ysb HelloWorld
3 3
1 2 3
4 5 6
7 8 9
1 2 3 6 5 4 7 8 9 
*/
