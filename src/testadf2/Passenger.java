package testadf2;

public class Passenger {
    public Integer id;
    public String passengerName;
    public String address;
    public String phone;
    public String dateOfDeparture;
    public String dateOfReturn;

//    public Passenger(Integer id, String passengerName, String address, String phone, String dateOfDeparture, String dateOfReturn) {
//        this.id = id;
//        this.passengerName = passengerName;
//        this.address = address;
//        this.phone = phone;
//        this.dateOfDeparture = dateOfDeparture;
//        this.dateOfReturn = dateOfReturn;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public String getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(String dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }
}
