package com.example.weathersandbox.util

import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
fun Disposable.addDisposable(disposable: CompositeDisposable){
    disposable.add(this)
}