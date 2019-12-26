function FindYoilOfOneMonthOneDay(year) {
    var yun = 0;
    var yoil = year-1;
    for(var i = 1 ; i <= year ; i++)
        if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
            yun++;
    yoil += yun;

    if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        yoil -= 1;

    var temp = yoil % 7;
    if(temp == 6) temp = 0;
    else temp++;
    console.log("OneMonthOneDay : " + temp);
    return temp;
}

function ThisMonthFirstDay(year, month) {
    var day = FindYoilOfOneMonthOneDay(year);
    var yun = 0;
    if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0))
        yun = 1;
    var arr = [31, 28+yun, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    for(var i = 0 ; i < month-1 ; i++)
        day += arr[i];

    return day % 7;
}

function LastDay(year, month) {
    var yun = 0;
    if(((year%4 == 0 ) && (year%100 != 0)) || (year%400 == 0))
        yun = 1;
    var arr = [31, 28+yun, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    return arr[month-1];
}

function CreateAMonthlyCalendar(year, month) {
    var arr = [[],[],[],[],[],[]];
    console.log("FirstDay : " + ThisMonthFirstDay(year, month));

    var firstDay = ThisMonthFirstDay(year, month);
    var lastDay = LastDay(year, month);
}

CreateAMonthlyCalendar(2019, 3);