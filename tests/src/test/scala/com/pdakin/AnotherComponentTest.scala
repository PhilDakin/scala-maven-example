import com.pdakin.lib.AnotherComponent
import org.scalatest.funsuite.AnyFunSuite

class AnotherComponentTest extends AnyFunSuite {
    test("AnotherComponentTest")
    {
        val component = new AnotherComponent()
        assert(component != null)
    }
}