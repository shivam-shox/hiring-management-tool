angular.module('app.controllers', []).controller('ShipwreckListController', function($scope, $state, popupService, $window, Hiring) {
  $scope.hiring = Hiring.query(); //fetch all shipwrecks. Issues a GET to /api/vi/shipwrecks

  $scope.deleteShipwreck = function(shipwreck) { // Delete a Shipwreck. Issues a DELETE to /api/v1/shipwrecks/:id
    if (popupService.showPopup('Really delete this?')) {
      shipwreck.$delete(function() {
        $scope.hiring = Hiring.query();
        $state.go('hiring');
      });
    }
  };
}).controller('ShipwreckViewController', function($scope, $stateParams, Hiring) {
  $scope.hiring = Hiring.get({ id: $stateParams.id }); //Get a single shipwreck.Issues a GET to /api/v1/shipwrecks/:id
}).controller('ShipwreckCreateController', function($scope, $state, $stateParams, Shipwreck) {
  $scope.hiring = new Hiring();  //create new shipwreck instance. Properties will be set via ng-model on UI

  $scope.addShipwreck = function() { //create a new shipwreck. Issues a POST to /api/v1/shipwrecks
    $scope.hiring.$save(function() {
      $state.go('hiring'); // on success go back to the list i.e. shipwrecks state.
    });
  };
}).controller('ShipwreckEditController', function($scope, $state, $stateParams, Hiring) {
  $scope.updateShipwreck = function() { //Update the edited shipwreck. Issues a PUT to /api/v1/shipwrecks/:id
    $scope.hiring.$update(function() {
      $state.go('hiring'); // on success go back to the list i.e. shipwrecks state.
    });
  };

  $scope.loadShipwreck = function() { //Issues a GET request to /api/v1/shipwrecks/:id to get a shipwreck to update
    $scope.hiring = Hiring.get({ id: $stateParams.id });
  };

  $scope.loadShipwreck(); // Load a shipwreck which can be edited on UI
});
