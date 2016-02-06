package com.sdyx.boss.service.internal.customer.echannel.service;

import java.util.List;

import com.sdyx.boss.service.internal.customer.echannel.model.RenewalInfo;

public interface ServiceInfoService {

	public String getRenewalInfo(String cityFlag, String caNo);
	
	public String getUserProInfo(String cityFlag, String caNo);
	
	public String getCustomerCommonBalanceInfo(String cityFlag, String cNo);
}
