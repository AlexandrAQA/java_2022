package com.tbilisi;

class NewBabyObj {
    public static void main(String[] args) {
        HumanBaby baby = new HumanBaby();
        baby.babyName = "David";
        baby.fatherSurName = new Father("Johnson", true);
        baby.motherName= new Mother("Mary");
        baby.isFatherRich = new Father("Johnson", true);
        baby.showInfoBaby();

    }
}
public class HumanBaby {
    String babyName;
    Mother motherName;
    Father fatherSurName;
    Father  isFatherRich;
    void showInfoBaby (){
        System.out.println("baby name is " + babyName +
                " father's lastname: " + fatherSurName.fatherName + " mother firstname is " + motherName.motherName +
                " is his father rich: " + isFatherRich.isRich);
    }
}

class Father {
    Father(String name, boolean is_rich){
        fatherName = name;
        isRich = is_rich;
    }
    String fatherName;
    boolean isRich;
}

class Mother {
    Mother(String name){
       motherName = name;
    }
    String motherName;
}
