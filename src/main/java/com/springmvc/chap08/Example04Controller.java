<<<<<<< HEAD
package com.springmvc.chap08;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
public class Example04Controller {

    @GetMapping("/mymber")
    public String requestMethod(Model model) {
        return "loginform";
    }

    @GetMapping("/admin")
    public String requestMethod2(Model model) {
        return "webpage08_04";
    }

    @GetMapping("/myany")
    public String logout(Model model) {
        return "loginform";

    }
}
=======
package com.springmvc.chap08;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
public class Example04Controller {

    @GetMapping("/login")
    public String requestMethod(Model model) {
        return "loginform";
    }

    @GetMapping("/admin")
    public String requestMethod2(Model model) {
        return "webpage08_04";
    }

    @GetMapping("/logout")
    public String logout(Model model) {
        return "loginform";

    }
}
>>>>>>> 732d73dfd0f7b51368597ae7bc4bedc8bc296ff5
