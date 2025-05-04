package com.dev.insurance_middle.application.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UserControllerDto
 */

@JsonTypeName("User")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UserControllerDto {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("surname")
  private String surname;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("email")
  private String email;

  @JsonProperty("dni")
  private String dni;

  @JsonProperty("password")
  private String password;

  @JsonProperty("city")
  private String city;

  @JsonProperty("country")
  private String country;

  @JsonProperty("address")
  private String address;

  @JsonProperty("dateOfBirth")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateOfBirth;

  @JsonProperty("dateOfRegistration")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateOfRegistration;

  @JsonProperty("dateOfLastUpdate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateOfLastUpdate;

  @JsonProperty("vehicles")
  @Valid
  private List<VehicleControllerDto> vehicles = null;

  public UserControllerDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserControllerDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserControllerDto surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  */
  
  @Schema(name = "surname", required = false)
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public UserControllerDto phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  
  @Schema(name = "phone", required = false)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UserControllerDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserControllerDto dni(String dni) {
    this.dni = dni;
    return this;
  }

  /**
   * Get dni
   * @return dni
  */
  
  @Schema(name = "dni", required = false)
  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public UserControllerDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  
  @Schema(name = "password", required = false)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserControllerDto city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  
  @Schema(name = "city", required = false)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public UserControllerDto country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  
  @Schema(name = "country", required = false)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public UserControllerDto address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  
  @Schema(name = "address", required = false)
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public UserControllerDto dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  */
  @Valid 
  @Schema(name = "dateOfBirth", required = false)
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public UserControllerDto dateOfRegistration(LocalDate dateOfRegistration) {
    this.dateOfRegistration = dateOfRegistration;
    return this;
  }

  /**
   * Get dateOfRegistration
   * @return dateOfRegistration
  */
  @Valid 
  @Schema(name = "dateOfRegistration", required = false)
  public LocalDate getDateOfRegistration() {
    return dateOfRegistration;
  }

  public void setDateOfRegistration(LocalDate dateOfRegistration) {
    this.dateOfRegistration = dateOfRegistration;
  }

  public UserControllerDto dateOfLastUpdate(LocalDate dateOfLastUpdate) {
    this.dateOfLastUpdate = dateOfLastUpdate;
    return this;
  }

  /**
   * Get dateOfLastUpdate
   * @return dateOfLastUpdate
  */
  @Valid 
  @Schema(name = "dateOfLastUpdate", required = false)
  public LocalDate getDateOfLastUpdate() {
    return dateOfLastUpdate;
  }

  public void setDateOfLastUpdate(LocalDate dateOfLastUpdate) {
    this.dateOfLastUpdate = dateOfLastUpdate;
  }

  public UserControllerDto vehicles(List<VehicleControllerDto> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public UserControllerDto addVehiclesItem(VehicleControllerDto vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
  }

  /**
   * Get vehicles
   * @return vehicles
  */
  @Valid 
  @Schema(name = "vehicles", required = false)
  public List<VehicleControllerDto> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<VehicleControllerDto> vehicles) {
    this.vehicles = vehicles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserControllerDto user = (UserControllerDto) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.surname, user.surname) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.dni, user.dni) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.city, user.city) &&
        Objects.equals(this.country, user.country) &&
        Objects.equals(this.address, user.address) &&
        Objects.equals(this.dateOfBirth, user.dateOfBirth) &&
        Objects.equals(this.dateOfRegistration, user.dateOfRegistration) &&
        Objects.equals(this.dateOfLastUpdate, user.dateOfLastUpdate) &&
        Objects.equals(this.vehicles, user.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, surname, phone, email, dni, password, city, country, address, dateOfBirth, dateOfRegistration, dateOfLastUpdate, vehicles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserControllerDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    dni: ").append(toIndentedString(dni)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    dateOfRegistration: ").append(toIndentedString(dateOfRegistration)).append("\n");
    sb.append("    dateOfLastUpdate: ").append(toIndentedString(dateOfLastUpdate)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

