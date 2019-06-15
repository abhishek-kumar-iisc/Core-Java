public class QuestionThree{

    static void printFirstRepeating( int arr[]){
        //Initialize index of first repeating element
        for(int index1 = 0; index1 < arr.length ; index1++){
            int temp = arr[index1];
            int flag =0;
            for(int index2 = index1+1; index2 < arr.length; index2++){
                if(temp == arr[index2]){
                    System.out.println(temp);
                    flag = 1;
                }
            }
            if(flag == 1){
                break;
            }
        }
    }
    public static void main(String args[]){
        int input[] = {3,4,56,2,56,6,78,2};
        printFirstRepeating(input);
        
    }
}