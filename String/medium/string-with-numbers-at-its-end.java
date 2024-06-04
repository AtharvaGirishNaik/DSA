class Solution {
    int isSame(String s) {
        int x = 0;
        int n = s.length();

        // Find where the numeric part starts from the end of the string
        int i = n - 1;
        while (i >= 0 && Character.isDigit(s.charAt(i))) {
            i--;
        }

        // Extract the numeric part
        String numberPart = s.substring(i + 1);
        String nonNumberPart = s.substring(0, i + 1);

        // Check if the extracted part is non-empty and valid number
        if (!numberPart.isEmpty()) {
            try {
                long numberValue = Long.parseLong(numberPart);

                // Check if the length of the non-numeric part matches the number value
                if (nonNumberPart.length() == numberValue) {
                    x = 1;
                }
            } catch (NumberFormatException e) {
                // Handle cases where the number is too large to parse as a long
                x = 0;
            }
        }

        return x;
    }
}
