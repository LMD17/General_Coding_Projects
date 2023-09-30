public class Main {
    public static void main(String[] args) {

        String str = "Hello, world!";
        int hashedStr = hashCode(str);
        System.out.println("Hashed value of string '" + str + "' is: " + hashedStr);

    }

    //
    static int hashCode(String s){
        int h = 0;
        for (int i = 0; i < s.length(); i++){
            System.out.println(h);
            h = (h << 5 | h >>> 27);    //5-bit cyclic shift of the running sum
            h += ((int) s.charAt(i)) % s.length();  // add in next character
        }
        return h;
    }
}