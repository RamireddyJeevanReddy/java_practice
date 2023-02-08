// OM SAI RAM //
public class EnhancedSwitch {
    public static void main(String args[]){
        char var='a';
        switch (var){
            case 'a'-> System.out.println("it is a");
            case 'b'-> System.out.println("it is b");
            case 'c','d'-> System.out.println("It might be a or b");
            default -> System.out.println("input doesnt match");
        }
    }
}
