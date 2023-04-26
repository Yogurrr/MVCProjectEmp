package project.spring4.mvc.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import project.spring4.mvc.employee.service.EmpService;

@Controller
public class EmpController {

    private EmpService empsrv;

    @Autowired
    public EmpController(EmpService empsrv) {
        this.empsrv = empsrv;
    }

    @GetMapping(value = "/list")
    public ModelAndView List() {
        ModelAndView mv = new ModelAndView();

        mv.addObject("emps", empsrv.readEmp());
        mv.setViewName("emplist");

        return mv;
    }
}
