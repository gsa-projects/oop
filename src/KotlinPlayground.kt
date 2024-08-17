import kotlin.reflect.full.primaryConstructor
import java.util.concurrent.ConcurrentHashMap
import java.util.function.Function

// TooltipData 인터페이스 정의
interface TooltipData

// TooltipComponent 인터페이스 정의
interface TooltipComponent

// AbstractTooltipComponent 클래스 정의
abstract class AbstractTooltipComponent(
    val data: TooltipData,
    val screen: Screen? = null
) : TooltipComponent {

    init {
        registerComponent()
    }

    private fun registerComponent() {
        TooltipComponentFactory.register(data::class.java) { this::class.primaryConstructor!!.call(data, screen) }
    }

    fun setScreen(screen: Screen): AbstractTooltipComponent {
        return this::class.primaryConstructor!!.call(data, screen)
    }
}

// Screen 클래스(예제용)
class Screen

// TooltipComponentFactory 객체 정의
object TooltipComponentFactory {
    private val componentMap: MutableMap<Class<out TooltipData>, Function<out TooltipData, out TooltipComponent>> = ConcurrentHashMap()

    fun <T : TooltipData> create(data: T): TooltipComponent {
        val function = componentMap[data::class.java] as? Function<T, out TooltipComponent>
        return function?.apply(data)
            ?: throw IllegalArgumentException("Unknown TooltipComponent from TooltipComponentFactory")
    }

    fun <T : TooltipData> register(clazz: Class<T>, creator: Function<T, TooltipComponent>) {
        componentMap[clazz] = creator
    }
}

// 하위 클래스 정의 (예: ArmorTooltipComponent)
class ArmorTooltipData : TooltipData
class ArmorTooltipComponent(data: ArmorTooltipData, screen: Screen? = null) : AbstractTooltipComponent(data, screen)

// 하위 클래스 정의 (예: DefaultToolTooltipComponent)
class DefaultToolTooltipData : TooltipData
class DefaultToolTooltipComponent(data: DefaultToolTooltipData, screen: Screen? = null) : AbstractTooltipComponent(data, screen)

// 테스트 코드
fun main() {
    // ArmorTooltipComponent 생성 및 테스트
    val armorData = ArmorTooltipData()
    val armorComponent = TooltipComponentFactory.create(armorData)
    println(armorComponent) // ArmorTooltipComponent 인스턴스 출력

    // DefaultToolTooltipComponent 생성 및 테스트
    val toolData = DefaultToolTooltipData()
    val toolComponent = TooltipComponentFactory.create(toolData)
    println(toolComponent) // DefaultToolTooltipComponent 인스턴스 출력
}
