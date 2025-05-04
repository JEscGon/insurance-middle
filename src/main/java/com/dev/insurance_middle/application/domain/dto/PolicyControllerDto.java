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
 * PolicyControllerDto
 */

@JsonTypeName("Policy")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PolicyControllerDto {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("userId")
  private Integer userId;

  @JsonProperty("vehicleId")
  private Integer vehicleId;

  @JsonProperty("beneficiaryId")
  private Integer beneficiaryId;

  @JsonProperty("iban")
  private String iban;

  @JsonProperty("startDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate startDate;

  @JsonProperty("endDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate endDate;

  @JsonProperty("policyTypeId")
  private Integer policyTypeId;

  @JsonProperty("active")
  private Boolean active;

  @JsonProperty("premiumAmount")
  private Double premiumAmount;

  @JsonProperty("registrationDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate registrationDate;

  @JsonProperty("lastUpdateDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate lastUpdateDate;

  public PolicyControllerDto id(Integer id) {
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

  public PolicyControllerDto userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @NotNull 
  @Schema(name = "userId", required = true)
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public PolicyControllerDto vehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * Get vehicleId
   * @return vehicleId
  */
  @NotNull 
  @Schema(name = "vehicleId", required = true)
  public Integer getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
  }

  public PolicyControllerDto beneficiaryId(Integer beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
    return this;
  }

  /**
   * Get beneficiaryId
   * @return beneficiaryId
  */
  @NotNull 
  @Schema(name = "beneficiaryId", required = true)
  public Integer getBeneficiaryId() {
    return beneficiaryId;
  }

  public void setBeneficiaryId(Integer beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
  }

  public PolicyControllerDto iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * Get iban
   * @return iban
  */
  @NotNull 
  @Schema(name = "iban", required = true)
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public PolicyControllerDto startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @NotNull @Valid 
  @Schema(name = "startDate", required = true)
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public PolicyControllerDto endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @NotNull @Valid 
  @Schema(name = "endDate", required = true)
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public PolicyControllerDto policyTypeId(Integer policyTypeId) {
    this.policyTypeId = policyTypeId;
    return this;
  }

  /**
   * Get policyTypeId
   * @return policyTypeId
  */
  @NotNull 
  @Schema(name = "policyTypeId", required = true)
  public Integer getPolicyTypeId() {
    return policyTypeId;
  }

  public void setPolicyTypeId(Integer policyTypeId) {
    this.policyTypeId = policyTypeId;
  }

  public PolicyControllerDto active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  */
  
  @Schema(name = "active", required = false)
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public PolicyControllerDto premiumAmount(Double premiumAmount) {
    this.premiumAmount = premiumAmount;
    return this;
  }

  /**
   * Get premiumAmount
   * @return premiumAmount
  */
  @NotNull 
  @Schema(name = "premiumAmount", required = true)
  public Double getPremiumAmount() {
    return premiumAmount;
  }

  public void setPremiumAmount(Double premiumAmount) {
    this.premiumAmount = premiumAmount;
  }

  public PolicyControllerDto registrationDate(LocalDate registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

  /**
   * Get registrationDate
   * @return registrationDate
  */
  @NotNull @Valid 
  @Schema(name = "registrationDate", example = "Mon May 15 02:00:00 CEST 2023", required = true)
  public LocalDate getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(LocalDate registrationDate) {
    this.registrationDate = registrationDate;
  }

  public PolicyControllerDto lastUpdateDate(LocalDate lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
    return this;
  }

  /**
   * Get lastUpdateDate
   * @return lastUpdateDate
  */
  @NotNull @Valid 
  @Schema(name = "lastUpdateDate", example = "Tue Feb 20 01:00:00 CET 2024", required = true)
  public LocalDate getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(LocalDate lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyControllerDto policy = (PolicyControllerDto) o;
    return Objects.equals(this.id, policy.id) &&
        Objects.equals(this.userId, policy.userId) &&
        Objects.equals(this.vehicleId, policy.vehicleId) &&
        Objects.equals(this.beneficiaryId, policy.beneficiaryId) &&
        Objects.equals(this.iban, policy.iban) &&
        Objects.equals(this.startDate, policy.startDate) &&
        Objects.equals(this.endDate, policy.endDate) &&
        Objects.equals(this.policyTypeId, policy.policyTypeId) &&
        Objects.equals(this.active, policy.active) &&
        Objects.equals(this.premiumAmount, policy.premiumAmount) &&
        Objects.equals(this.registrationDate, policy.registrationDate) &&
        Objects.equals(this.lastUpdateDate, policy.lastUpdateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, vehicleId, beneficiaryId, iban, startDate, endDate, policyTypeId, active, premiumAmount, registrationDate, lastUpdateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyControllerDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    policyTypeId: ").append(toIndentedString(policyTypeId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    premiumAmount: ").append(toIndentedString(premiumAmount)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
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

