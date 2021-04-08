package sample.Assignment.s3;

public class NhanVien {
    public Integer id;
    public String name;
    public String phone;
    public String address;
    public Double salary;

    public NhanVien(Integer id, String name, String phone, String address, Double salary) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
