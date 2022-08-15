public class Rolating{
    public static void main(String[] args) {
        int[] A = {10,6,5,96,20,32,56,7};
        int temp = A[0];
        for(int i = 1;i<A.length;i++){
            A[i-1] = A[i];
        }
        A[A.length-1] = temp;
        for(int x: A){
            System.out.print(x+",");
        }
    }
}