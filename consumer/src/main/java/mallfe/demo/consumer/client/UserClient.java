package mallfe.demo.consumer.client;

import mallfe.demo.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service",fallback =UserClientFallback.class )
public interface UserClient {
    //通过feign进行远程调用

    @GetMapping("user/{id}")
    User queryById(@PathVariable("id") Long id);
}
