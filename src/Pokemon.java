public class Pokemon {
    String name;
    String type;
    String rarity;
    int level;
    int hp;
    String skill01;
    String skill02;
    String skill03;
    String skill04;
    int skill01Damage;
    int skill02Damage;
    int skill03Damage;
    int skill04Damage;

    Pokemon(String name, String type, String rarity, int level, int hp, String skill01, int skill01Damage) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.level = level;
        this.hp = hp;
        this.skill01 = skill01;
        this.skill01Damage = skill01Damage;
    }

    Pokemon(String name, String type, String rarity, int level, int hp, String skill01, int skill01Damage, String skill02, int skill02Damage) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.level = level;
        this.hp = hp;
        this.skill01 = skill01;
        this.skill02 = skill02;
        this.skill01Damage = skill01Damage;
        this.skill02Damage = skill02Damage;

    }

    Pokemon(String name, String type, String rarity, int level, int hp, String skill01, int skill01Damage, String skill02, int skill02Damage, String skill03, int skill03Damage) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.level = level;
        this.hp = hp;
        this.skill01 = skill01;
        this.skill02 = skill02;
        this.skill03 = skill03;
        this.skill01Damage = skill01Damage;
        this.skill02Damage = skill02Damage;
        this.skill03Damage = skill03Damage;

    }

    Pokemon(String name, String type, String rarity, int level, int hp, String skill01, int skill01Damage, String skill02, int skill02Damage, String skill03, int skill03Damage, String skill04, int skill04Damage) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.level = level;
        this.hp = hp;
        this.skill01 = skill01;
        this.skill02 = skill02;
        this.skill03 = skill03;
        this.skill04 = skill04;
        this.skill01Damage = skill01Damage;
        this.skill02Damage = skill02Damage;
        this.skill03Damage = skill03Damage;
        this.skill04Damage = skill04Damage;

    }
}
