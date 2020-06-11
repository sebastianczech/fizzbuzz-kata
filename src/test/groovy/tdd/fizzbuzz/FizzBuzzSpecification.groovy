package tdd.fizzbuzz

import spock.lang.Specification

class FizzBuzzSpecification extends Specification {

    def "should return number when input is 1"() {
        given:
        def fizzBuzz = new FizzBuzz()

        when:
        def fizzBuzzResult = fizzBuzz.fizzBuzz(1);

        then:
        fizzBuzzResult == "1"
    }

    def "should return buzz is when input is dividable by 7"(int input, String output) {
        given:
        def fizzBuzz = new FizzBuzz()

        expect:
        output == fizzBuzz.fizzBuzz(input)

        where:
        input | output
        21    | "Buzz"
        14    | "Buzz"
        49    | "Buzz"
    }

}