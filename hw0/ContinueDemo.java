public class ContinueDemo {
    public static void main(String[] args){
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
            if (a[i].contains("horse")){
                break;
            }
        }
    }
}
