package br.com.w.testmvp.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.w.testmvp.R

class MainActivity : AppCompatActivity(), HelloContract.View{

    lateinit var presenter: HelloPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = HelloPresenter(this@MainActivity)
        init()
    }

    override fun showHello(message: String) {
        Toast.makeText(this@MainActivity, message, Toast.LENGTH_LONG).show()
    }

    override fun init() {
        presenter.sayHello()
    }
}
