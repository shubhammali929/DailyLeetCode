public class TransposeMatrix {

    public static int[][] transpose(int[][] matrix) {
        int[][] arr = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix[0].length; i++)
        {
            for(int j=0; j<matrix.length; j++)
            {
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
   }

   public static void printArr(int[][] arr)
   {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        printArr(arr);
        int[][] arr2 = transpose(arr);
        System.out.println("Transpose of Matrix is : ");
        printArr(arr2);

    }
}
