package logic.logic01;

import logic.BasicLogic;

public class Logic01Soal06 extends BasicLogic {
    public Logic01Soal06(int n) {
        super(n);
    }
    public void isiArray(){
        int angka = 0;
        for (int i = 0; i < this.n; i++) {
            angka = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    angka++;
                }
            }
            if (angka == 2){
                this.array[0][i] = String.valueOf(angka);
            }
        }
    }
    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
