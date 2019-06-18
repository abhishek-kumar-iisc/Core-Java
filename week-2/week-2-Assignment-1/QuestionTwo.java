public class QuestionTwo{
    public static void main(String[] args) {
        int input[] = {3,4,2,7,9};
        int sum = 0;
        for( int index = 0; index < input.length; index++){
            sum += input[index];
        }
        System.out.println("The sum is "+sum);
        
    }
}