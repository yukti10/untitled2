package p1;

import java.util.Date;

public class student {
    private int studentId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Gender gender;//enum
    private String address;
    private String city;
    private String pincode;
    private String cellphone;
    private String email;
    private String department;
    private float marks[];
    private float totalMarks;
    private float percentage;
    private String grade;

    public student(int studentId) {
        this.studentId = studentId;
    }

    public student(int studentId, String firstName, String lastName, Date dateOfBirth, Gender gender, String address, String city, String pincode, String cellphone, String email, String department) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.pincode = pincode;
        this.cellphone = cellphone;
        this.email = email;
        this.department = department;
    }

    public int getStudentId() {
        return studentId;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFullName() {
        return firstName+" "+ lastName;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    private void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getGrade() {
        return grade;
    }

    private void setGrade(String grade) {
        this.grade = grade;
    }
}
