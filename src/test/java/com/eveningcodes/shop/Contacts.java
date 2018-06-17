package com.eveningcodes.shop;

public class Contacts {
    private String phone_numbers;
    private String address;
    private String e_mail;

    public Contacts(String phone_numbers, String address, String e_mail) {
        this.phone_numbers = phone_numbers;
        this.address = address;
        this.e_mail = e_mail;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_numbers() {
        return phone_numbers;
    }

    public void setPhone_numbers(String phone_numbers) {
        this.phone_numbers = phone_numbers;
    }
}
