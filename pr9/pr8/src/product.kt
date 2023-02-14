package products
open class DairyProduct(_title:String,_weight:Int,_FatContent:Int,_manufacturer:String,_price:Int)
{
    var title:String=_title
    var weight:Int=_weight
    var FatContent:Int=_FatContent
    var  manufacturer:String=_manufacturer
    var price:Int=_price
    open fun ProductWeight(){
        println("'${title}' вес продукта = ${weight} Цена = ${price} ")
    }
    open fun FatContentOfProduct(){
        when {
            (FatContent < 40) -> println("Продукт'${title}' имеет жирность = ${FatContent}%")
            else -> println("Такого молочного изделия нет")
        }
    }
    open fun ManufacturerOfproducts(){
        println("Продукт '${title}'-производитель:${manufacturer}")
    }
}

