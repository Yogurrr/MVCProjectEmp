package project.spring4.mvc.employee.service;

import project.spring4.mvc.employee.model.EmpVO;

import java.util.List;

public interface EmpService {

    boolean newEmp(EmpVO emp);
    List<EmpVO> readEmp();
    EmpVO readOneEmp(int empno);
    boolean modifyEmp(EmpVO emp);
    boolean removeEmp(int empno);
}
