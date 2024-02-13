package reqursions;

public class CommonReqursions {
    public static int triangle(int i){
        if(i == 1) return 1;
        return i + triangle(i-1);
    }

    public static int factorial(int n){
        if (n == 1) return 1;
        return n * factorial(n-1);
    }


}
