package com.ctg.itrdc.account.balance.dao;

/**
 * 余额支出记录存入
 * @author hxj
 *
 */
public interface IBalancePayoutDao {
	public boolean insertPayout(int acctBalanceId, int acctId, int billId,
			int paymentId, int operType, int staffId, int amount, int balance,
			int prnCount, int sliceKey);
}
