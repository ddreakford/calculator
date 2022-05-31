/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.InputStream;

public class AppTest {

    @Test public void testAdd() {
        InputStream is = getClass().getResourceAsStream("menu_choice_add.txt");
        MenuHandler menuHandler = new MenuHandler(is);
        String operator = menuHandler.getOperator();
        String op1 = menuHandler.getFirstOperand();
        String op2 = menuHandler.getSecondOperand();
        ArithmeticHandler aHandler = new ArithmeticHandler();
        Double result = aHandler.performOp(operator, Double.valueOf(op1), Double.valueOf(op2));
        assertEquals(result, Double.valueOf(13));
    }

    @Test public void testAppAdd() {
        InputStream is = getClass().getResourceAsStream("menu_choice_add.txt");
        MenuHandler menuHandler = new MenuHandler(is);
        App calculator = new App();
        Double result = calculator.run(menuHandler);
        assertEquals(result, Double.valueOf(13));
    }

    @Test public void testSubtract() {
        InputStream is = getClass().getResourceAsStream("menu_choice_subtract.txt");
        MenuHandler menuHandler = new MenuHandler(is);
        String operator = menuHandler.getOperator();
        String op1 = menuHandler.getFirstOperand();
        String op2 = menuHandler.getSecondOperand();
        ArithmeticHandler aHandler = new ArithmeticHandler();
        Double result = aHandler.performOp(operator, Double.valueOf(op1), Double.valueOf(op2));
        assertEquals(result, Double.valueOf(87));
    }

    @Test public void testMultiply() {
        InputStream is = getClass().getResourceAsStream("menu_choice_multiply.txt");
        MenuHandler menuHandler = new MenuHandler(is);
        String operator = menuHandler.getOperator();
        String op1 = menuHandler.getFirstOperand();
        String op2 = menuHandler.getSecondOperand();
        ArithmeticHandler aHandler = new ArithmeticHandler();
        Double result = aHandler.performOp(operator, Double.valueOf(op1), Double.valueOf(op2));
        assertEquals(result, Double.valueOf(27));
    }

    @Test public void testDivide() {
        InputStream is = getClass().getResourceAsStream("menu_choice_divide.txt");
        MenuHandler menuHandler = new MenuHandler(is);
        String operator = menuHandler.getOperator();
        String op1 = menuHandler.getFirstOperand();
        String op2 = menuHandler.getSecondOperand();
        ArithmeticHandler aHandler = new ArithmeticHandler();
        Double result = aHandler.performOp(operator, Double.valueOf(op1), Double.valueOf(op2));
        assertEquals(result, Double.valueOf(3));
    }

}
