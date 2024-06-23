public class Employee {
    private int tabelNumber;
    private String phoneNumber;
    private String name;
    private int workExpirence;

    public Employee(int tabelNumber, String phoneNumber, String name, int workExpirence) {
        this.tabelNumber = tabelNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.workExpirence = workExpirence;
    }

    public int getTabelNumber() {
        return tabelNumber;
    }

    public void setTabelNumber(int tabelNumber) {
        this.tabelNumber = tabelNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkExpirence() {
        return workExpirence;
    }

    public void setWorkExpirence(int workExpirence) {
        this.workExpirence = workExpirence;
    }
}
