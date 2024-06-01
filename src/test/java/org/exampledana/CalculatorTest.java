package org.exampledana;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Scanner;

public class CalculatorTest {
//
//    @BeforeAll
//    static void createStaticMock() {
//        System.out.println("Running before all");
//        Mockito.mockStatic(ScientificCalculator.class)
//                .when(()-> ScientificCalculator.sin(90.0))
//                .thenReturn(0.0);
//    }
//
//    @Test
//    // @Disabled
//    public void additionWorks(){
//        Random randomizer = new Random();
//        int term1 = randomizer.nextInt(50);
//        System.out.println(term1);
//        int term2 = randomizer.nextInt(50);
//        System.out.println(term2);
//
//        Assertions.assertEquals(term1 + term2, Calculator.addition(term1,term2));
//    }
//

    @Test
    public void gettingUnitWorks(){
        String input1="mm";
        Assertions.assertEquals(Unit.mm, Calculator.getUnit(new Scanner(input1)));
        String input2="Km";
        Assertions.assertEquals(Unit.km, Calculator.getUnit(new Scanner(input2)));
        String input3="CM";
        Assertions.assertEquals(Unit.cm, Calculator.getUnit(new Scanner(input3)));
    }

    @Test
    public void additionWorks() {
//        Random randomizer = new Random();
//        double term1 = randomizer.nextInt(100);
//        System.out.println(term1);
//        double term2 = randomizer.nextInt(100);
//        System.out.println(term2);
//        double term3 = randomizer.nextInt(100);
//        System.out.println(term3);
        Assertions.assertEquals((10000+200), Calculator.calculateDistance("10m+20cm", Unit.mm));
    }
    @Test
    public void subtractionWorks() {
//        Random randomizer = new Random();
//        double term1 = randomizer.nextInt(100);
//        System.out.println(term1);
//        double term2 = randomizer.nextInt(100);
//        System.out.println(term2);
//        double term3 = randomizer.nextInt(100);
//        System.out.println(term3);
        Assertions.assertEquals((-20+200), Calculator.calculateDistance("-20mm+20cm", Unit.mm));
    }
    @ParameterizedTest
    @CsvSource({"10m+20cm, Unit.mm, 10200", "10m+20m, Unit.mm, 30000"})
    public void parameterizedAdditionWorks(String expression, Unit unit, double result){
        Assertions.assertEquals(result, Calculator.calculateDistance(expression, unit));
    }


//
//    @Test
//    // @Disabled
//    public void substractionWorks(){
//        Random randomizer = new Random();
//        int term1 = randomizer.nextInt(50);
//        int term2 = randomizer.nextInt(50);
//        Assertions.assertEquals(term1 - term2, Calculator.substraction(term1,term2));
//    }
//
//    @Test
//    public void addNamesWorks(){
//        String[] initNames = {"Marcel", "Irina"};
//
//        List<String> calculatedNames = Calculator.addNames(initNames);
//
//        Assertions.assertTrue(calculatedNames.contains("Ana"));
//        Assertions.assertTrue(calculatedNames.containsAll(Arrays.asList(initNames)));
//    }
}
