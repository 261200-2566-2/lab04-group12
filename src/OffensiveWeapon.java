public abstract class OffensiveWeapon extends Weapon{
    //fields
    protected int baseDmg;
    protected int dmg;
    protected int dmgScaling;
    //constructors
    public OffensiveWeapon(String name, int level) {
        super(name, level,true);
        updateStat();
    }
    public OffensiveWeapon(String name, int level,int baseDmg) {
        this(name,level);
        this.baseDmg = baseDmg;
    }
    public OffensiveWeapon(String name, int level,int baseDmg,int dmgScaling){
        this(name,level,baseDmg);
        this.dmgScaling = dmgScaling;
    }
    //getter
    public int getDmg() {return dmg;}
    //methods
    @Override
    public void updateStat() {
        dmg = baseDmg * level * dmgScaling;
        if(dmg<0)   dmg=0;
        super.updateStat();
    }

}
