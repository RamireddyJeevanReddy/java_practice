// OM SAI RAM //
public class IfElseChallenge {
    public static void main(String args[]){
        boolean gameover=true;
        int score =10000;
        int levelcompleted=8;
        int bonous =200;
        int finalscore  = score;
        if(gameover){
            finalscore+=levelcompleted*bonous;
            System.out.println("Your final score is:"+finalscore);
        }
        else{
            System.out.println("Your final score is:"+finalscore);
        }
    }
}
