package Pokemon;

enum Type {
    Water,
    Fire,
    Grass,
}

public class Pokemon{
    private float health;
    private int strength;
    private int speed;
    private String name;
    private int maxHealth;
    private Type type;

    public int getSpeed() {
        return speed;
    }

    public Type getType() {
        return type;
    }

    /**
     * Constructs the pokemon
     * @Require:
     *    health is an integer greater than or equal to 1 but less than or equal to 300
     *    strength is an integer greater than or equal to 1 but less than or equal to 300
     *    speed is an integer greater than or equal to 1 but less than or equal to 300
     */
    public Pokemon(int health, int strength, int speed, String name, Type type){
        this.health = health;
        this.strength = strength;
        this.speed = speed;
        this.name= name;
        this.maxHealth = health;
        this.type = type;
    }

        public static void battle(Pokemon pokemon1, Pokemon pokemon2){
        Pokemon fastest = determineFastest(pokemon1, pokemon2);
        Pokemon slowest = (fastest == pokemon1) ? pokemon2 : pokemon1;

        System.out.println(Introduction(fastest));
        System.out.println("VS");
        System.out.println(Introduction(slowest));
        
        Pokemon victor;
        do {
            victor = round(fastest, slowest);
        } while(victor == null);
    }

    public static Pokemon determineFastest(Pokemon pokemon1, Pokemon pokemon2){
        if(pokemon1.speed > pokemon2.speed){
            return pokemon1;
        }else
        {
            return pokemon2;
        }
    }

    public static Pokemon round(Pokemon pokemon1, Pokemon pokemon2) {
        attack(pokemon1, pokemon2);
        if(pokemon2.health > 0) attack(pokemon2, pokemon1);

        return determineVictor(pokemon1, pokemon2);
    }

    public static void attack(Pokemon Attacker, Pokemon Defender){
        float crit = criticalHitMultiplier(1f, 1.8f);
        float Damage = Attacker.strength * typeCheck(Attacker.type, Defender.type) * crit;

        System.out.println("-----------------------------");
        Defender.health = Defender.health - Damage;

        if(crit > 1.5) System.out.println("A Critical Hit!");

        if(Defender.health <= 0) Defender.health = 0;

        System.out.println(Attacker.name + " attacks " + Defender.name + " for " + Math.round(Damage) + " damage");
        System.out.println(Defender.name + ": HP " + Math.round(Defender.health) + "/" + Math.round(Defender.maxHealth));
    }

    public static Pokemon determineVictor(Pokemon Attacker, Pokemon Defender){
        if(Defender.health <= 0){
            System.out.println("-----------------------------");
            System.out.println(Attacker.name + " Is the winner!");
            return Attacker;
        }
        else if(Attacker.health <= 0) {
            System.out.println("-----------------------------");
            System.out.println(Defender.name + " Is the winner!");
            return Defender;
        }
        else{
            return null;
        }
    }

    public static float typeCheck(Type Attacker, Type Defender){
        if(Attacker == Defender) return 1;
        if(Attacker == Type.Fire && Defender == Type.Grass) return 2;
        if(Attacker == Type.Fire && Defender == Type.Water) return .5f;
        if(Attacker == Type.Grass && Defender == Type.Water) return 2;
        if(Attacker == Type.Grass && Defender == Type.Fire) return .5f;
        if(Attacker == Type.Water && Defender == Type.Fire) return 2;
        if(Attacker == Type.Water && Defender == Type.Grass) return .5f;
        return 1;
    }

    public static float criticalHitMultiplier(float lower, float upper){
        return lower + (float)Math.random() * (upper - lower);
    }

    public static String Introduction(Pokemon pokemon){
       return pokemon.name + ":" + "\n" + "Health: " + Math.round(pokemon.health) + "\n" + "Speed: " + pokemon.speed + "\n" + "Strength: " + pokemon.strength;

    }
  }