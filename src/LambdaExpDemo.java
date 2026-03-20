interface Sum {
    int sum(int i, int j);
}

public class LambdaExpDemo {
    public static void main(String[] args) {
        Sum obj = (i, j) -> i+j;
        System.out.println(obj.sum(2,3));
    }
}
