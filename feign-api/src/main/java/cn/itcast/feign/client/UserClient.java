package cn.itcast.feign.client;




import cn.itcast.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 *  String url = "http://userservice/user/" + order.getUserId();
 *
 *         User user = restTemplate.getForObject(url, User.class);
 *
 *         使用Feign代替RestTemplate
 */
@FeignClient(value = "userservice")  //服务名称
public interface UserClient {
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);

}
