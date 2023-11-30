public class Weapon extends Equipment {
    //fields
    protected int level = 1;
    protected double spDec;
    protected boolean isATK;
    protected int weight;
    //constructors
    public Weapon(String name,int level,boolean isATK){
        this.level = level;
        this.name = name;
        this.isATK = isATK;
    }
    //getters
    public int getLevel() {return level;}
    public double getSpDec() {return spDec;}
    //methods
    public void updateStat(){
        spDec = (double) level/(weight*10);
        if(spDec>1)    spDec=1;
    }
    public void upLevel(){upLevel(1);}
    public void upLevel(int lvl){
        level+=lvl;
        updateStat();
    }
}

