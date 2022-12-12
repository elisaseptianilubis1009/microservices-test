package elisa.web.api.controller;

import elisa.web.api.client.CustomerFeignClient;
import elisa.web.api.payload.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/customers")
@RequiredArgsConstructor
public class CustomerController {
  private final CustomerFeignClient customerFeignClient;


  @PostMapping
  public ResponseEntity saveCustomers(@RequestBody Customer customer){
    return ResponseEntity.ok(customerFeignClient.saveCustomers(customer));
  }

  @GetMapping
  public ResponseEntity getAll(){
    return ResponseEntity.ok(customerFeignClient.getAllCustomers().get_embedded().getCustomers());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity delete(@PathVariable("id") Long id){
    return ResponseEntity.ok(customerFeignClient.delete(id));
  }

  @GetMapping("/{id}")
  public ResponseEntity findById(@PathVariable("id") Long id){
    return ResponseEntity.ok(customerFeignClient.findById(id));
  }
}
