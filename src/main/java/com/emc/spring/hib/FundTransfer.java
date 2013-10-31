package com.emc.spring.hib;

public interface FundTransfer {
	
	void doTransfer(String srcId,String destId,Integer amt);

}
