package com.ctg.itrdc.account.balance.dao;

import com.ctg.itrdc.account.balance.model.AcctBalanceModel;

/**
 * 余额账本存入，查询
 * @author hxj
 *
 */
public interface IAcctBalanceDao {
	/**
	 * 余额充值
	 * @param sliceKey 分片标识
	 * @param acctBalaneceId 余额账本标识
	 * @param balanceTypeId 余额账本类型
	 * @param acctId 拥有账户标识
	 * @param effDate 生效时间
	 * @param addBalance 新增余额
	 * @return 是否存入成功
	 */
	public boolean insertRecharge(int sliceKey, int acctBalaneceId,
			int balanceTypeId, int acctId, String effDate, int addBalance);
	
	/**
	 * 余额充值
	 * @param sliceKey 分片标识
	 * @param acctBalaneceId 余额账本标识
	 * @param balanceTypeId 余额账本类型
	 * @param acctId 拥有账户标识
	 * @param effDate 生效时间
	 * @param expDate 失效时间
	 * @param addBalance 新增余额
	 * @return 是否存入成功
	 */
	public boolean insertRecharge(int sliceKey, int acctBalaneceId,
			int balanceTypeId, int acctId, String effDate, String expDate,
			int addBalance);
	
	/**
	 * 余额充值
	 * @param sliceKey 分片标识
	 * @param acctBalaneceId 余额账本标识
	 * @param balanceTypeId 余额类型标识
	 * @param acctId 账户标识
	 * @param effDate 生效时间
	 * @param expDate 失效时间
	 * @param addBalance 余额
	 * @param cycleUpper 扣费上限金额
	 * @param cycleLower 扣费下限金额
	 * @param cycleUpperType 扣费上限类型
	 * @param cycleLowerType 扣费下限类型
	 * @param state 状态
	 * @return
	 */
	public boolean insertRecharge(int sliceKey, int acctBalaneceId,
			int balanceTypeId, int acctId, String effDate, String expDate,
			int addBalance, int cycleUpper, int cycleLower, int cycleUpperType,
			int cycleLowerType,int state);
	
	/**
	 * 分月返还
	 * @param sliceKey 分片标识
	 * @param acctBalaneceId 余额账本标识
	 * @param balanceTypeId 余额账本类型
	 * @param acctId 拥有账户标识
	 * @param effDate 生效时间
	 * @param expDate 失效时间
	 * @param balance 分月返还余额
	 * @return 是否存入成功
	 */
	public boolean insertMonthlyReturn(int sliceKey, int acctBalaneceId,
			int balanceTypeId, int acctId, String effDate, String expDate,
			int balance);
	
	/**
	 * 根据余额账本标识查询余额账本
	 * @param sliceKey 分片标识
	 * @param acctBalanceId 余额账本标识
	 * @return
	 */
	public AcctBalanceModel selectAcctBalanceByAcctBalanceId(int sliceKey,int acctBalanceId);
	
	/**
	 * 账户账本存在，新增余额时修改原记录
	 * @param sliceKey 分片标识
	 * @param acctBalanceId 账本标识
	 * @param acctId 账户标识
	 * @param addBalance 新增余额
	 * @return
	 */
	public boolean updateAcctBalance(int sliceKey, int acctBalanceId,
			int acctId, int addBalance);
}
