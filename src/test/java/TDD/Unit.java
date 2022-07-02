package TDD;


public class Unit {
    private int health;
    private final int damege;

    public int getHealth(){
        return health;
    }

    public Unit(int health, int damege ){
        this.health = health;
        this.damege = damege;

    }

    public void takeDamege (int damage){
        health -= damage;

    }

    public void addDamege(Unit unitTom){
        unitTom.takeDamege(damege);

    }




}
