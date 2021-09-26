import java.io.*;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.calculate();



























        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   // создаем объект для работы с консолью
        String [] rom_number = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int [] arab_number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try {
            String input = reader.readLine();

        int result = 0;
        String[] words = input.split(" ");

        boolean flag = false;
        for(int i = 0; i < rom_number.length; i++) {
            if(rom_number[i].equals(words[0]) && rom_number[i].equals(words[2])) {
                flag = true;
            }
        }
        if (flag) {
            num1 = Roman2int.letterToNumber(words[0]);
            num2 = Roman2int.letterToNumber(words[2]);
        }

        int num1 = Integer.parseInt(words[0]);
        if(num1 < 0 | num1 > 10) {
            throw new Exception("Input number from 0 to 10");
        }

        int num2 = Integer.parseInt(words[2]);
        if(num2 < 0 | num2 > 10) {
            throw new Exception("Input number from 0 to 10");
        }

        String operation = words[1];
        char operation_symbol = operation.charAt(0);

        switch (operation_symbol) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default: throw new Exception ("IllegalOperationSymbol");
        }

        System.out.println(result);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }*/
    }
}
