public class Uzduotis4 {
    public static void main(String[] args) {

        String number = "153";
        int numLength = number.length();
        System.out.println(numLength);
        String numberToWord = "";

        for (int j = 0; j < numLength; j++) {

            switch (number.charAt(j)) {

                case '1': {
                    numberToWord = numberToWord + " vienas ";
                    break;
                }
                case '2': {
                    numberToWord = numberToWord + " du ";
                    break;
                }
                case '3': {
                    numberToWord = numberToWord + " trys ";
                    break;
                }
                case '4': {
                    numberToWord = numberToWord + " keturi ";
                    break;
                }
                case '5': {
                    numberToWord = numberToWord + " penki ";
                    break;
                }
                case '6': {
                    numberToWord = numberToWord + " šeši ";
                    break;
                }
                case '7': {
                    numberToWord = numberToWord + " septyni ";
                    break;
                }
                case '8': {
                    numberToWord = numberToWord + " aštuoni ";
                    break;
                }
                case '9': {
                    numberToWord = numberToWord + " devyni ";
                    break;
                }
                default: {
                    numberToWord = numberToWord + " nulis ";
                }
            }
        }
        System.out.println(numberToWord);
    }
}
