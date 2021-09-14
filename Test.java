package Figire;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;


public class Test {

    @org.junit.jupiter.api.Test
    @DisplayName("Калькулятор работает")
    void clc_is_working() {
        var calc = new Calculator();
        Assertions.assertEquals(10, calc.calculate(2,"*",5));
    }


    @org.junit.jupiter.api.Test
    @DisplayName("Неправильный формат первого аргумента")
    void clc_wrong_first_symbol_type() {
        var calc = new Calculator();
        Assertions.assertThrows(NumberFormatException.class, calc.calculate(5,"+",5));
    }


    @org.junit.jupiter.api.Test
    @DisplayName("Неправильный формат второго аргумента")
    void clc_wrong_second_symbol_type() {
        var calc = new Calculator();
        Assertions.assertThrows(NumberFormatException.class, calc.calculate(5,"+",5));
    }


    @org.junit.jupiter.api.Test
    @DisplayName("Неправильный формат знака")
    void clc_wrong_sign_type() {
        var calc = new Calculator();
        Assertions.assertThrows(NumberFormatException.class, calc.calculate(5,"+",5));
    }

}
