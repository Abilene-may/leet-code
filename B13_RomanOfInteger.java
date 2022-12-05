public class B13_RomanOfInteger {
    public static int romanToInt(String s) {
        int sum = 0;
        int temp = 0;
        char[] symbol = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int[] value = { 1, 5, 10, 50, 100, 500, 1000 };
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < symbol.length; j++) {
                if (i == 0 && s.charAt(i) == symbol[j]) {
                    sum = value[j];
                    temp = value[j];

                }
                if (i > 0 && s.charAt(i) == symbol[j]) {
                    if (value[j] < temp) {
                        sum = sum - value[j];
                    } else {
                        sum = sum + value[j];
                    }
                    temp = value[j];
                }
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "LVIII";
        System.out.println(romanToInt(str));
    }
}
