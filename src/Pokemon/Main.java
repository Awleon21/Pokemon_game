package Pokemon;

public class Main {

    // Write a program to have pokemon battle and tell who is the winner between two pokemon
    // Challenge : have the pokemon battle two fights in a row
    //              (you may see a problem with this, how are you going to solve it)
    //

    public static void main(String[] args){
        // Update these to initialize these Pokemon
        int count = 1;
        Pokemon charizard = new Pokemon(getRandomNumber(),getRandomNumber(),getRandomNumber(), "Charizard", Type.Fire);
        Pokemon blastoise = new Pokemon(getRandomNumber(),getRandomNumber(),getRandomNumber(), "Blastoise", Type.Water);
        Pokemon venusaur = new Pokemon(getRandomNumber(),getRandomNumber(),getRandomNumber(), "Venusaur", Type.Grass);

        while(count <= 2){
            if(count == 1){
                System.out.println("Round 1!" + "\n");
            }
            else {
                System.out.println("Round 2" + "\n");
            }

            Pokemon.battle(charizard, blastoise);
            System.out.println(" \n BATTLE 1 OVER \n");

            Pokemon.battle(charizard, venusaur);
            System.out.println(" \n BATTLE 2 OVER \n");

            count++;
        }



    }
    public static int getRandomNumber() {
        int min = 100;
        int max = 300;
        return (int) ((Math.random() * (max - min)) + min);
    }
}