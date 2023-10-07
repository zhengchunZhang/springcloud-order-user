package cn.itcast.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("cn.itcast.order.mapper")
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

//    /**
//     * 创建restTemplate对象并且注入容器，并利用它来发送http请求
//     * @return
//     */
//    @Bean
//    public RestTemplate restTemplate(){
//        return  new RestTemplate();
//    }
}