public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        double h=0;
        for (int i=0;i<arr.length;i++){
            h+=(1.0/arr[i]);
        }
        h=arr.length/h;
        System.out.println(h);


    }
}