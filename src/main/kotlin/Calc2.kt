class Calc2 {

    fun calcular(input: String): Int {
        var firstValue = ""
        var secondValue = ""
        var operator = ""
        input.toCharArray().forEach {
            when(it) {
                '+', '-', '*', '/' -> {
                    if(canOperate(firstValue, operator, secondValue)) {
                        firstValue = eval(firstValue, operator, secondValue).toString()
                        secondValue = ""
                    }
                    operator = it.toString()
                }
                else -> {
                    if(operator.isEmpty()) {
                        firstValue += it.toString()
                    } else {
                        secondValue += it.toString()
                    }
                }
            }
        }
        return eval(firstValue, operator, secondValue)
    }

    private fun canOperate(firstValue: String, operator: String, secondValue: String):Boolean {
        return firstValue.isNotEmpty() && operator.isNotEmpty() && secondValue.isNotEmpty()
    }

    private fun eval(first: String, operator: String, second: String) :Int {
        return when(operator) {
            "+" -> first.toInt() + second.toInt()
            "-" -> first.toInt() - second.toInt()
            "*" -> first.toInt() * second.toInt()
            "/" -> first.toInt() / second.toInt()
            else -> throw Exception("Operation not supported")
        }
    }
}