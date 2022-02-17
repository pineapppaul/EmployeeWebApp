package com.example.restservice.model;

public class Address {

  private int civicNumber;
  private String streetName;
  private String city;
  private String province;
  private String postalCode;

  public Address(int civicNumber, String streetName, String city, String province, String postalCode) {
    this.civicNumber = civicNumber;
    this.streetName = streetName;
    this.city = city;
    this.province = province;
    this.postalCode = postalCode;
  }

  public int getCivicNumber() {
    return civicNumber;
  }

  public void setCivicNumber(int civicNumber) {
    this.civicNumber = civicNumber;
  }

  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }
}
