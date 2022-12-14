package logic;

public class BasicLogic {

    public int n;
    public String[][] array;
    public int[][] array1;

    public BasicLogic(int n){
        this.n = n;
        this.array = new String[n][n];
        this.array1 = new int[n][n];
    }

    public void print(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(this.array[i][j] != null){
                    System.out.print(this.array[i][j]+"\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("\n");
        }
    }

    public void printSingle(){
        for (int i = 0; i < n; i++) {
            if(this.array[0][1] != null){
                System.out.print(this.array[0][i]+"\t");
            } else {
                System.out.print("\t");
            }
        }
    }
    public void printSingleInt(){
        for (int i = 0; i < n; i++) {
            System.out.print(this.array1[0][i]+"\t");
        }
    }
}

