package com.emc.spring.hib;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class FundTransferImpl implements FundTransfer{
	
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED)
	@Override
	public void doTransfer(String srcId,String destId, Integer amt) {
		
		
		Emp srcEmp=hibernateTemplate.get(Emp.class, srcId);
		
		Emp destEmp=hibernateTemplate.get(Emp.class, destId);
		
		srcEmp.setEsal(srcEmp.getEsal()-amt);
		destEmp.setEsal(destEmp.getEsal()+amt);
		
		hibernateTemplate.saveOrUpdate(srcEmp);
		
		/*if(true)
		throw new RuntimeException("NetworkFailure");*/
		
		hibernateTemplate.saveOrUpdate(destEmp);
		
	}

}
