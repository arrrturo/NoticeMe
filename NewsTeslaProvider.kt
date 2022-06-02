package com.example.noticeme3

// clase que otorga cada noticia
class NewsTeslaProvider {
    companion object{
        val newsTeslaList = listOf<NewsTesla>(
            //1 lista
            NewsTesla(
                "Thomas Barrabi",
                "Elon Musk reveals stance on gun control, 2nd Amendment after Texas school shooting",
                "Billionaire Elon Musk revealed a mixed stance on proposed gun control measures following the mass shooting at an elementary school in Uvalde, Texas.",
                "https://nypost.com/2022/05/26/elon-musk-reveals-stance-on-gun-control-after-texas-school-shooting/",
                "https://nypost.com/wp-content/uploads/sites/2/2022/05/elon_32.jpg?quality=75&strip=all&w=1024",
                "2022-05-26",
            ),
            //2 lista
            NewsTesla(
                "Edurne Martínez",
                "Elon Musk pondrá más dinero de su bolsillo en Twitter para evitar el desplome de Tesla",
                "El empresario renuncia a comprar la red social con deuda vinculada a las acciones de su compañía de coches",
                "https://www.lavozdegalicia.es/noticia/economia/2022/05/26/elon-musk-pondra-dinero-bolsillo-twitter-evitar-desplome-tesla/00031653587211597535253.htm",
                "https://www.lavozdegalicia.es/default/2022/05/26/00121653587461613597369/Foto/reu_20220517_171824666.jpg",
                "2022-05-26",
            ),
            //4 lista
            NewsTesla(
                "Alejandra Otero",
                "Descuentos de la semana: un SUV híbrido superventas con entrega rápida y un coche eléctrico a precio de ganga",
                "Encaramos la última semana de mayo y las marcas de coches siguen mostrando ofertas interesantes para hacer buenos números en un trimestre complicado. Repasamos los descuentos más destacados de la semana, que incluye varios superventas y todo…",
                "https://www.motorpasion.com/descuentos-coches/descuentos-semana-suv-hibrido-superventas-entrega-rapida-coche-electrico-a-precio-ganga",
                "https://img.remediosdigitales.com/0a46ef/1366_2000/840_560.jpeg",
                "2022-05-25",
            ),
            //6 lista
            NewsTesla(
                "Fund Letters",
                "Wedgewood Partners Large Cap Focused Growth Fund Q1 2022 Client Letter",
                "For the first quarter 2022, Wedgewood Partners Composite (net)i declined -10.6%. Click here to read the full fund letter.",
                "https://seekingalpha.com/article/4514736-wedgewood-partners-first-quarter-2022-client-letter",
                "https://static.seekingalpha.com/cdn/s3/uploads/getty_images/1354117263/image_1354117263.jpg?io=getty-c-w750",
                "2022-05-25",
            ),
            NewsTesla(
                "Patrick Campanale",
                "Amazon Renogy Gold Box from $102 has flexible solar panels at $111, more in New Green Deals",
                "Are you ready to finally start building or overhauling your solar setup? Well, Amazon is helping you out with today in its Gold Box that has items starting at just $102. Our favorite deal here is the that’s down to $111, which is both a new all-time low and i…",
                "https://electrek.co/2022/05/26/flexible-solar-panel-renogy-new-green-deals/",
                "https://i0.wp.com/electrek.co/wp-content/uploads/sites/3/2022/03/renogy-solar-gold-box.jpg?resize=1200%2C628&quality=82&strip=all&ssl=1",
                "2022-05-25",
            ),
            NewsTesla(
                "Reuters",
                "Musk sued by Twitter investors for stock 'manipulation' during takeover bid",
                "The investors said Musk saved himself $156 million by failing to disclose that he had purchased more than 5% of Twitter by March 14. They asked to be certified as a class and to be awarded an unspecified amount of punitive and compensatory damages.",
                "https://economictimes.indiatimes.com/markets/stocks/news/musk-sued-by-twitter-investors-for-stock-manipulation-during-takeover-bid/articleshow/91820236.cms",
                "https://img.etimg.com/thumb/msid-91820261,width-1070,height-580,imgsize-44516,overlay-etmarkets/photo.jpg",
                "2022-05-25",
            ),
            NewsTesla(
                "Alex Lee",
                "Where are the next US tech hubs?",
                "Silicon Valley is still the startup capital of the US by a mile.  The region had a mammoth funding year in 2021, doubling year-over-year to top $106B. And in Q1’22, despite a funding decline of 2% quarter-over-quarter (QoQ), the region’s share …\nThe post Wher…",
                "https://www.cbinsights.com/research/next-us-tech-hubs-austin-miami-dallas/",
                "https://research-assets.cbinsights.com/2022/05/26112219/Austin-Miami-Dallas-Q122-funding-deals.png",
                "2022-05-25",
            ),
            NewsTesla(
                "Rich Smith",
                "Why Tesla Stock Keeps Going Up",
                "Cathie Wood bought Tesla stock again -- but should you?",
                "https://www.fool.com/investing/2022/05/26/why-tesla-stock-keeps-going-up/",
                "https://g.foolcdn.com/editorial/images/682082/stock-up-glowing-green-arrow-climbs-on-a-stock-screen.jpg",
                "2022-05-25",
            ),
            NewsTesla(
                "RT en Español",
                "Den un paso adelante ahora: la ONU insta a Musk, Bezos y otros multimillonarios a ayudar a combatir la amenaza de la crisis alimentaria global",
                "El jefe de Tesla y SpaceX donó en noviembre del año pasado unos 5.700 millones de dólares a una fundación para apoyar la lucha contra el hambre, pero el Programa Mundial de Alimentos afirma no haber recibido todavía nada de ese dinero.",
                "https://actualidad.rt.com/actualidad/430977-onu-bezos-musk-multimillonarios-ayudar-crisis-alimentaria",
                "https://cdni.russiatoday.com/actualidad/public_images/2022.05/article/628f65e3e9ff7139b41c6b14.jpeg",
                "2022-05-25",
            ),
            NewsTesla(
                "Mario Escribano",
                "No te acordabas de esta red social, pero está arrastrando al pozo a medio internet",
                "El hundimiento de Snapchat, una red social olvidada en España, ha provocado que gigantes como Google o Facebook pierdan miles de millones. ¿Qué ha pasado para que una plataforma de 'segunda' provoque tal terremoto?",
                "https://www.elconfidencial.com/tecnologia/2022-05-26/snapchat-redes-sociales-caida_3430857/",
                "https://images.ecestaticos.com/3IR8bF2zRYsrwSwxBYIYTt5Tjbs=/0x0:2272x1455/600x315/filters:fill(white):format(jpg):quality(99):watermark(f.elconfidencial.com/file/bae/eea/fde/baeeeafde1b3229287b0c008f7602058.png,0,274,1)/f.elconfidencial.com/original/865/de2/665/865de266550496efc709c0b17b848834.jpg",
                "2022-05-25",
            ),
            NewsTesla(
                "Carla Mozée",
                "Risks to Tesla stock are piling up and investors should prepare for less upside ahead as 'disruption from inside' and a wave of negative headlines weigh on shares, says Jefferies",
                "In lowering its price target on Tesla by 16% to $1,050, Jefferies cited an \"uncomfortable pile up of negative news\" surrounding CEO Elon Musk.",
                "https://markets.businessinsider.com/news/stocks/tesla-stock-price-target-cut-jefferies-elon-musk-leadership-risks-2022-5",
                "https://i.insider.com/60d6db9ddf1db80018f3a694?width=1200&format=jpeg",
                "2022-05-25",
            ),
            NewsTesla(
                "Reuters",
                "Elon Musk sued by Twitter investors for delaying disclosure of stake",
                "Investors say Musk saved himself $156m by failing to disclose that he had purchased more than 5% of Twitter by 14 MarchElon Musk was sued by Twitter investors for delaying the disclosure of his stake in the company, as the Tesla owner mounts a $44bn takeover …",
                "https://amp.theguardian.com/technology/2022/may/26/elon-musk-twitter-investors-sue",
                "https://i.guim.co.uk/img/media/a7084a5e5ac076237ae141dd447ba800d0d42a09/0_98_3183_1911/master/3183.jpg?width=1200&height=630&quality=85&auto=format&fit=crop&overlay-align=bottom%2Cleft&overlay-width=100p&overlay-base64=L2ltZy9zdGF0aWMvb3ZlcmxheXMvdGctZGVmYXVsdC5wbmc&enable=upscale&s=bfa30e27c38f6283f156298248d82812",
                "2022-05-25",
            ),
            NewsTesla(
                "Samantha Subin",
                "Stocks making the biggest moves midday: Twitter, Macy's, Nvidia, Lululemon and more",
                "These are the stocks posting the largest moves in midday trading.",
                "https://www.cnbc.com/2022/05/26/stocks-making-the-biggest-moves-midday-twitter-macys-nvidia-lululemon-and-more.html",
                "https://image.cnbcfm.com/api/v1/image/106291292-1576098701504gettyimages-1188776777.jpeg?v=1607621785&w=1920&h=1080",
                "2022-05-25",
            ),
            NewsTesla(
                "La Nacion",
                "Musk es demandado por los inversores de twitter por su retraso en la revelación de su participación",
                "Musk es demandado por los inversores de twitter por su retraso en la revelación de su participación",
                "https://www.lanacion.com.ar/agencias/musk-es-demandado-por-los-inversores-de-twitter-por-su-retraso-en-la-revelacion-de-su-participacion-nid26052022/",
                "https://resizer.glanacion.com/resizer/3RtWgCP--RAvm_gVQCN60D8EDIs=/768x0/filters:format(webp):quality(80)/cloudfront-us-east-1.images.arcpublishing.com/lanacionar/67GCK7VVHRH5JDZJTNRRSP7NEI.jpg",
                "2022-05-25",
            ),
        )
    }
}