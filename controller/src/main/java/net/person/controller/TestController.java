package net.person.controller;

import net.person.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by admin on 2019/3/15.
 */
@Controller
@RequestMapping("test")
public class TestController {
    private TestService testService;

    @Autowired
    public void setTestService(TestService testService) {
        this.testService = testService;
    }
    @RequestMapping("getData")
    @ResponseBody
    public  void getAllTest(HttpServletResponse response){
        testService.getAllTest(response);
    }
}
