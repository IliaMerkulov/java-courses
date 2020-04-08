public class Calculate {
    public static void main(String[] args) {
        //System.out.println("Calculate");
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);
        int sum = first + second;
        System.out.println("sum " +sum);
        int minus = first - second;
        System.out.println("minus "+minus);
        int umn = first * second;
        System.out.println("umn "+umn);
        int del = first / second;
        System.out.println("del "+del);
        int stepen = (int)Math.pow(first, second);
        System.out.println("stepen "+stepen);



    }
}
