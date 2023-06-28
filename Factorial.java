import java.util.Scanner;

public class Factorial {
    private int num;
    private int pr;

    private int PFakt(int n){
        if (n==0 || n==1)
            return n;
        else{
           // res =n*(n-1);
            return n* PFakt (n-1 );
        }
 
    }
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n-ое число: ");
        this.num = in.nextInt();
        in.close();
        this.pr=PFakt(num);
    }   
    public void Output(){
        System.out.printf("Произведение=  %d \n", pr);
    }

}
