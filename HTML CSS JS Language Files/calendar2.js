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
    console.log("FirstDay : " + day%7);
    return day % 7;
}

function LastDay(year, month) {
    if(month < 1) {
        year-=1;
        month = 12;
    }
    var yun = 0;
    if(((year%4 == 0 ) && (year%100 != 0)) || (year%400 == 0))
        yun = 1;
    var arr = [31, 28+yun, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    console.log("LastDay : " + arr[month-1]);
    return arr[month-1];
}

function Day(month, day, color, special) {
    this.month = month;
    this.day = day;
    this.color = color;
    this.special = special;
}

function CreateAMonthlyCalendar(year, month) {
    var calendar = [[],[],[],[],[],[]];

    var firstDay = ThisMonthFirstDay(year, month);
    var lastDay = LastDay(year, month);
    var beforeLastDay = LastDay(year, month-1) - firstDay + 1;
    var date = 0;
    var nextDate = 0;

    for(var i = 0 ; i < 6 ; i++) {
        for(var j = 0 ; j < 7 ; j++) {
            if(i == 0 && j < firstDay)
                calendar[i][j] = new Day(month-1, beforeLastDay+j, "GREY", "");
            else if(date >= lastDay)
                calendar[i][j] = new Day(month+1, ++nextDate, "GREY", "");
            else {
                if(j == 0)
                    calendar[i][j] = new Day(month, ++date, "RED", "");
                else if(j == 6)
                    calendar[i][j] = new Day(month, ++date, "BLUE", "");
                else
                    calendar[i][j] = new Day(month, ++date, "BLACK", "");
            }
        }
    }

    return calendar;
}

var calendar = CreateAMonthlyCalendar(2019, 12);

console.log(calendar);