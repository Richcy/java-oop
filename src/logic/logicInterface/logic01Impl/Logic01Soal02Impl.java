package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal02Impl implements LogicInterface {
    private final BasicLogic logic;
    public Logic01Soal02Impl(BasicLogic logic) {
        this.logic = logic;
    }
    public void isiArray(){
        int angka1 = 1;
        int angka2 = 3;
        for (int i = 0; i < this.logic.n; i++) {
            if(i % 2 == 0){
                this.logic.array[0][i] = String.valueOf(angka1);
                angka1++;
            }else {
                this.logic.array[0][i] = String.valueOf(angka2);
                angka2+=3;
            }
        }
    }
    public void cetakArray(){
        this.isiArray();
        this.logic.printSingle();
    }
}
