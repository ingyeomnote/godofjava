public class ArrayDefaultValues {
    public static void main(String[] args) {
        // 정수형 배열
        int[] intArray = new int[3];
        // 실수형 배열
        double[] doubleArray = new double[3];
        // 문자형 배열
        char[] charArray = new char[3];
        // 논리형 배열
        boolean[] booleanArray = new boolean[3];
        // 참조형 배열 (String)
        String[] stringArray = new String[3];

        // 배열의 기본값 출력
        System.out.println("int Array: ");
        for (int i : intArray) {
            System.out.println(i); // 기본값 0
        }

        System.out.println("\ndoubleArray: ");
        for (double d : doubleArray) {
            System.out.println(d); // 기본값 0.0
        }

        System.out.println("\ncharArray: ");
        for (char c : charArray) {
            System.out.println("'" + c + "'"); // 기본값 '\u0000' (빈 문자)
        }

        System.out.println("\nbooleanArray: ");
        for (boolean b : booleanArray) {
            System.out.println(b); // 기본값 false
        }

        System.out.println("\nstringArray: ");
        for (String s : stringArray) {
            System.out.println(s); // 기본값 null
        }
    }
}
