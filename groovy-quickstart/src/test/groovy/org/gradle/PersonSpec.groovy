package org.gradle

import spock.lang.*

class PersonSpec extends Specification {
    def "Can construct a person"() {
        when:
            def p = new Person()
        then:
            p.name == 'Barry'
    }

    def "Can construct a person using name"() {
        when:
            def p = new Person(name: 'name')
        then:
            p.name == 'name'
    }

    def "Using correct version of Groovy"() {
        expect:
            GroovySystem.version == '2.0.5'
    }

    def "Test resources are available"() {
        expect:
            getClass().getResource('/testResource.txt') != null
	        getClass().getResource('/testScript.groovy') != null
    }
}
