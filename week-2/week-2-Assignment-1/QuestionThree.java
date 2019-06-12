public class QuestionThree{
    static int calculateFactorial(int n){
        if( n == 0){
            return 1;
        }
        else return (n*calculateFactorial(n-1));
    }
    public static void main(String args[]){
        int i;
        int fact = 1;
        int number = 4; //It is the number to calculate factorial
        fact = calculateFactorial(number);
        System.out.println(" Factorial of " + number +" is: "+ fact);
    }
}