package com.avaya.plds.dao;

import java.util.List;

import com.avaya.plds.beans.Inbox;
import com.avaya.plds.beans.User;


public interface PLDSPluginDAO {

	/*public List<AppList> getApplicationList();
	
	public AppInfo getApplicationInfo(int appId);
	public ProductInfo getProductInfo(@Param("appId") int appId, @Param("version") int version);
	public List<Features> getFeatures(@Param("appId") int appId, @Param("version") int version);
	public List<Rules> getRules(@Param("appId") int appId, @Param("version") int version);

	public int updateAppData(AppInfo appInfo);
	public int updateProductInfo(ProductInfo productInfo);
	public int updateFeatures(@Param("feature") Features feature);
	public int updateRules(@Param("rule") Rules rule);
	
	
	public int saveAppData(AppInfo appInfo);
	public int saveProductInfo(ProductInfo productInfo);
	public int saveProductInfo1(ProductInfo productInfo);
	public int saveFeatures(@Param("feature") Features feature);
	public int saveRules(@Param("rule") Rules rule);
	
	
	public int deleteFeatures(@Param("appId") String appId, @Param("version") String version);
	public int deleteRules(@Param("appId") String appId, @Param("version") String version);*/
	
	public List<Inbox> getInbox(String email);
	public int setInbox(Inbox inbox);
	
	public User login(User user);
	public int requestLogin(User user);
	
}
