public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int inDay,int inMonth, int inYear) {
        this.day  = inDay;
        this.month = inMonth;
        this.year = inYear;
        System.out.printf("Date is created: %s.%s.%s\n",this.day,this.month,this.year);

    }

    public String toString() {
        return String.format("Day: %s \nMonth: %s \nYear: %s \n",
                this.day, this.month, this.year);
    }

    public static int date2day(Date inDate) {
        return inDate.day + (inDate.month-1)*30 + inDate.year*30*12;
    }
    public static Date day2date(int inDay) {
        int year = inDay/(30*12);
        int month = (inDay%(30*12))/30;
        int day = (inDay%(30*12))%30;
        //Date result = ;
        return new Date(day,month,year);
    }
}
