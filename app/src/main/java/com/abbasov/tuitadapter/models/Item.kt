package com.abbasov.tuitadapter.models

class Item {
    var image=0
    var name=""

    constructor(image: Int, name: String) {
        this.image = image
        this.name = name
    }

    override fun toString(): String {
        return "Item(image=$image, name='$name')"
    }

}