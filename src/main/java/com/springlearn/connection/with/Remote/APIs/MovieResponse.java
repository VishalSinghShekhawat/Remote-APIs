package com.springlearn.connection.with.Remote.APIs;

public class MovieResponse {

    private int Year;

    private String Title;

    private String Plot;

    private int revenue_total;

    public MovieResponse() {
    }

    public MovieResponse(int Year, String Title, String Plot, int revenue_total) {
        this.Year = Year;
        this.Title = Title;
        this.Plot = Plot;
        this.revenue_total = revenue_total;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        this.Year = Year;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = Title;
    }

    public String getPlot() {
        return Plot;
    }

    public void setPlot(String plot) {
        this.Plot = Plot;
    }

    public int getRevenue_total() {
        return revenue_total;
    }

    public void setRevenue_total(int revenue_total) {
        this.revenue_total = revenue_total;
    }
}
