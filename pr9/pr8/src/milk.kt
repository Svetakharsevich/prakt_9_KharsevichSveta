import products.*
class milk(var productions:String,var forproducts:Boolean,title:String,weight:Int,FatContent:Int,
           manufacturer:String,price:Int) : DairyProduct(title,weight,FatContent,manufacturer,price)
{
    override fun ProductWeight() {
        println("'${title}' объем продукта = ${weight} Цена = ${price}")
    }
    override fun FatContentOfProduct() {
        when{
            (productions=="Корова")-> println("Коровье молоко")
            (productions=="Коза")-> println("Козье молоко")
            (productions=="Кокос")-> println("Кокосовое молоко")
            else -> println("Такого молоко нет")
        }
        when {
            (FatContent < 60) -> println("Продукт'${title}' имеет жирность = ${FatContent}%")
            else -> println("Такого молочного изделия нет")
        }
    }
    override fun ManufacturerOfproducts() {
        when{
            (forproducts==true)-> println("Продукт '${title}' - пойдет для других продукций")
            (forproducts==false)-> println("Продукт '${title}' - не идет для других продукций")
        }
        println("Продукт '${title}'-производитель:${manufacturer} ")
    }
}

