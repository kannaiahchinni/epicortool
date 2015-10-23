package com.avaya.plds.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.avaya.plds.beans.Inbox;
import com.avaya.plds.beans.User;
import com.avaya.plds.service.PLDSPluginService;


@Controller
public class PluginController {

	@Autowired
	PLDSPluginService pldsPluginService;
	
	
	/*
	 *  To get the list of applications and versions 
	 */
	
	/*@RequestMapping(value="/api/getAppList" , method=RequestMethod.POST)
	public @ResponseBody List<AppList> getApplicationList(){
		return pldsPluginService.getApplicationList();
	}
	
	@RequestMapping(value="/api/getAppInfo/{appId}/{version}", method=RequestMethod.POST)
	public @ResponseBody ApplicationInfo getApplicationInfo(HttpServletRequest request,
			@PathVariable("appId") String appId, @PathVariable("version") String version){
		System.out.println(appId);
		System.out.println(version);
		return pldsPluginService.getApplicationInfo(Integer.parseInt(appId),Integer.parseInt(version));
	}
	
	
	
	 *  For update operations
	 
	
	@RequestMapping(value="/api/update", method=RequestMethod.POST)
	public @ResponseBody int update(HttpServletRequest request,@RequestBody ApplicationInfo appinfo){
		pldsPluginService.update(appinfo);
		return 0;
	}
	
	
	 *  save application information. This is for creating new record in database based on input. 
	 
	@RequestMapping(value="/api/save" , method=RequestMethod.POST)
	public @ResponseBody int save(HttpServletRequest request, @RequestBody ApplicationInfo appinfo){
		System.out.println(appinfo.toString());
		return pldsPluginService.save(appinfo);
		//return 1;
	}
	
	
	 *  Delete the application information based on application id 
	 
	@RequestMapping(value="/api/trash/{appId}", method=RequestMethod.POST)
	public @ResponseBody int delete(HttpServletRequest request,@PathVariable int appId){
		return pldsPluginService.deleteApplication(appId);
	}
	*/
	
	@RequestMapping(value="/api/session", method=RequestMethod.GET)
	public @ResponseBody User session(HttpServletRequest request){
		User user = (User)request.getSession().getAttribute("user");
		return user;
	}
	
	@RequestMapping(value="/api/login" , method=RequestMethod.POST)
	public @ResponseBody User login(HttpServletRequest request,@RequestBody User user){
		System.out.println(user.toString());
		user = pldsPluginService.login(user);
		if(user != null){
			user.setPassword("");
			if(user.getStatus().equalsIgnoreCase("active")){
				user.setMessage("User Logged");
				request.getSession().setAttribute("user", user);
			}else{
				user.setMessage("Your account is not active, Please Contact adminstrator...");
			}
		}else{
			user = new User();
			user.setMessage("Your email not existed or Username and password are not matched, Please try again ..");
		}
		
		return user;
	}
	
	
	
	@RequestMapping(value="/api/requestLogin" , method=RequestMethod.POST)
	public @ResponseBody String requestLogin(HttpServletRequest request ,@RequestBody User user){
		int result = pldsPluginService.requestLogin(user);
		return result == 1 ? "Request sent successfully " : "Request failed, Please try after sometime";
	}
	
	
	@RequestMapping(value="/api/logout" , method=RequestMethod.GET)
	public @ResponseBody String logout(HttpServletRequest request){
		request.getSession().setAttribute("user", null);
		request.getSession().invalidate();
		return "done";
	}
	
	@RequestMapping(value="/api/getinbox",method=RequestMethod.POST)
	public @ResponseBody List<Inbox> getInbox(HttpServletRequest request){
		User user = (User)request.getSession().getAttribute("user");
		return pldsPluginService.getInbox(user.getEmail());
	}
	
	@RequestMapping(value="/api/setinbox",method=RequestMethod.POST)
	public @ResponseBody int setInbox(HttpServletRequest request,Inbox inbox){
		User user = (User)request.getSession().getAttribute("user");
		inbox.setFromEmail(user.getEmail());
		return pldsPluginService.setInbox(inbox);
	}
	
}
