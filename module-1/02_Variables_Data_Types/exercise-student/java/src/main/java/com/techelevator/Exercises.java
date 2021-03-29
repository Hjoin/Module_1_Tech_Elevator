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
		int numberOfRaccoons = 3;
		int raccoonsEatingDinner = 2;
		int raccoonsLeftInWoods = numberOfRaccoons - raccoonsEatingDinner;


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int totalFlowers = 5;
		int totalBees = 3;
		int beeFlowerDifference = totalFlowers - totalBees;


        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int pigeonEating = 1;
		int pigeonComingToEat = 1;
		int pigeonsEatingBreadcrumbs = pigeonEating + pigeonComingToEat;


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsSittingOnFence = 3;
		int owlsJoining = 2;
		int currentOwlsOnFence = owlsSittingOnFence + owlsJoining;


        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorking = 2;
		int beaversGoingSwimming = 1;
		int beaversLeftWorking = beaversWorking - beaversGoingSwimming;


        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSitting = 2;
		int toucansJoining = 1;
		int totalNumberOfToucans = toucansSitting + toucansJoining;


        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int totalSquirrels = 4;
		int totalAcorns = 2;
		int differenceOfSquirrelsAndAcorns = totalSquirrels - totalAcorns;


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quarters = .25;
		double dimes = .10;
		double nickels = .05;
		double totalMoney = quarters + dimes + (nickels * 2);


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int briersMuffins = 18;
		int macadamsMuffins = 20;
		int flannerysMuffins = 17;
		int totalMuffins = briersMuffins + macadamsMuffins + flannerysMuffins;


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyo = .24;
		double whistle = .14;
		double totalMoneySpent = yoyo + whistle;


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltsSnowfall = 29;
		int brecknocksSnowfall = 17;
		int snowfallDifference = hiltsSnowfall - brecknocksSnowfall;


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double hiltCash = 10.00;
		double toyTruck = 3.00;
		double pencilCase = 2.00;
		double moneyLeft = hiltCash - toyTruck - pencilCase;


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int joshMarbleCollection = 16;
		int marblesLost = 7;
		int remainingMarbles = joshMarbleCollection - marblesLost;


        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int meganSeashellCollection = 19;
		int desiredSeashellCollection = 25;
		int seashellsToBeCollected = desiredSeashellCollection - meganSeashellCollection;


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradBalloons = 17;
		int bradRedBalloons = 8;
		int bradGreenBalloons = bradBalloons - bradRedBalloons;


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnTheShelf = 38;
		int addedBooksToShelf = 10;
		int totalBooksOnShelf = booksOnTheShelf + addedBooksToShelf;


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int legsPerBee = 6;
		int totalAmountOfBees = 8;
		int totalAmountBeeLegs = legsPerBee * totalAmountOfBees;


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double iceCreamConeCost = 0.99;
		int iceCreamConesBought = 2;
		double totalIceCreamConeCost = iceCreamConeCost * iceCreamConesBought;


        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksNeededToCompleteBorder = 125;
		int currentRockSupply = 64;
		int rocksNeededToFinishBorder = rocksNeededToCompleteBorder - currentRockSupply;


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltlMarbleCollection = 38;
		int hiltMarblesLost = 15;
		int hiltMarblesRemaining = hiltlMarbleCollection - hiltMarblesLost;


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int concertMileTotal = 78;
		int milesDriven = 32;
		int milesLeftToDrive = concertMileTotal - milesDriven;


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int saturdayMorningShoveling = 90;
		int saturdayAfternoonShoveling = 45;
		int totalSaturdayShoveling = saturdayMorningShoveling + saturdayAfternoonShoveling;


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int hiltHotDogsBought = 6;
		double hotDogCost = .50;
		double totalHotDogCost = hiltHotDogsBought * hotDogCost;


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double hiltTotalCashForPencils = .50;
		double costPerIndividualPencil = .07;
		int pencilsThatCanBeBought = (int) (hiltTotalCashForPencils / costPerIndividualPencil);


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterfliesSeenByHilt = 33;
		int butterfliesThatWereOrange = 20;
		int butterfliesThatWereRed = butterfliesSeenByHilt - butterfliesThatWereOrange;


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double moneyGivenToClerk = 1.00;
		double storeCandyCost = .54;
		double kateChangeReceived = moneyGivenToClerk - storeCandyCost;


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int markTreesPlanted = 13;
		int additionalMarkTreesPlanted = 12;
		int totalMarkTrees = markTreesPlanted + additionalMarkTreesPlanted;


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysUntilSeeingGrandma = 2;
		int hoursInADay = 24;
		int hoursUntilSeeingGrandma = daysUntilSeeingGrandma * hoursInADay;


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimsTotalCousins = 4;
		int piecesOfGumPerCousin = 5;
		int totalPiecesOfGumNeeded = kimsTotalCousins * piecesOfGumPerCousin;


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double danStartingMoney = 3.00;
		double candyBarTotalCost = 1.00;
		double danMoneyLeftRemaining = danStartingMoney - candyBarTotalCost;


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsOnTheLake = 5;
		int peoplePerBoatOnLake = 3;
		int totalPeopleInBoatsOnLake = boatsOnTheLake * peoplePerBoatOnLake;


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellenTotalLegosToStart = 380;
		int ellenLostLegos = 57;
		int ellenRemainingLegos = ellenTotalLegosToStart - ellenLostLegos;


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int totalMuffinsNeededToBeBaked = 83;
		int muffinsAlreadyBakedByArthur = 35;
		int muffinsArthurStillNeedsToBake = totalMuffinsNeededToBeBaked - muffinsAlreadyBakedByArthur;


        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyTotalCrayonCollection = 1400;
		int lucyTotalCrayonCollection = 290;
		int differenceInCrayonCollection = willyTotalCrayonCollection - lucyTotalCrayonCollection;


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersPerPage = 10;
		int totalNumberOfPages = 22;
		int totalNumberOfStickers = stickersPerPage * totalNumberOfPages;


        /* Exercise 39
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double totalShareableCupcakes = 96;
		double totalChildrenToShare = 8;
		double cupcakesEvenlyDistributed = totalShareableCupcakes / totalChildrenToShare;



        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int gingerbreadCookiesMadeForDistribution = 47;
		int gingerbreadCookieJars = 6;
		int gingerbreadCookiesWithoutAJar = 47 % 6;


        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int totalCroissantsMade = 59;
		int totalNumberOfNeighborsToShareWith = 8;
		int croissantsLeftForMarian = totalCroissantsMade % totalNumberOfNeighborsToShareWith;


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int oatmealCookiesMadeInTotal = 276;
		int oatmealCookiesPerTray = 12;
		int oatmealCookieTrayTotal = oatmealCookiesMadeInTotal / oatmealCookiesPerTray;


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int marianMadeBiteSizedPretzels = 480;
		int biteSizedPretzelServing = 12;
		int totalBiteSizedPretzelServings = marianMadeBiteSizedPretzels / biteSizedPretzelServing;


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupcakesMadeForChildren = 53;
		int lemonCupcakesLeftAtHome = 2;
		int lemonCupcakesThreeServingBox = 3;
		int totalLemonCupcakesThreeServingsGiven = (lemonCupcakesMadeForChildren- lemonCupcakesLeftAtHome) / lemonCupcakesThreeServingBox;


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotsPrepared = 74;
		int peopleSharingCarrots = 12;
		int carrotsLeftUneaten = carrotsPrepared % peopleSharingCarrots;


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalTeddyBearsGathered = 98;
		int teddyBearsPerShelf = 7;
		int filledTeddyBearShelves = totalTeddyBearsGathered / teddyBearsPerShelf;


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int picturesPerAlbum = 20;
		int totalPicturesForAlbum = 480;
		int totalAlbumsNeeded = totalPicturesForAlbum / picturesPerAlbum;


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int tradingCardsCollected = 94;
		int tradingCardsPerBox = 8;
		int tradingCardBoxesFilled = tradingCardsCollected / tradingCardsPerBox;
		int tradingCardsInUnfilledBox = tradingCardsCollected % tradingCardsPerBox;


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int booksToBeDistributedByFather = 210;
		int shelvesToReceiveBooks = 10;
		int booksPerShelf = booksToBeDistributedByFather / shelvesToReceiveBooks;


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double cristinaCroissantsBaked = 17;
		double cristinaGuests = 7;
		double croissantsLeftForEachGuest = cristinaCroissantsBaked / cristinaGuests;


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
		double billHourlyRate = 1/2.15;
		double jillHourlyRate = 1/1.90;
		double roomsToBePainted = 5;
		double totalTimeToPaintRooms = roomsToBePainted / (billHourlyRate+jillHourlyRate);




	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String middleInitial = "B";
		String lastName = "Hopper";
		String fullName = lastName + ", " + firstName + " " + middleInitial + ".";


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double distanceBetweenCities = 800;
		double distanceAlreadyTraveled = 537;
		double distanceCompletedPercentageWise = distanceAlreadyTraveled / distanceBetweenCities;
		int distancePercentageWholeNumber = (int) (distanceCompletedPercentageWise * 100);

	}

}
