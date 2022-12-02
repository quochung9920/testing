package org.example;

import org.junit.jupiter.api.Assertions;

// Tạo Class UtilitiesTest chứa các phương thức test cho mỗi phương thức trong lớp Utilties để mỗi phương thức này trả về test fail()
public class UtilitiesTest {
    // Tạo phương thức test cho phương thức everyNthChar()
    @org.junit.jupiter.api.Test
    public void testEveryNthChar() {
        // Tạo một mảng ký tự chứa các ký tự trong chuỗi "hello"
        char[] output = Utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        // Tạo một mảng ký tự chứa các ký tự trong chuỗi "hlo"
        char[] expected = {'h', 'l', 'o'};
        // So sánh 2 mảng ký tự
        Assertions.assertArrayEquals(expected, output);
    }


    // Tạo phương thức test cho phương thức removePairs()
    @org.junit.jupiter.api.Test
    public void testRemovePairs() {
        // Tạo một chuỗi chứa chuỗi "AABCDDEFF"
        String output = Utilities.removePairs("AABCDDEFF");
        // Tạo một chuỗi chứa chuỗi "ABCDEF"
        String expected = "ABCDEF";
        // So sánh 2 chuỗi
        Assertions.assertEquals(expected, output);
    }

    // Tạo phương thức test cho phương thức removePairs()
    @org.junit.jupiter.api.Test
    public void testRemovePairs2() {
        // Tạo một chuỗi chứa chuỗi "AABCDDEFF"
        String output = Utilities.removePairs("ABCBDEEF ");
        // Tạo một chuỗi chứa chuỗi "ABCDEF"
        String expected = "ABCDEF";
        // So sánh 2 chuỗi
        Assertions.assertEquals(expected, output);
    }


    // Tạo phương thức test cho phương thức converter()
    @org.junit.jupiter.api.Test
    public void testConverter() {
        // Tạo một biến kiểu int chứa giá trị của phương thức converter() với 2 tham số là 10 và 5
        int output = Utilities.converter(10, 5);
        // Tạo một biến kiểu int chứa giá trị 300
        int expected = 30;
        // So sánh 2 biến kiểu int
        Assertions.assertEquals(expected, output);
    }

    // Tạo phương thức test cho phương thức nullIfOddLength()
    @org.junit.jupiter.api.Test
    public void testNullIfOddLength() {
        // Tạo một chuỗi chứa chuỗi "odd"
        String output = Utilities.nullIfOddLength("odd");
        // Tạo một chuỗi chứa chuỗi null
        String expected = "";
        // So sánh 2 chuỗi
        Assertions.assertEquals(expected, output);
    }

}
