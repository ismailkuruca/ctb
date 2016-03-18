'use strict';

angular.module('ctbApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


