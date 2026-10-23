package com.cinema.cinema_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 1. Dùng @RestController để báo cho Spring Boot biết: "Class này dùng để nhận request từ Web"
@RestController
public class HelloController {

    // 2. Dùng @GetMapping để gắn đường link "/hello" vào hàm này
    @GetMapping("/hello")
    public String sayHello() {
        // Khi có người vào link "/hello", code Java này sẽ chạy và trả về chuỗi dưới đây
        return "Xin chào! Đây là dòng code Spring Boot đầu tiên của tôi.";
    }
}