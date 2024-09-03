package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.BankDTO;

@Repository
public class BankDAOImpl extends BaseDAOImpl<BankDTO> implements BankDAOInt{

	@Override
	protected List<Predicate> getWhereClause(BankDTO dto, CriteriaBuilder builder, Root<BankDTO> qRoot) {
		
		List<Predicate> whereCondition  = new ArrayList<Predicate>();
		
		if(!isEmptyString(dto.getName()));
		
		whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		
		if(!isZeroNumber(dto.getAccountNumber()));
		
		whereCondition.add(builder.equal(qRoot.get("accountNumber"), dto.getAccountNumber() + "%"));
		
		return null;
	}

	@Override
	public Class<BankDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
