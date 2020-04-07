package com.example.tictac

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    public fun buClick(view:View){
        val buSelected = view as Button
        var cellId = 0

        when(buSelected.id){
            R.id.bt1 ->cellId =1
            R.id.bt2 ->cellId =2
            R.id.bt3 ->cellId =3
            R.id.bt4 ->cellId =4
            R.id.bt5 ->cellId =5
            R.id.bt6 ->cellId =6
            R.id.bt7 ->cellId =7
            R.id.bt8 ->cellId =8
            R.id.bt9 ->cellId =9
        }
       // Toast.makeText(this,"ID:"+cellId,Toast.LENGTH_SHORT).show()
        playGame(cellId,buSelected)
    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activePlayer = 1


    fun playGame(cellId:Int, buSelected:Button){

        if(activePlayer == 1){
            buSelected.text = "X"
            buSelected.setBackgroundColor(Color.RED)
            player1.add(cellId)
            activePlayer = 2
        }
        else{
            buSelected.text = "0"
            buSelected.setBackgroundColor(Color.GREEN)
            player2.add(cellId)
            activePlayer = 1
        }


        buSelected.isEnabled = false
        checkWinner()
    }
    var winner = -1
    fun checkWinner(){


        //row1
        if(player1.contains(1) && player1.contains(2) && player1.contains(3)){
            winner = 1
        }
        if(player2.contains(1) && player2.contains(2) && player2.contains(3)){
            winner = 2
        }

        //row2
        if(player1.contains(4) && player1.contains(5) && player1.contains(6)){
            winner = 1
        }
        if(player2.contains(4) && player2.contains(5) && player2.contains(6)){
            winner = 2
        }


        //row3
        if(player1.contains(7) && player1.contains(8) && player1.contains(9)){
            winner = 1
        }
        if(player2.contains(7) && player2.contains(8) && player2.contains(9)){
            winner = 2
        }


        //col1
        if(player1.contains(1) && player1.contains(4) && player1.contains(7)){
            winner = 1
        }
        if(player2.contains(1) && player2.contains(4) && player2.contains(7)){
            winner = 2
        }

        //col2
        if(player1.contains(2) && player1.contains(5) && player1.contains(8)){
            winner = 1
        }
        if(player2.contains(2) && player2.contains(5) && player2.contains(8)){
            winner = 2
        }


        //col3
        if(player1.contains(3) && player1.contains(6) && player1.contains(9)){
            winner = 1
        }
        if(player2.contains(3) && player2.contains(6) && player2.contains(9)){
            winner = 2
        }

        //cross 1

        if(player1.contains(1) && player1.contains(5) && player1.contains(9)){
            winner = 1
        }
        if(player2.contains(1) && player2.contains(5) && player2.contains(9)){
            winner = 2
        }

        //cross2

        if(player1.contains(3) && player1.contains(5) && player1.contains(7)){
            winner = 1
        }
        if(player2.contains(3) && player2.contains(5) && player2.contains(7)){
            winner = 2
        }

        if(winner != -1){
            if (winner == 1){
                Toast.makeText(this,"Player 1 Wins",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Player 2 Wins",Toast.LENGTH_SHORT).show()
            }

        }

    }

    fun resetAll(view: View){
        var buSelected = view as Button
        bt1.text = ""
        bt1.setBackgroundColor(Color.LTGRAY)
        bt2.text = ""
        bt2.setBackgroundColor(Color.LTGRAY)
        bt3.text = ""
        bt3.setBackgroundColor(Color.LTGRAY)
        bt4.text = ""
        bt4.setBackgroundColor(Color.LTGRAY)
        bt5.text = ""
        bt5.setBackgroundColor(Color.LTGRAY)
        bt6.text = ""
        bt6.setBackgroundColor(Color.LTGRAY)
        bt7.text = ""
        bt7.setBackgroundColor(Color.LTGRAY)
        bt8.text = ""
        bt8.setBackgroundColor(Color.LTGRAY)
        bt9.text = ""
        bt9.setBackgroundColor(Color.LTGRAY)

        bt1.isEnabled = true
        bt2.isEnabled = true
        bt3.isEnabled = true
        bt4.isEnabled = true
        bt5.isEnabled = true
        bt6.isEnabled = true
        bt7.isEnabled = true
        bt8.isEnabled = true
        bt9.isEnabled = true


        player1.removeAll(player1)
        player2.removeAll(player2)

        winner = -1
        activePlayer = 1

            Toast.makeText(this,"Reset",Toast.LENGTH_SHORT).show()
    }
}
