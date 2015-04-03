package com.ctg.itrdc.account.balance.dao;

/**
 * 余额账本日志存入
 * @author hxj
 *
 */
public interface IAcctBalanceLogDao {
	public boolean insertBalanceLog(int acctBalanceId, int acctId,
			int operIncomeId, int srcAmount, int operPayoutId,
			int payOutAmount, int sliceKey);
	/**
	 * 账本余额来源日志
	 * @param acctBalanceId 余额账本标识
	 * @param acctId 账户标识
	 * @param operIncomeId 来源操作流水
	 * @param srcAmount 来源原金额
	 * @param sliceKey 分片标识
	 * @return
	 */
	public boolean  insertBalanceLogOperIn(int acctBalanceId, int acctId,
			int operIncomeId, int srcAmount,int sliceKey);
	
	/**
	 * 账本余额支出日志
	 * @param acctBalanceId 余额账本标识
	 * @param acctId 账户标识
	 * @param operPayoutId 支出操作流水
	 * @param payOutAmount 支出金额
	 * @param sliceKey 分片标识
	 * @return
	 */
	public boolean insertBalanceLogOperOut(int acctBalanceId, int acctId,
			int operPayoutId, int payOutAmount, int sliceKey);
}
