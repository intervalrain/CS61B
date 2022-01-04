public class ArgsSum{
    /**
     * Prints out the sum of arguments,
     *  assuming the are integers.
     */
    public static void main(String[] args){
        int index = 0;
        int sum = 0;
        while (index < args.length){
            sum += Integer.parseInt(args[index]);
            index++;
        }
        System.out.println(sum);
    }
}