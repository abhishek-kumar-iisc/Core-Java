public class QuestionFive{
    public static void main(String args[]){
        int input[] = {4,56,2,34,56,4,78,99, 56};
        int result[] = new int[10];
        int counter = 0;
        int count =0;

        for(int i = 0; i < input.length; i++ ){
            boolean isDistinct = false;
            for(int j = 0; j < i; j++){
                if(input[i] == input[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                result[counter++] = input[i];
            }
        }
        for(int i = 0; i < counter; i++){
            count = 0;
            for(int j = 0; j < input.length; j++){
                if(result[i] == input[j]){
                    count++;
                }
            }
            System.out.println(result[i] + " is repeated " + count+" times ");
        }
    } 

}