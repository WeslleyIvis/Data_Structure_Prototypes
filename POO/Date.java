class Date {
    private int day;
    private int month;
    private int year;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void entraDados(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void writeDate() {
        System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
    }
}