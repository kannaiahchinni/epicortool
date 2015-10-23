/**
 * 
 */
package com.avaya.plds.beans;

/**
 * @author Kannaiah Yadav
 *
 */
public class Rules {

	private String product_info_id;
	private String rule_Id;
	private String version;
	private String rule;
	private String action_type;
	private String unitAction_id;
	private String unitAction_Type;
	private String feature_Name;
	private String to_type;
	private String messageCode;
	private String to_type_setting;
	private String PLD_release;
	
	
	public void setProduct_info_id(String product_info_id) {
		this.product_info_id = product_info_id;
	}
	
	public String getProduct_info_id() {
		return product_info_id;
	}

	/**
	 * @return the rule_Id
	 */
	public String getRule_Id() {
		return rule_Id;
	}
	/**
	 * @param rule_Id the rule_Id to set
	 */
	public void setRule_Id(String rule_Id) {
		this.rule_Id = rule_Id;
	}
	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	/**
	 * @return the rule
	 */
	public String getRule() {
		return rule;
	}
	/**
	 * @param rule the rule to set
	 */
	public void setRule(String rule) {
		this.rule = rule;
	}
	/**
	 * @return the action_type
	 */
	public String getAction_type() {
		return action_type;
	}
	/**
	 * @param action_type the action_type to set
	 */
	public void setAction_type(String action_type) {
		this.action_type = action_type;
	}
	/**
	 * @return the unitAction_id
	 */
	public String getUnitAction_id() {
		return unitAction_id;
	}
	/**
	 * @param unitAction_id the unitAction_id to set
	 */
	public void setUnitAction_id(String unitAction_id) {
		this.unitAction_id = unitAction_id;
	}
	/**
	 * @return the unitAction_Type
	 */
	public String getUnitAction_Type() {
		return unitAction_Type;
	}
	/**
	 * @param unitAction_Type the unitAction_Type to set
	 */
	public void setUnitAction_Type(String unitAction_Type) {
		this.unitAction_Type = unitAction_Type;
	}
	/**
	 * @return the feature_Name
	 */
	public String getFeature_Name() {
		return feature_Name;
	}
	/**
	 * @param feature_Name the feature_Name to set
	 */
	public void setFeature_Name(String feature_Name) {
		this.feature_Name = feature_Name;
	}
	/**
	 * @return the to_type
	 */
	public String getTo_type() {
		return to_type;
	}
	/**
	 * @param to_type the to_type to set
	 */
	public void setTo_type(String to_type) {
		this.to_type = to_type;
	}
	/**
	 * @return the to_type_setting
	 */
	public String getTo_type_setting() {
		return to_type_setting;
	}
	/**
	 * @param to_type_setting the to_type_setting to set
	 */
	public void setTo_type_setting(String to_type_setting) {
		this.to_type_setting = to_type_setting;
	}
	/**
	 * @return the messageCode
	 */
	public String getMessageCode() {
		return messageCode;
	}
	/**
	 * @param messageCode the messageCode to set
	 */
	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}
	/**
	 * @return the pLD_release
	 */
	public String getPLD_release() {
		return PLD_release;
	}
	/**
	 * @param pLD_release the pLD_release to set
	 */
	public void setPLD_release(String pLD_release) {
		PLD_release = pLD_release;
	}
	
	
	
	@Override
	public String toString(){
		
		return "Rules{rule_Id="+rule_Id
				+ ",rule="+rule
				+ ",action_type="+action_type
				+ ",unitAction_id="+unitAction_id
				+ ",unitAction_Type="+unitAction_Type
				+ ",feature_Name ="+feature_Name
				+ ",to_type="+to_type
				+ ",to_type_setting="+to_type_setting
				+ ",messageCode="+messageCode
				+ ",PLD_release="+PLD_release+"}";
	}
	
	
}
