package stoyanov.venislav.btripweb.model;

import org.example.engine.BusinessTripForm;
import org.example.utillity.BTripGetDaysFromCheckboxesOrFields;

import java.util.List;

public class BTrip implements BusinessTripForm {

    private String fullName;
    private String personalNumber;
    private String position;
    private int numberDocuments;
    private String branchIn;
    private String endDestination;
    private String startDestination;
    private int numberOfDays;
    private String monthNumber;
    private String whatYear;
    private String reason;
    private String headEmployeeName;
    private String tripNumberThisMonth;
    private String additionalExpenses;
    private boolean isNightStayedInHotel;
    private String nightStayPrice;
    private String numberOfNightsStayed;
    private boolean isTravelOnFirstDay;
    private boolean IsTravelOnLastDay;
    private boolean isTravelWithYourVehicle;
    private String makeAndModel;
    private String category;
    private String registrationNumber;
    private String costBy100;
    private String fuelPrice;
    private String kilometers;
    private String fuelType;
    private int fromWhichDayField;
    private int toWhichDayField;
    private List<Integer> days;
    private boolean day1;
    private boolean day2;
    private boolean day3;
    private boolean day4;
    private boolean day5;
    private boolean day6;
    private boolean day7;
    private boolean day8;
    private boolean day9;
    private boolean day10;
    private boolean day11;
    private boolean day12;
    private boolean day13;
    private boolean day14;
    private boolean day15;
    private boolean day16;
    private boolean day17;
    private boolean day18;
    private boolean day19;
    private boolean day20;
    private boolean day21;
    private boolean day22;
    private boolean day23;
    private boolean day24;
    private boolean day25;
    private boolean day26;
    private boolean day27;
    private boolean day28;
    private boolean day29;
    private boolean day30;
    private boolean day31;

    public BTrip() {
    }

    public BTrip(String fullName, String personalNumber, String position, int numberDocuments, String branchIn,
                 String endDestination, String startDestination, int numberOfDays, String monthNumber, String whatYear,
                 String reason, String headEmployeeName, String tripNumberThisMonth, String additionalExpenses,
                 boolean isNightStayedInHotel, String nightStayPrice, String numberOfNightsStayed, boolean isTravelOnFirstDay,
                 boolean isTravelOnLastDay, boolean isTravelWithYourVehicle, String makeAndModel, String category,
                 String registrationNumber, String costBy100, String fuelPrice, String kilometers,
                 String fuelType, int fromWhichDay, int toWhichDay, List<Integer> days, boolean day1,
                 boolean day2, boolean day3, boolean day4, boolean day5, boolean day6, boolean day7, boolean day8,
                 boolean day9, boolean day10, boolean day11, boolean day12, boolean day13, boolean day14, boolean day15,
                 boolean day16, boolean day17, boolean day18, boolean day19, boolean day20, boolean day21, boolean day22,
                 boolean day23, boolean day24, boolean day25, boolean day26, boolean day27, boolean day28, boolean day29,
                 boolean day30, boolean day31) {
        this.fullName = fullName;
        this.personalNumber = personalNumber;
        this.position = position;
        this.numberDocuments = numberDocuments;
        this.branchIn = branchIn;
        this.endDestination = endDestination;
        this.startDestination = startDestination;
        this.numberOfDays = numberOfDays;
        this.monthNumber = monthNumber;
        this.whatYear = whatYear;
        this.reason = reason;
        this.headEmployeeName = headEmployeeName;
        this.tripNumberThisMonth = tripNumberThisMonth;
        this.additionalExpenses = additionalExpenses;
        this.isNightStayedInHotel = isNightStayedInHotel;
        this.nightStayPrice = nightStayPrice;
        this.numberOfNightsStayed = numberOfNightsStayed;
        this.isTravelOnFirstDay = isTravelOnFirstDay;
        IsTravelOnLastDay = isTravelOnLastDay;
        this.isTravelWithYourVehicle = isTravelWithYourVehicle;
        this.makeAndModel = makeAndModel;
        this.category = category;
        this.registrationNumber = registrationNumber;
        this.costBy100 = costBy100;
        this.fuelPrice = fuelPrice;
        this.kilometers = kilometers;
        this.fuelType = fuelType;
        this.fromWhichDayField = fromWhichDay;
        this.toWhichDayField = toWhichDay;
        this.days = days;
        this.day1 = day1;
        this.day2 = day2;
        this.day3 = day3;
        this.day4 = day4;
        this.day5 = day5;
        this.day6 = day6;
        this.day7 = day7;
        this.day8 = day8;
        this.day9 = day9;
        this.day10 = day10;
        this.day11 = day11;
        this.day12 = day12;
        this.day13 = day13;
        this.day14 = day14;
        this.day15 = day15;
        this.day16 = day16;
        this.day17 = day17;
        this.day18 = day18;
        this.day19 = day19;
        this.day20 = day20;
        this.day21 = day21;
        this.day22 = day22;
        this.day23 = day23;
        this.day24 = day24;
        this.day25 = day25;
        this.day26 = day26;
        this.day27 = day27;
        this.day28 = day28;
        this.day29 = day29;
        this.day30 = day30;
        this.day31 = day31;
    }

