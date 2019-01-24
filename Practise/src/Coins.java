import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class Coins{
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while((line = in.readLine())!= null){
            int value = Integer.parseInt(line);
            int coins = 0;
                if ((value/5)>0){
                    coins = coins + value/5;
                    value = value - 5*(value/5);
                    System.out.println( value + " " + coins);
                }
                if ((value/3)>0){
                    coins = coins + value/3;
                    value = value - 3*(value/3);
                    System.out.println( value + " " + coins);
                }
                coins = coins + value;
        System.out.println(coins);
        }
    }

}