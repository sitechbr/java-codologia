public class Date {
    private int day;
    private int month;
    private int year;
    private int allDay;

    public Date (int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
        System.out.printf("Date is created: %s.%s.%s\n", this.day,this.month,this.year);
    }

    public int convert2day() {
        this.allDay = (12*30) * this.year + (this.month -1)*30 + this.day;
        return this.allDay;
    }

    public void convert2date() {
        this.year = this.allDay/(12*30);
        this.month = (this.allDay%(12*30))/31+1;
        this.day = (this.allDay%(12*30)) % 30;
    }



    public String toString() {
        if (this.day ==0){
            this.day = 30;
            this.month = this.month-1;
        }

        return String.format("%s.%s.%s",this.day,this.month,this.year);
    }
}