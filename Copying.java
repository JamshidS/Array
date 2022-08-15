public class Copying {
    public static void main(String[] args) {
        int[] A = {8,6,10,9,2,15,7,13,19,11};
        int[] B = new int[10];

        for(int i = 0; i<A.length;i++){
            B[i] = A[i];
        }

        for (int i : B) {
            System.out.print(i+",");
        }
    }
}
