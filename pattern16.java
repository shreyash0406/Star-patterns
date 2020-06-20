 import java.util.Scanner;
public class pattern16{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=2*n;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=2; i<=n; i++){
            for(int j=1 ; j<=n-i+1; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(i-1); j++){
                System.out.print(" ");
            }
            for(int l=1 ; l<=n-i+1; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}