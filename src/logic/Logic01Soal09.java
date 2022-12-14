package logic;

public class Logic01Soal09 extends BasicLogic{
    public Logic01Soal09(int n) {
        super(n);
    }
    public void isiArray(){
        for (int i = 0; i < this.n; i++) {
            this.array[0][i] = String.valueOf((int)Math.pow(3,i));
        }
    }
    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
