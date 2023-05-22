package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsInWoods = 3;
		int	raccoonsThatLeave = 2;
		int raccoonsLeftInWoods = raccoonsInWoods - raccoonsThatLeave;


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int numberOfLessBees = numberOfFlowers - numberOfBees;



        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int pigeonsEating = 1;
		int pigeonsComingToEat = 1;
		int  totalPigeonsEating = pigeonsEating + pigeonsComingToEat;


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsOnFence = 3;
		int owlsComingToFence = 2;
		int totalOwlsOnFence = owlsOnFence + owlsComingToFence;


        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorkingonHome = 2;
		int beaversGoingforSwim = 1;
		int beaverStillWorking = beaversWorkingonHome - beaversGoingforSwim;



        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansInTree = 2;
		int toucansComingIntoTree = 1;
		int totalToucansInTree = toucansInTree + toucansComingIntoTree;


        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTree = 4;
		int nutsInTree = 2;
		int squirrelsMoreThanNuts = squirrelsInTree - nutsInTree;


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quartersFound = .25;
		double dimesFound = .10;
		double nickelsFound = .10;
		double totalAmount = quartersFound + dimesFound + nickelsFound;



        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int muffinsBakedByBrierClass = 18;
		int muffinsBakedByMacAdamsClass = 20;
		int muffinsBakedByFlannerysClass = 17;
		int muffinsBakedByAllClasses = muffinsBakedByBrierClass + muffinsBakedByFlannerysClass + muffinsBakedByMacAdamsClass;

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double priceOfYoyo = .24;
		double priceOfWhistle = .14;
		double priceForAllToys = priceOfYoyo + priceOfWhistle;



        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallowsUsed = 8;
		int miniMarshmallowsUsed = 10;
		int totalMarshmallowsUsed = largeMarshmallowsUsed + miniMarshmallowsUsed;

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int inchesOfSnowAtHiltsHouse = 29;
		int inchesOfSnowAtSchool = 17;
		int inchesOfMoreSnowAtHiltsHouse = inchesOfSnowAtHiltsHouse - inchesOfSnowAtSchool;



        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2.50 on a pencil
        case. How much money does she have left?
        */
		double totalAmountOfMoney = 10.00;
		double costOfToyTruck = 3.00;
		double costOfPencilCase = 2.50;
		double moneyRemaining = totalAmountOfMoney - (costOfPencilCase + costOfToyTruck);


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int totalMarblesInCollection = 16;
		int marblesLost = 7;
		int remainingMarblesInCollection = totalMarblesInCollection - marblesLost;


        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int seashellCollectionAmount = 19;
		int seashellsDesiredInCollection = 25;
		int seashellsNeededForDesiredCollection = seashellsDesiredInCollection - seashellCollectionAmount;




        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalAmountOfBallons = 17;
		int redBallons = 8;
		int remainingBallonsThatAreGreen = totalAmountOfBallons - redBallons;



        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int booksAddedToShelf = 10;
		int totalBooksOnShelf = booksOnShelf + booksAddedToShelf;


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int amountOfLegsOnBee = 6;
		int amountOfBees = 8;
		int totalAmountOfBeeLegs = amountOfLegsOnBee * amountOfBees;


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double costOfIceCreamCone = .99;
		double amountOfIceCreamConesBought = 2;
		double costOfIceCreamCones = costOfIceCreamCone * amountOfIceCreamConesBought;

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int currentAmountOfRocks = 64;
		int totalAmountOfRocksNeeded = 125;
		int amountOfRocksNeeded = totalAmountOfRocksNeeded - currentAmountOfRocks;


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int totalAmountOfMarbles = 38;
		int marblesSheLost = 15;
		int remainingMarbles = totalAmountOfMarbles - marblesSheLost;


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalMilesToDrive = 78;
		int milesDriven = 32;
		int milesLeftToDrive = totalMilesToDrive - milesDriven;


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int timesSpentShovelingSnowSaturdayMorning = 90;
		int timeSpentShovelingSnowSaturdayAfternoon = 45;
		int totalTimeShovelingSnow = timeSpentShovelingSnowSaturdayAfternoon + timesSpentShovelingSnowSaturdayMorning;


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double hotdogsBought = 6;
		double costOfHotdog = .50;
		double costOfAllHotdogs = hotdogsBought * costOfHotdog;


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int totalMoney = 50;
		int costOfPencil = 7;
		int amountOfPencilsAbleToPurchase = totalMoney / costOfPencil;


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalAmountOfButterflies = 33;
		int amountOfOrangeButterflies =  20;
		int amountOfRedButterflies = totalAmountOfButterflies - amountOfOrangeButterflies;


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double amountOfMoneyGivenToClerk = 1.00;
		double costOfCandy = .54;
		double changeFromPurchase = amountOfMoneyGivenToClerk - costOfCandy;


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int treesInBackyard = 13;
		int treesPlanted = 12;
		int totalTreesInBackyard = treesInBackyard + treesPlanted;


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int amountOfDaysUntilSeeingGrandmother = 2;
		int amountOfHoursInADay = 24;
		int totalHoursUntilSeeingGrandmother = amountOfDaysUntilSeeingGrandmother * amountOfHoursInADay;

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int amountOfCousins = 4;
		int piecesOfGum = 5;
		int totalPiecesOfGumNeeded = amountOfCousins * piecesOfGum;


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double amountOfMoney = 3.00;
		double costOfCandyBar = 1.00;
		double changeFromPurchasingCandyBar = amountOfMoney - costOfCandyBar;


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int amountOfBoats = 5;
		int amountOfPeopleOnEachBoat = 3;
		int totalAmountOfPeopleOnBoats = amountOfBoats * amountOfPeopleOnEachBoat;


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int amountOfLegos = 380;
		int legosLost = 57;
		int remainingLegos = amountOfLegos - legosLost;


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinsBaked = 35;
		int totalMuffinsNeeded = 83;
		int amountOfMuffinsStillNeeded = totalMuffinsNeeded - muffinsBaked;


        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willysCrayons = 1400;
		int lucysCrayons = 290;
		int amountOfCrayonsMoreWillyHasThanLucy = willysCrayons - lucysCrayons;


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnAPage = 10;
		int amountOfPages = 22;
		int totalAmountOfStickers = stickersOnAPage * amountOfPages;


        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double totalCupcakes = 100;
		double amountOfChildren = 8;
		double totalCupcakesPerChild = totalCupcakes / amountOfChildren;


        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int totalGingerbreadCookies = 47;
		int cookiesInEachJar = 6;
		int cookiesLeftover = totalGingerbreadCookies % cookiesInEachJar;

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int totalCroissantsPrepared = 59;
		int numberOfNeighbors = 8;
		int croissantsLeftover = totalCroissantsPrepared % numberOfNeighbors;


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int totalOatmealCookies = 276;
		int amountOfCookieTrays = 12;
		int cookiesPerTray = totalOatmealCookies / amountOfCookieTrays;


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzelsMade = 480;
		int pretzelsPerServing = 12;
		int totalAmountOfServings = pretzelsMade / pretzelsPerServing;


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int totalLemonCakesBaked = 53;
		int lemonCakesLeftAtHome = 2;
		int lemonCakesPerBox = 3;
		int lemonCakesLeftover = totalLemonCakesBaked / lemonCakesPerBox;



        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotsPrepared = 74;
		int amountOfPeopleServed = 12;
		int numberOfCarrotsUneaten = carrotsPrepared % amountOfPeopleServed;


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalTeddyBears = 98;
		int teddyBearsPerShelf = 7;
		int shelvesFilledWithTeddyBears = totalTeddyBears / teddyBearsPerShelf;


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int picturesPerAlbum = 20;
		int totalPictures = 480;
		int amountOfAlbumsNeeded = totalPictures / picturesPerAlbum;


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int tradingCardTotal = 94;
		int cardsPerFullBox = 8;
		int cardsInUnfilledBoxes = tradingCardTotal % cardsPerFullBox;



        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int totalBooks = 210;
		int amountOfShelves = 10;
		int booksPerShelf = totalBooks / amountOfShelves;


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double croissantsBaked = 17;
		double amountOfGuests = 7;
		double amountPerGuests = croissantsBaked / amountOfGuests;


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates, 
	    and then divide the total number of rooms to be painted by the combined rate.
	    */
		double amountOfStandardRooms = 5;


     

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */



	}

}
