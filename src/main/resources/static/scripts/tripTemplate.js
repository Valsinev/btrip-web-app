function validateBusinessTrip(event) {

    var radio = document.getElementById("show-month-panel");
    if (radio.checked) {
        // Get the input field value
        var numDaysInput = document.getElementById('numberOfDays');
        var numDays = parseInt(numDaysInput.value);
        // Get the selected checkboxes
        var checkboxes = document.querySelectorAll('.day-box input[type="checkbox"]:checked');
        // Check if the number of selected checkboxes matches the input value
        if (checkboxes.length !== numDays) {
            alert("Броят дни не съответства на посочените!");
            event.preventDefault(); // Prevent form submission
        }
    }
}


    function showHideNightStayPanelDiv(radio) {
        var hotelDiv = document.getElementById('hotel-panel-div');
        var monthDiv = document.getElementById('month-panel-div');

        if (radio.value === 'false') {
            nightFieldsNotRequired();
            monthDiv.style.display = 'block'; // Show Div 1
            hotelDiv.style.display = 'none'; // hide Div 2
            clearNightStayPanelData();
        } else {
            monthDiv.style.display = 'none'; // hide Div 1
            hotelDiv.style.display = 'block'; // Show Div 2
            nightFieldsToggleRequired();
            clearMonthPanelData();
        }

        function nightFieldsToggleRequired() {
            nightStayPrice.required = true;
//            numberOfNights.required = true;
            fromWhichDayField.required = true;
            toWhichDayField.required = true;
        }

        function nightFieldsNotRequired() {
            nightStayPrice.required = false;
//            numberOfNights.required = false;
            fromWhichDayField.required = false;
            toWhichDayField.required = false;
        }


function clearMonthPanelData() {
            var day1  = document.getElementById('day1');
            var day2  = document.getElementById('day2');
            var day3  = document.getElementById('day3');
            var day4  = document.getElementById('day4');
            var day5  = document.getElementById('day5');
            var day6  = document.getElementById('day6');
            var day7  = document.getElementById('day7');
            var day8  = document.getElementById('day8');
            var day9  = document.getElementById('day9');
            var day10 = document.getElementById('day10');
            var day11 = document.getElementById('day11');
            var day12 = document.getElementById('day12');
            var day13 = document.getElementById('day13');
            var day14 = document.getElementById('day14');
            var day15 = document.getElementById('day15');
            var day16 = document.getElementById('day16');
            var day17 = document.getElementById('day17');
            var day18 = document.getElementById('day18');
            var day19 = document.getElementById('day19');
            var day20 = document.getElementById('day20');
            var day21 = document.getElementById('day21');
            var day22 = document.getElementById('day22');
            var day23 = document.getElementById('day23');
            var day24 = document.getElementById('day24');
            var day25 = document.getElementById('day25');
            var day26 = document.getElementById('day26');
            var day27 = document.getElementById('day27');
            var day28 = document.getElementById('day28');
            var day29 = document.getElementById('day29');
            var day30 = document.getElementById('day30');
            var day31 = document.getElementById('day31');

             day1.checked = false;
             day2.checked = false;
             day3.checked = false;
             day4.checked = false;
             day5.checked = false;
             day6.checked = false;
             day7.checked = false;
             day8.checked = false;
             day9.checked = false;
            day10.checked = false;
            day11.checked = false;
            day12.checked = false;
            day13.checked = false;
            day14.checked = false;
            day15.checked = false;
            day16.checked = false;
            day17.checked = false;
            day18.checked = false;
            day19.checked = false;
            day20.checked = false;
            day21.checked = false;
            day22.checked = false;
            day23.checked = false;
            day24.checked = false;
            day25.checked = false;
            day26.checked = false;
            day27.checked = false;
            day28.checked = false;
            day29.checked = false;
            day30.checked = false;
            day31.checked = false;
        }


        function clearNightStayPanelData() {
            var nightStayPrice = document.getElementById('nightStayPrice');
//            var numberOfNights = document.getElementById('numberOfNights');
//            var fromWhichDay = document.getElementById('fromWhichDayField');
//            var toWhichDay = document.getElementById('toWhichDayField');
            var isTravelOnFirstDay = document.getElementById('isTravelOnFirstDay');
            var isTravelOnLastDay = document.getElementById('isTravelOnLastDay');

            nightStayPrice.value = '';
//            numberOfNights.value = '';
//            fromWhichDay.value = '';
//            toWhichDay.value = '';
            isTravelOnFirstDay.checked = false;
            isTravelOnLastDay.checked = false;
        }
    }



    function showHideVehPanelDiv(radio) {
        var vehPanel = document.getElementById('vehicle-panel-div');

        if (radio.value === 'true') {
            toggleRequiredVehFields();
            vehPanel.style.display = 'block'; // Show Div 1
        } else {
            vehPanel.style.display = 'none'; // Hide Div 1
            toggleNotRequiredVehFields();
            clearVehPanelData();
        }

        function toggleRequiredVehFields() {
            costBy100.required = true;
            fuelPrice.required = true;
            kilometers.required = true;
        }

        function toggleNotRequiredVehFields() {
            costBy100.required = false;
            fuelPrice.required = false;
            kilometers.required = false;
        }

        function clearVehPanelData() {
            var makeAndModel = document.getElementById('makeAndModel');
            var category = document.getElementById('category');
            var regNumber = document.getElementById('regNumber');
            var costBy100 = document.getElementById('costBy100');
            var fuelType = document.getElementById('fuelType');
            var fuelPrice = document.getElementById('fuelPrice');
            var kilometers = document.getElementById('kilometers');

            makeAndModel.value = '';
            category.value = '';
            regNumber.value = '';
            costBy100.value = '';
            fuelType.value = '';
            fuelPrice.value = '';
            kilometers.value = '';
        }
    }


