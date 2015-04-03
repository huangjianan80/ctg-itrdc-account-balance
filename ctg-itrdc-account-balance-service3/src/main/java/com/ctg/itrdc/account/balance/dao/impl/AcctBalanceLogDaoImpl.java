package com.ctg.itrdc.account.balance.dao.impl;

import com.ctg.itrdc.account.balance.dao.IAcctBalanceLogDao;

public class AcctBalanceLogDaoImpl implements IAcctBalanceLogDao{

	@Override
	public boolean insertBalanceLog(int acctBalanceId, int acctId,
			int operIncomeId, int srcAmount, int operPayoutId,
			int payOutAmount, int sliceKey) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertBalanceLogOperIn(int acctBalanceId, int acctId,
			int operIncomeId, int srcAmount, int sliceKey) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertBalanceLogOperOut(int acctBalanceId, int acctId,
			int operPayoutId, int payOutAmount, int sliceKey) {
		// TODO Auto-generated method stub
		return false;
	}

}
