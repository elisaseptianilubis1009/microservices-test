package elisa.web.api.controller;

import elisa.web.api.client.ProductFeignClient;
import elisa.web.api.payload.Customer;
import elisa.web.api.payload.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/products")
@RequiredArgsConstructor
public class ProductController {

  private final ProductFeignClient productFeignClient;

  @PostMapping
  public ResponseEntity saveProducts(@RequestBody Product product){
    return ResponseEntity.ok(productFeignClient.saveProducts(product));
  }

  @GetMapping
  public ResponseEntity getAll(){
    return ResponseEntity.ok(productFeignClient.getAllProducts().get_embedded().getProducts());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity delete(@PathVariable("id") Long id){
    productFeignClient.delete(id);
    return ResponseEntity.ok("Product Deleted");
  }

  @GetMapping("/{id}")
  public ResponseEntity findById(@PathVariable("id") Long id){
    return ResponseEntity.ok(productFeignClient.findById(id));
  }

  @PutMapping("/{id}")
  public ResponseEntity updateProduct(@PathVariable("id") Long id, @RequestBody Product product){
    return ResponseEntity.ok(productFeignClient.updateProducts(product,id));
  }

}
