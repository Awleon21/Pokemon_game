package Pokemon;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PokemonTest {

    public PokemonTest() {
        // Dependency mocks setup would go here
    }

    @BeforeAll
    public static void Setup() {
        // Also maybe here
    }

    /*
         ParamaterizedTest Annotation allows the Test method to use the Csv source as a set of parameters
         example "200,100,200" is speed1, speed2, expected
         CsvSource acts as a Comma Separate Value collection of parameters to be passed to our test method
     */
    @ParameterizedTest
    @CsvSource({"200,100,200", "99,100,100", "300,100,300"})
    @DisplayName("Pokemon with fastest speed should be returned")
    public void TestSpeedDetermination(int speed1, int speed2, int expected){
        //Arrange
        //Instantiate new pokemon to be used during our test.  Using speed from parameter to set Charizard's speed
        Pokemon Charizard = new Pokemon(300,300,speed1, "Charizard", Type.Fire);
        Pokemon Blastoise = new Pokemon(300,300,speed2, "Blastoise", Type.Water);
        //Act
        // Call the method to be tested
        Pokemon Faster = Pokemon.determineFastest(Charizard, Blastoise);
        //Assert
        // Assertion takes the feedback from our method call with "actual" as first argument, and Expected as the second.
        // Test passes when both of these values are equal.
        Assertions.assertEquals(Faster.getSpeed(), expected);
    }

    @ParameterizedTest
    @MethodSource("TypeEnums")
    @DisplayName("Correctly calculates modifier from 2 pokemon types")
    public void TestTypeCheck(Type type1, Type type2, float expected){
//        //Arrange
        //Instantiate new pokemon to be used during our test.  Using speed from parameter to set Charizard's speed
        Pokemon Charizard = new Pokemon(300,300,300, "Charizard", type1);
        Pokemon Blastoise = new Pokemon(300,300,100, "Blastoise", type2);
        //Act
        // Call the method to be tested
        float Multiplier = Pokemon.typeCheck(Charizard.getType(), Blastoise.getType());
        //Assert
        // Assertion takes the feedback from our method call with "actual" as first argument, and Expected as the second.
        // Test passes when both of these values are equal.
        Assertions.assertEquals(Multiplier, expected);
    }

    private static Stream<Arguments> TypeEnums() {
        return Stream.of(
                Arguments.of(Type.Fire, Type.Fire, 1),
                Arguments.of(Type.Fire, Type.Water, .5f),
                Arguments.of(Type.Fire, Type.Grass, 2),
                Arguments.of(Type.Grass, Type.Grass, 1),
                Arguments.of(Type.Grass, Type.Water, 2),
                Arguments.of(Type.Grass, Type.Fire, .5f),
                Arguments.of(Type.Water, Type.Water, 1),
                Arguments.of(Type.Water, Type.Fire, 2),
                Arguments.of(Type.Water, Type.Grass, .5f)
        );
    }
}
