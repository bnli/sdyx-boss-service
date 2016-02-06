package com.sdyx.boss.service.internal.customer.echannel.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.sdyx.boss.service.internal.customer.echannel.dao.BossDao;
import com.sdyx.boss.service.internal.customer.echannel.model.RenewalInfo;
import com.sdyx.boss.service.internal.customer.echannel.model.UserProInfo;

public class BossDaoImpl extends SqlSessionDaoSupport implements BossDao {

	@Override
	public List<RenewalInfo> selectRenewalInfo(String cityFlag, String caNo) {
		// TODO Auto-generated method stub
		/*Map<String, Object> params=new HashMap<String, Object>();
        params.put("cityFlag", cityFlag);
        params.put("caNo", caNo);*/
		return this.getSqlSession().selectList("com.sdyx.boss.service.internal.customer.echannel.dao.BossDao.selectRenewalInfo");
	}

	@Override
	public List<UserProInfo> selectUserProInfo(String cityFlag, String caNo) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.sdyx.boss.service.internal.customer.echannel.dao.BossDao.selectUserProInfo");
	}

	@Override
	public Double selectCustomerBalanceInfo(String cityFlag, String cNo) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.sdyx.boss.service.internal.customer.echannel.dao.BossDao.selectCustomerBalanceInfo");
	}
}
