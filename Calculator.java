
public class Calculator {
    private double num1;
    private double num2;
    private char sign;

    public Calculator(){

    }
    public Calculator (double x,double y,char sign){
        this.num1=x;
        this.num2=y;
        this.sign=sign;
    }
    
    private double Action (double x,double y,char sign){
        double result=0;
        switch(sign){
            case ('+'):
            result= x+y;
            break;
            case ('-'):
            result= x-y;
            break;
            case ('*'):
            result= x*y;
            break;
            case ('/'):

            if (y!=0) {
                result= x/y;}
            else {
                System.out.println("Ошибка,деление на ноль!!!");}
            break;
        }
        return result;
    }
    public void Result(){
        System.out.println(Action(num1, num2, sign));
    }
}
