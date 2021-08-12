class FactoryPattern {
    public Weapon createWeapon(String name) {
        if(name.equals("M416")) {
            return new M416();
        } else if(name.equals("M762")) {
            return new M762();
        } else {
            return new M164A();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FactoryPattern fp = new FactoryPattern();

        fp.createWeapon("M416").getDamage();
        fp.createWeapon("M416").getNoOfAmmo();

        fp.createWeapon("M762").getDamage();
        fp.createWeapon("M762").getNoOfAmmo();
        
        fp.createWeapon("M164A").getDamage();
        fp.createWeapon("M164A").getNoOfAmmo();

    }
}