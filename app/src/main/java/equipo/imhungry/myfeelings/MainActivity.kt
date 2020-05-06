package equipo.imhungry.myfeelings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import equipo.imhungry.myfeelings.utilities.Emociones
import equipo.imhungry.myfeelings.utilities.JSONFile
import org.json.JSONArray

class MainActivity : AppCompatActivity() {

    var jsonFile: JSONFile? = null
    var veryHappy = 0.0F
    var happy = 0.0F
    var neutral = 0.0F
    var sad = 0.0F
    var data: Boolean = false
    var lista = ArrayList<Emociones>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun fetchingData(){}

    fun iconoMayoria(){}

    fun actualizarGrafica(){}

    fun parseJson (jsonArray: JSONArray): ArrayList<Emociones>{
        var lista = ArrayList<Emociones>()
        return lista
    }

    fun guardar(){}
}
