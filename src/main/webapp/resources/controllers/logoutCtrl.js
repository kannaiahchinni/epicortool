/**
* PLDSPlugin Module
*
* Description
*/
angular.module('PLDSPlugin').controller('logoutCtrl', ['$scope','$location','PluginService','$rootScope', function ($scope,$location,PluginService,$rootScope) {

	PluginService.logout().then(
		function(success){
			$rootScope.showMenu = false;
			$rootScope.userName = "";
			$location.path("/login");
		}
		);

}]);