package com.example.noticeme3

// clase que otorga cada noticia
class NewsAmericaProvider {
    companion object{
        val newsAmericaList = listOf<NewsAmerica>(
            NewsAmerica(
                "Ryan Browne",
                "As Klarna cuts jobs, rival fintechs say they're recruiting for hundreds of roles - CNBC",
                "As Klarna plans to lay off 10% of its workforce, rival fintech firms Revolut and Wise say they're hiring for hundreds of open roles.",
                "https://www.cnbc.com/2022/05/26/klarna-layoffs-rival-fintechs-revolut-and-wise-are-still-recruiting.html",
                "https://image.cnbcfm.com/api/v1/image/106911221-1626337239518-gettyimages-1180635150-1835438.jpeg?v=1653493889&w=1920&h=1080",
                "2022-05-26",
            ),
            NewsAmerica(
                "Guardian staff reporter",
                "Elon Musk sued by Twitter investors for delaying disclosure of stake - The Guardian",
                "Investors say Musk saved himself $156m by failing to disclose that he had purchased more than 5% of Twitter by 14 March",
                "https://amp.theguardian.com/technology/2022/may/26/elon-musk-twitter-investors-sue",
                "https://i.guim.co.uk/img/media/a7084a5e5ac076237ae141dd447ba800d0d42a09/0_98_3183_1911/master/3183.jpg?width=1200&height=630&quality=85&auto=format&fit=crop&overlay-align=bottom%2Cleft&overlay-width=100p&overlay-base64=L2ltZy9zdGF0aWMvb3ZlcmxheXMvdGctZGVmYXVsdC5wbmc&enable=upscale&s=bfa30e27c38f6283f156298248d82812",
                "2022-05-26",
            ),
            NewsAmerica(
                "Paul Wiseman",
                "Worry about stagflation, a flashback to '70s, begins to grow - The Associated Press - en Español",
                "WASHINGTON (AP) — Stagflation. It was the dreaded “S word” of the 1970s.  For Americans of a certain age, it conjures memories of painfully long lines at gas stations, shuttered factories and President Gerald Ford’s much-ridiculed “Whip Inflation Now” buttons.",
                "https://apnews.com/article/russia-ukraine-covid-health-63a9d0ec0ee778dcdd8355b3ffebb99e",
                "https://storage.googleapis.com/afs-prod/media/8a56ffcd820a4617afaebee81bb0cca3/1937.jpeg",
                "2022-05-26",
            ),
            NewsAmerica(
                "Samantha Subin",
                "Stocks making the biggest moves midday: Twitter, Macy's, Nvidia, Lululemon and more - CNBC",
                "These are the stocks posting the largest moves in midday trading.",
                "https://www.cnbc.com/2022/05/26/stocks-making-the-biggest-moves-midday-twitter-macys-nvidia-lululemon-and-more.html",
                "https://image.cnbcfm.com/api/v1/image/106291292-1576098701504gettyimages-1188776777.jpeg?v=1607621785&w=1920&h=1080",
                "2022-05-26",
            ),
            NewsAmerica(
                "Nicolas Vega",
                "Jamie Dimon's JPMorgan says bitcoin's slide has created 'significant upside' for crypto investors - CNBC",
                "The bank estimated that bitcoin, which was trading just above $29,600 on Thursday afternoon, was undervalued by 28%.",
                "https://www.cnbc.com/2022/05/26/jamie-dimons-jpmorgan-says-bitcoin-has-significant-upside-now.html",
                "https://image.cnbcfm.com/api/v1/image/107067687-1653579187562-gettyimages-1136153634-aw_027.jpeg?v=1653579220&w=1920&h=1080",
                "2022-05-26",
            ),
            NewsAmerica(
                "Kristen Altus",
                "Gas prices, inflation dampening summer vacation plans - Fox Business",
                "Scorching gas and everyday prices are forcing Americans to change their travel and budget plans this summer. FOX Business' Jeff Flock from the Jersey Shore.",
                "https://www.foxbusiness.com/lifestyle/gas-prices-inflation-dampening-summer-vacation-plans",
                "https://a57.foxnews.com/static.foxbusiness.com/foxbusiness.com/content/uploads/2022/05/0/0/JERSEY-SHORE-SUMMER-GETTY.jpg?ve=1&tl=1",
                "2022-05-26",
            ),
            NewsAmerica(
                "Kim Khan",
                "S&P 500, Nasdaq, Dow Jones get into rally mode on retail rebound - Seeking Alpha",
                "The stock market is gaining Thursday with solid results wiping out some of the recent gloom in the retail sector.",
                "https://seekingalpha.com/news/3842967-nasdaq-sp-500-dow-jones-stock-market",
                "https://static.seekingalpha.com/cdn/s3/uploads/getty_images/1299156307/image_1299156307.jpg?io=getty-c-w750",
                "2022-05-26",
            ),
            NewsAmerica(
                "Andrew Liszewski",
                "You Will Not Feel the World's Smallest Walking RC Robot Crawling Across Your Body - Gizmodo",
                "Researchers from Northwestern University have created what could be one of the most unsettling robots yet.",
                "https://gizmodo.com/rc-robot-small-penny-scientists-northwestern-crab-spide-1848980747",
                "https://i.kinja-img.com/gawker-media/image/upload/c_fill,f_auto,fl_progressive,g_center,h_675,pg_1,q_80,w_1200/b8460bad5185e2ef67ed4bcf18307348.jpg",
                "2022-05-26",
            ),
            NewsAmerica(
                "Diana Olick",
                "Home listings suddenly jump as sellers worry they may miss out on the red hot housing market - CNBC",
                "With home sales slowing and mortgage rates rising, home sellers are starting to worry that the red-hot housing market is over.",
                "https://www.cnbc.com/2022/05/26/home-listings-suddenly-spike-as-sellers-worry-theyll-miss-out-on-red-hot-market.html",
                "https://image.cnbcfm.com/api/v1/image/107067635-1653575184034-gettyimages-1239641872-AFP_327C9C2.jpeg?v=1653575226&w=1920&h=1080",
                "2022-05-26",
            ),
            NewsAmerica(
                "Ariel Zilber",
                "Jack Dorsey 'backstabbing' led to Elon Musk takeover: Twitter co-founder - New York Post ",
                "Ex-Twitter CEO Jack Dorsey served up the company on a platter to Elon Musk by “backstabbing” the social media’s board of directors, a co-founder said.",
                "https://nypost.com/2022/05/26/jack-dorsey-backstabbing-led-to-elon-musk-bid-twitter-co-founder/",
                "https://nypost.com/wp-content/uploads/sites/2/2022/05/Jack-Dorsey_04-2.jpg?quality=75&strip=all&w=1024",
                "2022-05-26",
            ),
            NewsAmerica(
                "Nathaniel Meyersohn, CNN Business",
                "Wealthy shoppers are splurging at Macy's. Low-income shoppers are pulling back at Walmart - CNN",
                "Decades-high inflation is leading to a split in American consumers' behavior.",
                "https://www.cnn.com/2022/05/26/business/macys-nordstrom-department-stores/index.html",
                "https://cdn.cnn.com/cnnnext/dam/assets/210223124908-02-macys-file-nov-2020-super-tease.jpg",
                "2022-05-26",
            ),
            NewsAmerica(
                "Anónimo",
                "Weekly jobless claims drop to 210000, revised Q1 GDP down 1.5% - CNBC Television",
                "CNBC's Rick Santelli and Steve Liesman join 'Squawk Box' to break down weekly initial jobless claims and revised first-quarter U.S. GDP data. For access to l...",
                "https://www.youtube.com/watch?v=Uu6eES3eV2A",
                "https://i.ytimg.com/vi/Uu6eES3eV2A/hqdefault.jpg",
                "2022-05-26",
            ),
            NewsAmerica(
                "Quentin Fottrell",
                "After 2 stormy years of 'moonshot' house prices, don't hold out hope for a major correction. Why COVID-era property values may be here to stay. - MarketWatch",
                "‘As more millennials reach age 40, their household formation rate will accelerate due to higher marriage rates and more stable incomes’",
                "https://www.marketwatch.com/story/after-2-stormy-years-of-moonshot-house-prices-dont-hold-out-hope-for-a-major-correction-why-covid-era-property-values-may-be-here-to-stay-11653578510",
                "https://images.mktw.net/im-351409/social",
                "2022-05-26",
            ),
            NewsAmerica(
                "Kate Rooney",
                "Sequoia coaches start-ups to cut costs or face a 'death spiral' amid stock market slump, bleak economic backdrop - CNBC",
                "Sequoia doesn't see the economy bouncing back anytime soon and is warning portfolio companies to tighten their belts in the meantime.",
                "https://www.cnbc.com/2022/05/26/sequoia-coaches-start-ups-to-cut-costs-or-face-a-death-spiral-.html",
                "https://image.cnbcfm.com/api/v1/image/107067662-1653578019311-roelof-screen.jpg?v=1653578032&w=1920&h=1080",
                "2022-05-26",
            ),
            NewsAmerica(
                "Paul R. La Monica, CNN Business",
                "Chinese consumers are stuck at home but still spending a ton, Alibaba says - CNN",
                "China's economy has slumped as Covid cases surged in the world's most populous country. But Chinese consumers stuck at home are still spending.",
                "https://www.cnn.com/2022/05/26/investing/alibaba-earnings/index.html",
                "https://cdn.cnn.com/cnnnext/dam/assets/220525154001-alibaba-food-delivery-beijing-0510-super-tease.jpg",
                "2022-05-26",
            ),
        )
    }
}