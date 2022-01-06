public class ArrayTest {
    public static int max(int[] m){
        int res = m[0];
        for (int i : m)
            res = Math.max(i, res);
        return res;
    }
    public static void main(String[] args){
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(ArrayTest.max(numbers));
    }
}
