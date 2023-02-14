import products.*
class cheese(var mould:Boolean,title:String,weight:Int,FatContent:Int,manufacturer:String,price:Int)
    : DairyProduct(title,weight,FatContent,manufacturer,price){
    override fun ProductWeight() {
        println("'${title}' вес продукта = ${weight}")
        when{
            (mould==true)-> println("'${title}' имеет особый сорт с плесенью")
            (mould==false)-> println("'${title}' имеет обычный сорт сыра")
        }
    }

    override fun FatContentOfProduct() {
        when {
            (FatContent < 60) -> println("Продукт'${title}' имеет жирность = ${FatContent}%")
            else -> println("Такого молочного изделия нет")
        }
    }
    override fun ManufacturerOfproducts() {
        println("Продукт '${title}'-производитель:${manufacturer} Цена = ${price}")
    }
}
