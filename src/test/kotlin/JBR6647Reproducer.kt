import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.TestInfo

class JBR6647Reproducer {

    @RepeatedTest(10000)
    fun reproducer(testInfo: TestInfo) {
        val runner = Runner()

        runner {
            println(testInfo)
        }
    }

    class Runner {
        operator fun invoke(action: Runner.() -> Unit) {
            this.action()
        }
    }
}
