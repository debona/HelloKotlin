package fr.debona.hellothere.models

import java.util.ArrayList

public class Place {

    var name: String? = null
    var latitude: Double? = null
    var longitude: Double? = null
    var radius: Double? = null

    var messages = ArrayList<String>()

    class object {
        fun all(): ArrayList<Place> {
            val descriptions = arrayListOf(
                    hashMapOf(
                            "name" to "Nice, France",
                            "latitude" to 43.7048037,
                            "longitude" to 7.2534179,
                            "radius" to 5.0
                    ),
                    hashMap(
                            "name" to "Paris, France",
                            "latitude" to 48.8588589,
                            "longitude" to 2.3470599,
                            "radius" to 10.0
                    ),
                    hashMap(
                            "name" to "London, United Kingdom",
                            "latitude" to 51.5286416,
                            "longitude" to -0.1015987,
                            "radius" to 10.0
                    ),
                    hashMap(
                            "name" to "Dublin, Ireland",
                            "latitude" to 53.3243201,
                            "longitude" to -6.251695,
                            "radius" to 5.0
                    ),
                    hashMap(
                            "name" to "Geneva, Switzerland",
                            "latitude" to 46.204705,
                            "longitude" to 6.1431301,
                            "radius" to 3.0
                    ),
                    hashMap(
                            "name" to "Berlin, Germany",
                            "latitude" to 52.5075419,
                            "longitude" to 13.4261419,
                            "radius" to 10.0
                    ),
                    hashMap(
                            "name" to "Amsterdam, The Netherlands",
                            "latitude" to 52.3747157,
                            "longitude" to 4.8986167,
                            "radius" to 4.0
                    ),
                    hashMap(
                            "name" to "Stockholm, Sweden",
                            "latitude" to 59.3261419,
                            "longitude" to 17.9875456,
                            "radius" to 5.0
                    )
            )
            val places = ArrayList<Place>()

            for (description in descriptions) {
                val place = Place()

                place.name = description["name"] as String?
                place.latitude = description["latitude"] as Double?
                place.longitude = description["longitude"] as Double?
                place.radius = description["radius"] as Double?

                places.add(place)
            }

            return places
        }
    }

}
