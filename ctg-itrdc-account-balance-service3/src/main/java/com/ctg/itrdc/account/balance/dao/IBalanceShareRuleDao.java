package com.ctg.itrdc.account.balance.dao;

/**
 * 余额共享规则
 * @author hxj
 *
 */
public interface IBalanceShareRuleDao {
	/**
	 * 共享规则新增
	 * @param shareRuleId 共享规则标识
	 * @param acctBalanceId 余额账本标识
	 * @param acctId 账本标识
	 * @param shareRuleTypeId 共享规则类型
	 * @param objectType 余额对象类型
	 * @param objectId 余额对象标识
	 * @param shareRuleTypePri 共享规则优先级
	 * @param upperAmount 扣费上限金额
	 * @param lowerAomunt 扣费下限金额
	 * @param effDate 生效时间
	 * @param expDate 失效时间
	 * @param sliceKey 分片标识
	 * @param state 状态
	 * @return
	 */
	public boolean insertShareRule(int shareRuleId, int acctBalanceId,
			int acctId, int shareRuleTypeId, int objectType, int objectId,
			int shareRuleTypePri, int upperAmount, int lowerAomunt,
			String effDate, String expDate, int sliceKey, int state);
	
	/**
	 * 
	 * @param shareRuleId
	 * @param acctBalanceId
	 * @param acctId
	 * @param shareRuleTypeId
	 * @param objectType
	 * @param objectId
	 * @param shareRuleTypePri
	 * @param upperAmount
	 * @param lowerAomunt
	 * @param effDate
	 * @param sliceKey
	 * @param state
	 * @return
	 */
	public boolean insertShareRule(int shareRuleId, int acctBalanceId,
			int acctId, int shareRuleTypeId, int objectType, int objectId,
			int shareRuleTypePri, int upperAmount, int lowerAomunt,
			String effDate, int sliceKey, int state);
	
	public boolean updateShareRule(int shareRuleId);
}
