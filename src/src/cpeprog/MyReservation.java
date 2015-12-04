// 
// Decompiled by Procyon v0.5.30
// 

package src.cpeprog;

public class MyReservation
{
    PassCode pass;
    String reservation;
    String cinema;
    String movTitle;
    String timeSlot;
    String movDate;
    String code;
    int numReseats;
    int price;
    int numReg;
    int numSen;
    String seatNames;
    String snack;
    
    public MyReservation(final Movie a, final int s, final OrderSnack p) {
        this.pass = new PassCode();
        this.seatNames = a.getSeatnames();
        this.cinema = a.getCinemanum();
        this.numReseats = 90 - a.getSeatsNum();
        this.movTitle = a.getTitle();
        this.timeSlot = a.getTime();
        this.code = this.pass.getCode();
        this.movDate = a.getDate();
        this.price = s + p.getTotal();
        this.numReg = a.getReg();
        this.numSen = a.getSen();
        this.snack = p.getOrder();
        this.reservation = String.valueOf(this.cinema) + " | " + this.movTitle + " | " + this.movDate + " | " + this.timeSlot + " | " + this.seatNames;
    }
    
    public String getReservation() {
        return this.reservation;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public String getCinema() {
        return this.cinema;
    }
    
    public String getTitle() {
        return this.movTitle;
    }
    
    public String getDate() {
        return this.movDate;
    }
    
    public String getTimeSlot() {
        return this.timeSlot;
    }
    
    public String getPrice() {
        return "P" + this.price;
    }
    
    public String getResSeats() {
        return "Resrved Seats: " + this.numReseats;
    }
    
    public String getseatNames() {
        return this.seatNames;
    }
    
    public String getReg() {
        return "Regulars: " + this.numReg;
    }
    
    public String getSen() {
        return "Seniors: " + this.numSen;
    }
    
    public String getSnack() {
        return this.snack;
    }
}
