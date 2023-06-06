/***
 * 콜백은 보통 단일 메소드로 이루어진 인터페이스를 사용한다. => 함수형 인터페이스
 */
interface CalculateOperator {
    fun process(source: Int, target: Int): Int
}
