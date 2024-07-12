public class MultiDArrays {
    public static void main(String[] args){
        // 2D array = array of arrays

        String[][] couples = 
        { 
            {"Etienne", "Fausta"},
            {"Frank", "Jullet"}
        };

        for(int i = 0; i < couples.length; i++){
            System.out.println();
            for(int j = 0; j < couples[i].length; j++){
                System.out.print(couples[i][j]+ " ");
            }
        }
    }
}
