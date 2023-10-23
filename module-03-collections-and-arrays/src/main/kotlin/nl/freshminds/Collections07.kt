package nl.freshminds

/**
 * Return the average lap number in which a driver set their fastest lap of the race.
 */
fun averageLapInWhichADriverSetTheirFastestLap(race: Race): Double =
    race.results.sumOf { it.fastestLap?.lap ?: 0 } / race.results.size.toDouble()


/**
 * Return the driver with the shortest given name for a specified nationality, or null if no drivers from such
 * nationality exist.
 */
fun driverWithShortestGivenName(nationality: String, drivers: List<Driver>): String? =
    drivers.filter { driver: Driver -> driver.nationality == nationality }.minByOrNull { driver: Driver -> driver.givenName.length }?.givenName

