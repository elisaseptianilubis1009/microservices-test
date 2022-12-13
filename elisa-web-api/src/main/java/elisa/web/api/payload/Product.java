package elisa.web.api.payload;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor@AllArgsConstructor
public class Product {
  private Long id;
  private String name;
  private String price;
  private Date expiredDate;
  private Integer stock;

}
