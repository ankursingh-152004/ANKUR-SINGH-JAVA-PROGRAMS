package in.kgcoding.Challenge82;

public class TestArray {

    public static void main(String[] args) {
        ArrayOperation arr=new ArrayOperation(new int[] {1,3,5,9});
        ArrayOperation.Statistics statistics=arr.new Statistics();
    System.out.println(statistics.mean());
    }
}
