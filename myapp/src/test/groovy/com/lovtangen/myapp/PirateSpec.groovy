package com.lovtangen.myapp

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class PirateSpec extends Specification {

    def "likeAPirate method should work as instance method on a String value"() {
        given:
        final String originalText = "Hi, Groovy is the greatest language of the JVM."

        expect:
        originalText.likeAPirate() == "Yo-ho-ho, Groovy be th' greatest language o' th' JVM."
    }
}