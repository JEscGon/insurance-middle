package com.dev.insurance_middle.application.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Objects;

/**
 * VehicleControllerDto
 */

@JsonTypeName("Vehicle")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class VehicleControllerDto {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("userId")
  private Integer userId;

  @JsonProperty("matricula")
  private String matricula;

  @JsonProperty("km")
  private Integer km;

  @JsonProperty("color")
  private String color;

  @JsonProperty("marca")
  private String marca;

  @JsonProperty("fechaFabricacion")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate fechaFabricacion;

  @JsonProperty("dateOfRegistration")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateOfRegistration;

  @JsonProperty("dateOfLastUpdate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateOfLastUpdate;

  public VehicleControllerDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "10", required = false)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public VehicleControllerDto userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", example = "1", required = false)
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public VehicleControllerDto matricula(String matricula) {
    this.matricula = matricula;
    return this;
  }

  /**
   * Get matricula
   * @return matricula
  */
  @NotNull 
  @Schema(name = "matricula", example = "1234ABC", required = true)
  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public VehicleControllerDto km(Integer km) {
    this.km = km;
    return this;
  }

  /**
   * Get km
   * @return km
  */
  @NotNull 
  @Schema(name = "km", example = "50000", required = true)
  public Integer getKm() {
    return km;
  }

  public void setKm(Integer km) {
    this.km = km;
  }

  public VehicleControllerDto color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
  */
  
  @Schema(name = "color", example = "Rojo", required = false)
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public VehicleControllerDto marca(String marca) {
    this.marca = marca;
    return this;
  }

  /**
   * Get marca
   * @return marca
  */
  @NotNull 
  @Schema(name = "marca", example = "Toyota", required = true)
  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public VehicleControllerDto fechaFabricacion(LocalDate fechaFabricacion) {
    this.fechaFabricacion = fechaFabricacion;
    return this;
  }

  /**
   * Get fechaFabricacion
   * @return fechaFabricacion
  */
  @NotNull @Valid 
  @Schema(name = "fechaFabricacion", example = "Wed Jan 01 01:00:00 CET 2020", required = true)
  public LocalDate getFechaFabricacion() {
    return fechaFabricacion;
  }

  public void setFechaFabricacion(LocalDate fechaFabricacion) {
    this.fechaFabricacion = fechaFabricacion;
  }

  public VehicleControllerDto dateOfRegistration(LocalDate dateOfRegistration) {
    this.dateOfRegistration = dateOfRegistration;
    return this;
  }

  /**
   * Get dateOfRegistration
   * @return dateOfRegistration
  */
  @Valid 
  @Schema(name = "dateOfRegistration", example = "Mon May 15 02:00:00 CEST 2023", required = false)
  public LocalDate getDateOfRegistration() {
    return dateOfRegistration;
  }

  public void setDateOfRegistration(LocalDate dateOfRegistration) {
    this.dateOfRegistration = dateOfRegistration;
  }

  public VehicleControllerDto dateOfLastUpdate(LocalDate dateOfLastUpdate) {
    this.dateOfLastUpdate = dateOfLastUpdate;
    return this;
  }

  /**
   * Get dateOfLastUpdate
   * @return dateOfLastUpdate
  */
  @Valid 
  @Schema(name = "dateOfLastUpdate", example = "Tue Feb 20 01:00:00 CET 2024", required = false)
  public LocalDate getDateOfLastUpdate() {
    return dateOfLastUpdate;
  }

  public void setDateOfLastUpdate(LocalDate dateOfLastUpdate) {
    this.dateOfLastUpdate = dateOfLastUpdate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleControllerDto vehicle = (VehicleControllerDto) o;
    return Objects.equals(this.id, vehicle.id) &&
        Objects.equals(this.userId, vehicle.userId) &&
        Objects.equals(this.matricula, vehicle.matricula) &&
        Objects.equals(this.km, vehicle.km) &&
        Objects.equals(this.color, vehicle.color) &&
        Objects.equals(this.marca, vehicle.marca) &&
        Objects.equals(this.fechaFabricacion, vehicle.fechaFabricacion) &&
        Objects.equals(this.dateOfRegistration, vehicle.dateOfRegistration) &&
        Objects.equals(this.dateOfLastUpdate, vehicle.dateOfLastUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, matricula, km, color, marca, fechaFabricacion, dateOfRegistration, dateOfLastUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleControllerDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    matricula: ").append(toIndentedString(matricula)).append("\n");
    sb.append("    km: ").append(toIndentedString(km)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    marca: ").append(toIndentedString(marca)).append("\n");
    sb.append("    fechaFabricacion: ").append(toIndentedString(fechaFabricacion)).append("\n");
    sb.append("    dateOfRegistration: ").append(toIndentedString(dateOfRegistration)).append("\n");
    sb.append("    dateOfLastUpdate: ").append(toIndentedString(dateOfLastUpdate)).append("\n");
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

