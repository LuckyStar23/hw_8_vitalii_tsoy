package kg.geektech.game.players;

public abstract class Hero extends GameEntity
        implements HavingSuperPower {
    private SuperPower superPower;
    private String name;

    public Hero(int health, int damage,
                SuperPower superPower, String name) {
        super(health, damage);
        this.superPower = superPower;
        this.name = name;
    }

    public SuperPower getSuperPower() {
        return superPower;
    }

    public void setSuperPower(SuperPower superPower) {
        this.superPower = superPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}