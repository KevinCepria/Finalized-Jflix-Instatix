// 
// Decompiled by Procyon v0.5.30
// 

package src.cpeprog;

public class Movie
{
    private Reservation seats;
    private String Title;
    private String Date;
    private String Time;
    private int numseats;
    private int cinema;
    private String seatnames;
    
    public Movie(final int t, final String a, final String b, final String c) {
        this.seats = new Reservation();
        this.numseats = this.seats.getseatcount();
        this.Title = a;
        this.Date = b;
        this.Time = c;
        this.cinema = t;
    }
    
    public String getTitle() {
        return this.Title;
    }
    
    public String getTime() {
        return this.Time;
    }
    
    public String getSeats() {
        return "Available Seats: " + this.seats.getseatcount();
    }
    
    public void openSeatReservation() {
        this.seats.open();
    }
    
    public void closeSeatReservation() {
        this.seats.close();
    }
    
    public String getCinemanum() {
        return "Cinema " + this.cinema;
    }
    
    public String getDate() {
        return this.Date;
    }
    
    public int getSeatsNum() {
        return this.seats.getseatcount();
    }
    
    public int getnumReserve() {
        return this.seats.getResrvedTix();
    }
    
    public int getTotalPirce() {
        return this.seats.getPrice();
    }
    
    public String getSeatnames() {
        String o = "";
        for (int i = 0; i < this.seats.res.size(); ++i) {
            if (i == this.seats.res.size() - 1) {
                o = String.valueOf(o) + this.seats.res.get(i);
                this.seatnames = o;
            }
            else {
                o = String.valueOf(o) + this.seats.res.get(i) + ",";
            }
        }
        return this.seatnames;
    }
    
    public int getReg() {
        return this.seats.getReg();
    }
    
    public int getSen() {
        return this.seats.getSeniors();
    }
}
