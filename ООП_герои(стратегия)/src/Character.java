public abstract class Character {
    WeaponBehavior weapon;//каждый объект содержит ссылку на реализацию  интерфейса
    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }
    public void fight(){
        weapon.useWeapon();
    }
    public abstract void display();
}