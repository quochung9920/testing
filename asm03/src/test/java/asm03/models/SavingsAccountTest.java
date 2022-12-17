package asm03.models;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SavingsAccountTest {

    SavingsAccount savingsAccount = new SavingsAccount("123456", 8000000);
    SavingsAccount savingsAccountPremium = new SavingsAccount("123459", 20000000);

    @BeforeAll
    static void init() {
        System.out.println("Start testing SavingsAccount class");
    }

    @AfterAll
    static void finish() {
        System.out.println("Finish testing SavingsAccount class");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Start testing a method");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Finish testing a method");
    }

    @Test
    @Tag("withdraw1")
    @DisplayName("Test phương thức rút tiền")
    void testWithdraw1() {
        // Test số tiền rút nhỏ hơn 50.000đ
        Assertions.assertEquals(false, savingsAccount.withdraw(40000));
        Assertions.assertEquals(false, savingsAccountPremium.withdraw(40000));

        // Test số tiền rút lớn hơn 5.000.000đ và không phải tài khoản Premium
        Assertions.assertEquals(false, savingsAccount.withdraw(6000000));

        // Test số tiền rút lớn hơn 5.000.000đ và là tài khoản Premium
        Assertions.assertEquals(true, savingsAccountPremium.withdraw(6000000));

        // Test số dư còn lại sau khi rút tiền thành công phải lớn hơn hoặc bằng 50.000đ
        Assertions.assertEquals(false, savingsAccount.withdraw(8000000));
        Assertions.assertEquals(false, savingsAccountPremium.withdraw(19998000));

        // Test số tiền rút phải là bội số của 10.000đ
        Assertions.assertEquals(false, savingsAccount.withdraw(2000001));
        Assertions.assertEquals(false, savingsAccountPremium.withdraw(2000001));
    
        // Test số tiền rút bằng 0
        Assertions.assertEquals(false, savingsAccount.withdraw(0));
        Assertions.assertEquals(false, savingsAccountPremium.withdraw(0));
    }

    @Test
    void testIsAccept() {
        // Test số tiền rút nhỏ hơn 50.000đ
        Assertions.assertEquals(false, savingsAccount.withdraw(40000));
        Assertions.assertEquals(false, savingsAccountPremium.withdraw(40000));

        // Test số tiền rút lớn hơn 5.000.000đ và không phải tài khoản Premium
        Assertions.assertEquals(false, savingsAccount.withdraw(6000000));

        // Test số tiền rút lớn hơn 5.000.000đ và là tài khoản Premium
        Assertions.assertEquals(true, savingsAccountPremium.withdraw(6000000));

        // Test số dư còn lại sau khi rút tiền thành công phải lớn hơn hoặc bằng 50.000đ
        Assertions.assertEquals(false, savingsAccount.withdraw(8000000));
        Assertions.assertEquals(false, savingsAccountPremium.withdraw(19998000));

        // Test số tiền rút phải là bội số của 10.000đ
        Assertions.assertEquals(false, savingsAccount.withdraw(2000001));
        Assertions.assertEquals(false, savingsAccountPremium.withdraw(2000001));
    }

    @ParameterizedTest()
    @ValueSource(doubles = { 70000, 6000000, 8000000, 19998000, 2000001, 0 })
    @Tag("withdraw2")
    @DisplayName("Test phương thức rút tiền")
    @Disabled
    void testWithdraw2(double value) {
        Assertions.assertTrue(savingsAccount.withdraw(value));
        Assertions.assertTrue(savingsAccountPremium.withdraw(value));
    }

    @Test
    @Tag("withdraw3")
    @DisplayName("Test phương thức gửi tiền")
    void testWithdraw3() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(1000), () -> savingsAccountPremium.withdraw(6000000));
    }

    @Nested
    @DisplayName("Test phương thức chuyển khoản")
    class WithdrawTest {

        @Test
        @Tag("withdraw1")
        @DisplayName("Test số tiền chuyển nhỏ hơn 50.000đ")
        void testWithdraw1() {
            Assertions.assertEquals(false, savingsAccount.withdraw(40000));
            Assertions.assertEquals(false, savingsAccountPremium.withdraw(40000));
        }

        @Test
        @Tag("withdraw2")
        @DisplayName("Test số tiền chuyển lớn hơn 5.000.000đ và không phải tài khoản Premium")
        void testWithdraw2() {
            Assertions.assertEquals(false, savingsAccount.withdraw(6000000));
        }

        @Test
        @Tag("withdraw3")
        @DisplayName("Test số tiền chuyển lớn hơn 5.000.000đ và là tài khoản Premium")
        void testWithdraw3() {
            Assertions.assertEquals(true, savingsAccountPremium.withdraw(6000000));
        }

        @Test
        @Tag("withdraw4")
        @DisplayName("Test số dư còn lại sau khi chuyển tiền thành công phải lớn hơn hoặc bằng 50.000đ")
        void testWithdraw4() {
            Assertions.assertEquals(false, savingsAccount.withdraw(8000000));
            Assertions.assertEquals(false, savingsAccountPremium.withdraw(19998000));
        }

        @Test
        @Tag("withdraw5")
        @DisplayName("Test số tiền chuyển phải là bội số của 10.000đ")
        void testWithdraw5() {
            Assertions.assertEquals(false, savingsAccount.withdraw(2000001));
            Assertions.assertEquals(false, savingsAccountPremium.withdraw(2000001));
        }

        @Test
        @Tag("withdraw6")
        @DisplayName("Test số tiền chuyển bằng 0")
        void testWithdraw6() {
            Assertions.assertEquals(false, savingsAccount.withdraw(0));
            Assertions.assertEquals(false, savingsAccountPremium.withdraw(0));
        }
        
    }     

}
