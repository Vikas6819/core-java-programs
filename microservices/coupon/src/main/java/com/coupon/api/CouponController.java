package com.coupon.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coupon/rest")
public class CouponController
{

  @GetMapping("/status")
  public String getStatus()
  {
    return "Hello From Coupon Service";
  }

}
