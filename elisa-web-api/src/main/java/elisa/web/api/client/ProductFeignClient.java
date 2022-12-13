package elisa.web.api.client;

import elisa.web.api.payload.Product;
import elisa.web.api.payload.embedded.ProductEmbedded;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "product",url = "${customer.backend.url}")
public interface ProductFeignClient {

  @PostMapping("/products")
  Object saveProducts(@RequestBody Product product);

  @GetMapping("/products")
  ProductEmbedded getAllProducts();

  @GetMapping("/products/{id}")
  Product findById(@PathVariable Long id);

  @DeleteMapping("/products/{id}")
  Object delete(@PathVariable("id") Long id);

  @PutMapping("/products/{id}")
  Object updateProducts(@RequestBody Product product,@PathVariable ("id") Long id);

}
