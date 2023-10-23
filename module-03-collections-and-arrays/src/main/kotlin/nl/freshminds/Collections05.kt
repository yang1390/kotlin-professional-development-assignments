package nl.freshminds

/**
 * Return a map from nationality to constructor names. Each constructor can only be in the list once.
 */
fun groupConstructorsByNationality(results: List<Result>): Map<String, List<String>> =
    results.map { result: Result -> result.constructor }
        .distinct().groupBy { it.nationality }
        .mapValues { it.value.map { constructor -> constructor.name }
        }

/**
 * Return a pair where [first] contains a list of all results with the 'Finished' status, and [second]
 * contains all other results.
 */
fun partitionByStatus(results: List<Result>): Pair<List<Result>, List<Result>> =
    results.partition { result: Result -> result.status == "Finished" }


