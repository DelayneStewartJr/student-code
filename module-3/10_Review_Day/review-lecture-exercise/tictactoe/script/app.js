// Add code here

const player1 = {name : 'Player 1 ', classname: 'p1'};
const player2 = {name : 'Player 2 ', classname: 'p2'};

// Winning Sets
const row1 = [1, 2, 3];
const row2 = [4, 5, 6];
const row3 = [7, 8, 9];
const col1 = [1, 4, 7];
const col2 = [2, 5, 8];
const col3 = [3, 6, 9];
const dia1 = [1, 5, 9];
const dia2 = [3, 5, 7];

const scoringSets = [row1, row2, row3, col1, col2, col3, dia1, dia2];

let currentPlayer = player1;

let gameOver = false; 

// DOMContentCheck

// add event listener to game-board ; click ; event.target -- pass to circleCheck function hint...contains, add
// add circleClick function
// gameScore function check to see if player has won; check scoringSets, last player to place marble check to see if they won, false, game continues