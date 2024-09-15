public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        Calculator cc = new Calculator();
        System.out.println(cc.add(1,3));
    }
}
