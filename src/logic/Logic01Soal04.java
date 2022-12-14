package logic;

public class Logic01Soal04 extends BasicLogic{
    public Logic01Soal04(int n) {
        super(n);
    }
    public void isiArray(){
        for (int i = 0; i < this.n; i++) {
            if (i == 0 || i == 1){
                this.array1[0][i] = 1;
            } else {
              this.array1[0][i] = this.array1[0][i-1] + this.array1[0][i-2];
            }
        }
    }
    public void cetakArray(){
        this.isiArray();
        this.printSingleInt();
    }
}
