public class QuestionOne{
    public static void main(String args[]){
        int n  = 9;
        int t1 = 0;
        int t2 = 1;
        System.out.print("First " + n + " terms: ");
        for(int index = 1; index <= n; ++index){
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

}