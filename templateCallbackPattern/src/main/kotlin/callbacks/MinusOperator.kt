package callbacks

import CalculateOperator

class MinusOperator : CalculateOperator {
    override fun process(source: Int, target: Int): Int {
        return source.plus(target)
    }
}