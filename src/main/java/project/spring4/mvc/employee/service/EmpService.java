package project.spring4.mvc.employee.service;

import project.spring4.mvc.employee.model.EmpVO;

import java.util.List;

public interface EmpService {

    void newEmp();
    List<EmpVO> selectEmp();
    void selectOneEmp();
    void modifyEmp();
    void removeEmp();
}
