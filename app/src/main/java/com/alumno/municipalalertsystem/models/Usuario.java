package com.alumno.municipalalertsystem.models;

public class Usuario {

    private Integer idperson;
    private String fullname;
    private String email;
    private String password;
    private Boolean languague;
    private String phone;
    private Boolean gender;
    private String city;

    public Integer getIdperson() {
        return idperson;
    }
    public void setIdperson(Integer idperson) {
        this.idperson = idperson;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Boolean getLanguague() {
        return languague;
    }
    public void setLanguague(Boolean languague) {
        this.languague = languague;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Boolean getGender() {
        return gender;
    }
    public void setGender(Boolean gender) {
        this.gender = gender;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idperson=" + idperson + '\'' +
                ", fullname=" + fullname + '\'' +
                ", email=" + email + '\'' +
                ", password=" + password + '\'' +
                ", languague=" + languague + '\'' +
                ", phone=" + phone + '\'' +
                ", gender=" + gender + '\'' +
                ", city=" + city + '\'' +
                "}";
    }



}
