function Calculation(yoil) {
    switch(yoil) {
        case 0 : return "월";
        case 1 : return "화";
        case 2 : return "수";
        case 3 : return "목";
        case 4 : return "금";
        case 5 : return "토";
        case 6 : return "일";
        default : return "공백";
    }
}

var January1stMeasurement = function(year) {
    var yun = 0;
    var yoil = year-1;
    for(var i = 1 ; i <= year ; i++)
        if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
            yun++;
    yoil += yun;

    if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        yoil -= 1;
    return yoil % 7;
}

var CreateAMonthlyCalendar = function(year, month) {
    var arr = [[],[],[],[],[],[]];
    var oneMonthOneDay = January1stMeasurement(year);
    var count = 0;
    var lastDay = 0;

    function FirstDay(year, month, day) {
        var check = 0;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            check = 1;

        var arr = [0, 31, 28+check, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

        for(var i = 0 ; i < month ; i++)
            day += arr[i];
        return day % 7;
    }

    function LastDay(year, month) {
        var check = 0;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            check = 1;
        
        var arr = [0, 31, 28+check, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
        return arr;
    }

    oneMonthOneDay = FirstDay(year, month, oneMonthOneDay);
    lastDay = LastDay(year, month);

    for(var i = 0 ; i < 6 ; i++) {
        for(var j = 0 ; j < 7 ; j++) {
            if(i == 0 && j < oneMonthOneDay)
                arr[i][j] = "";
            else {
                if(count == lastDay[month]) {
                    return arr;
                }
                arr[i][j] = ++count;
            }
        }
    }
}

var calender = CreateAMonthlyCalendar(2019,1);

console.log(calender);