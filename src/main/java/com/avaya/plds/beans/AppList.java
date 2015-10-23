package com.avaya.plds.beans;

import java.util.ArrayList;
import java.util.List;

public class AppList {

	private String appId;
	private String applicationName;
	private List<Version> versionsList;
	private String versions;
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public List<Version> getVersionsList() {
		versionsList = new ArrayList<Version>();
		for(String ver : this.versions.split(",")){
			Version v= new Version();
			v.setVersion(ver);
			versionsList.add(v);
		}
		return versionsList;
	}
	public void setVersionsList(List<Version> versionsList) {
		this.versionsList = versionsList;
	}
	public String getVersions() {
		return versions;
	}
	public void setVersions(String versions) {
		this.versions = versions;
		//this.convertVersions(versions);
		//this.versionsList = Arrays.asList(versions.split(","));
	}
	
	
	
	@Override
	public String toString(){
		return "AppList{appId="+appId+""
				+ ",applicationName="+applicationName
				+ ",versionsList="+versionsList
				+ ",versions="+versions+"}";
	}
}
