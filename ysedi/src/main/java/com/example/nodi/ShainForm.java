package com.example.nodi;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class ShainForm {

  @NotEmpty(message = "社員番号を入力してくださいね")
  @Pattern(regexp ="^[0-9]{3}$", message="半角数字、3ケタでお願いします")
  private String number;

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }
  
  
}
