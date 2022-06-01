import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            Scanner input=new Scanner(System.in);
            String shuxing = input.next();
            if(shuxing == "exit") {
                break;
            }
            String res = fun(shuxing);
            System.out.println(res);
        }
    }

    public static String fun(String shuxing){

        return shuxing;
    }
}
