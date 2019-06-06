package mallfe.demo.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 描述
 *
 * @author Yangbin
 * @since 2019/06/06
 */
@SpringBootApplication
@MapperScan("mallfe.demo.user.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
