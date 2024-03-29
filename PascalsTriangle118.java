import java.util.*;
public class PascalsTriangle118 {


    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        if(numRows==0) return list;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        list.add(firstRow);

        if(numRows==1) return list;


        for (int i=1;i<numRows;i++){

            List<Integer> prev = list.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=0; j<i-1; j++){
                int sum = prev.get(j)+prev.get(j+1);
                row.add(sum);
            }
            row.add(1);
            list.add(row);
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(generate(5));
    }
}
