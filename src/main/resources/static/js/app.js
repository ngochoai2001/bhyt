createYear();
createMonth();
deleteData()

function validate() {
    let a = [
        [1, 1, 31],
        [2, 1, 28],
        [3, 1, 31],
        [4, 1, 30],
        [5, 1, 31],
        [6, 1, 30],
        [7, 1, 31],
        [8, 1, 31],
        [9, 1, 30],
        [10, 1, 31],
        [11, 1, 30],
        [12, 1, 31]
    ]
    let d = a[0][1]
    let m = a[0][2]
    let y = a[1][0]
    date = `${d}/${m}/${y}`
    // let isValid =  /^(?:(?:31(\/|-|\.)(?:0?[13578]|1[02]))\1|(?:(?:29|30)(\/|-|\.)(?:0?[1,3-9]|1[0-2])\2))(?:(?:1[6-9]|[2-9]\d)?\d{2})$|^(?:29(\/|-|\.)0?2\3(?:(?:(?:1[6-9]|[2-9]\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\d|2[0-8])(\/|-|\.)(?:(?:0?[1-9])|(?:1[0-2]))\4(?:(?:1[6-9]|[2-9]\d)?\d{2})$/.test(date)
    // if(!isValid){
    // 	document.getElementById('error').innerHTML='Nhập sai định dạng'
    // }else{
    // 	document.getElementById('error').innerHTML=date
    // }
    document.getElementById('error').innerHTML = date
}

function createYear() {
    let date = new Date();
    let cur = date.getFullYear();
    let listYearStart = $('#yearStart');
    let listYearEnd = $('#yearEnd');
    for (let i = cur; i >= 1900; i--) {
        listYearStart.append('<option value="' + i + '">' + i + '</option>');
        listYearEnd.append('<option value="' + i + '">' + i + '</option>');
    };

}

function createDayStart(a) {
    document.getElementById('dayStart').innerHTML = "";
    let list = [
        [1, 1, 31],
        [2, 1, 28],
        [3, 1, 31],
        [4, 1, 30],
        [5, 1, 31],
        [6, 1, 30],
        [7, 1, 31],
        [8, 1, 31],
        [9, 1, 30],
        [10, 1, 31],
        [11, 1, 30],
        [12, 1, 31]
    ]
    let ch = document.getElementById('yearStart').value;
    if (ch % 4 == 0) {
        list[1][2] = 29
    }
    let listDay = $('#dayStart');
    listDay.append('<option>--day--</option>')
    for (let i = list[a - 1][1]; i <= list[a - 1][2]; i++) {
        listDay.append('<option value="' + i + '">' + i + '</option>');
    };
}

function createDayEnd(a) {
    document.getElementById('dayEnd').innerHTML = "";
    let list = [
        [1, 1, 31],
        [2, 1, 28],
        [3, 1, 31],
        [4, 1, 30],
        [5, 1, 31],
        [6, 1, 30],
        [7, 1, 31],
        [8, 1, 31],
        [9, 1, 30],
        [10, 1, 31],
        [11, 1, 30],
        [12, 1, 31]
    ]
    let ch = document.getElementById('yearEnd').value;
    if (ch % 4 == 0) {
        list[1][2] = 29
    }
    let listDay = $('#dayEnd');
    listDay.append('<option>--day--</option>')
    for (let i = list[a - 1][1]; i <= list[a - 1][2]; i++) {
        listDay.append('<option value="' + i + '">' + i + '</option>');
    };
}

function createMonth() {
    document.getElementById('monthStart').innerHTML = "";
    document.getElementById('monthEnd').innerHTML = "";
    let listMonthStart = $('#monthStart');
    let listMonthEnd = $('#monthEnd');
    listMonthStart.append('<option>--month--</option>')
    listMonthEnd.append('<option>--month--</option>')
    let month = new Array();
    month[1] = "1";
    month[2] = "2";
    month[3] = "3";
    month[4] = "4";
    month[5] = "5";
    month[6] = "6";
    month[7] = "7";
    month[8] = "8";
    month[9] = "9";
    month[10] = "10";
    month[11] = "11";
    month[12] = "12";

    for (let i = 1; i <= 12; i++) {
        listMonthStart.append('<option value="' + i + '">' + month[i] + '</option>');
        listMonthEnd.append('<option value="' + i + '">' + month[i] + '</option>');
    };
}

function checkStart() {
    let ch = document.getElementById('monthStart').value;
    createDayStart(ch)
}

function checkEnd() {
    let ch = document.getElementById('monthEnd').value;
    createDayEnd(ch)
}

