package com.sdyx.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sdyx.boss.service.internal.customer.echannel.service.ServiceInfoService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring.xml",
		"classpath*:spring-mybatis.xml" })
public class TestDB {

	/*private static final Logger LOGGER = Logger
			.getLogger(TestDB.class);*/

	@Autowired
	private ServiceInfoService serviceInfoService;
	
	@Test
	public void Test2() {
		System.out.println(serviceInfoService.getRenewalInfo("ZB", "8533003607843680"));
	}
	
	@Test
	public void Test3() {
		System.out.println(serviceInfoService.getUserProInfo("ZB", "8533003607843680"));
	}
	
	@Test
	public void Test4() {
		System.out.println(serviceInfoService.getCustomerCommonBalanceInfo("ZB", "030570063987"));
	}
}
