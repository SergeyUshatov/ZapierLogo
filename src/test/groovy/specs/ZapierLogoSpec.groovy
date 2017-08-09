package specs

import geb.spock.GebReportingSpec
import pages.ZapierPage

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.is

class ZapierLogoSpec extends GebReportingSpec{

    def setup(){
        to ZapierPage
    }

    def "I check Zapier logo"(){
        expect:
            at ZapierPage
            assertThat(zapierLogo.displayed, is(true))
    }
}
