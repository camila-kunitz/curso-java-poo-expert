package desafio4.entities;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void takeDamage(Champion other) {
        // Calcula o dano
        int damage = 0;

        if (this.armor >= other.getAttack()) {
            damage = 1;
        } else {
            damage = other.getAttack() - this.armor;
        }

        // Desconta o dano da vida
        if (this.life - damage < 0) {
            this.life = 0;
        } else {
            int lifeResult = this.life - damage;
            this.life = (lifeResult);
        }
    }

    public String status() {
        if (this.life <= 0) {
            return this.name + ": " + this.life + " de vida (morreu)";
        }
        return this.name + ": " + this.life + " de vida";
    }
}
