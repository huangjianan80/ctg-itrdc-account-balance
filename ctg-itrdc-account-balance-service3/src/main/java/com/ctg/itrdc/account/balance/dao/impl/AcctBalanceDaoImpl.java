package com.ctg.itrdc.account.balance.dao.impl;

import com.ctg.itrdc.account.balance.dao.IAcctBalanceDao;
import com.ctg.itrdc.account.balance.model.AcctBalanceModel;

public class AcctBalanceDaoImpl implements IAcctBalanceDao{

	@Override
	public boolean insertRecharge(int sliceKey, int acctBalaneceId,
			int balanceTypeId, int acctId, String effDate, int addBalance) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertRecharge(int sliceKey, int acctBalaneceId,
			int balanceTypeId, int acctId, String effDate, String expDate,
			int addBalance) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertMonthlyReturn(int sliceKey, int acctBalaneceId,
			int balanceTypeId, int acctId, String effDate, String expDate,
			int balance) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AcctBalanceModel selectAcctBalanceByAcctBalanceId(int sliceKey,
			int acctBalanceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertRecharge(int sliceKey, int acctBalaneceId,
			int balanceTypeId, int acctId, String effDate, String expDate,
			int addBalance, int cycleUpper, int cycleLower, int cycleUpperType,
			int cycleLowerType, int state) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAcctBalance(int sliceKey, int acctBalanceId,
			int acctId, int addBalance) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
