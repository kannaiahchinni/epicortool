(function(){
	
	angular.module('PLDSPlugin').config(['$stateProvider', '$urlRouterProvider', function ($stateProvider,$urlRouterProvider) {
		console.log('inside of configu creation ');
			$stateProvider.state('login',{
				url:'/login',
				templateUrl:'resources/views/login.html'
			}).state('home',{
				url:'/home',
				templateUrl :'resources/views/home.html',
				controller:'homeCtrl',
				resolve:{
					auth:['$q','$location','PluginService','$log','$rootScope', function($q,$location,PluginService,$log,$rootScope){
						return PluginService.session().then(
								
								function(success){
									$log.debug(success);
									$log.debug("done at routing to home / "+ success);
									$log.debug(angular.toJson(success));
									if(success.data === ""){
										$location.path("/login");
										$location.replace();
										return $q.reject('');
									}else{
										$rootScope.showMenu = true;
										$rootScope.userName = success.data.userName
									}
									/*$log.debug("navigating to home ");
									$location.path("/home");
									$location.replace();*/
								},
								function(err){
									$log.debug("navigating to login area ");
									$location.path("/login");
									$location.replace();
									return $q.reject(err);
								}
						);
					}]
				}
			}).state('/logout',{
				url:'/logout',
				controller:'logoutCtrl'
			}).state('request',{
				url:'/request',
				templateUrl:'resources/views/request.html',
				controller:'requestCtrl'
			})
			
			
			// defining nested states for different states. 
			
			.state('home.inbox', {
				url:'/inbox',
				templateUrl:'resources/views/forms/inbox.html'
				
			}).state('home.assign', {
				url:'/assign',
				templateUrl:'resources/views/forms/assign.html'
			}).state('home.form3', {
				url:'/form3',
				templateUrl:'resources/views/forms/form3.html'
			}).state('home.form4', {
				url:'/form4',
				templateUrl:'resources/views/forms/form4.html'
			}).state('home.config', {
				url:'/config',
				templateUrl:'resources/views/edit/config.html'
			}).state('home.info', {
				url:'/info',
				templateUrl:'resources/views/edit/info.html'
			}).state('home.features', {
				url:'/features',
				templateUrl:'resources/views/edit/features.html'
			}).state('home.rules', {
				url:'/rules',
				templateUrl:'resources/views/edit/rules.html'
			}).state('/',{
				url:'/',
				resolve:{
					auth:['$q','$location','PluginService','$log', function($q,$location,PluginService,$log){
						return PluginService.session().then(
								
								function(success){
									$log.debug(success);
									$log.debug("done at routing to / "+ success);
									if(success.data === ""){
										$location.path("/login");
										$location.replace();
										return $q.reject('');
									}
									$log.debug("navigating to home ");
									$location.path("/home");
									$location.replace();
								},
								function(err){
									$log.debug("navigating to login area ");
									$location.path("/login");
									$location.replace();
									return $q.reject(err);
								}
						);
					}]
				}
			});
			

			$urlRouterProvider.otherwise('/');

	}]).run(['$rootScope', function ($rootScope) {
				$rootScope.showMenu = false;
				$rootScope.loggedUser = {};
			}]);



})();