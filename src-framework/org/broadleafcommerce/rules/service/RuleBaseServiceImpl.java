package org.broadleafcommerce.rules.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.drools.RuleBase;
import org.drools.RuleBaseFactory;

public class RuleBaseServiceImpl implements RuleBaseService {

	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	private RuleBase ruleBase;

	public RuleBase getRuleBase() {
		if (ruleBase == null) {
			System.out.println("creating");
			ruleBase = RuleBaseFactory.newRuleBase();
		}
		System.out.println("returning from cache");
		return ruleBase;
	}
}
