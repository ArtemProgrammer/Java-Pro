package Lesson6;

public class Subscriber {
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String city;
    private String numberPhone;
    private String contractNumber;
    private int balance;
    private int cityTalkTime;
    private int longDistanceCallTime;
    private int internetTraffic;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Subscriber() {}

    public Subscriber(int id, String lastName, String firstName, String patronymic, String city, String numberPhone,
                      String contractNumber, int balance, int cityTalkTime, int longDistanceCallTime, int internetTraffic) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.city = city;
        this.numberPhone = numberPhone;
        this.contractNumber = contractNumber;
        this.balance = balance;
        this.cityTalkTime = cityTalkTime;
        this.longDistanceCallTime = longDistanceCallTime;
        this.internetTraffic = internetTraffic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return city;
    }

    public void setAddress(String address) {
        this.city = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCityTalkTime() {
        return cityTalkTime;
    }

    public void setCityTalkTime(int cityTalkTime) {
        this.cityTalkTime = cityTalkTime;
    }

    public int getLongDistanceCallTime() {
        return longDistanceCallTime;
    }

    public void setLongDistanceCallTime(int longDistanceCallTime) {
        this.longDistanceCallTime = longDistanceCallTime;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return "Lesson6a.Subscriber{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", city='" + city + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", balance=" + balance +
                ", cityTalkTime=" + cityTalkTime +
                ", longDistanceCallTime=" + longDistanceCallTime +
                ", internetTraffic=" + internetTraffic +
                '}';
    }
}