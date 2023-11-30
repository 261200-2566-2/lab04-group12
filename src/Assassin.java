public class Assassin extends Character implements SkilledCharacter{
    public Assassin(String name, int level, int speed, Equipment weapon) {
        super(name, level, speed, weapon);
    }
    public Assassin(String name, int level, int speed) {
        super(name, level, speed);
    }

    public void specialAttack() {
        //do something
    }
    public int passiveSkill() {
        //do something
        //Assassin do more damage
    }

    @Override
    protected double calculateDMG() {

    }

}
