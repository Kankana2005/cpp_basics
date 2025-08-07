import java.util.*;
public class patterns {
    // public static void pat(int n){
    //        for(int i=0;i<n;i++){
    //         for(int j =0;j<n;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    // public static void pat1(int n){
    //     for (int i=0;i<n;i++){
    //         for (int j=0;j<=i;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void pat1(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    //  public static void pat1(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(i+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    //  public static void pat1(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=0;j<n-i+1;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    //  public static void pat1(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i+1;j++){
    //             System.out.print(j );
    //         }
    //         System.out.println();
    //     }
    // }

    //  public static void pat1(int n){
    //     for(int i=0;i<n;i++){
    //             for(int j=0;j<n-i-1;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=0;j<2*i+1;j++){
    //             System.out.print("*");
    //         }
    //          for(int j=0;j<n-i-1;j++){
    //             System.out.print(" ");
    //         }
    //         System.out.println();
    //     }
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=0;j<2*n-(2*i+1);j++){
    //             System.out.print("*");
    //         }
    //          for(int j=0;j<i;j++){
    //             System.out.print(" ");
    //         }
    //         System.out.println();
    //     }

    //   public static void pat1(int n){
    
    //     for (int i=1;i<=2*n-1;i++){
    //         int stars = i;
    //         if(i>n){
    //             stars= 2*n-i;
    //         }
    //         for (int j=0;j<stars;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    //    public static void pat1(int n){
    //     for (int i=0;i<n;i++){
    //         int start = 1;
    //         if(i%2==0){
    //             start= 1;
    //         }
    //         else{
    //             start=0;
    //         }
    //         for (int j=0;j<=i;j++){
    //             System.out.print(start);
    //             start=1-start;
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void pat1(int n){
    //     for(int i=1;i<=n;i++){
    //     //    int space = 2*(n-i);
    //         //no's
    //         for (int j=1;j<=i;j++){
    //             System.out.print(j);

    //         }
    //         //space
    //         for(int j=1;j<=2*n-2*i;j++){
    //             System.out.print(" ");
    //         }
    //                for (int j=i;j>=1;j--){
    //             System.out.print(j);
                
    //         }
    //         System.out.println();
    //// space+=-2;         
    //     }
    // }

    // public static void pat1(int n ){
    //     int num=1;
    //     for (int i=1;i<=n;i++){
            
    //         for(int j=1;j<=i;j++){
    //             System.out.print(num+" ");
    //             num=num+1;
    //         }
    //         System.out.println();
    //     }
    // }

    //   public static void pat1(int n ){
    //     int num=1;
    //     for (int i=0;i<n;i++){
            
    //         for(char j='A';j<='A'+i;j++){
    //             System.out.print(j);
        
    //         }
    //         System.out.println();
    //     }
    // }

    //      public static void pat1(int n ){
    
    //     for (int i=1;i<=n;i++){
            
    //         for(char j='A';j<='A'+(n-i);j++){
    //             System.out.print(j);
        
    //         }
    //         System.out.println();
    //     }
    // }

    //    public static void pat1(int n ){
    
    //     for (int i=0;i<n;i++){
    //         char ch=(char)('A'+i);
    //         for(int j=0;j<=i;j++){
    //             System.out.print(ch+" ");
        
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void pat1(int n){
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n-i-1;j++){
    //             System.out.print(" ");
    //         }
    //         char ch ='A';
    //         int breakpoint = (2*i+1)/2;
    //         for(int j=0;j<2*i+1;j++){
    //             System.out.print(ch);
    //             if(j<breakpoint){
    //                 ch++;
    //             }
    //             else{
    //                 ch--;
    //             }
    //         }
    //          for(int j=0;j<n-i-1;j++){
    //             System.out.print(" ");
                
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void pat1(int n){
    //     int start=0;

    //     for(int i=0;i<n;i++){
    //         for(int j=1;j<=n-i;j++){
    //            System.out.print("*");
    //         }
    //         for(int j=0;j<start;j++){
    //           System.out.print(" ");

    //         }
      
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print("*");
    //         }
    //         start=start+2;
    //         System.out.println();
    //     }
        
    //     start = 8;
    //     for(int i=1;i<=n;i++){
    //          for(int j=1;j<=i;j++){
    //            System.out.print("*");
    //         }
    //         for(int j=0;j<start;j++){
    //           System.out.print(" ");

    //         }
      
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         start=start-2;
    //         System.out.println();

    //     }
    

    // }

    //       public static void pat1(int n ){
    
    //     for (int i=0;i<n;i++){
    //         for(char j=(char)('E'-i);j<='E';j++){
    //             System.out.print(j);
        
    //         }
    //         System.out.println();
    //     }
    // }


    // public static void pat1(int n ){
    //     int spaces = 2*n-2;
    //     for(int i =1;i<=2*n-1;i++){
    //         int stars=i;
    //         if(i>n){
    //             stars=2*n-i;
    //         }
    //         for(int j=1;j<=stars;j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1;j<=spaces;j++){
    //             System.out.print(" ");
    //         }
    //           for(int j=1;j<=stars;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //         if(i<n){
    //             spaces=spaces-2;
    //         }
    //         else{
    //             spaces=spaces+2;
    //         }
    //     }
    // }

    // public static void pat1(int n){
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if(i==0 || i==n-1 || j==0 || j==n-1){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void pat1(int n){
    //     for(int i=0;i<2*n-1;i++){
    //         for(int j=0;j<2*n-2;j++){
    //             int top=i;
    //             int left=j;
    //             int right=2*n-2-j;
    //             int bottom=2*n-1-i;
    //             int min = Math.min(top, Math.min(left, Math.min(right, bottom)));
    //             System.out.print(n-min+" ");
    //         }
    //         System.out.println();
    //     }
    // }



        
        
    

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pat1(n);
     
    }
}
    

