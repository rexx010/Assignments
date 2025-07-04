package bankApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AccountTest {

    @Test
    public void testThatDepositCanBeDone(){
        Account bigAccount = new Account();
        assertEquals(0, bigAccount.getBalance("correctPin"));
        bigAccount.deposit(2_000, "correctPin");
        assertEquals(2_000, bigAccount.getBalance("correctPin"));
        bigAccount.deposit(1_000, "correctPin");
        assertNotEquals(0, bigAccount.getBalance("correctPin"));
    }
    @Test
    public void testThatBalanceIsNotNegative(){
        Account bigAccount = new Account();
        bigAccount.deposit(-2_000, "correctPin");
        assertEquals(0, bigAccount.getBalance("correctPin"));
    }
    @Test
    public void testThatPinIsCorrect(){
        Account bigAccount = new Account();
        bigAccount.deposit(5_000, "correctPin");
        assertEquals(5_000, bigAccount.getBalance("correctPin"));
    }
    @Test
    public void testThatPinIsIncorrect(){
        Account bigAccount = new Account();
        bigAccount.deposit(5_000, "correctPin");
        assertEquals(0, bigAccount.getBalance("wrongPin"));
        assertNotEquals(5_000, bigAccount.getBalance("wrongPin"));
    }
    @Test
    public void testThatBalanceCanBeCheckedWithPin(){
        Account bigAccount = new Account();
        bigAccount.deposit(45_000, "correctPin");
        assertEquals(45_000, bigAccount.getBalance("correctPin"));
    }
    @Test
    public void testThatTheDeposistOf2kTwiceWillReturn4k(){
        Account bigAccount = new Account();
        bigAccount.deposit(2_000, "correctPin");
        bigAccount.deposit(2_000, "correctPin");
        assertEquals(4_000, bigAccount.getBalance("correctPin"));
    }
    @Test
    public void testThatWithdrawalCanBeDoneWithCorrectPin() {
        Account bigAccount = new Account();
        bigAccount.deposit(51_000, "correctPin");
        assertEquals(51_000, bigAccount.getBalance("correctPin"));
        bigAccount.withdrawal(22_000, "correctPin");
        assertEquals(29_000, bigAccount.getBalance("correctPin"));
    }
    @Test
    public void testThatWithdrawalCannotBeDoneWithIncorrectPin() {
        Account bigAccount = new Account();
        bigAccount.deposit(51_000, "correctPin");
        assertEquals(51_000, bigAccount.getBalance("correctPin"));
        bigAccount.withdrawal(22_000, "wrongPin");
        assertEquals(51_000, bigAccount.getBalance("correctPin"));
    }
    @Test
    public void testThatWithdrawalIsNotGreaterThanBalance(){
        Account bigAccount = new Account();
        bigAccount.deposit(51_000, "correctPin");
        assertEquals(51_000, bigAccount.getBalance("correctPin"));
        bigAccount.withdrawal(52_000, "correctPin");
        assertEquals(51_000, bigAccount.getBalance("correctPin"));
    }
    @Test
    public void testThatWithdrawalCanWithdrawalCanBeDoneTwice(){
        Account bigAccount = new Account();
        bigAccount.deposit(51_000, "correctPin");
        assertEquals(51_000, bigAccount.getBalance("correctPin"));
        bigAccount.withdrawal(22_000, "correctPin");
        assertEquals(29_000, bigAccount.getBalance("correctPin"));
        bigAccount.withdrawal(9_000, "correctPin");
        assertEquals(20_000, bigAccount.getBalance("correctPin"));
    }
}
