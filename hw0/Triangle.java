public class Triangle{
    public void drawTriangle(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            } 
            System.out.println();
        }
    }

    public static void main(String[] args){
        Triangle tri = new Triangle();
        tri.drawTriangle(Integer.parseInt(args[0]));
    }
}