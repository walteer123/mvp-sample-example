package br.com.w.testmvp.hello

class HelloPresenter(val view: HelloContract.View ): HelloContract.Presenter{

    override fun sayHello() {
        view.showHello("HELLO!")
    }
}

