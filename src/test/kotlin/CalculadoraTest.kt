import org.junit.Test
import kotlin.test.assertEquals

internal class CalculadoraTest {

    @Test
    fun `realizar suma`(){
        val calculadora = Calc2()
        val resultado = calculadora.calcular("2+3")
        assertEquals(5, resultado)
    }

    @Test
    fun `realizar suma multiple`(){
        val calculadora = Calc2()
        val resultado = calculadora.calcular("2+3+13+5")
        assertEquals(23, resultado)
    }

    @Test
    fun `realizar resta`(){
        val calculadora = Calc2()
        val resultado = calculadora.calcular("2-3")
        assertEquals(-1, resultado)
    }

    @Test
    fun `realizar resta multiple`(){
        val calculadora = Calc2()
        val resultado = calculadora.calcular("100-3-20")
        assertEquals(77, resultado)
    }

    @Test
    fun `realizar multiplicacion`(){
        val calculadora = Calc2()
        val resultado = calculadora.calcular("2*3")
        assertEquals(6, resultado)
    }

    @Test
    fun `realizar operacion combinada`(){
        val calculadora = Calc2()
        val resultado = calculadora.calcular("2+1*4")
        assertEquals(12, resultado)
    }

    @Test
    fun `realizar division entre cero`(){
        val calculadora = Calc2()
        val resultado = calculadora.calcular("2/0")
        assertEquals(12, resultado)
    }

    @Test
    fun `realizar mod de un numero`(){
        val calculadora = Calc2()
        val resultado = calculadora.calcular("1%3")
        assertEquals(12, resultado)
    }
}