import java.io.*;

public class isbnNum {
    static boolean isISBN(long num){
        int sum=0;
        int i,t,intNum,dNum;
        String strNum;

        strNum=""+num;

        if(strNum.length()!=10){
            return false;
        }
        for(i=0;i<strNum.length();i++){
            intNum = Integer.parseInt(strNum.substring(i,i+1));
            dNum = i+1;
            t = dNum *intNum;
            sum = sum+t;
        }
        if((sum%11)==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        long n;
        try{
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            System.out.println("Enter the 10 digit ISBN number: ");
            n = Long.parseLong(br.readLine());
            if(isISBN(n)){
                System.out.println(n+" is valid ISBN Number");
            }
            else{
                System.out.println(n+" is invalid ISBN Number");
            }
        }
        catch(java.lang.Exception e){
            System.out.println("Invalid Input");
        }
    }
    
}
