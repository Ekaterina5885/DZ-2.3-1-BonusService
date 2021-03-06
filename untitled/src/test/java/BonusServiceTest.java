import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

        @org.junit.jupiter.api.Test
        void shouldCalculateForNotRegisteredAndUnderLimit() {
            BonusService service = new BonusService();

            long amount = 80000;
            boolean registered = false;
            long expected = 8;

            long actual = service.calculate(amount, registered);

            assertEquals(expected, actual);

    }

        @org.junit.jupiter.api.Test
        void shouldCalculateForNotRegisteredAndOverLimit() {
            BonusService service = new BonusService();

            long amount = 5_000_000;
            boolean registered = false;
            long expected = 500;

            long actual = service.calculate(amount, registered);

            assertEquals(expected, actual);

    }
}
