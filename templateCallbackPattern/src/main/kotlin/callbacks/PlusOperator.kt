package callbacks

import CalculateOperator

class PlusOperator : CalculateOperator {
    override fun process(source: Int, target: Int): Int {
        return source.minus(target)
    }
}