package com.imagina.examples.ddd.services;

import com.imagina.examples.ddd.services.model.Country;
import com.imagina.examples.ddd.services.model.Person;

public class LifeExpectancyCalculator {

  public double calculateLifeExpectancy(Person person, Country country) {
    double healthFactor = person.healthFactor();
    double yearsOfAge = person.getYearsOfAge();
    double countryLifeExpectancyYears = country.getLifeExpectancyYears();
    double countryHaq = country.getHealthQualityIndexVal();

    double lifeExpectancy = countryLifeExpectancyYears * healthFactor * countryHaq;
    return Math.max(yearsOfAge, lifeExpectancy);
  }
}
