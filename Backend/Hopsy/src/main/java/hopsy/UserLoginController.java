package hopsy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {

    @RequestMapping("/login")
    public boolean userLogin(@RequestParam String name, @RequestParam String pswrd) {
        System.out.println(name);
        System.out.println(pswrd);
        return true;
    }

}
