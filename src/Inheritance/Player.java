package Inheritance;

public class Player {
    private int level;
    private int hp;
    private int mp;

    public Player(int level, int hp, int mp) {
        this.level = level;
        this.hp = hp;
        this.mp = mp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

}
