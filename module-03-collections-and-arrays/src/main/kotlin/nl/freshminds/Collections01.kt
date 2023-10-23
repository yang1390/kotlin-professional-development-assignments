package nl.freshminds

/**
 * Find the amount of races held in the 2023 season.
 */
fun amountOfRacesIn2023(races: List<Race>): Int =
    races.filter { race: Race -> race.date.year == 2023 }.size


/**
 * Return a set of all unique circuit names.
 */
fun circuitNames(races: List<Race>): Set<String> =
    races.map { race: Race -> race.circuit.circuitName }.toSet()

