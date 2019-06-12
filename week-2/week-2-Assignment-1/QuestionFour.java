public class QuestionFour{
    /**
     * @author Abhishek kumar
     * {emai:}
     * @param args
     */

     public static void main(String args[]){
         // TODO Auto-generated method stud
         //input : arr={0,1, ...}
         //output : arr={...,1,0}
         int input[]    = {3,4,6,7,9};
         for(int index=0; index < input.length; index++)
         System.out.print(input[index]+" ");
         System.out.println();
         int length     = input.length;
         int revArray[] = reverseArray(input, 0, length-1 );
         //loop through array for display
         for(int i:revArray){
             System.out.print(i+" ");
         }
     }
     /**
      * <p> Reversing array using Recursion
      * Example of Tail Recursion.
      * </p>
      * if(i<j) then
      *    swap elements a[i], a[j] //i holds starting index, j holds ending index of array.
      *    reverse(a, i+1, j-1);
      *  @param a
      *  @param i
      *  @param j
      *  @return 
      */
      public static int[] reverseArray(int a[], int i, int j){
          //Tail Recursion
          if( i < j){
              //swap elements a[i], a[j]
              int temp = a[i];
              a[i] = a[j];
              a[j] = temp;
              reverseArray(a, i+1, j-1);
          }
          return a;
      }


}