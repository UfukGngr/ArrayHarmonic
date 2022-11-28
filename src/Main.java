public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        double h=0;
        for (int i=0;i<arr.length;i++){
            h+=(1.0/arr[i]);
        }
        System.out.println(h);


    }
}