public class QuestionTwo{
    static boolean canVote(String citizenship, int age, boolean hasVoterId){
        if(citizenship == "INDIAN"){
            if( age >= 18){
                if(hasVoterId == true){
                    return true;
                }
            }
        }else{
            return false;
        }
        return false;
    }
    public static void main(String args[]){
      String citizenship = "AMERICAN";
      int age = 34;
      boolean hasVoterId = true ;
      System.out.println( canVote( citizenship, age, hasVoterId) );

      citizenship = "INDIAN";
      age = 12;
      hasVoterId = false ;
      System.out.println( canVote( citizenship, age, hasVoterId) );

      citizenship = "INDIAN";
      age = 22;
      hasVoterId = true;
      System.out.println( canVote( citizenship, age, hasVoterId) );
    }
}