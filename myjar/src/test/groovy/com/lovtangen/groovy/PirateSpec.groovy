package com.lovtangen.groovy
 
import spock.lang.Specification

class PirateSpec extends Specification {

    def "likeAPirate method should work as instance method on a String value"() {
        given:
        final String originalText = "Hi, Groovy is the greatest language of the JVM."

        expect:
        originalText.likeAPirate() == "Yo-ho-ho, Groovy be th' greatest language o' th' JVM."
    }
 
    def "likeAPirate method should work when invoked as static method"() {
        given:
        final String originalText = "Hi, Groovy is the greatest language of the JVM."

        expect:
        PirateExtension.likeAPirate(originalText) == "Yo-ho-ho, Groovy be th' greatest language o' th' JVM."
    }

}