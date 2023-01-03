public class App {
    public static void main(String[] args) {
        
        int a = 7;
        int b = 10;
        int c = 1;

        int result = max(a,b,c);

        System.out.println("The Max value is : "+ result);
    }

    private static int max(int n1, int n2, int n3) {
        int maxValue;

        if(n2 > n1){
            maxValue = n2;
        }else{
            maxValue = n1;
        }
        
        if(n3 > maxValue){
            maxValue = n3;
        }

        return maxValue;
    }
}
