package com.radialserial.prova

class Drink(
    val name: String,
    val description: String,
    val imageId: Int
) {
    companion object {
        fun getDrinks(): List<Drink> {
            return listOf(
                Drink(
                    "Espresso",
                    "Um café forte e concentrado feito ao forçar agua quente através de café moído fino. Base de várias outras bebidas de café.",
                    R.drawable.expresso
                ),
                Drink(
                    "Cappuccino",
                    "Combina espresso com partes iguais de leite vaporizado e espuma de leite. Famoso pelo equilibrio entre sabores ricos e textura cremosa.",
                    R.drawable.cappucino
                ),
                Drink(
                    "Latte",
                    "Uma dose de espresso com uma quantidade generosa de leite vaporizado e uma pequena camada de espuma por cima. Suave e levemente adocicado.",
                    R.drawable.latte
                ),
                Drink(
                    "Americano",
                    "Espresso diluido com água quente, resultando em um café mais suave e menos intenso. Popular entre quem gosta de sabores menos concentrados.",
                    R.drawable.americano
                ),
                Drink(
                    "Mocha",
                    "Mistura de espresso com leite vaporizado e uma dose de chocolate. Geralmente coberto com chantilly e popular entre os amantes de chocolate.",
                    R.drawable.mocha
                ),
                Drink(
                    "Macchiato",
                    "Espresso \"manchado\" com um pouco de espuma de leite, acentuando o sabor forte do café com apenas um toque de suavidade.",
                    R.drawable.macchiato
                ),
                Drink(
                    "Flat White",
                    "Similar ao cappuccino, mas com menos espuma e uma proporção maior de leite. De origem australiana, tem sabor intenso e textura sedosa.",
                    R.drawable.flatwhite
                ),
                Drink(
                    "Ristretto",
                    "Uma dose de espresso mais concentrada e curta, com sabor mais denso e encorpado. Ideal para quem gosta de café intenso.",
                    R.drawable.ristreto
                ),
                Drink(
                    "Affogato",
                    "Uma sobremesa italiana que combina espresso quente sobre uma bola de sorvete de baunilha. Uma deliciosa fusdo de quente e frio.",
                    R.drawable.affogato
                ),
                Drink(
                    "Cold Brew",
                    "Café preparado com infusão em agua fria por 12-24 horas, resultando em um sabor suave e menos acido. Servido gelado.",
                    R.drawable.coldbrew
                ),
            )
        }
    }
}

