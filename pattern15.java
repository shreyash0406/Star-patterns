import java.util.Scanner;
public class pattern15{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int row=2*n-1;
        for(int i=1 ;i<=n-1; i++){
            System.out.print(" ");
        }
        System.out.println("*");
        for(int i=2;i<=row-1; i++){
            if(i<=n){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                System.out.print("* ");
                for(int j=1;j<=i-2; j++){
                    System.out.print("  ");
                }
                System.out.println("*");
            }
            else{
                for(int j=1; j<=i-n; j++){
                    System.out.print(" ");
                }
                System.out.print("* ");
                for(int j=1; j<=row-i-1; j++){
                    System.out.print("  ");
                }
                System.out.println("*");
            }
        }
        for(int i=1; i<=n-1; i++){
            System.out.print(" ");
        }
        System.out.println("*");
    }
}