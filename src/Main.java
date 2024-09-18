enum WeaponType {
    SWORD,
    BOW,
    GUN
}public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Excalibur");
        boss.setWeapon(bossWeapon);
        boss.printInfo();


        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(200);
        skeleton1.setDamage(30);
        Weapon skeletonWeapon1 = new Weapon(WeaponType.BOW, "Bone Bow");
        skeleton1.setWeapon(skeletonWeapon1);
        skeleton1.setArrows(10);
        skeleton1.printInfo();


        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(150);
        skeleton2.setDamage(20);
        Weapon skeletonWeapon2 = new Weapon(WeaponType.BOW, "Shadow Bow");
        skeleton2.setWeapon(skeletonWeapon2);
        skeleton2.setArrows(15);
        skeleton2.printInfo();
    }
}