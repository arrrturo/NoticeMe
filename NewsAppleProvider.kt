package com.example.noticeme3

// clase que otorga cada noticia
class NewsAppleProvider {
    companion object{
        val newsAppleList = listOf<NewsApple>(
            //1 lista
            NewsApple(
                "Jake Peterson",
                "This Hidden Apple Setting Makes You Sound So Much Better on Video Calls",
                "You don’t know you sound bad on a FaceTime or Zoom call until someone points it out. If you’re chatting with a particularly polite bunch, you might never know, and your hilarious stories or inspiring speeches will fall on deaf and strained ears. If you’re an …",
                "https://lifehacker.com/this-hidden-apple-setting-makes-you-sound-so-much-bette-1848970372",
                "https://i.kinja-img.com/gawker-media/image/upload/c_fill,f_auto,fl_progressive,g_center,h_675,pg_1,q_80,w_1200/3c663545d174780e0c85bde189f3367c.jpg",
                "2022-05-25",
            ),
            //2 lista
            NewsApple(
                "Valentina Palladino",
                "Apple's MacBook Air M1 is $100 off right now",
                "While you may waiting in anticipation for Apple's next iteration of the MacBook Air, the current model is on sale at Amazon. You can pick up the 256GB MacBook Air M1 for $900 right now, or $100 off its normal price. We have seen it lower before — last year's …",
                "https://www.engadget.com/apples-macbook-air-m1-is-100-off-right-now-124135328.html",
                "https://s.yimg.com/os/creatr-uploaded-images/2020-11/c8aea820-28a0-11eb-9f89-5ddd62987703",
                "2022-05-25",
            ),
            //3 lista
            NewsApple(
                "Ars Staff",
                "Today’s best deals: PlayStation Days of Play sale, SanDisk storage, and more",
                "Dealmaster also includes the MacBook Air, Jabra earbuds, and Xbox consoles.",
                "https://arstechnica.com/staff/2022/05/todays-best-deals-playstation-days-of-play-sale-sandisk-storage-and-more/",
                "https://cdn.arstechnica.net/wp-content/uploads/2022/05/dealmaster052522-760x380.jpg",
                "2022-05-25",
            ),
            //4 lista
            NewsApple(
                "Anónimo",
                "U.S. urges Supreme Court to reject Apple appeal in Qualcomm patent fight - Reuters.com",
                "The Justice Department on Tuesday urged the U.S. Supreme Court to deny a bid by Apple Inc to revive a patent fight with Qualcomm Inc over mobile technology.",
                "https://www.reuters.com/legal/litigation/us-urges-supreme-court-reject-apple-appeal-qualcomm-patent-fight-2022-05-25/",
                "https://www.reuters.com/resizer/ARyyBMu-cyoPIJo8aJRW19xO4xU=/728x381/smart/filters:quality(80)/cloudfront-us-east-2.images.arcpublishing.com/reuters/SYFLHTPT3JPFNEQZDR3YLE75VE.jpg",
                "2022-05-25",
            ),
            //5 lista
            NewsApple(
                "Elle Hunt",
                "It’s not beige, it’s not grey: it’s greige – and it’s why all our houses look the same",
                "As our politics became more polarized, we soothed ourselves with calm interiors. Maybe now it’s time for some colourYou might say it’s charcoal, silver, concrete, slate. You might call it by the name on the paint chip: Chic Shadow, Polished Pebble, Purbeck St…",
                "https://amp.theguardian.com/lifeandstyle/2022/may/25/greige-color-paint-popular-interior-decorating-design",
                "https://i.guim.co.uk/img/media/ff03e12c898db24f6b6737f6850e396fddacf609/172_0_5156_3094/master/5156.jpg?width=1200&height=630&quality=85&auto=format&fit=crop&overlay-align=bottom%2Cleft&overlay-width=100p&overlay-base64=L2ltZy9zdGF0aWMvb3ZlcmxheXMvdGctZGVmYXVsdC5wbmc&enable=upscale&s=eb0768238fe55319d23cce726b8aedf4",
                "2022-05-25",
            ),
            //6 lista
            NewsApple(
                "Anónimo",
                "Retail inflows at nearly all-time high despite market turbulence - Reuters.com",
                "Individual investors are buying stocks at a pace akin to the 2021 meme-stock frenzy even as the returns on retail investments sit at multi-year lows amid a widespread sell-off on concerns about rising interest rates, Vanda Research said.",
                "https://www.reuters.com/markets/wealth/retail-inflows-nearly-all-time-high-despite-market-turbulence-2022-05-25/",
                "https://www.reuters.com/resizer/qn2Ec4pq3idvt-oZK45j_Tpfdr0=/1200x628/smart/filters:quality(80)/cloudfront-us-east-2.images.arcpublishing.com/reuters/Y5WZNC2UXNN4DDMVG5HU6HWKJ4.jpg",
                "2022-05-25",
            ),
            //7 lista
            NewsApple(
                "Juli Clover",
                "Ikea Debuts Matter-Compatible Smart Home Hub",
                "Swedish furniture and accessory store Ikea today announced the upcoming launch of the Dirigera smart hub, which supports Matter. Matter is a universal smart home automation connectivity standard that is being adopted by Amazon, Apple, Google, Samsung, and oth…",
                "https://www.macrumors.com/2022/05/25/ikea-matter-smart-home-hub/",
                "https://images.macrumors.com/t/HfeAQig8jQQ_M97rttvlfswK3_8=/2000x/article-new/2022/05/ikea-dirigera-hub.jpg",
                "2022-05-25",
            ),
            //8 lista
            NewsApple(
                "Joe Rossignol",
                "Beats Unveils Limited-Edition Studio Buds in Collaboration With Fashion Brand 'Daily Paper'",
                "Apple-owned Beats today introduced new limited-edition Studio Buds designed in collaboration with Amsterdam-based, African-inspired fashion brand Daily Paper.\n\nIn a tweet, Beats said the custom Studio Buds are inspired by Daily Paper's spring/summer 2022 …",
                "https://www.macrumors.com/2022/05/25/beats-studio-buds-daily-paper-edition/",
                "https://images.macrumors.com/t/eId4YRn6v-e4XiBp9WlVUoSxaCQ=/1600x/article-new/2022/05/beats-studio-buds-daily-paper.jpeg",
                "2022-05-25",
            ),
            //9 lista
            NewsApple(
                "Hartley Charlton",
                "iPhone 14 Pro Renders Highlight Multiple Design Changes",
                "Leaker Jon Prosser today shared ostensibly accurate renders of the iPhone 14 Pro, providing the most accurate look yet at what the device could look like when it launches later this year.\n\nIn the latest video on YouTube channel Front Page Tech, Prosser re…",
                "https://www.macrumors.com/2022/05/25/iphone-14-pro-renders-highlight-design-changes/",
                "https://images.macrumors.com/t/jCL3sbFa5zaLBBsgHNcqn-1ddGY=/3897x/article-new/2022/05/iPhone-14-Pro-Purple-Front-and-Back-MacRumors-Exclusive.jpg",
                "2022-05-25",
            ),
            //10 lista
            NewsApple(
                "Joe Rossignol",
                "Ember Launches Smaller iPhone-Controlled Coffee Cup With Temperature Control",
                "Ember this week expanded its lineup of temperature-controlled mugs with a new 6-ounce Ember Cup designed for espresso-based drinks such as cappuccinos, cortados, and flat whites. Ember Cup pricing starts at $99.95 in the United States, making it the cheapest …",
                "https://www.macrumors.com/2022/05/25/ember-cup-iphone-controlled/",
                "https://images.macrumors.com/t/vqoCwuKF5pi1cJdNBU8OkCeNWqA=/1600x/article-new/2022/05/ember-cup-iphone.jpeg",
                "2022-05-25",
            ),
            //11 lista
            NewsApple(
                "Anónimo",
                "Apple's iPhone development schedule delayed by China lockdowns - Nikkei - Reuters",
                "Apple Inc has told its suppliers to speed up iPhone development after China's strict COVID-19 lockdowns hampered schedule for at least one of the new phones, Nikkei reported on We…",
                "https://www.reuters.com/technology/apples-iphone-development-schedule-delayed-by-china-lockdowns-nikkei-2022-05-25/",
                "https://www.reuters.com/resizer/aWkGmNw32dFLkg_Yb0_xkcTBS_Y=/1200x628/smart/filters:quality(80)/cloudfront-us-east-2.images.arcpublishing.com/reuters/DDGH763X45JE5NZASDN2IKIPCI.jpg",
                "2022-05-25",
            ),
            //12 lista
            NewsApple(
                "Anónimo",
                "Russia's VK launches RuStore for apps after exit of Western alternatives - Reuters",
                "Russian internet group VK launched a home-made app store on Wednesday, the latest in a Kremlin-endorsed drive to create a raft of domestic digital services to replace Western ri…",
                "https://www.reuters.com/technology/russias-vk-launches-rustore-apps-after-exit-western-alternatives-2022-05-25/",
                "https://www.reuters.com/resizer/VZUuyenIMAGtYld8HuMcuKDYws0=/1200x628/smart/filters:quality(80)/cloudfront-us-east-2.images.arcpublishing.com/reuters/IBQFJONBV5IXZFORHGKJC52J24.jpg",
                "2022-05-25",
            ),
            //13 lista
            NewsApple(
                "Anónimo",
                "Vedanta to finalize $20 billion Indian chip, display unit site by mid-June -Chairman - Reuters India",
                "Vedanta will finalize a location for its $20 billion semiconductor and display plants in India by mid-June and will have the first chip product ready in two years, its Chairman Anil Agarwal said on Wednesday.",
                "https://www.reuters.com/world/india/vedanta-finalize-20-billion-indian-chip-display-unit-site-by-mid-june-chairman-2022-05-25/",
                "https://www.reuters.com/resizer/KD64KH5oHtmb9uED0rEQNiR6i94=/1200x628/smart/filters:quality(80)/cloudfront-us-east-2.images.arcpublishing.com/reuters/QA3B2TSTQFPPBNLL5EJGAYJV7E.jpg",
                "2022-05-25",
            ),
            //14 lista
            NewsApple(
                "Shruti Shekar",
                "Wear OS 3 was absent at Google I/O 2022, but that’s just fine",
                "Google barely spoke about Wear OS 3 at Google I/O this year, but there's a very good reason for that. Experts analyze why Google made the move to be quiet about the software.",
                "https://www.androidcentral.com/apps-software/wear-os-3-google-io",
                "https://cdn.mos.cms.futurecdn.net/oFXzR4Xd3xaoi2vH25CbW9-1200-80.jpg",
                "2022-05-25",
            ),
            //15 lista
            NewsApple(
                "Anthony J Nash",
                "Catalyst Black for Android review: A surprisingly deep team-based shooter",
                "Fans of the team-based shooting genre are in for a surprise, as Super Evil Megacorp's Catalyst Black is a deep and engaging experience.",
                "https://www.androidcentral.com/gaming/android-games/catalyst-black-review",
                "https://cdn.mos.cms.futurecdn.net/jnm6uXphPp9dhhcPZXxqm6-1200-80.jpg",
                "2022-05-25",
            ),
            //16 lista
            NewsApple(
                "Michael L Hicks",
                "Polar Pacer Pro review: Tailor-made for data-driven runners",
                "The Polar Pacer Pro is tailor-made for runners or triathletes looking to improve their splits with a wealth of free, colorful data. If you're buying a new running watch, Polar has made a strong case for Garmin Forerunner fans to look at its watch instead.",
                "https://www.androidcentral.com/wearables/polar-pacer-pro-review",
                "https://cdn.mos.cms.futurecdn.net/SbQNagpS4j7ELZ6nVQ3oDP-1200-80.jpeg",
                "2022-05-25",
            ),
            //17 lista
            NewsApple(
                "Juli Clover",
                "Apple Releases tvOS 15.5.1 for Apple TV HD and Apple TV 4K",
                "Apple today released tvOS 15.5.1, a minor update to the tvOS operating system that first launched in September 2021. tvOS 15.5.1 comes about 10 days after the launch of tvOS 15.5. \n\ntvOS 15.5.1 can be downloaded over the air on the Apple TV through the Se…",
                "https://www.macrumors.com/2022/05/25/apple-releases-tvos-15-5-1/",
                "https://images.macrumors.com/t/-OrBC1E2HenMFmWiYHFnHEmi514=/2500x/article-new/2021/04/apple-tv-4k-design-green.jpg",
                "2022-05-25",
            ),
            //18 lista
            NewsApple(
                "Joe Rossignol",
                "Apple Stores Rolling Out iPhone-to-iPhone Contactless Payments Starting Today",
                "Apple in February unveiled a new \"Tap to Pay on iPhone\" feature that will allow compatible iPhones to accept payments via Apple Pay, contactless credit and debit cards, and other digital wallets, with no additional hardware required.\n\nApple began testing …",
                "https://www.macrumors.com/2022/05/25/apple-stores-rolling-out-tap-to-pay-on-iphone/",
                "https://images.macrumors.com/t/hLJ1O9ZdmeliSzpSGbwxwv6ItJU=/1600x/article-new/2022/02/Apple-Tap-to-Pay-iPhone.jpeg",
                "2022-05-25",
            ),
            //19 lista
            NewsApple(
                "Joe Rossignol",
                "iPod Touch Removed From Apple's Website in Some Countries After Being Discontinued",
                "A few weeks after Apple announced it is discontinuing the iPod touch, the company has started to remove the device from its website in some countries.\n\nIt is no longer possible to access the iPod touch's product page on Apple's website in countries such a…",
                "https://www.macrumors.com/2022/05/25/apple-starts-removing-ipod-touch-page/",
                "https://images.macrumors.com/t/mSw82yFNtcooHjpQF3Hup3wR-rI=/1600x/article-new/2022/05/ipod-touch-colors.jpeg",
                "2022-05-25",
            ),
            //20 lista
            NewsApple(
                "Juli Clover",
                "Apple-Commissioned Study Touts App Store Job Growth and Success of Small Developers",
                "Apple today shared details on developer studies sourced from economists at Analysis Group (commissioned by Apple) and the Progressive Policy Group, with the reports aimed at highlighting the successes of small businesses and independent developers on the App …",
                "https://www.macrumors.com/2022/05/25/apple-commissioned-app-store-developer-study/",
                "https://images.macrumors.com/t/on82wv5858RI4ckSlMLJ1hrpSPY=/2250x/article-new/2022/01/iOS-App-Store-General-Feature-Desaturated.jpg",
                "2022-05-25",
            ),
        )
    }
}