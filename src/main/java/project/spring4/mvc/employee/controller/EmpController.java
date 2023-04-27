package project.spring4.mvc.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import project.spring4.mvc.employee.model.EmpVO;
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

    // 사원 정보 입력 폼 표시
    @GetMapping(value = "/add")
    public String Add() {
        return "emp";
    }

    // 사원 정보 입력 처리
    @PostMapping(value = "/add")
    public ModelAndView Addok(EmpVO emp) {
        ModelAndView mv = new ModelAndView();
        String view = "empfail";

        if (empsrv.newEmp(emp)) {
            mv.addObject("emp", emp);
            view = "redirect:/list";
        }

        mv.setViewName(view);

        return mv;
    }

    // 사원 정보 본문 조회 처리
    @GetMapping(value = "/view")
    public ModelAndView View(@RequestParam int empno) {
        ModelAndView mv = new ModelAndView();
        String view = "empfail";

        EmpVO emp = empsrv.readOneEmp(empno);
        if (emp != null) {
            mv.addObject("emp", emp);
            view = "empview";
        }

        mv.setViewName(view);

        return mv;
    }

    // 사원 정보 수정

    // 사원 정보 삭제
    @GetMapping(value = "/remove")
    public String remove(int empno) {

        empsrv.removeEmp(empno);

        return "redirect:/list";
    }
}
