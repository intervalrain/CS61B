public class BreakContinue{
    public static void windowPosSum(int[] a, int n){
        for (int i = 0; i < a.length; i++){
            if (a[i] < 0) continue;
            int tmp = 0;
            int cnt = 0;
            for (int j = i; j < a.length; j++){
                cnt++;
                tmp += a[j];
                if (cnt > n) break;
            }
            a[i] = tmp;
        }
    }
    
    public static void main(String[] args){
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
        // should print [4, 8, -3, 13, 9, 4]
        System.out.println(java.util.Arrays.toString(a));

        a = new int[]{1, -1, -1, 10, 5, -1};
        n = 2;
        windowPosSum(a, n);
        // should print [-1, -1, -1, 14, 4, -1]
        System.out.println(java.util.Arrays.toString(a));
    }
}