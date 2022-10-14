package app.date.carol.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var foodList = arrayListOf("Chinese","Hamburger","Pizza","McDonalds","Panda")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var food : TextView = findViewById(R.id.food)
        var foodinput : EditText = findViewById(R.id.addFood)
        var buttonAdd : Button = findViewById(R.id.addFoodbtn)
        var decide: Button = findViewById(R.id.buttonDecide)

        decide.setOnClickListener {
            var random = java.util.Random()
            val randomFood = random.nextInt(foodList.count())
            food.text = foodList[randomFood]
        }

        buttonAdd.setOnClickListener {
            val newFood = foodinput.text.toString()
            foodList.add(newFood)
            foodinput.text.clear()
            println(foodList)
        }




    }
}