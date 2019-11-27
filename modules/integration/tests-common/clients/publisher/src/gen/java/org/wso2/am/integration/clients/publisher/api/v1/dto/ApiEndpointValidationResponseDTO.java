/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ApiEndpointValidationResponseDTO
 */

public class ApiEndpointValidationResponseDTO {
  @SerializedName("statusCode")
  private Integer statusCode = null;

  @SerializedName("statusMessage")
  private String statusMessage = null;

  @SerializedName("error")
  private String error = null;

  public ApiEndpointValidationResponseDTO statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * HTTP status code
   * @return statusCode
  **/
  @ApiModelProperty(required = true, value = "HTTP status code")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public ApiEndpointValidationResponseDTO statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * string
   * @return statusMessage
  **/
  @ApiModelProperty(required = true, value = "string")
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public ApiEndpointValidationResponseDTO error(String error) {
    this.error = error;
    return this;
  }

   /**
   * If an error occurs, the error message will be set to this property. If not, this will remain null. 
   * @return error
  **/
  @ApiModelProperty(value = "If an error occurs, the error message will be set to this property. If not, this will remain null. ")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiEndpointValidationResponseDTO apiEndpointValidationResponse = (ApiEndpointValidationResponseDTO) o;
    return Objects.equals(this.statusCode, apiEndpointValidationResponse.statusCode) &&
        Objects.equals(this.statusMessage, apiEndpointValidationResponse.statusMessage) &&
        Objects.equals(this.error, apiEndpointValidationResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, statusMessage, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiEndpointValidationResponseDTO {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

