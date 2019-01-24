import java.util.Scanner;

class abc{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count =0;
        for(int i= 0; i<s.length();i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        byte[] s1 = s.getBytes();
        s.strip().split(" ");
//        s = s.replaceAll(" ", "");
        System.out.println(s + s1 + " " + count);
    }
}