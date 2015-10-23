(function(){
		
	angular.module('PLDSPlugin').controller('requestCtrl',['$scope','$log','PluginService', '$http',function($scope,$log,PluginService,$http){
	
		$scope.requestLogin = function(){
			$scope.user.message = "Please wait, sending request to admin..";
			PluginService.requestLogin($scope.user).then(
			
			function(success){
				$scope.user ={};
				$scope.user.message = "request sent to admin successfully ... ";
				$log.debug("request sent to admin successfully ... ");
			},
			function(err){
				$scope.user.message = "request failed, Please try once again ...... ";
				$log.debug('request failed, Please try once again ...');
			}
		);
		}
		
	}]);
	
})();