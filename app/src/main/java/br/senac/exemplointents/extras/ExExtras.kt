package br.senac.exemplointents.extras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExExtrasBinding

class ExExtras : AppCompatActivity() {

    lateinit var binding: ActivityExExtrasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExExtrasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonIr.setOnClickListener {
            //aqui poderá ser tanto implicido quanto explicito.
            //usaremos explicito
            var intent = Intent(this, ExExtrasDetalhe::class.java)
            //colocar os parametros que serão pegos e serão mandados para outra atividade.

            intent.putExtra("nome", binding.editNome.text.toString())
            intent.putExtra("codigo", binding.editNumber.text.toString().toInt())
            startActivity(intent)
        }
    }
}