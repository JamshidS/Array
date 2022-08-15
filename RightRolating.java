public class RightRolating{
    public static void main(String[] args) {
        int[] A = {10,6,5,96,20,32,56,7}; 

        int temp = A[A.length-1];

        int size = A.length; //8

        for(int i=size-1;i>0;i--){
            A[i] = A[i-1];
        }
        A[0]=temp;
        System.out.println("The Arry has rotatted to right.");

        for (int x : A) {
            System.out.print(x+",");
        }
    }
}
