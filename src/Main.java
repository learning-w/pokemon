import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            Scanner input=new Scanner(System.in);
            String shuxing = input.next();
            if("exit".equals(shuxing)) {
                return;
            }
            String res = fun(shuxing);
            System.out.println(res);
        }
    }

    public static String fun(String shuxing){
        for (PokeMon pokeMon:PokeMon.values()) {
            if(shuxing.equals(pokeMon.getShuxing()))
            {
                String gongji = "--->"+pokeMon.getDoubleAtt()+"*2"+"\n--->"+ pokeMon.getHalfAtt()+"*0.5"+
                        "\n--->"+ pokeMon.getInvalidAtt()+"......";
                String fangshou = pokeMon.getDoubleDen()+"--->*2\n"+ pokeMon.getHalfden()+"--->*0.5\n"
                        + pokeMon.getInvalidDen()+"--->.......";
                return gongji + "\n\n" + fangshou;
            }
        }
        return "未找到该属性";
    }
}
