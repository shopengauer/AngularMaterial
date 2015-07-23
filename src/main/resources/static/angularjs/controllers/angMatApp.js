/**
 * Created by Василий on 12.07.2015.
 */


var mainModule = angular.module("AngMatApp",['ngMaterial']);

mainModule.controller("angMatCtrl",function($scope,$http){
    $scope.home = "hello";
});
