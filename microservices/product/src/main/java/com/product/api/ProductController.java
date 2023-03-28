package com.product.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/rest")
public class ProductController
{

  @GetMapping("/status")
  public String getStatus()
  {
    return "Hello From Product Service";
  }

}
