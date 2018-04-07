package unit.testing;

import org.testng.Assert;

public class ApplyCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Assert.assertEquals(cal.addition(10,15),25);
        Assert.assertEquals(cal.subtraction(20,10),10);
        Assert.assertEquals(cal.multiplication(10,10),100);
        cal.setName("Boby");
        Assert.assertEquals("Boby", cal.getName(),"We could not find: "+cal.getName()+" cause he missed java class");
        cal.division(10,5);
    }
}
