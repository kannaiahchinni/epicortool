package com.avaya.plds.beans;

import java.util.List;


public class ApplicationInfo {
	
	private AppInfo appInfo;
	private ProductInfo productInfo;
	private List<Features> featuresList;
	private List<Rules> rulesList;
	private boolean newVersion = false;
	
	
	public void setNewVersion(boolean newVersion) {
		this.newVersion = newVersion;
	}
	
	public boolean getNewVersion(){
		return this.newVersion;
	}
	
	/**
	 * @return the appInfo
	 */
	public AppInfo getAppInfo() {
		return appInfo;
	}
	/**
	 * @param appInfo the appInfo to set
	 */
	public void setAppInfo(AppInfo appInfo) {
		this.appInfo = appInfo;
	}
	/**
	 * @return the productInfo
	 */
	public ProductInfo getProductInfo() {
		return productInfo;
	}
	/**
	 * @param productInfo the productInfo to set
	 */
	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}
	/**
	 * @return the featuresList
	 */
	public List<Features> getFeaturesList() {
		return featuresList;
	}
	/**
	 * @param featuresList the featuresList to set
	 */
	public void setFeaturesList(List<Features> featuresList) {
		this.featuresList = featuresList;
	}
	/**
	 * @return the rulesList
	 */
	public List<Rules> getRulesList() {
		return rulesList;
	}
	/**
	 * @param rulesList the rulesList to set
	 */
	public void setRulesList(List<Rules> rulesList) {
		this.rulesList = rulesList;
	}

	
	@Override
	public String toString(){
		
		return "ApplicationInfo{"
				+ "appInfo="+appInfo
				+ ",productInfo="+productInfo
				+ ",featuresList="+featuresList
				+ ",rulesList="+rulesList+"}";
		
	}
	
	
}
