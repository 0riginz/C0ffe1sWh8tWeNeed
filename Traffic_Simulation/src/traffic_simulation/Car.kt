package traffic_simulation

public class Car (var name: String, var isDriving: Boolean){

    var delay: Boolean = false
    fun delayed(delay: Boolean){
        this.delay = delay
    }
    override fun toString(): String {
        return "Car(name='$name', isDrivig=$'isDriving', delay=$'delay')"
    }



}
