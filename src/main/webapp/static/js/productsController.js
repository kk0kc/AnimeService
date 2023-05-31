var app = angular.module('ShoppingApp', []);

app.controller('AnimeController', function ($http) {

    var me = this;

    me.mvAnime = [];
    me.mpAnime = [];

    me.fetchAnime = function () {


        $http.get('/onlineshopping/json/data/mv/anime')
            .then(function (response) {
                me.mvAnime = response.data;
            });


        $http.get('/onlineshopping/json/data/mp/anime')
            .then(function (response) {
                me.mpAnime = response.data;
            });

    }

});