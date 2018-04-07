package unit.testing;

public class Calculator {
    String name;

    public int addition(int num1, int num2){
        int total = num1 + num2;
        return total;
    }

    public int subtraction(int num1, int num2){
        int total = num1 - num2;
        return total;
    }

    public int multiplication(int num1, int num2){
        int total = num1 * num2;
        return total;
    }

    public int division(int num1, int num2){
        int total = num1 / num2;
        return total;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
