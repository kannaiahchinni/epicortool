/**
 * 
 */
package com.avaya.plds.beans;

/**
 * @author Kannaiah Yadav
 *
 */

public class Features {

	private String Product_info_id;
	private String productVersion;
	private String Feature_type;
	private String Name4;
	private String DisplayName5;
	private String Value;
	private String PLD_release;
	private String defaultValue;
	private String defaultt;
	private String dataType;
	
	/**
	 * @return the product_info_id
	 */
	public String getProduct_info_id() {
		return Product_info_id;
	}
	/**
	 * @param product_info_id the product_info_id to set
	 */
	public void setProduct_info_id(String product_info_id) {
		Product_info_id = product_info_id;
	}
	/**
	 * @return the productVersion
	 */
	public String getProductVersion() {
		return productVersion;
	}
	/**
	 * @param productVersion the productVersion to set
	 */
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}
	/**
	 * @return the feature_type
	 */
	public String getFeature_type() {
		return Feature_type;
	}
	/**
	 * @param feature_type the feature_type to set
	 */
	public void setFeature_type(String feature_type) {
		Feature_type = feature_type;
	}
	/**
	 * @return the name4
	 */
	public String getName4() {
		return Name4;
	}
	/**
	 * @param name4 the name4 to set
	 */
	public void setName4(String name4) {
		Name4 = name4;
	}
	/**
	 * @return the displayName5
	 */
	public String getDisplayName5() {
		return DisplayName5;
	}
	/**
	 * @param displayName5 the displayName5 to set
	 */
	public void setDisplayName5(String displayName5) {
		DisplayName5 = displayName5;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return Value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		Value = value;
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
		return "Features{"
				+ ",Product_info_id="+Product_info_id
				+ ",productVersion="+productVersion
				+ ",Feature_type="+Feature_type
				+ ",Name4="+Name4
				+ ",DisplayName5="+DisplayName5
				+ ",Value="+Value
				+ "PLD_release="+PLD_release+"}";
	}
	/**
	 * @return the defaultValue
	 */
	public String getDefaultValue() {
		return defaultValue;
	}
	/**
	 * @param defaultValue the defaultValue to set
	 */
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	/**
	 * @return the defaultt
	 */
	public String getDefaultt() {
		return defaultt;
	}
	/**
	 * @param defaultt the defaultt to set
	 */
	public void setDefaultt(String defaultt) {
		this.defaultt = defaultt;
	}
	/**
	 * @return the dataType
	 */
	public String getDataType() {
		return dataType;
	}
	/**
	 * @param dataType the dataType to set
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	
}
