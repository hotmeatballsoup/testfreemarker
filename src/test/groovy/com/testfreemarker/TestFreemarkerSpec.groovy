package com.testfreemarker

import spock.lang.Specification

/**
 * Test spec for the main entry point.
 */
class TestFreemarkerSpec extends Specification {
	def "change me"() {
		expect:
		name.size() == length

		where:
		name	| length
		'Spock' | 5
	}
}
