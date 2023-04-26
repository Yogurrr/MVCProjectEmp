package project.spring4.mvc.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.spring4.mvc.employee.dao.EmpDAO;
import project.spring4.mvc.employee.model.EmpVO;

import java.util.List;
import java.util.Scanner;

@Service("empsrv")
public class EmpServiceImpl implements EmpService {
    private Scanner sc = null;
    private List<EmpVO> emps = null;
    private EmpDAO empdao = null;

    @Autowired
    public EmpServiceImpl(EmpDAO empdao) { this.empdao = empdao; }

    public void newEmp() {

    }


    public List<EmpVO> readEmp() {

        return empdao.selectEmp();
    }

    public void readOneEmp() {

    }

    public void removeEmp() {

    }

    public void modifyEmp() {

    }
}
