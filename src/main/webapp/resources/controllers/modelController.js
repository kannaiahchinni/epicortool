(function(){
	
	angular.module('PLDSPlugin').controller('modelController',['$modalInstance','feature','$scope','featureList','$log' ,function($modalInstance,feature,$scope,featureList,$log){
		console.log('inside of modelController data');
		console.log(angular.toJson(feature));
		var dump  = angular.copy(featureList);
		$scope.feature = feature;
		
		$scope.cancel = function(){
			$modalInstance.close('cancel');
			featureList = angular.copy(dump);
		};
		
		$scope.save = function(){
			$log.debug('inside of save functiion');
			if(feature === ""){
				$scope.feature.product_info_id = featureList[0].product_info_id;
				$log.debug("fearure.product_info_id"+angular.toJson($scope.feature));
				featureList.push($scope.feature);
			}
			$modalInstance.close();
		};
	}]).controller('ruleModelController',['$modalInstance','rule','$scope','rulesList','$log' ,function($modalInstance,rule,$scope,rulesList,$log){
		console.log('inside of ruleModelController data');
		console.log(angular.toJson(rule));
		var dump  = angular.copy(rulesList);
		$scope.rule = rule;
		
		$scope.cancel = function(){
			$modalInstance.close('cancel');
			rulesList = angular.copy(dump);
		};
		
		$scope.save = function(){
			$log.debug('inside of save functiion');
			if(rule === ""){
				$scope.rule.product_info_id = rulesList[0].product_info_id;
				rulesList.push($scope.rule);
			}
			$modalInstance.close();
		};
	}])
	
})();