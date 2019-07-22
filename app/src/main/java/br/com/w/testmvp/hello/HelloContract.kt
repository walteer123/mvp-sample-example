package br.com.w.testmvp.hello

import br.com.w.testmvp.BaseView

interface HelloContract {

    interface  View: BaseView {

        fun showHello( message:String )

    }

    interface Presenter {

        fun sayHello()

    }

}