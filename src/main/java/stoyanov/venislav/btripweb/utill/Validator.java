package stoyanov.venislav.btripweb.utill;

import org.example.utillity.BTripGetDaysFromCheckboxesOrFields;
import stoyanov.venislav.btripweb.model.BTrip;

public class Validator {


    public static void validateTrip(BTrip bTrip) throws ValidationException {
        validateNightStayFields(bTrip);
        validateVehicleFields(bTrip);
        validateCommonFields(bTrip);
        validateNumberOfDays(bTrip);
    }

    private static void validateNightStayFields(BTrip form) throws ValidationException {
        if (form.getIsNightStayedInHotel()) {
            if (form.getNightStayPrice() == null || form.getNumberOfNightsStayed() == null) {
                throw new ValidationException("ErrorMessage.NIGHT_STAY_FIELDS_INVALID");
            }
        }
        // Additional validation logic for night stay fields
    }

    private static void validateVehicleFields(BTrip form) throws ValidationException {
        if (form.getIsTravelWithYourVehicle()) {
            if (form.getCostBy100() == null || form.getFuelPrice() == null || form.getKilometers() == null) {
                throw new ValidationException("ErrorMessage.VEHICLE_FIELDS_INVALID");
            }
        }
        // Additional validation logic for vehicle fields
    }

    private static void validateCommonFields(BTrip form) throws ValidationException {
        // Validation logic for common fields
        // Use if statements similar to the above methods
    }

    private static void validateNumberOfDays(BTrip bTrip) throws ValidationException {
        bTrip.setDays(BTripGetDaysFromCheckboxesOrFields.getDays(bTrip));
        if (bTrip.getDays() == null || bTrip.getDays().isEmpty()
                || !FieldValidator.validateNumberOfDaysEqualsInputDays(String.valueOf(bTrip.getNumberOfDays()), bTrip.getDays())) {
            throw new ValidationException("ErrorMessage.NUMBER_OF_DAYS_INVALID");
        }
    }
}
