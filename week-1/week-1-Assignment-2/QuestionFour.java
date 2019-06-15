public class QuestionFour{
    static void printCompany(String code ){
        switch(code){
            case "INF": 
                System.out.println("Infosys");
                break;
            case "TCS":
                System.out.println("Tata Consultancy Services");
                break;
            case "RIL":
                System.out.println("Reliance Industries");
                break;
            default:
                System.out.println("Not mapped");
        }
    }

    public static void main(String args[]){
        printCompany("INF");
        printCompany("TCS");
        printCompany("RIL");
        printCompany("HIND");
    }
}