    @Override
    public String getFullName() {
        return this.fullName;
    }

    @Override
    public String getPersonalNumber() {
        return personalNumber;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public int getNumberDocuments() {
        return numberDocuments;
    }

    @Override
    public String getBranchIn() {
        return branchIn;
    }

    @Override
    public String getEndDestination() {
        return endDestination;
    }

    @Override
    public String getStartDestination() {
        return startDestination;
    }

    @Override
    public int getNumberOfDays() {
        return numberOfDays;
    }


    @Override
    public String getMonthNumber() {
        return monthNumber;
    }

    @Override
    public String getWhatYear() {
        return whatYear;
    }

    @Override
    public String getReason() {
        return reason;
    }

    @Override
    public String getHeadEmployeeName() {
        return headEmployeeName;
    }

    @Override
    public String getTripNumberThisMonth() {
        return tripNumberThisMonth;
    }

    @Override
    public String getAdditionalExpenses() {
        return additionalExpenses;
    }

    @Override
    public boolean getIsNightStayedInHotel() {
        return isNightStayedInHotel;
    }

    @Override
    public String getNightStayPrice() {
        return nightStayPrice;
    }

    @Override
    public String getNumberOfNightsStayed() {
        return numberOfNightsStayed;
    }

    @Override
    public boolean getIsTravelOnFirstDay() {
        return isTravelOnFirstDay;
    }

    @Override
    public boolean getIsTravelOnLastDay() {
        return IsTravelOnLastDay;
    }

    @Override
    public boolean getIsTravelWithYourVehicle() {
        return isTravelWithYourVehicle;
    }

    @Override
    public String getMakeAndModel() {
        return makeAndModel;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getCostBy100() {
        return costBy100;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String getFuelPrice() {
        return fuelPrice;
    }

    @Override
    public String getKilometers() {
        return kilometers;
    }

    @Override
    public int getFromWhichDayField() {
        return fromWhichDayField;
    }

    @Override
    public int getToWhichDayField() {
        return toWhichDayField;
    }

    @Override
    public List<Integer> getDays() {
        return BTripGetDaysFromCheckboxesOrFields.getDays(this);
    }

    @Override
    public boolean getDay1() {
        return day1;
    }

    @Override
    public boolean getDay2() {
        return day2;
    }

    @Override
    public boolean getDay3() {
        return day3;
    }

    @Override
    public boolean getDay4() {
        return day4;
    }

    @Override
    public boolean getDay5() {
        return day5;
    }

    @Override
    public boolean getDay6() {
        return day6;
    }

    @Override
    public boolean getDay7() {
        return day7;
    }

    @Override
    public boolean getDay8() {
        return day8;
    }

    @Override
    public boolean getDay9() {
        return day9;
    }

    @Override
    public boolean getDay10() {
        return day10;
    }

    @Override
    public boolean getDay11() {
        return day11;
    }

    @Override
    public boolean getDay12() {
        return day12;
    }

    @Override
    public boolean getDay13() {
        return day13;
    }

    @Override
    public boolean getDay14() {
        return day14;
    }

    @Override
    public boolean getDay15() {
        return day15;
    }

    @Override
    public boolean getDay16() {
        return day16;
    }

    @Override
    public boolean getDay17() {
        return day17;
    }

    @Override
    public boolean getDay18() {
        return day18;
    }

    @Override
    public boolean getDay19() {
        return day19;
    }

    @Override
    public boolean getDay20() {
        return day20;
    }

    @Override
    public boolean getDay21() {
        return day21;
    }

    @Override
    public boolean getDay22() {
        return day22;
    }

    @Override
    public boolean getDay23() {
        return day23;
    }

    @Override
    public boolean getDay24() {
        return day24;
    }

    @Override
    public boolean getDay25() {
        return day25;
    }

    @Override
    public boolean getDay26() {
        return day26;
    }

    @Override
    public boolean getDay27() {
        return day27;
    }

    @Override
    public boolean getDay28() {
        return day28;
    }

    @Override
    public boolean getDay29() {
        return day29;
    }

    @Override
    public boolean getDay30() {
        return day30;
    }

    @Override
    public boolean getDay31() {
        return day31;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setNumberDocuments(int numberOfDocuments) {
        this.numberDocuments = numberOfDocuments;
    }

    public void setBranchIn(String branch) {
        this.branchIn = branch;
    }

    public void setEndDestination(String endDestination) {
        this.endDestination = endDestination;
    }

    public void setStartDestination(String startDestination) {
        this.startDestination = startDestination;
    }

    public void setNumberOfDays(int days) {
        this.numberOfDays = days;
    }

    public void setMonthNumber(String monthNumber) {
        this.monthNumber = monthNumber;
    }

    public void setWhatYear(String whatYear) {
        this.whatYear = whatYear;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setHeadEmployeeName(String headEmployee) {
        this.headEmployeeName = headEmployee;
    }

    public void setTripNumberThisMonth(String tripNumberThisMonth) {
        this.tripNumberThisMonth = tripNumberThisMonth;
    }

    public void setAdditionalExpenses(String additionalExpenses) {
        this.additionalExpenses = additionalExpenses;
    }

    public void setNightStayedInHotel(boolean nightStayedInHotel) {
        isNightStayedInHotel = nightStayedInHotel;
    }

    public void setNightStayPrice(String nightStayPrice) {
        this.nightStayPrice = nightStayPrice;
    }

    public void setNumberOfNightsStayed(String numberOfNightsStayed) {
        this.numberOfNightsStayed = numberOfNightsStayed;
    }

    public void setTravelOnFirstDay(boolean travelOnFirstDay) {
        isTravelOnFirstDay = travelOnFirstDay;
    }

    public void setTravelOnLastDay(boolean travelOnLastDay) {
        IsTravelOnLastDay = travelOnLastDay;
    }

    public void setTravelWithYourVehicle(boolean travelWithYourVehicle) {
        isTravelWithYourVehicle = travelWithYourVehicle;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setCostBy100(String costBy100) {
        this.costBy100 = costBy100;
    }

    public void setFuelPrice(String fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setFromWhichDay(int fromWhichDay) {
        this.fromWhichDayField = fromWhichDay;
    }

    public void setToWichDay(int toWhichDay) {
        this.toWhichDayField = toWhichDay;
    }

    public void setAddExpenses(String addExpenses) {
        this.additionalExpenses = addExpenses;
    }

    public void setDays(List<Integer> days) {
        this.days = days;
    }

    public void setDay1(boolean day1) {
        this.day1 = day1;
    }

    public void setDay2(boolean day2) {
        this.day2 = day2;
    }

    public void setDay3(boolean day3) {
        this.day3 = day3;
    }

    public void setDay4(boolean day4) {
        this.day4 = day4;
    }

    public void setDay5(boolean day5) {
        this.day5 = day5;
    }

    public void setDay6(boolean day6) {
        this.day6 = day6;
    }

    public void setDay7(boolean day7) {
        this.day7 = day7;
    }

    public void setDay8(boolean day8) {
        this.day8 = day8;
    }

    public void setDay9(boolean day9) {
        this.day9 = day9;
    }

    public void setDay10(boolean day10) {
        this.day10 = day10;
    }

    public void setDay11(boolean day11) {
        this.day11 = day11;
    }

    public void setDay12(boolean day12) {
        this.day12 = day12;
    }

    public void setDay13(boolean day13) {
        this.day13 = day13;
    }

    public void setDay14(boolean day14) {
        this.day14 = day14;
    }

    public void setDay15(boolean day15) {
        this.day15 = day15;
    }

    public void setDay16(boolean day16) {
        this.day16 = day16;
    }

    public void setDay17(boolean day17) {
        this.day17 = day17;
    }

    public void setDay18(boolean day18) {
        this.day18 = day18;
    }

    public void setDay19(boolean day19) {
        this.day19 = day19;
    }

    public void setDay20(boolean day20) {
        this.day20 = day20;
    }

    public void setDay21(boolean day21) {
        this.day21 = day21;
    }

    public void setDay22(boolean day22) {
        this.day22 = day22;
    }

    public void setDay23(boolean day23) {
        this.day23 = day23;
    }

    public void setDay24(boolean day24) {
        this.day24 = day24;
    }

    public void setDay25(boolean day25) {
        this.day25 = day25;
    }

    public void setDay26(boolean day26) {
        this.day26 = day26;
    }

    public void setDay27(boolean day27) {
        this.day27 = day27;
    }

    public void setDay28(boolean day28) {
        this.day28 = day28;
    }

    public void setDay29(boolean day29) {
        this.day29 = day29;
    }

    public void setDay30(boolean day30) {
        this.day30 = day30;
    }

    public void setDay31(boolean day31) {
        this.day31 = day31;
    }

    @Override
    public String toString() {
        return "BTrip{" +
                "fullName='" + fullName + '\'' +
                ", personalNumber='" + personalNumber + '\'' +
                ", position='" + position + '\'' +
                ", numberDocuments=" + numberDocuments +
                ", branchIn='" + branchIn + '\'' +
                ", endDestination='" + endDestination + '\'' +
                ", startDestination='" + startDestination + '\'' +
                ", numberOfDays=" + numberOfDays +
                ", monthNumber='" + monthNumber + '\'' +
                ", whatYear='" + whatYear + '\'' +
                ", reason='" + reason + '\'' +
                ", headEmployeeName='" + headEmployeeName + '\'' +
                ", tripNumberThisMonth='" + tripNumberThisMonth + '\'' +
                ", additionalExpenses='" + additionalExpenses + '\'' +
                ", isNightStayedInHotel=" + isNightStayedInHotel +
                ", nightStayPrice='" + nightStayPrice + '\'' +
                ", numberOfNightsStayed='" + numberOfNightsStayed + '\'' +
                ", isTravelOnFirstDay=" + isTravelOnFirstDay +
                ", IsTravelOnLastDay=" + IsTravelOnLastDay +
                ", isTravelWithYourVehicle=" + isTravelWithYourVehicle +
                ", makeAndModel='" + makeAndModel + '\'' +
                ", category='" + category + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", costBy100='" + costBy100 + '\'' +
                ", fuelPrice='" + fuelPrice + '\'' +
                ", kilometers='" + kilometers + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", fromWhichDayField=" + fromWhichDayField +
                ", toWhichDayField=" + toWhichDayField +
                ", days=" + days +
                ", day1=" + day1 +
                ", day2=" + day2 +
                ", day3=" + day3 +
                ", day4=" + day4 +
                ", day5=" + day5 +
                ", day6=" + day6 +
                ", day7=" + day7 +
                ", day8=" + day8 +
                ", day9=" + day9 +
                ", day10=" + day10 +
                ", day11=" + day11 +
                ", day12=" + day12 +
                ", day13=" + day13 +
                ", day14=" + day14 +
                ", day15=" + day15 +
                ", day16=" + day16 +
                ", day17=" + day17 +
                ", day18=" + day18 +
                ", day19=" + day19 +
                ", day20=" + day20 +
                ", day21=" + day21 +
                ", day22=" + day22 +
                ", day23=" + day23 +
                ", day24=" + day24 +
                ", day25=" + day25 +
                ", day26=" + day26 +
                ", day27=" + day27 +
                ", day28=" + day28 +
                ", day29=" + day29 +
                ", day30=" + day30 +
                ", day31=" + day31 +
                '}';
    }
}
