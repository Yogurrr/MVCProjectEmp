package project.spring4.mvc.employee.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import project.spring4.mvc.employee.model.EmpVO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("empdao")
public class EmpDAOImpl implements EmpDAO {
    private static final Logger logger = LogManager.getLogger(EmpDAOImpl.class);
    private JdbcTemplate jdbcTemplate;

    @Value("#{jdbc['insertSQL']}") private String insertSQL;
    @Value("#{jdbc['selectSQL']}") private String selectSQL;
    @Value("#{jdbc['selectOneSQL']}") private String selectOneSQL;
    @Value("#{jdbc['updateSQL']}") private String updateSQL;
    @Value("#{jdbc['deleteSQL']}") private String deleteSQL;

    @Autowired
    public EmpDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertEmp(EmpVO emp) {
        Object[] params = new Object[]{
                emp.getEmpno(), emp.getFname(), emp.getLname(), emp.getEmail(), emp.getPhone(),
                emp.getHdate(), emp.getJobid(), emp.getSal(), emp.getComm(), emp.getMgrid(), emp.getDeptid()
        };

        return jdbcTemplate.update(insertSQL, params);
    }

    @Override
    public List<EmpVO> selectEmp() {
        RowMapper<EmpVO> mapper = new EmpMapper();

        return jdbcTemplate.query(selectSQL, mapper);
    }

    private class EmpMapper implements RowMapper<EmpVO> {
        @Override
        public EmpVO mapRow(ResultSet rs, int i) throws SQLException {
            EmpVO emp = new EmpVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));

            return emp;
        }
    }

    @Override
    public EmpVO selectOneEmp(int empno) {
        Object[] param = new Object[] { empno };
        RowMapper<EmpVO> mapper = new EmpOneMapper();

        EmpVO emp = jdbcTemplate.queryForObject(selectOneSQL, mapper, param);

        return emp;
    }

    private class EmpOneMapper implements RowMapper<EmpVO> {
        @Override
        public EmpVO mapRow(ResultSet rs, int num) throws SQLException {
            EmpVO emp = new EmpVO(rs.getInt(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getInt(8), rs.getDouble(9),
                    rs.getInt(10), rs.getInt(11));

            return emp;
        }
    }

    public int updateEmp(EmpVO emp) {
        int cnt = -1;

        return cnt;
    }

    public int deleteEmp(int empno) {
        Object[] param = new Object[] { empno };

        return jdbcTemplate.update(deleteSQL, param);
    }
}
