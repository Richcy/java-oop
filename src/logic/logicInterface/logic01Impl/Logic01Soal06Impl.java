package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal06Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal06Impl(BasicLogic logic) {
        this.logic = logic;
    }
    public void isiArray(){
        int k = 1; //nilai awal
        int l =10; //nilai akhir
        int tampungN,batas = 0;
        for (int i=k; i<=l; i++) {
            tampungN = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    tampungN = tampungN + 1;
                }
            }
            if (tampungN == 2) {
                this.logic.array[0][batas] = String.valueOf(i);
                if (batas == logic.n - 1) break;
                else {
                    l = (int) (Math.pow(l, i));
                    batas++;
                }
            }
        }
    }


    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
