package Pokemon;
public class Pokemon {
    // Atributos
    private String name;
    private int health;
    private String type;
    private static int count = 0;

    public Pokemon(String name, int health, String type) {
        this.name = name;
        this.health = health;
        this.type = type;
        Pokemon.count++;
    }

    public void attackPokemon(Pokemon pokemon) {
        int health = pokemon.getHealth();
        pokemon.setHealth(health-10);

    }
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public static void setCount(int count) {
        Pokemon.count = count;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getType() {
        return type;
    }
    public static int getCount() {
        return count;
    }
}