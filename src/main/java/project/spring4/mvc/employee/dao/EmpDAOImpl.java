package project.spring4.mvc.employee.dao;

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
        int cnt = -1;

        return cnt;
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
        EmpVO emp = null;

        return emp;
    }

    public int updateEmp(EmpVO lb) {
        int cnt = -1;

        return cnt;
    }

    public int deleteEmp(int empno) {
        int cnt = 0;

        return cnt;
    }
}
