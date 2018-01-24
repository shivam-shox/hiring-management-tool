angular.module('app.services', []).factory('Hiring', function($resource) {
  return $resource('/api/v1/hiring/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});
