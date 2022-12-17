package asm03.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoanAccountTest {
    LoanAccount loanAccount = new LoanAccount("123456");

    @Test
    void testWithdraw1() {
        
        // Test hạn mức sau khi rút phải lớn hơn 50.000 đồng
        Assertions.assertEquals(false, loanAccount.withdraw(99999000));
        
        // Test số tiền rút bằng 0
        Assertions.assertEquals(false, loanAccount.withdraw(0));
    }

    @Test
    void testIsAccept() {
        // Test hạn mức rút tiền không vượt quá 100.000.000 đồng
        Assertions.assertEquals(false, loanAccount.withdraw(110000000));
        
        // Test hạn mức sau khi rút phải lớn hơn 50.000 đồng
        Assertions.assertEquals(false, loanAccount.withdraw(99999000));
        
        // Test số tiền rút bằng 0
        Assertions.assertEquals(false, loanAccount.withdraw(0));
    }

}
