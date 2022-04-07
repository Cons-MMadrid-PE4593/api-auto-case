package com.santander.connector.schema;

public class InputParamsXml {
	 private String DealerCode;
	 private String User;
	 private String Password;
	 private String CapCode;
	 private String VIN;
	 private String LicensePlate;


	 // Getter Methods 

	 public String getDealerCode() {
	  return DealerCode;
	 }

	 public String getUser() {
	  return User;
	 }

	 public String getPassword() {
	  return Password;
	 }

	 public String getCapCode() {
	  return CapCode;
	 }

	 public String getVIN() {
	  return VIN;
	 }

	 public String getLicensePlate() {
	  return LicensePlate;
	 }

	 // Setter Methods 

	 public void setDealerCode(String DealerCode) {
	  this.DealerCode = DealerCode;
	 }

	 public void setUser(String User) {
	  this.User = User;
	 }

	 public void setPassword(String Password) {
	  this.Password = Password;
	 }

	 public void setCapCode(String CapCode) {
	  this.CapCode = CapCode;
	 }

	 public void setVIN(String VIN) {
	  this.VIN = VIN;
	 }

	 public void setLicensePlate(String LicensePlate) {
	  this.LicensePlate = LicensePlate;
	 }
	}