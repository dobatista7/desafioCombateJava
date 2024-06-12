package entities;

public class Champion {

    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public void takeDamage(int attack){
        int damage = attack-this.armor;
        if (damage < 1){
            damage = 1;
        }
        this.life-=damage;
        if(this.life<0){
            this.life=0;
        }
    }

    
    
}
