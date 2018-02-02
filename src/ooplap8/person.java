package ooplap8;

public class person {
    private String Personid;
    private String name;
    private String address;
    private String gender;

    //constructor
    public person(String personid, String name, String address, String gender) {
        this.Personid = personid;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "person{" +
                "personid='" + Personid + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    //getter and setter methods


    public String getPersonid() {
        return Personid;
    }

    public void setPersonid(String personid) {
        this.Personid = personid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}//class
