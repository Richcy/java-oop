package logic;

public class Logic01Soal02 extends BasicLogic{
    public Logic01Soal02(int n) {
        super(n);
    }
    public void isiArray(){
        int angka1 = 1;
        int angka2 = 3;
        // proses mengisi array
        for (int i = 0; i < this.n; i++) {
            if(i % 2 == 0){
                this.array[0][i] = String.valueOf(angka1);
                angka1++;
            }else {
                this.array[0][i] = String.valueOf(angka2);
                angka2+=3;
            }

        }
    }
    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
