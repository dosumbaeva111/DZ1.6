package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.setWeaponName("AK-47");
        weapon.setWeaponType("Rifle");
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setWeapon(weapon);
        System.out.println("Boss health: " + boss.getHealth() + " " + "Boss damage: " + boss.getDamage() +" " + "Boss weapon: " + boss.getWeapon().getWeaponName());

    }
}
