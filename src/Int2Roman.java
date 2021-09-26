public class Int2Roman {
    public static String number2roman(int number) {
        int[] roman_value_list = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman_char_list = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < roman_value_list.length; i += 1) {
            while (number >= roman_value_list[i]) {
                number -= roman_value_list[i];
                res.append(roman_char_list[i]);
            }
        }
        return res.toString();
    }
}


/*
- если большая цифра стоит перед меньшей, то они складываются (принцип сложения),
- если меньшая цифра стоит перед большей, то меньшая вычитается из большей (принцип вычитания). */
