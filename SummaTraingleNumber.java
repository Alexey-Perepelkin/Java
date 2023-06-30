import java.util.Scanner;

public class SummaTraingleNumber {
    private int num;
    private int summ;

    private  int SummTraingleNumber (int num, int summ){
        
        if (num==0)
            return summ;
        else
            summ=summ+(num*(num+1)*1/2);
        return SummTraingleNumber(num-1,summ);
    }
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n-ое число: ");
        this.num = in.nextInt();
        in.close();
        this.summ=SummTraingleNumber(num, 0);
    }   
    public void Output(){
        System.out.printf("Сумма=  %d \n", summ);
    }
}
