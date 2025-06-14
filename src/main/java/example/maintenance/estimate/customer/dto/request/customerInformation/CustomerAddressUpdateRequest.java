package example.maintenance.estimate.customer.dto.request.customerInformation;

import example.maintenance.estimate.customer.dto.request.validator.ValidPrefecture;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CustomerAddressUpdateRequest {

  @NotBlank(message = "空白は許可されていません")
  @Pattern(regexp = "^\\d{3}-\\d{4}$", message = "postalCodeは半角数字でハイフン含め7文字で入力してください")
  private String postalCode;
  @NotBlank(message = "空白は許可されていません")
  @ValidPrefecture
  private String prefecture;
  @NotBlank(message = "空白は許可されていません")
  private String city;
  @NotBlank(message = "空白は許可されていません")
  private String townAndNumber;
  private String buildingNameAndRoomNumber;
}
