//пример с урока 30.01:
public class MainNew {
    public static void main(String[] args) {
       int result = getSum(1,2,3,4);
        System.out.println(result);
    }
    private static int getSum(int...data) {
        int result = 0;
        for (int i : data) {
            result = result+1;
        }
        return result;
    }
}