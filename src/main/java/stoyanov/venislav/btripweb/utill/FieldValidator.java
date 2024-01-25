package stoyanov.venislav.btripweb.utill;

import java.util.List;

public class FieldValidator {

    public FieldValidator() {
    }

        public static boolean validateDigitField(String field) {
            String matchingDigits = "[+]?([0-9]*[.])?[0-9]+";
            boolean isValid = true;
            if (!field.matches(matchingDigits)) {
                isValid = false;
            }

            return isValid;
        }

        public static boolean validateMonthField(String field) {
            String monthRegex = "^(1[0-2]|[1-9])$";
            boolean isValid = true;
            if (!field.matches(monthRegex)) {
                isValid = false;
            }

            return isValid;
        }

        public static boolean validateDayField(String field) {
            String dayRegex = "^(0?[1-9]|[1-2][0-9]|3[0-1])$";
            boolean isValid = true;
            if (!field.matches(dayRegex)) {
                isValid = false;
            }

            return isValid;
        }

        public static boolean validateYearField(String field) {
            String yearRegex = "[^1]\\d\\d\\d";
            boolean isValid = true;
            if (!field.matches(yearRegex)) {
                isValid = false;
            }

            return isValid;
        }

        public static boolean validateNumberOfDaysEqualsInputDays(String numberOfDays, List<Integer> days) {
            boolean isValid = true;

            try {
                int numOfDays = Integer.parseInt(numberOfDays);
                if (numOfDays != days.size()) {
                    throw new Exception("грешка в бр. или избрани дни");
                }
            } catch (Exception var4) {
                isValid = false;
            }

            return isValid;
        }
}

