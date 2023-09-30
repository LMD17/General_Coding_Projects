
package nestedforloops.number.table;

public class NestedForLoopsNumberTable {
    public static void main(String[] args) {
        
        int lastNum = 1;
        for (int rows = 1; rows <= 3; rows++) {

        for (int col = lastNum; col <= lastNum + 4; col++) {
            System.out.print("\t|\t" + col);
        }
        System.out.println("\t|");
        lastNum += 5;
        
        }
    }
    
}
