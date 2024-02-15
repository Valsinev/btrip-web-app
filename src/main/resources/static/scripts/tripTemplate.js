document.getElementById("submit-button").onclick = function (event) {
    // Custom function to execute before form submission
    var form = document.getElementById('tripForm');
    if (validateBusinessTrip(event) && form.checkValidity()) {
        // If the form is valid, show the modal
        showLoadingModal();
    } else {
        // If the form is not valid, do not show the modal
        // You can add additional logic here, such as displaying an error message
        console.log("Form validation failed");
    }
    // You can add any additional functions or logic here

    // If you want to submit the form programmatically, you can call the submit() method on the form element
    // document.getElementById("myForm").submit();
};




function validateBusinessTrip(event) {

    var monthPanel = document.getElementById("show-month-panel");
    var hotelPanel = document.getElementById("show-night-panel");
    var numDaysInput = document.getElementById('numberOfDays');
    var numDays = parseInt(numDaysInput.value);
    if (hotelPanel.checked) {
        var fromWhichDayField = document.getElementById('fromWhichDayField');
        var toWhichDayField = document.getElementById('toWhichDayField');

        var fromDay = parseInt(fromWhichDayField.value);
        var toDay = parseInt(toWhichDayField.value);

        if (toDay - fromDay + 1 === numDays) {
            return true;
        } else {
            showSelectedDaysAlert();
            event.preventDefault();
            return false;
        }
    }
    if (monthPanel.checked) {
        // Get the input field value
        // Get the selected checkboxes
        var checkboxes = document.querySelectorAll('.day-box input[type="checkbox"]:checked');
        // Check if the number of selected checkboxes matches the input value
        if (checkboxes.length !== numDays) {
            showSelectedDaysAlert();
            event.preventDefault(); // Prevent form submission
            return false;
        }
        else {
            return true;
        }
    }
}



function showHideNightStayPanelDiv(radio) {
    var hotelDiv = document.getElementById('hotel-panel-div');
    var monthDiv = document.getElementById('month-panel-div');
    var nightStayPrice = document.getElementById('nightstay-price-input');
    var isTravelOnFirstDay = document.getElementById('isTravelOnFirstDay');
    var isTravelOnLastDay = document.getElementById('isTravelOnLastDay');

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
        fromWhichDayField.required = true;
        toWhichDayField.required = true;
    }

    function nightFieldsNotRequired() {
        nightStayPrice.required = false;
        fromWhichDayField.required = false;
        toWhichDayField.required = false;
    }


    function clearMonthPanelData() {
        var day1 = document.getElementById('day1');
        var day2 = document.getElementById('day2');
        var day3 = document.getElementById('day3');
        var day4 = document.getElementById('day4');
        var day5 = document.getElementById('day5');
        var day6 = document.getElementById('day6');
        var day7 = document.getElementById('day7');
        var day8 = document.getElementById('day8');
        var day9 = document.getElementById('day9');
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
        nightStayPrice.value = 0;
        isTravelOnFirstDay.checked = false;
        isTravelOnLastDay.checked = false;
    }
}

function showHideOtherTransportExpenses(radio) {
    var otherTransportPanel = document.getElementById('other-transport-div');
    var otherTransportExpenses = document.getElementById('other-transport-input');

    if (radio.value === 'true') {
        otherTransportPanel.style.display = 'block';
        otherTransportExpenses.required = true;
    } else {
        otherTransportPanel.style.display = 'none';
        otherTransportExpenses.required = false;
        otherTransportExpenses.value = '';
    }
}

function showHideIsTravelOnFirstLastDay(radio) {
    var isTravelOnFirstLastDay = document.getElementById('is-travel-first-last-day');
    var isTravelOnLastDay = document.getElementById('isTravelOnLastDay');
    var isTravelOnFirstDay = document.getElementById('isTravelOnFirstDay');


    if (radio.value === 'false') {
        isTravelOnFirstLastDay.style.display = 'none';
        isTravelOnFirstDay.checked = false;
        isTravelOnLastDay.checked = false;
    } else {
        isTravelOnFirstLastDay.style.display = 'block';
    }
}

function redirectToPage() {
    // You can change 'destination.html' to the URL of the page you want to redirect to
    window.location.href = '/';
}


function showHideVehPanelDiv(radio) {
    var vehPanel = document.getElementById('vehicle-panel-div');
    var otherTransportPanel = document.getElementById('other-transport-div');
    var otherTransportSection = document.getElementById('other-transport-section');
    var otherTransportCheck = document.getElementById('isTravelWithOtherVehicle');
    var otherTransportExpenses = document.getElementById('other-transport-input');

    if (radio.value === 'true') {
        toggleRequiredVehFields();
        vehPanel.style.display = 'block'; // Show Div 1
        otherTransportPanel.style.display = 'none'; // hide Div 2
        otherTransportSection.style.display = 'none';
        otherTransportCheck.checked = true;
        otherTransportExpenses.value = '';
        otherTransportExpenses.required = false;
    } else {
        vehPanel.style.display = 'none'; // Hide Div 1
        otherTransportPanel.style.display = 'none'; // show Div 2
        otherTransportSection.style.display = 'block';
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
        var make = document.getElementById('make');
        var model = document.getElementById('model');
        var category = document.getElementById('category');
        var regNumber = document.getElementById('regNumber');
        var costBy100 = document.getElementById('costBy100');
        var fuelType = document.getElementById('fuelType');
        var fuelPrice = document.getElementById('fuelPrice');
        var kilometers = document.getElementById('kilometers');

        make.value = '';
        model.value = '';
        category.value = '';
        regNumber.value = '';
        costBy100.value = '';
        fuelType.value = '';
        fuelPrice.value = '';
        kilometers.value = '';
    }
}


function showSelectedDaysAlert() {
    var alertDiv = document.getElementById('selected-days-alert');
    alertDiv.style.display = 'block'; // Set the display style to 'block' to make it visible

    // // Move the alert div to the top of the document body
    document.body.insertBefore(alertDiv, document.body.firstChild);
    
    // Scroll the alert div into view
    alertDiv.scrollIntoView({ behavior: 'smooth', block: 'start' });
}

function hideSelectedDaysAlert() {
    var alertDiv = document.getElementById('selected-days-alert');
    alertDiv.style.display = 'none'; // Hide the alert
}

function showLoadingModal() {
    var modal = document.getElementById('loading-modal');
    $(modal).modal('show'); // Show the modal

    // Set focus to the modal
    modal.focus();

    // Scroll the modal into view
    modal.scrollIntoView({ behavior: 'smooth', block: 'center' });
}
