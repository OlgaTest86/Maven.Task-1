import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTestTest {

    @Test
    void calculate() {
        BonusServiceTest service = new BonusServiceTest();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
}