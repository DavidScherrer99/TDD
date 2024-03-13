import ch.hearc.ig.FizzBuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    @DisplayName("1 => 1")
    void fizz_Given1_ShouldBe1() {
        assertEquals("1", new FizzBuzz().generate(1));
    }

    @Test
    @DisplayName("5 => Fizz")
    void fizz_Given5_shouldBeFizz() {
        assertEquals("Fizz", new FizzBuzz().generate(5));
    }

    @Test
    @DisplayName("7 => Buzz")
    void fizz_Given7_ShouldBeBuzz() {
        assertEquals("Buzz", new FizzBuzz().generate(7));
    }

    @Test
    @DisplayName("35 => FizzBuzz")
    void fizz_Given35_ShouldBeFizzBuzz() {
        assertEquals("FizzBuzz", new FizzBuzz().generate(35));
    }

    @Test
    @DisplayName("6 => 6")
    void fizz_Given6_ShouldBe6() {
        assertEquals("6", new FizzBuzz().generate(6));
    }

    @Test
    @DisplayName("-1 => IllegalArgumentException")
    void fizz_GivenNegative1_ShouldBeIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new FizzBuzz().generate(-1));
    }

    @Test
    @DisplayName("660 => FizzBuzz")
    void fizz_Given660_ShouldBeFizzBuzz() {
        assertEquals("FizzBuzz", new FizzBuzz().generate(660));
    }

    @Test
    @DisplayName("606 => 606")
    void fizz_Given606_ShouldBe606() {
        assertEquals("606", new FizzBuzz().generate(606));
    }

    @Test
    @DisplayName("666 => FizzBuzz")
    void fizz_Given666_ShouldBeFizzBuzz() {
        assertEquals("FizzBuzz", new FizzBuzz().generate(666));
    }

    @Test
    @DisplayName("65, -5 => IllegalArgumentException")
    void fizz_Given65_and_Negative5_ShouldBeIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new FizzBuzz().generateMultiple(65, -5));
    }

    @Test
    @DisplayName("65, 3 => Fizz, FizzBuzz, 67")
    void fizz_Given65_and_3_ShouldBeFizz_FizzBuzz_67() {
        assertEquals("Fizz, FizzBuzz, 67", new FizzBuzz().generateMultiple(65, 3));
    }
}
