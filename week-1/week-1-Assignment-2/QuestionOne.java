public class QuestionOne{
    public static void main(String args[]){
        int age = 45;
        if( age <2){
            System.out.println("Infant");
        }
        else if( age >2 && age <12){
            System.out.println("Child");
        }
        else if( age > 12 && age < 20){
            System.out.println("Teenage");
        }
        else if( age > 20 && age <58){
            System.out.println("Adult");
        }
        else if( age > 58 ){
            System.out.println("Senior Citizen");
        }
    }
}