function checkValid() {
    document.getElementById('error').innerHTML = ''
    let ds = parseInt(document.getElementById('dayStart').value);
    let ms = document.getElementById('monthStart').value;
    let ys = document.getElementById('yearStart').value;
    let de = parseInt(document.getElementById('dayEnd').value);
    let me = document.getElementById('monthEnd').value;
    let ye = document.getElementById('yearEnd').value;

    let dateStart = `${ds}/${ms}/${ys}`
    let dateEnd = `${de}/${me}/${ye}`
    document.getElementById('dayS').value = dateStart
    document.getElementById('dayE').value = dateEnd

    let isValidStart = /^(?:(?:31(\/|-|\.)(?:0?[13578]|1[02]))\1|(?:(?:29|30)(\/|-|\.)(?:0?[1,3-9]|1[0-2])\2))(?:(?:1[6-9]|[2-9]\d)?\d{2})$|^(?:29(\/|-|\.)0?2\3(?:(?:(?:1[6-9]|[2-9]\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\d|2[0-8])(\/|-|\.)(?:(?:0?[1-9])|(?:1[0-2]))\4(?:(?:1[6-9]|[2-9]\d)?\d{2})$/.test(dateStart)
    let isValidEnd = /^(?:(?:31(\/|-|\.)(?:0?[13578]|1[02]))\1|(?:(?:29|30)(\/|-|\.)(?:0?[1,3-9]|1[0-2])\2))(?:(?:1[6-9]|[2-9]\d)?\d{2})$|^(?:29(\/|-|\.)0?2\3(?:(?:(?:1[6-9]|[2-9]\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\d|2[0-8])(\/|-|\.)(?:(?:0?[1-9])|(?:1[0-2]))\4(?:(?:1[6-9]|[2-9]\d)?\d{2})$/.test(dateEnd)
    if (ds == NaN || ms == null || ys == null || de == NaN || me == null || ye == null) {

    } else if (!isValidStart || !isValidEnd) {
        document.getElementById('error').innerHTML = 'Nhập sai định dạng'
    } else {
        createDateStart()
        createDateEnd()
        if (ys < ye || (ys == ye && ms < me) || (ys == ye && ms == me && ds < de)) {

        } else if (ys > ye) {
            document.getElementById('error').innerHTML = 'Ngày bắt đầu không được muộn hơn ngày kết thúc'
        } else if (ms > me) {
            document.getElementById('error').innerHTML = 'Ngày bắt đầu không được muộn hơn ngày kết thúc'
        } else if (ds > de) {
            document.getElementById('error').innerHTML = 'Ngày bắt đầu không được muộn hơn ngày kết thúc'
        }
    }
}

function createCity() {
    const selectElement = document.getElementById('city');
    selectElement.addEventListener('change', function(event) {
        let firstName = document.querySelector('#inputCity');
        const selectElement = document.getElementById('city');
        document.querySelector('#inputDistrict').value="";
        document.querySelector('#inputWard').value="";
        if (selectElement.options[selectElement.selectedIndex].textContent !== "Chọn tỉnh thành") {
            firstName.value = selectElement.options[selectElement.selectedIndex].textContent;

        }
    });
}

function createDistrict() {
    const selectElement = document.getElementById('district');
    selectElement.addEventListener('change', function(event) {
        let firstName = document.querySelector('#inputDistrict');
        const selectElement = document.getElementById('district');
        document.querySelector('#inputWard').value="";
        if (selectElement.options[selectElement.selectedIndex].textContent !== "Chọn quận huyện") {
            firstName.value = selectElement.options[selectElement.selectedIndex].textContent;
        }
    });
}

function createWard() {
    const selectElement = document.getElementById('ward');
    selectElement.addEventListener('change', function(event) {
        let firstName = document.querySelector('#inputWard');
        const selectElement = document.getElementById('ward');
        if (selectElement.options[selectElement.selectedIndex].textContent !== "Chọn xã phường") {
            firstName.value = selectElement.options[selectElement.selectedIndex].textContent;
        }
    });
}

function createDateStart() {
    let ds = parseInt(document.getElementById('dayStart').value);
    let ms = document.getElementById('monthStart').value;
    let ys = document.getElementById('yearStart').value;
    let dateStart = `${ys}-${ms}-${ds}`
    let firstName = document.querySelector('#inputStart');
    firstName.value = dateStart;
}

function createDateEnd() {
    let de = parseInt(document.getElementById('dayEnd').value);
    let me = document.getElementById('monthEnd').value;
    let ye = document.getElementById('yearEnd').value;
    let dateEnd = `${ye}-${me}-${de}`
    let firstName = document.querySelector('#inputEnd');
    firstName.value = dateEnd;

}

function deleteData() {
    document.querySelector('#inputDistrict').value="";
    document.querySelector('#inputWard').value="";
    document.querySelector('#inputCity').value="";
    document.querySelector('#inputStart').value="1900-1-1";
    let currentDate = new Date();
    let day = currentDate.getDate();
    let month = currentDate.getMonth() + 1;
    let year = currentDate.getFullYear();
    document.querySelector('#inputEnd').value=`${year}-${month}-${day}`;
}
























