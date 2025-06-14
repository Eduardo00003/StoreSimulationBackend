package com.LearningSpring.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// this @ is telling the spring that this class controller is used for web traffic
@Controller
public class HomeController {
  @Value("${spring.application.name}")
  private String appName;

  // this is the root path  
  @RequestMapping
  // when the root request is called this fuction
  public String index(){
    System.out.println("Welcome to " + appName);
    return "index.hml"; 
   
    
  }

 
  
}
 