import java.io.*;
import java.util.*;

public class Calculator {
    int result;

    public void calculate() {

        StringAnalyzator one = new StringAnalyzator();
        try {
            one.analyze();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String symbol = StringAnalyzator.operationSymbol;

        switch (symbol) {
            case "+":
                result = Addition.addition();
                break;
            case "-":
                result = Subtraction.subtraction();
                break;
            case "*":
                result = Multiplication.multiple();
                break;
            case "/":
                result = Division.division();
                break;
            default:
                try {
                    throw new Exception("IllegalOperationSymbol");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
        if(one.flag) {            //проверка на вывод: римская или арабская
            System.out.println(Int2Roman.number2roman(result));
        } else {
            System.out.println(result);
        }
    }
}
