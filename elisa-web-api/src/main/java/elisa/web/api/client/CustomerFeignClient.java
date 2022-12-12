package elisa.web.api.client;

import elisa.web.api.payload.Customer;
import elisa.web.api.payload.embedded.CustomerEmbedded;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "customer",url = "${customer.backend.url}")
public interface CustomerFeignClient {
  @GetMapping("/customers")
  CustomerEmbedded getAllCustomers();

  @GetMapping("/customers/{id}")
  Customer findById(@PathVariable Long id);
  @PostMapping("/customers")
  Object saveCustomers(@RequestBody Customer customer);

  @DeleteMapping("/customers/{id}")
  Object delete(@PathVariable("id") Long id);



}
