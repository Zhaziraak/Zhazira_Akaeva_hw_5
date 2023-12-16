public class Main {

    public static void main(String[] args) {

        Boss exampleBoss = new Boss();
        exampleBoss.setHealth(300);
        exampleBoss.setDamage(50);
        exampleBoss.setDefence("Magical");

        System.out.println("BOSS` HEALTH: " + exampleBoss.getHealth() +
                ", DAMAGE: " + exampleBoss.getDamage() + ", DEFENCE: " +
                exampleBoss.getDefence() + ".");
        System.out.println();

        Hero[] heroes = createHeroes();

        for (Hero eachHero:heroes) {
            System.out.println("SUPER POWER: " + eachHero.getSuperPower());
            System.out.println("HEALTH: " + eachHero.getHealth());
            System.out.println("DAMAGE: " + eachHero.getDamage());
            System.out.println();
        }
    }

    public static Hero[] createHeroes() {
        Hero Mag = new Hero(200, 60, "Magic");
        Hero Kinetic = new Hero(300, 70);
        Hero Medic = new Hero(250, 20, "Healing");

        return new Hero[]{Mag, Kinetic, Medic};
    }
}