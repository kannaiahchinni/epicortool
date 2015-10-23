package com.avaya.plds.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avaya.plds.beans.AppList;
import com.avaya.plds.beans.ApplicationInfo;
import com.avaya.plds.beans.Features;
import com.avaya.plds.beans.Inbox;
import com.avaya.plds.beans.Rules;
import com.avaya.plds.beans.User;
import com.avaya.plds.dao.PLDSPluginDAO;
import com.avaya.plds.service.PLDSPluginService;

@Service
public class PLDSPluginServiceImpl implements PLDSPluginService {

	@Autowired
	PLDSPluginDAO pldsPluginDAO;

	/*public List<AppList> getApplicationList() {
		System.out.println( "inside of getApplicationList method impl");
		List<AppList> result = pldsPluginDAO.getApplicationList();
		System.out.println(result);
		//return pldsPluginDAO.getApplicationList();
		return result;
	}

	public ApplicationInfo getApplicationInfo(int appId, int version) {
		ApplicationInfo appInfo = new ApplicationInfo();
		appInfo.setAppInfo(pldsPluginDAO.getApplicationInfo(appId));
		System.out.println("appId= "+appId+" version ="+ version);
		appInfo.setProductInfo(pldsPluginDAO.getProductInfo(appId, version));
		appInfo.setFeaturesList(pldsPluginDAO.getFeatures(appId, version));
		appInfo.setRulesList(pldsPluginDAO.getRules(appId, version));
		//System.out.println(app.toString());
		// appInfo.setAppInfo(app);
		//System.out.println(appInfo.toString());
		return appInfo;
	}

	public int deleteApplication(int appId) {

		return 1;
		//return pldsPluginDAO.deleteApplication("1","1");
	}

	public int update(ApplicationInfo appInfo) {
		pldsPluginDAO.updateAppData(appInfo.getAppInfo());
		pldsPluginDAO.updateProductInfo(appInfo.getProductInfo());
		System.out.println(appInfo.getFeaturesList().toString());
		// deleting existing feature while updating screens
		pldsPluginDAO.deleteFeatures(appInfo.getProductInfo().getProduct_info_id(),appInfo.getProductInfo().getProductVersion());
		for(Features feature: appInfo.getFeaturesList())
			pldsPluginDAO.saveFeatures(feature);

		pldsPluginDAO.deleteRules(appInfo.getProductInfo().getProduct_info_id(),appInfo.getProductInfo().getProductVersion());
		for(Rules rule : appInfo.getRulesList())
			pldsPluginDAO.saveRules(rule);
		return 0;
	}

	public int save(ApplicationInfo appInfo) {
		if(!appInfo.getNewVersion()){
			int application_id = pldsPluginDAO.saveAppData(appInfo.getAppInfo());
			int product_id = pldsPluginDAO.saveProductInfo(appInfo.getProductInfo());
			String version =  appInfo.getProductInfo().getProductVersion();
			for(Features feature: appInfo.getFeaturesList()){

				feature.setProductVersion(version);
				pldsPluginDAO.saveFeatures(feature);
			}

			for(Rules rule : appInfo.getRulesList()){
				rule.setVersion(version);
				pldsPluginDAO.saveRules(rule);
			}

		}else{

			int product_id = pldsPluginDAO.saveProductInfo1(appInfo.getProductInfo());
			String version =  appInfo.getProductInfo().getProductVersion();
			for(Features feature: appInfo.getFeaturesList()){
				
				feature.setProductVersion(version);
				System.out.println(feature.toString());
				pldsPluginDAO.updateFeatures(feature);
			}

			for(Rules rule : appInfo.getRulesList()){
				rule.setVersion(version);
				pldsPluginDAO.updateRules(rule);
			}
		}
		return 0;
	}*/

	public User login(User user) {
		return pldsPluginDAO.login(user);
	}

	public int requestLogin(User user) {
		return pldsPluginDAO.requestLogin(user);
	}

	public List<Inbox> getInbox(String email) {
		
		return pldsPluginDAO.getInbox(email);
	}

	public int setInbox(Inbox inbox) {
		
		return pldsPluginDAO.setInbox(inbox);
	}


}
