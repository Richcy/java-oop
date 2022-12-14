package logic;

import logic.logicInterface.LogicInterface;
import logic.logicInterface.logic01Impl.*;
import logic.logicInterface.logic02Impl.Logic02Soal01Impl;
import logic.logicInterface.logic02Impl.Logic02Soal02Impl;
import logic.logicInterface.logic02Impl.Logic02Soal09Impl;

public class MainLogicInterface {
    public static void main(String[] args) {
        System.out.println("Logic 01 Soal 01");
        LogicInterface logic01soal01 = new Logic01Soal01Impl(new BasicLogic(9));
        logic01soal01.cetakArray();

        System.out.println("\n\nLogic 01 Soal 02");
        LogicInterface logic01soal02 = new Logic01Soal02Impl(new BasicLogic(9));
        logic01soal02.cetakArray();

        System.out.println("\n\nLogic 01 Soal 03");
        LogicInterface logic01soal03 = new Logic01Soal03Impl(new BasicLogic(9));
        logic01soal03.cetakArray();

        System.out.println("\n\nLogic 01 Soal 04");
        LogicInterface logic01soal04 = new Logic01Soal04Impl(new BasicLogic(9));
        logic01soal04.cetakArray();

        System.out.println("\n\nLogic 01 Soal 05");
        LogicInterface logic01soal05 = new Logic01Soal05Impl(new BasicLogic(9));
        logic01soal05.cetakArray();

        System.out.println("\n\nLogic 01 Soal 06");
        LogicInterface logic01soal06 = new Logic01Soal06Impl(new BasicLogic(9));
        logic01soal06.cetakArray();

        System.out.println("\n\nLogic 01 Soal 07");
        LogicInterface logic01soal07 = new Logic01Soal07Impl(new BasicLogic(9));
        logic01soal07.cetakArray();

        System.out.println("\n\nLogic 01 Soal 08");
        LogicInterface logic01soal08 = new Logic01Soal08Impl(new BasicLogic(9));
        logic01soal08.cetakArray();

        System.out.println("\n\nLogic 01 Soal 09");
        LogicInterface logic01soal09 = new Logic01Soal09Impl(new BasicLogic(9));
        logic01soal09.cetakArray();

        System.out.println("\n\nLogic 01 Soal 10");
        LogicInterface logic01soal10 = new Logic01Soal10Impl(new BasicLogic(9));
        logic01soal10.cetakArray();

        System.out.println("\n\nLogic 02 Soal 01");
        LogicInterface logic02soal01 = new Logic02Soal01Impl(new BasicLogic(9));
        logic02soal01.cetakArray();

        System.out.println("\n\nLogic 02 Soal 02");
        LogicInterface logic02soal02 = new Logic02Soal02Impl(new BasicLogic(9));
        logic02soal02.cetakArray();

        System.out.println("\n\nLogic 02 Soal 09");
        LogicInterface logic02soal09 = new Logic02Soal09Impl(new BasicLogic(9));
        logic02soal09.cetakArray();


    }
}
