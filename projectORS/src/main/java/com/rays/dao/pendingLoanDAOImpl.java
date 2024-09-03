package com.rays.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.pendingLoanDTO;

public class pendingLoanDAOImpl extends BaseDAOImpl<pendingLoanDTO>{

	@Override
	protected List<Predicate> getWhereClause(pendingLoanDTO dto, CriteriaBuilder builder, Root<pendingLoanDTO> qRoot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<pendingLoanDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
