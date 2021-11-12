import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTestTest {

    @Test
    void shouldCalculateRegisteredAndBonusUnderLimit() {
        BonusServiceTest service = new BonusServiceTest();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateRegisteredAndBonusOverLimit() {
        BonusServiceTest service = new BonusServiceTest();

        // подготавливаем данные:
        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNotRegisteredAndBonusUnderLimit() {
        BonusServiceTest service = new BonusServiceTest();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 100;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNotRegisteredAndBonusOverLimit() {
        BonusServiceTest service = new BonusServiceTest();

        // подготавливаем данные:
        long amount = 100_000_60;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
}