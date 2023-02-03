import java.util.*;

public class sphenicNum {
    static boolean a[]= new boolean[10000];
    static void isPrime(){
        Arrays.fill(a,true);
        for(int i=2; i*i<10000;i++){
            if(a[i]){
                for(int j = i*2; j<10000;j=j+i){
                    a[j]=false;
                }
            }
        }
        
    }
    static int isSphenic(int N)
    {
        int [] arr =new int[8];
        int count=0;
        int p=0;
        for(int j=1;j<=N;j++){
            if(N%j ==0 && count<8){
                count++;
                arr[p++]=j;
            }
        }
        if(count == 8 && (a[arr[1]] && a[arr[2]] && a[arr[3]]))
            return 1;
        else
            return 0;
        
    }
        public static void main(String[] args) {
            isPrime();
            Scanner s = new Scanner(System.in);
            System.out.println("enter a number:");
            int n = s.nextInt();
            int res = isSphenic(n);
            if(res == 1)
                System.out.println("Sphenic Number");
            else
                System.out.println("Not a Sphenic Number");
        }
    
}
