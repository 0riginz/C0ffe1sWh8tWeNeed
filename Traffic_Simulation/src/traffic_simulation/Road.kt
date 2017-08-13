package traffic_simulation

public class Road(var maxQuantity: Int) {
    fun amount(CarList: List<Car>): Int {
        var quantityCar = 0
        for (Car in CarList) {
            if (Car.isDriving == true) {
                quantityCar += 1
            } else {
                "This !$Car' isn't driving."
            }
        }
            return quantityCar
        }
    fun delay(CarList: List<Car>){
        val cars = CarList.size
        for (Car in CarList) {
            if (cars > maxQuantity) {
               return Car.delayed(true)
            } else{ Car.delayed(false)
        }
        }
    }
}




