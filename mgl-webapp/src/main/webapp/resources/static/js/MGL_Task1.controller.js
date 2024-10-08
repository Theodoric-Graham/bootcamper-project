'use strict';

angular.module('MGL_Task1_app').controller('GameController',
		[ 'GameService', function(GameService) {
			var self = this;
			self.game = {
				game_id : '',
				game_name : '',
				game_genre : ''
			};
			self.games = [];

			self.fetchAllGames = function(){
				GameService.fetchAllGames().then(function(data) {
					self.games = data;
				});
			}

			self.addGame = function(){
				return MGL_Task1_Service.createGame(self.game).then( function() {
				self.fetchAllGames();
				});
			}

			self.fetchAllGames();
		} ]);
