package nl.freshminds

/**
 * Return the total amount of points awarded in this race.
 */
fun totalAmountOfPoints(race: Race): Int =
    race.results.sumOf { result: Result -> result.points }

/**
 * Return the full names (givenName + familyName) of the top 3 drivers from this race.
 */
fun top3Drivers(race: Race): List<String> =
    race.results.sortedByDescending { result: Result -> result.points }.subList(0, 3)
        .map { result: Result -> "${result.driver.givenName} ${result.driver.familyName}" }


/**
 * Return the total amount of points scored by a given driver.
 */
fun totalPointsForDriver(familyName: String, races: List<Race>): Int =
    races.flatMap { race: Race -> race.results }
        .filter { result: Result -> result.driver.familyName == familyName }
        .sumOf { it.points }

