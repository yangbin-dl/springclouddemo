package mallfe.demo.consumer.controller;

import mallfe.demo.consumer.client.UserClient;
import mallfe.demo.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author Yangbin
 * @since 2019/06/06
 */
@RestController
@RequestMapping("consumer")
public class ConsumeController {
//    @Autowired
//    private RestTemplate restTemplate;

//    @Autowired
//    private RibbonLoadBalancerClient client;


//    @GetMapping("{id}")
//    @HystrixCommand(fallbackMethod = "queryByIdFallback")
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name ="execution.isolation.thread.timeoutInMilliseconds", value = "3000")
//    })
//    public String queryById(@PathVariable("id") Long id) {
//        String url = "http://user-service/user/" + id;
//        String user = restTemplate.getForObject(url, String.class);
//        return user;
//    }
//
//    public String queryByIdFallback(Long id){
//        return "服务器拥挤！";
//    }
//
//    public String defaultFallback(){
//        return "服务器拥挤！";
//    }

    @Autowired
    private UserClient userClient;


    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id){
        //根据服务id获取实例
        //List<ServiceInstance> instances= discoveryClient.getInstances("user-service");
//        ServiceInstance instance = client.choose("user-serivce");
//
//
//        System.out.println(instance.getHost());
//        //从实例中获取ip和端口
//        String url="http://" + instance.getHost() + ":" + instance.getPort() + "/user/" + id;


//        String url = "http://user-service/user/"+ id;
//        User user = restTemplate.getForObject(url, User.class);

        User user = userClient.queryById(id);
        return user;

    }



}
