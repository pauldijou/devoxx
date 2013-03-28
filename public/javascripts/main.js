var app = angular.module("app", ["ngResource"])
  .constant('apiUrl', '/api/v1')
  .constant("Events", {
    CONFERENCE_ADDED: "conferenceAdded"
  })
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: '/views/index',
        controller: 'IndexCtrl'
      })
      .otherwise({
        redirectTo: '/'
      })
  }])
  .config(['$locationProvider', function ($locationProvider) {
    $locationProvider.html5Mode(true)
  }]);

app.controller("AppCtrl", ["$scope", "Events", "Conferences", function ($scope, Events, Conferences) {

  $scope.addConfForm = {
    name: "",
    speaker: ""
  };

  $scope.addConference = function () {
    Conferences.save($scope.addConfForm, function () {
      $("#modalAddConference").modal("hide");
      $scope.$broadcast(Events.CONFERENCE_ADDED);
    });
  };

  $scope.resetConference = function () {
    $scope.addConfForm = {
      name: "",
      speaker: ""
    };
  };

}]);

app.controller("IndexCtrl", ["$scope", "Events", "Conferences", function ($scope, Events, Conferences) {
  $scope.data = {
    conferences: []
  };

  updateConferences();

  $scope.$on(Events.CONFERENCE_ADDED, function (event, conf) {
    updateConferences();
  });

  $scope.up = function (id) {
    Conferences.up({"id": id}, {}, function () {
      updateConferences();
    });
  };

  $scope.down = function (id) {
    Conferences.down({"id": id}, {}, function () {
      updateConferences();
    });
  };

  function updateConferences() {
    Conferences.query({}, function (confs) {
    $scope.data.conferences = confs;
  });
  };
}]);

app.factory("Conferences", ["$resource", "apiUrl", function ($resource, apiUrl) {
  return $resource(apiUrl + "/conferences/:id/:action",
    {},
    {
      "up": {"method": "PUT", "params": {"action": "up"}, "isArray": false},
      "down": {"method": "PUT", "params": {"action": "down"}, "isArray": false}
    });
}]);