package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception


class Person
{
    var yas : Int = 0
    get () = field

    set(v)
    {
        if(v>0) field = v
        else
        {
            var hata =IllegalArgumentException();
            throw hata
            /*
            bu hata sistemde yok kendim oluşturdum. girilen değer sıfırdan küçük olunca hata fırlatıyor.
             */
        }
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        try
        {
            var pp = Person()
            pp.yas=0
        }
        catch (e: Exception)
        {
            println(e)
        }
        finally {
            println("Hata olsun ya da olmasın finally bloğu çalıştırılır")
        }






    }
}