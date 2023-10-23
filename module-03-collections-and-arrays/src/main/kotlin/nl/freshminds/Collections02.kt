package nl.freshminds

/**
 * Return true if all races are from a given season.
 */
fun checkAllRacesAreFromSeason(races: List<Race>, season: Int): Boolean =
    races.all { race: Race -> race.season == season }


/**
 * Return true if there is at least one driver with a given nationality.
 */
fun hasDriverWithNationality(drivers: List<Driver>, nationality: String): Boolean =
    drivers.any { driver: Driver -> nationality == driver.nationality }
