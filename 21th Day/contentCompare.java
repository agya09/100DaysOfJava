public class contentCompare {

    public static void main(String[] args) {
        String mystr = "Java Programming";
        System.out.println(mystr.contentEquals("Programming"));
        System.out.println(mystr.contentEquals("Java Programming"));
        System.out.println(mystr.contentEquals("Array"));

    }

}
