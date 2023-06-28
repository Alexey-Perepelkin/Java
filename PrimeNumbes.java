public class PrimeNumbes {
private int number;



    private static boolean isSimple(int number) {
        if(number < 2) return false;
        for(int i = 2; i < number ; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int getNumber() {
        return number;
    }
 
    public void setNumber(int number) {
        this.number = number;
    }

    public boolean getFlag(){
        return isSimple(this.number);
    }
}
