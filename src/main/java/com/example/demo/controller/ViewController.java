package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ViewController {
        @GetMapping("/login")
        public String sayHello() {
            return "login"; // 假设templates目录下有hello.html文件
        }

}
