class Skeleton extends Boss {
    private int arrows;


    public int getArrows() {
        return arrows;
    }


    public void setArrows(int arrows) {
        this.arrows = arrows;
    }


    @Override
    public void printInfo() {
        System.out.println("Skeleton Info: ");
        System.out.println("Health: " + getHealth());
        System.out.println("Damage: " + getDamage());
        System.out.println("Weapon Type: " + getWeapon().getType());
        System.out.println("Weapon Name: " + getWeapon().getName());
        System.out.println("Arrows: " + getArrows());
    }
}

