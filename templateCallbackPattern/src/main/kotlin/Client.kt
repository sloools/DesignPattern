import callbacks.MinusOperator
import callbacks.PlusOperator

/***
 * Template Callback Pattern
 *
 * 전략패턴에 익명함수를 더해서 사용하는 방식
 * 객체지향에서 지양해야 하는 상속 대신 익명함수를 활용해서 전략 클래스를 구현한다.
 * 외부에서 어떤 전략을 사용하는지 감추고 중요한 부분에 집중할 수 있다.
 *
 *
 */

fun main(args: Array<String>) {
    /*구현체 사용 (= Stregate Pattern) */
    val result1 = CalculateProcessor().process(calculateOperator = PlusOperator())
    println("Result with PlusOperator : $result1")

    val result2 = CalculateProcessor().process(calculateOperator = MinusOperator())
    println("Result with PlusOperator : $result2")

    /* 익명함수 사용 (= Template Callback Pattern) */
    val lambda = object : CalculateOperator {
        override fun process(source: Int, target: Int) = source.times(target)
    }

    val result3 = CalculateProcessor().process(lambda)
    println("Result with Anonymous Function : $result3")
}
