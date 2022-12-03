public class copyinJava {
    public static void main(String[] args) {
        char[] mystr = { 'j', 'a', 'v', 'a' };
        String newstr = "";
        newstr = newstr.copyValueOf(mystr, 0, 4);
        System.out.println("New String : " + newstr);

    }
}
