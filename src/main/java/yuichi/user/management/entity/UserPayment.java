package yuichi.user.management.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserPayment {

  private int id;
  private int userId;
  private String cardNumber;
  private String cardBrand;
  private String cardHolder;
  private String expirationDate;
}