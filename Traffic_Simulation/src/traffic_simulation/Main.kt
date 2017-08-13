package traffic_simulation

import com.univocity.parsers.csv.*

public fun main(ars: Array<String>){
    scenario()
}

fun scenario(){
    val drivingCars
    for(Car in drivingCars){
        if(Car.isDriving == true){
            println("${Car.name} is driving.")
        }
        else{
            println("${Car.name} isn't driving.")
        }
    }
    for(Car in drivingCars) {
        if (Car.delay == true){
            println("${Car.name} has no delay")
    }
    else{ println("${Car.name} has a delay.")
    }

        val Car1 = Car("Opel", true)
        val Car2 = Car("BMW", false)
        val Car3 = Car("Saab", true)
        val Car4 = Car("Kia", true)
        val Car5 = Car("Opel", false)
        val Car6 = Car("Ford", true)
        val Car7 = Car("Volvo", true)
        val Car8 = Car("Skoda", true)
        val Car9 = Car("Tesla", false)
        val Car10 = Car("Audi", true)
        val Car11 = Car("Koenigsegg", true)
        val Car12 = Car("Mercedes", true)


}}