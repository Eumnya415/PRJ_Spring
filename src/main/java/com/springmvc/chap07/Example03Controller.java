<<<<<<< HEAD
package com.springmvc.chap07;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class Example03Controller {

    @GetMapping("/exam03")
    public String showForm() {
        return "webpage07_03";
    }

    @ModelAttribute("title")
    public String setTitle() {
        return "@ModelAttribute 유형";
    }

    @ModelAttribute
    public void setsubTitle(Model model) {
        model.addAttribute("subtitle", "메소드에 @ModelAttributte 애너테이션 적용하기");
    }
}
=======
package com.springmvc.chap07;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class Example03Controller {

    @GetMapping("/exam03")
    public String showForm() {
        return "webpage07_03";
    }

    @ModelAttribute("title")
    public String setTitle() {
        return "@ModelAttribute 유형";
    }

    @ModelAttribute
    public void setsubTitle(Model model) {
        model.addAttribute("subtitle", "메소드에 @ModelAttributte 애너테이션 적용하기");
    }
}
>>>>>>> 732d73dfd0f7b51368597ae7bc4bedc8bc296ff5
