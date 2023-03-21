package br.senac.exemplointents.explicito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exemplointents.R
import br.senac.exemplointents.databinding.ActivityExExplicitoBinding


class ExExplicito : AppCompatActivity() {

    //incializa a variavel depois para não ter risco de retornar nulo. pode usar o ? mas com cuidado pois ele pode retornar nulo.
    //o tipo é o nome do arquivo xml em formato de ClasseBinding
    lateinit var binding: ActivityExExplicitoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inflar = pega xml e transforma em tela
        //inicializando a variavel binding para inflar o layout
        binding = ActivityExExplicitoBinding.inflate(layoutInflater)
        //define o binding e faz ele aparecer sem conflitar com outra tela. root é a tela toda carregada.
        setContentView(binding.root)

        //clousure = função prontas de ação
        binding.buttonIr.setOnClickListener {
            //intents declara um e depois executa. instanciar um intent so está sendo declarado
            val intent = Intent(this, ExExplicitoDetalhe::class.java) // intent classe externa que precisa ser importada
            //explicito é direto 2 parametros, contexto e a arquivo da classe da atividade pra onde vai.
            startActivity(intent) // função executa o que tá dentro.
        }
    }
}

//Intents explicitos: sabe qual atividade quer abrir. usados para abrir tela da propria aplicação
//trabalhando binding automatico < ativar!



//Atividade detalhe = aticvidade aberta de outra atividade.
//Launcher activity = atividade que faz parte da tela incial do android. sao atividades principais.
//para isso se usa intents.

//android manifest = configuração de aplicação.quando marca o launcher o android studio cria um intent-filter no android manifest, e aparece no launcher.