package Inheritance;

public class PaladinTester {

    public static void main(String[] args) {
        Paladin noob = new Paladin(1,20,10);
        Player noob2 = new Paladin(1,20,10);

        System.out.println(noob2 instanceof Player);

        System.out.println("level" + noob.getLevel());
        System.out.println("hp" + noob.getHp());
        System.out.println("mp" + noob.getMp());

    }

}
