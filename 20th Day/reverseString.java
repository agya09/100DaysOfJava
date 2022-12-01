public class reverseString {

    public static void main(String[] args) {
        String mystr = "Hello World";
        String newstr = "";
        System.out.println(mystr);

        for (int i = 0; i < mystr.length(); i++) {

            newstr = mystr.charAt(i) + newstr;

        }
        System.out.println(newstr);
    }

}
