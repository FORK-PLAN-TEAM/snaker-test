package test.query;

import org.junit.Test;
import org.snaker.engine.access.Page;
import org.snaker.engine.access.QueryFilter;
import org.snaker.engine.entity.Order;
import org.snaker.engine.test.TestSnakerBase;

/**
 * 流程实例查询测试
 * @author yuqs
 * @version 1.0
 */
public class TestQueryOrder extends TestSnakerBase {
	@Test
	public void test() {
		Page<Order> page = new Page<Order>();
		System.out.println(engine.query().getActiveOrders(
				new QueryFilter().setCreateTimeStart("2014-01-01")));
		System.out.println(engine.query().getActiveOrders(page, new QueryFilter()));
        System.out.println(engine.query().getOrder("016f6013e6974264aaf75d2ee3ec6822"));
	}
}
