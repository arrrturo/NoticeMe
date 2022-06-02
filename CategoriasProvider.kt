package com.example.noticeme3

// clase que otorga cada categoria
class CategoriasProvider {
    companion object{
        val categoriasList = listOf<Categorias>(
            Categorias(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Apple_logo_black.svg/640px-Apple_logo_black.svg.png",
                "Las últimas noticias de Apple",
                1
            ),
            Categorias(
                "https://1000marcas.net/wp-content/uploads/2019/12/Tesla-logo.png",
                "Todos los articulos sobre Tesla este mes",
                2
            ),
            Categorias(
                "https://i.blogs.es/7caa24/wsj-logo/450_1000.png",
                "Todos los articulos publicados por el Wall Street Journal",
                3
            ),
            Categorias(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQaAxzhc8VlLy1cGlrVY1i4kZnU50IWKHblecibb5e7dU1Gf15vEFBGKi1xyhpVHXhofEw&usqp=CAU",
                "Los titulares más relevantes de EE.UU",
                4
            ),
            Categorias(
                "https://cdn.shopify.com/s/files/1/1885/2557/articles/techcrunch_1000x_ced7ba87-9eba-4e66-9d41-f32c3e6d83bf.png?v=1525427505",
                "Últimos titulares de TechCrunch",
                5
            ),
        )
    }
}