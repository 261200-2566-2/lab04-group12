public class Dagger extends OffensiveWeapon implements WeaponSkill{
    //sword will have highest dmg scaling
    //fields
    //constructors
    public Dagger(String name,int level,int baseDmg,int dmgScaling){super(name, level, baseDmg, dmgScaling);}
    public Dagger(String name,int level,int baseDmg){this(name,level,baseDmg,1);}
    public Dagger(String name, int level) {this(name,level,20); weight = 2;}

    public void usingSkill() {
        //do something
    }
}
