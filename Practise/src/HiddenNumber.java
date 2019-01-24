import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class HiddenNumber {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while((line = in.readLine())!= null){
            for(char c : line.toCharArray()){
                if(Character.isDigit(c))
                    System.out.print(c);
                else if (c>='a' &&c<='j')
                    System.out.print(c-'a');
            }


//            StringBuilder result = new StringBuilder();
//            for(int i=0; i<line.length();i++){
//                char c = line.charAt(i);
//                if(c>='a' && c<='j'){
//                    result.append(c - 'a');
//                } else if (c >= '0' && c<='9'){
//                    result.append(c);
//                }
//            }
//            if(result.length() == 0)
//                System.out.println("NONE");
//            else
//                System.out.println(result);
        }
    }

}
