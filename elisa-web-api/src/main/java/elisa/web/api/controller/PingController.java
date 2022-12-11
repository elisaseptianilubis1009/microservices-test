package elisa.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class PingController {
  @GetMapping("ping")
  public String ping(){
    return "PONG";
  }
}
