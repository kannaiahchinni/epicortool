(function(){

	angular.module('PLDSPlugin').controller('homeCtrl', ['$scope','$log','$location','PluginService','$modal' ,function ($scope,$log,$location,PluginService,$modal) {
			
		$log.debug('inside of homeCtrl ... ');
		$location.path("/home");
		$log.debug('redirectinng form1 ');
		
		//$locationProvider.html5Mode(true);

		$scope.inbox = {};
		/*$scope.copiedConfigData ={};
		$scope.productInfo = {};
		$scope.features = [];
		$scope.release = [];
		$scope.status = false;
		$scope.state = true;
		$scope.options= [];
		$scope.appDetails =  null;
		$scope.operation = "none";*/
		$scope.page_loading = true;

		/*$scope.$watch('configData.productInfo.productVersion', function(){
				
			
				
				$log.debug('$scope.configData.newVersion'+ $scope.configData.newVersion);
		});

		$scope.$watch('applicationName', function(){
			$log.debug("watching applicationName changes");
			if($scope.applicationName != undefined){
				$scope.versions = angular.fromJson($scope.applicationName).versionsList; 
			}
		});
		
		$scope.viewstates = {"urls":[{"url":".form1","name":"Configuration"},{"url":".form2","name":"Information"},{"url":".form3","name":"Features"},{"url":".form4","name":"Rules"}]};
		$scope.editstates = {"urls":[{"url":".config","name":"Configuration"},{"url":".info","name":"Information"},{"url":".features","name":"Features"},{"url":".rules","name":"Rules"}]};
		
		$scope.menus = $scope.viewstates;
		
		$log.debug(angular.toJson($scope.menus));

		$scope.load = function(){
			$scope.loading_info = true;
			
			PluginService.appInfo(angular.fromJson($scope.applicationName).appId,$scope.appVersion).then(function(response){
				
				$scope.configData = response.data;
				$scope.copiedConfigData = angular.copy($scope.configData);
				$scope.appDetails = angular.fromJson($scope.applicationName).applicationName +" -"+$scope.appVersion;
				$scope.status = true;
				$scope.state = true;
				$scope.loading_info = true;
				$location.path("/home/form1");
			
			});
			
			
			
		};
		*/
		
		PluginService.getInbox().then(function(response){
			
			$scope.inbox = response.data;
			$scope.loading_info = true;
			$location.path("/home/inbox");
		
		});
		
		$scope.assignTicket = function(){
			PluginService.setInbox($scope.inboxdata).then(function(response){
					console.log('data saved successfully ');
					$scope.inbox.push($scope.inboxdata);
					$scope.inboxdata = {};
			});
		}
		
		
		$scope.editFeature  = function(feature){
			var modalInstance = $modal.open({
				templateUrl:"resources/views/edit/editfeature.html",
				size:'lg',
				controller:'modelController',
				resolve:{
					feature: function(){
						return feature;
					},
					featureList: function(){
						return $scope.configData.featuresList
					}
				}
			});
			$log.debug(modalInstance.result);
		}
		
		$scope.editRule  = function(rule){
			var modalInstance = $modal.open({
				templateUrl:"resources/views/edit/editrule.html",
				size:'lg',
				controller:'ruleModelController',
				resolve:{
					rule: function(){
						return rule;
					},
					rulesList: function(){
						return $scope.configData.rulesList;
					}
				}
			});
			$log.debug(modalInstance.result);
		}
		
		$scope.getVersions = function(){
			$log.debug($scope.applicationName);
		}
		
		$scope.remove = function(){
			$scope.configData = angular.copy($scope.copiedConfigData);
			/*$scope.status = true;
			$scope.state = true;
			$scope.menus =  $scope.viewstates;
			$location.path("/home/form1");
			*/
			$scope.navigate();
		}	
		
		
		
		$scope.edit = function(){
			$scope.state = false;
			$scope.menus = $scope.editstates;
			$scope.operation = "edit";
			$location.path("/home/config");
		}
		$scope.copy = function(){
			$scope.state = false;
			$scope.menus = $scope.editstates;
			$scope.operation = "copy";
			$location.path("/home/config");
		};
		
		$scope.next = function(val){
			$location.path("/home/"+val);
		};
		
		$scope.saveData = function(){
			if(!angular.equals($scope.configData, $scope.copiedConfigData)){
			
				if($scope.operation == "copy"){

					PluginService.save($scope.configData).then(function(response){
						$scope.navigate();
					});
				}
				else if($scope.operation == "edit"){
					PluginService.update($scope.configData).then(function(response){
						$scope.navigate();
					});
				}
			}else{
				$scope.navigate();
			}
			
		};
		
		
		$scope.deleteObject = function(object,type){
			if(type == 1){
				var index = $scope.configData.featuresList.indexOf(object);
				$scope.configData.featuresList.splice(index,1);
			}else{
				var index = $scope.configData.rulesList.indexOf(object);
				$scope.configData.rulesList.splice(index,1);
			}
		};
		
		$scope.init = function(){
			$log.debug(PluginService.isLoggedIn);
			//if(PluginService.isLoggedIn){
				PluginService.appList().then(function(response){
					$scope.options = response.data;
					$scope.page_loading = false;
				});
			/*}else{
				$location.path("/login");
			}*/
		}
		
		$scope.navigate = function(){
			$scope.status = true;
			$scope.state = true;
			$scope.menus =  $scope.viewstates;
			$scope.init();
			$location.path("/home/form1");
			$scope.operation ="none";
		}

		$scope.init();
		
	}]);

})();