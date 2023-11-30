public class Sword extends OffensiveWeapon implements WeaponSkill{
    //sword will have highest dmg scaling
    //fields
    //constructors
    public Sword(String name,int level,int baseDmg,int dmgScaling){super(name, level, baseDmg, dmgScaling);}
    public Sword(String name,int level,int baseDmg){this(name,level,baseDmg,2);}
    public Sword(String name, int level) {this(name,level,10);  weight = 5;}

    public void usingSkill() {
        //do something
    }
}
