import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ArmstrongNumber {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while((line = in.readLine())!= null){
            System.out.println(line);
            int sum=0;
            for(int i=0;i<line.length();i++){
                sum = (int) (sum + Math.pow(Integer.parseInt(String.valueOf(line.charAt(i))),3));
            }

            if(sum == Integer.parseInt(line))
                System.out.print("Armstrong Number");
            else
                System.out.print("Not an Armstrong Number");
        }
    }

}
