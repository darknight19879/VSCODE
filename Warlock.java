
public class Warlock extends Character {
    Warlock(String name) {
        super(name);
    }

    public void earthquake(Character mainCharacter) {
        System.out.println(
                super.characterName + " attacks " + mainCharacter.characterName + " with Earthquake ( Damage - 10)");
        int dp = 20;
        int manacost = 30;
        damageGet(mainCharacter, dp, manacost);
    };

    public void recover(Character enemyCharacter) {
        System.out.println(super.characterName + " recover increase HP and Mana");
        int addhp = 60;
        int addmana = 40;
        increase(enemyCharacter, addhp, addmana);
    }
}