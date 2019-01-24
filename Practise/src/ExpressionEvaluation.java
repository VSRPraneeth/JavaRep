import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ExpressionEvaluation {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while((line = in.readLine())!= null){
            String[] s = line.split(" ");
            String number = s[0];
            String expression = s[1];
            int result = 0;
            int index =0;
            if(expression.contains("+")){
                index = expression.indexOf("+");
                result = Integer.parseInt(number.substring(0,index)) + Integer.parseInt(number.substring(index));
            }
            else if(expression.contains("-")){
                index = expression.indexOf("-");
                result = Integer.parseInt(number.substring(0,index)) - Integer.parseInt(number.substring(index));
            }

            System.out.println(result);
        }
    }

}
