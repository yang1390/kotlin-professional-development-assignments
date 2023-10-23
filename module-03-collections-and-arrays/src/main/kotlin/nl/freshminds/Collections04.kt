package nl.freshminds

import kotlinx.datetime.LocalDate
import java.time.DayOfWeek

/**
 * Return a map from driver family name to the length of the family name.
 */
fun familyNameToNameLength(results: List<Result>): Map<String, Int> =
    results.map { result: Result -> result.driver.familyName }.associateWith { it.length }

/**
 * Return a map from date of birth to day of week.
 */
fun dayOfBirthToDayOfWeek(drivers: List<Driver>): Map<LocalDate, DayOfWeek> =
    drivers.map { driver: Driver -> driver.dateOfBirth }.associateWith { it.dayOfWeek }


/**
 * Return a map from constructor name to nationality.
 */
fun constructorNameToNationality(constructors: List<Constructor>): Map<String, String> =
    constructors.associate { it.name to it.nationality }
