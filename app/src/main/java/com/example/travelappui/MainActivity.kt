package com.example.travelappui
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var currentImage=0
    lateinit var image:ImageView
    var places= arrayOf("TajMahal","Charminar","Indian Gate","RedFort","Prakasam Barrage")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val next=findViewById<ImageButton>(R.id.btnNext)
        val prev=findViewById<ImageButton>(R.id.btnPrev)
        var placeName=findViewById<TextView>(R.id.tvName)

        next.setOnClickListener{
//i want to get next image
        var idcurrentImageString= "pic$currentImage"
        //i have to get integer adress assoisiated each design component
       var idcurrentImageInt=this.resources.getIdentifier(idcurrentImageString,"id",packageName)
            image=findViewById(idcurrentImageInt)
            image.alpha=0f

            currentImage=(5+currentImage+1)%5
            var idImageToShowString="pic$currentImage"
            var idImageToShowInt=this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idImageToShowInt)
            image.alpha=1f

         placeName.text=places[currentImage]


        }

        prev.setOnClickListener {
            // i want to see previous imagee
            var idcurrentImageString= "pic$currentImage"
            //i have to get integer adress assoisiated each design component
            var idcurrentImageInt=this.resources.getIdentifier(idcurrentImageString,"id",packageName)
            image=findViewById(idcurrentImageInt)
            image.alpha=0f

            currentImage=(5+currentImage-1)%5
            var idImageToShowString="pic$currentImage"
            var idImageToShowInt=this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idImageToShowInt)
            image.alpha=1f
   placeName.text=places[currentImage]


        }


    }
}