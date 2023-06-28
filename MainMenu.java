import java.util.Scanner;

public class MainMenu {
    public  void MeMenu(){
       
            System.out.println("Выберите одно из действий:");
            System.out.println("1 - Cумма треуголных чисел");
            System.out.println("2 - n!");
            System.out.println("3 - Простые числа");
            System.out.println("4 - Калькулятор");
            System.out.println("0 - Выход ");
            System.out.println("Выберите пункт меню: ");
            Scanner numMenu = new Scanner(System.in);
            int num = numMenu.nextInt();
            
            if (num ==1){
                SummaTraingleNumber SumTr = new SummaTraingleNumber();
                SumTr.Input(); 
                SumTr.Output();
            }    
            else if (num ==2){
                Factorial PrFac=new Factorial();
                PrFac.Input();
                PrFac.Output();
            }
            else if (num ==3){
                PrimeNumbes num1 =new PrimeNumbes();
                System.out.print ("от 1 до ");
                Scanner inNum =new Scanner(System.in);
                int number=inNum.nextInt();
                for(int i=1;i<=number;i++){
                    num1.setNumber(i);
                    if (num1.getFlag()){
                        System.out.print(i +" ");
                    }
                }
            inNum.close();
            }
            else if (num ==4){
                System.out.println("Введите числа");
                Scanner num1=new Scanner(System.in);
                double x=num1.nextInt();
                Scanner sign1=new Scanner(System.in);
                char sign =sign1.next().charAt(0);
                Scanner num2=new Scanner(System.in);
                double y=num2.nextInt();
    
                Calculator rez=new Calculator(x, y, sign);
                rez.Result();
                num1.close();
                num2.close();
                sign1.close();
            }
            else{
                
                numMenu.close();
                System.out.println("0 - Выход ");
            }
            
            
         }    
}
