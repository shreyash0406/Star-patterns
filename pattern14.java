import java.util.Scanner;
public class pattern14{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            System.out.print("* ");
            for(int j=1; j<=n-i-1; j++){
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for(int i=1; i<=n-1; i++){
            System.out.print(" ");
        }
        System.out.println("*");
    }
}