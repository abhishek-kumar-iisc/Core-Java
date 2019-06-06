public class QuestionFour{
    public static void main(String args[]){
        int input[] = {4,5,12,34,24,53,77,89};
        
        System.out.print("Even ");
        for(int index = 0; index < input.length; index++){
            if(input[index]%2 == 0){
                System.out.print(input[index]+" ");
            }
        }
        System.out.println();
        System.out.print("Odd ");
        for(int index = 0; index < input.length; index++){
            if(input[index]%2 != 0){
                System.out.print(input[index]+" ");
            }
        }
    }
}