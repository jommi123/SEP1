import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account = new Account();

    @Test
    void deposit() {
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    void withdraw() {
        account.deposit(100);
        assertEquals(50, account.withdraw(50));
        assertEquals(0.0, account.withdraw(1000));
    }

    @Test
    void getBalance() {
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }
}