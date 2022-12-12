package elisa.web.api.payload.embedded;

import elisa.web.api.payload.Customer;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor@AllArgsConstructor
public class CustomerEmbedded {
  private Embedded _embedded;

  @Data
  @NoArgsConstructor@AllArgsConstructor
  public class Embedded{
    private List<Customer> customers = new ArrayList<>();
  }
}
