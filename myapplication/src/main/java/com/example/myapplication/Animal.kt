package com.example.myapplication

class Animal{
    var name:String?=null
    var desc:String?=null
    var image:Int?=null
    var isKiler:Boolean?=false

    constructor(name: String?, desc: String?, image: Int?,isKiler:Boolean) {
        this.name = name
        this.desc = desc
        this.image = image
        this.isKiler=isKiler
    }
}