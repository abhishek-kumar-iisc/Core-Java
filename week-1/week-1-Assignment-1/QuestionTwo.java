import java.util.Arrays;
public class QuestionTwo{
    public static void main(String[] args) {
        int input[] = {2,34,12,29,5,6,67,45};
        int inputSize = input.length;
        Arrays.sort(input);
        System.out.println(input[inputSize-1]);  
        System.out.println(input[0]);
        
    }
}