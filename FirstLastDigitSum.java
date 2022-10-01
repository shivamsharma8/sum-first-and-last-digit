public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        int sum = 0;

        if (number<0){
            sum=-1;
            return sum;
        }
        else{
            int lastdigit=number%10;
            int firstdigit=0;
            while (number !=0){
                firstdigit=number%10;
                number/=10;
            }
            sum=  firstdigit+ lastdigit;
            return sum;
        }
    }
}
