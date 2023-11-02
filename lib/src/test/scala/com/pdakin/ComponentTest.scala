import com.pdakin.lib.Component
import org.scalatest.funsuite.AnyFunSuite

class ComponentTest extends AnyFunSuite {
    test("Component")
    {
        val component = new Component()
        assert(component != null)
    }
}