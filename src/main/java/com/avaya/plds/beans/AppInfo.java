package com.avaya.plds.beans;

public class AppInfo {

	private String Application_id;
	private String product_line_code;
	private String product_line_desc;
	private String master_product_line;
	private String application_name;
	private String type_code;
	private String platform_type;
	private String strip_dash;
	private String Sid;
	private String allow_any;
	private String required_apps;
	private String not_compatible_apps;
	private String webLMByPass;
	private String PLD_release;
	
	
	/**
	 * @return the application_id
	 */
	public String getApplication_id() {
		return Application_id;
	}
	/**
	 * @param application_id the application_id to set
	 */
	public void setApplication_id(String application_id) {
		Application_id = application_id;
	}
	/**
	 * @return the product_line_code
	 */
	public String getProduct_line_code() {
		return product_line_code;
	}
	/**
	 * @param product_line_code the product_line_code to set
	 */
	public void setProduct_line_code(String product_line_code) {
		this.product_line_code = product_line_code;
	}
	/**
	 * @return the product_line_desc
	 */
	public String getProduct_line_desc() {
		return product_line_desc;
	}
	/**
	 * @param product_line_desc the product_line_desc to set
	 */
	public void setProduct_line_desc(String product_line_desc) {
		this.product_line_desc = product_line_desc;
	}
	/**
	 * @return the master_product_line
	 */
	public String getMaster_product_line() {
		return master_product_line;
	}
	/**
	 * @param master_product_line the master_product_line to set
	 */
	public void setMaster_product_line(String master_product_line) {
		this.master_product_line = master_product_line;
	}
	/**
	 * @return the application_name
	 */
	public String getApplication_name() {
		return application_name;
	}
	/**
	 * @param application_name the application_name to set
	 */
	public void setApplication_name(String application_name) {
		this.application_name = application_name;
	}
	/**
	 * @return the type_code
	 */
	public String getType_code() {
		return type_code;
	}
	/**
	 * @param type_code the type_code to set
	 */
	public void setType_code(String type_code) {
		this.type_code = type_code;
	}
	/**
	 * @return the platform_type
	 */
	public String getPlatform_type() {
		return platform_type;
	}
	/**
	 * @param platform_type the platform_type to set
	 */
	public void setPlatform_type(String platform_type) {
		this.platform_type = platform_type;
	}
	/**
	 * @return the strip_dash
	 */
	public String getStrip_dash() {
		return strip_dash;
	}
	/**
	 * @param strip_dash the strip_dash to set
	 */
	public void setStrip_dash(String strip_dash) {
		this.strip_dash = strip_dash;
	}
	/**
	 * @return the sid
	 */
	public String getSid() {
		return Sid;
	}
	/**
	 * @param sid the sid to set
	 */
	public void setSid(String sid) {
		Sid = sid;
	}
	/**
	 * @return the allow_any
	 */
	public String getAllow_any() {
		return allow_any;
	}
	/**
	 * @param allow_any the allow_any to set
	 */
	public void setAllow_any(String allow_any) {
		this.allow_any = allow_any;
	}
	/**
	 * @return the required_apps
	 */
	public String getRequired_apps() {
		return required_apps;
	}
	/**
	 * @param required_apps the required_apps to set
	 */
	public void setRequired_apps(String required_apps) {
		this.required_apps = required_apps;
	}
	/**
	 * @return the not_compatible_apps
	 */
	public String getNot_compatible_apps() {
		return not_compatible_apps;
	}
	/**
	 * @param not_compatible_apps the not_compatible_apps to set
	 */
	public void setNot_compatible_apps(String not_compatible_apps) {
		this.not_compatible_apps = not_compatible_apps;
	}
	/**
	 * @return the webLMByPass
	 */
	public String getWebLMByPass() {
		return webLMByPass;
	}
	/**
	 * @param webLMByPass the webLMByPass to set
	 */
	public void setWebLMByPass(String webLMByPass) {
		this.webLMByPass = webLMByPass;
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
		return "AppInfo{Application_id="+Application_id+
				",product_line_code="+product_line_code+
				",product_line_desc="+product_line_desc+
				",master_product_line="+master_product_line+
				",application_name="+application_name+
				",type_code="+type_code+
				",platform_type="+platform_type+
				",strip_dash="+strip_dash+
				",Sid="+Sid+
				",allow_any="+allow_any+
				",required_apps="+required_apps+
				",not_compatible_apps="+not_compatible_apps+
				",webLMByPass="+webLMByPass+
				",PLD_release="+PLD_release+"}";
	}
	
}
