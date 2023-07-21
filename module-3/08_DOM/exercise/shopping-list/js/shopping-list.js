// add pageTitle
  const pageTitle = 'My Shopping List';
 
// add groceries
  let groceries = ['ginger', 'lemon', 'cucumbers', 'water', 'green tea', 'honey', 'cinnamon', 'oats', 'vanilla', 'apple']; 
/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('title');
    pageTitle.innerText = 'My Shopping List';
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  groceriesArray = document.getElementById('groceries')
  for (let i = 0; i < groceries.length; i++){
    let groceryList = document.createElement('li');
    groceryList.innerText = groceries[i];
    groceriesArray.appendChild(groceryList);
  }
      
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  groceryItems = document.querySelectorAll('#groceries > li');
    groceryItems.forEach((i) => {
      i.classList.add('completed');
    });

}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
