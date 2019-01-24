import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class ReverseAndAdd{
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while((line = in.readLine())!= null){
            long n = Long.parseLong(line);
            int count = 0;
            while (!isPalindrome(n)){
                n = n + reverse(n);
                count++;
            }

            System.out.println(count + " " + n);
        }
    }

    private static long reverse(long num){
        long reversenum = 0;
        while(num !=0){
            reversenum = reversenum*10 + num%10;
            num = num/10;
        }
        return reversenum;
    }

    private static boolean isPalindrome(long num){
        if(num == reverse(num))
            return true;
        return false;
    }
}