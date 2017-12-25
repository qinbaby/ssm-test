package ssm;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogBack {
	
	private final static Logger logger = LoggerFactory.getLogger(TestLogBack.class);
	
	@Test
	public void test(){
		logger.info("logback 成功了");
		logger.error("logback 成功了");
		logger.debug("logback 成功了");
	}
}
