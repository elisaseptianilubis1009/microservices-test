package elisa.web.api.payload.embedded;

import elisa.web.api.payload.Customer;
import elisa.web.api.payload.Product;
import elisa.web.api.payload.embedded.CustomerEmbedded.Embedded;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductEmbedded {

  private Embedded _embedded;

  @Data
  @NoArgsConstructor@AllArgsConstructor
  public class Embedded{
    private List<Product> products = new ArrayList<>();
  }

}
