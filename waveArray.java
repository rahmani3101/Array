import java.util.Scanner;
class WaveArray
{
    static void main()
    {
         Scanner in=new Scanner(System.in);
         int i,j,n,temp,pos=0;
         System.out.println("Enter Size : ");
         n=in.nextInt();
         int a[]=new int[n];
         System.out.println("Enter Element in Array ");
         for(i=0;i<n;i++){
             a[i]=in.nextInt();
         }
         
         
         
         for(i=0;i<n-1;i++)
         {
             pos=i;
             for(j=i+1;j<n;j++)
             {
                 if(  i %2==0 && a[j]>a[pos]){
                     pos=j;
                 }
                 else if( i %2!=0 && a[j]<a[pos] ){
                     pos=j;
                 }
                 
             }
             temp=a[i];
             a[i]=a[pos];
             a[pos]=temp;
         }
         
         for(i=0;i<n;i++){
             System.out.print(a[i]+" \t");
         }
         
             
    
    }
}
