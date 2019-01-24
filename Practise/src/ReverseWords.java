import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class ReverseWords{
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while((line = in.readLine())!= null){


            char[] s =line.toCharArray();

            String str = "" ;
            for(int i = s.length-1; i>=0; i-- ){
                str = str+ s[i];
            }
            System.out.println(str);
            if(str.equals(line))
                System.out.println("It's a Palindrome");
            else
                System.out.println("It's not a Palindrome");


        }
    }
}
