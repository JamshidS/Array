public class Inserting {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0]=2;
        arr[1]=9;
        arr[2]=22;
        arr[3]=94;
        arr[4]=20;
        arr[5]=7;
        int index = 2;
        int value = 5;
        int n =6;

        for(int i = n;i>index;i--){

            arr[i] = arr[i-1];
        }
        arr[index] = value;
        for (int i : arr) {
            System.out.print(i+",");
        }
    }
}
