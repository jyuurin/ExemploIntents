package br.senac.exemplointents.sistema

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityNavegadorBinding

class NavegadorActivity : AppCompatActivity() {

    lateinit var binding: ActivityNavegadorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavegadorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAbrir.setOnClickListener {
            val endereco = Uri.parse("https://www.sp.senac.br/")
            val intent = Intent(Intent.ACTION_VIEW, endereco)

            startActivity(intent)


        }
    }
}