import java.io.IOException;

public class StringAnalyzator {
    public static int num1;
    public static int num2;
    String[] rom_number = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    int[] arab_number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String[] words;
    public static String operationSymbol;
    boolean flag;

    boolean isRoman1;
    boolean isRoman2;

    public void analyze() throws IOException {

        words = InputString.getInput().split(" ");
            if(words.length > 3) throw new IOException("формат математической операции не удовлетворяет заданию - два операнда и один оператор");
        operationSymbol = words[1];

        flag = false; // введем переменную-флаг что бы выяснить с какой строкой работаем .

        try {

            for (int i = 0; i < rom_number.length; i++) {     // проверяем нашу введенную строку(римская или нет)
                if (rom_number[i].equals(words[0])) {
                    isRoman1 = true;
                    break;
                } else isRoman1 = false;
            }
            for(int j = 0; j < rom_number.length; j++) {         // второй операнд проверяется на принадлежность к римской системе
                if (rom_number[j].equals(words[2])) {
                    isRoman2 = true;
                    break;
                } else isRoman2 = false;
            }
                if (isRoman1 && isRoman2) {
                    flag = true;
                    num1 = Roman2int.letterToNumber(words[0]);
                    num2 = Roman2int.letterToNumber(words[2]);
                        if((num1 > 11 || num1 < 0) || (num2 > 11 || num2 < 0)) throw new  IllegalArgumentException("В римской системе нет отрицательных чисел или ваше число больше 10");
                } else if (!isRoman1 && !isRoman2) {
                    num1 = Integer.parseInt(words[0]);
                    num2 = Integer.parseInt(words[2]);
                        if(num1 > 11 || num2 > 11) throw new IllegalArgumentException("Число должно быть от 1 до 10");
                } else throw new IllegalArgumentException();
            }
         catch (IllegalArgumentException e) {
        e.printStackTrace();
        System.exit(0);
        }
    }
}


