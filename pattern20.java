import java.util.Scanner;
public class pattern20{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=2*n; i++){
            for(int j=1; j<=2*n-i; j++){
                System.out.print(" ");
            }
            if(i<=n){
                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int j=1; j<=i-n; j++){
                    System.out.print("* ");
                }
                for(int j=1; j<=2*n-i; j++){
                    System.out.print("  ");
                }
                for(int j=1; j<=i-n; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}