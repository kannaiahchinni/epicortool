(function(){

	/**
	*  Module
	*
	* Description
	*/
	angular.module('PLDSPlugin').factory('PluginService', ['$http','$log',function ($http,$log) {
		
		var service ={
			isLoggedIn:false,
			appList:[],
			userInfo:{},

			session: function(){
				return $http.get('api/session').then(function(response){
					if(response.data === ""){
						service.isLoggedIn = false;
						service.userInfo = {};
					}
					return response;
				});
			},
			login:function(user){
			return	$http.post('api/login',user).then(function(response){
					service.isLoggedIn = true;
					service.userInfo = user;
					return response;
				});
			},
			logout: function(){
				return $http.get('api/logout').then(function(response){
					service.isLoggedIn = false;
					service.userInfo = {};
					return response;
				})
			},
			appList: function(){
				return $http.post('api/getAppList').then(function(response){
					return response;
				});
			},
			appInfo:function(appId,version){
				$log.debug("appId : "+ appId +" version : "+version);
				return $http.post('api/getAppInfo/'+appId+'/'+version).then(function(response){
					return response;
				});
			},
			update:function(data){
				return $http.post('api/update',data).then(function(response){
					return response;
				});
			},
			save:function(data){
				return $http.post('api/save',data).then(function(response){
					return response;
				});
			},
			trash:function(id){
				return $http.post('api/trash/'+id).then(function(response){
					return response;
				});
			},
			requestLogin:function(data){
				return $http.post('api/requestLogin',data).then(function(response){
					return response;
				});
			},
			getInbox:function(){
				return $http.post('api/getinbox').then(function(response){
					return response;
				});
			},
			setInbox:function(data){
				return $http.post('api/setinbox').then(function(response){
					return response;
				});
			}


		};
	
		return service;
	}]);

})();