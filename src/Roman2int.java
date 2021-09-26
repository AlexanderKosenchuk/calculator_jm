public class Roman2int {

    private static int decodeSingle(char letter) {
        switch (letter) {
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }

    public static int letterToNumber(String roman){

            int result = 0;
            String uRoman = roman.toUpperCase();
            for (int i = 0; i < uRoman.length() - 1; i++) {
                if (decodeSingle(uRoman.charAt(i)) < decodeSingle(uRoman.charAt(i + 1))) {
                    result -= decodeSingle(uRoman.charAt(i));
                } else {
                    result += decodeSingle(uRoman.charAt(i));
                }
            }
            result += decodeSingle(uRoman.charAt(uRoman.length() - 1));
            return result;
        }
}
