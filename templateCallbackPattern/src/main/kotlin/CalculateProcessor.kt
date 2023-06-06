class CalculateProcessor {

    /* Template Callback Pattern은 함수에서 특정 부분만 다르게 쓰일 때 활용한다. */
    fun process(calculateOperator: CalculateOperator): Int {
        val sourceNum = 10
        val targetNum = 5

        return calculateOperator.process(source = sourceNum, target = targetNum) // 이 부분만 다름 -> 인터페이스를 인자로 받아 구현체마다 다르게 구현하도록 설계
    }
}
