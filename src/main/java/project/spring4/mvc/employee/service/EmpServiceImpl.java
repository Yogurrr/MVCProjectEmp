package project.spring4.mvc.employee.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.spring4.mvc.employee.dao.EmpDAO;
import project.spring4.mvc.employee.dao.EmpDAOImpl;
import project.spring4.mvc.employee.model.EmpVO;

import java.util.List;

@Service("empsrv")
public class EmpServiceImpl implements EmpService {
    private EmpDAO empdao = null;
    private static final Logger logger = LogManager.getLogger(EmpDAOImpl.class);

    @Autowired
    public EmpServiceImpl(EmpDAO empdao) { this.empdao = empdao; }

    public boolean newEmp(EmpVO emp) {
        boolean result = false;

        logger.info(emp);

        if (empdao.insertEmp(emp) > 0) result = true;

        return result;
    }

    public List<EmpVO> readEmp() {

        return empdao.selectEmp();
    }

    public EmpVO readOneEmp(int empno) {
        return empdao.selectOneEmp(empno);
    }

    public boolean removeEmp(int empno) {
        empdao.deleteEmp(empno);

        return true;
    }

    public boolean modifyEmp(EmpVO emp) {
        return false;
    }
}
