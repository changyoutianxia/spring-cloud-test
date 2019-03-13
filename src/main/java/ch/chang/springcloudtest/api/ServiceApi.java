package ch.chang.springcloudtest.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "CLIENTSERVICE")
public interface ServiceApi {
    @GetMapping("/hello")
    String hello();
}
