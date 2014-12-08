package test.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.snaker.engine.access.Page;
import org.snaker.engine.access.QueryFilter;
import org.snaker.engine.access.jdbc.BeanPropertyHandler;
import org.snaker.engine.access.jdbc.JdbcHelper;
import org.snaker.engine.entity.HistoryOrder;
import org.snaker.engine.test.TestSnakerBase;

/**
 * 流程实例查询测试
 * @author yuqs
 * @version 1.0
 */
public class TestQueryCCOrder extends TestSnakerBase {
	@Test
	public void test() {
		try {
			String sql = "select count(1) from ( select id,process_Id,order_State,priority,creator,cc.create_Time,end_Time,parent_Id,expire_Time,order_No,variable  from wf_cc_order cc  left join wf_hist_order o on cc.order_id = o.id  where 1=1  and cc.status = ? ) c";
			Connection conn = JdbcHelper.getConnection(null);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.getParameterMetaData();
			//			pstmt.executeQuery();
//			QueryRunner runner = new QueryRunner(true);
//			System.out.println(runner.query(JdbcHelper.getConnection(null), sql, new BeanPropertyHandler<HistoryOrder>(HistoryOrder.class), 1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Page<HistoryOrder> page = new Page<HistoryOrder>();
		//System.out.println(engine.query().getCCWorks(page, new QueryFilter().setState(1)));
	}
}
