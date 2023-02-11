
public class countElement {
    public static void main(String[] args) {
        int[] a = new int[]{2,2,1,8,7,2,3,1,6,8,2};
        int[] cnt = new int[a.length];
        int visited = -1;
        for(int i=0;i<a.length;i++){
            int count =1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    cnt[j]=visited;
                }
            }
            if(cnt[i] != visited)
                cnt[i]=count;
        }
        
        System.out.println("--------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("--------------------------------");
        for(int i=0; i<cnt.length;i++){
            if(cnt[i] != visited)
            System.out.println(" "+ a[i]+ " | "+ cnt[i]);
        }
        System.out.println("--------------------------------");
    }
    
}
