package com.androidtutorialpoint.googlemapsnearbyplaces;

import java.io.Serializable;
import java.util.List;

public class PlacesModel implements Serializable{
    /**
     * html_attributions : []
     * next_page_token : CrQCIwEAAENHdwG25mdW3ZKbcyt4_uRy2oTmNcJbutX_QCEro38lXPLjdb5boSExIf0aMxpqWjut3c2huWVp3ij9VPi26n7XCsr90P82ccDgOIP2OneiFrFjPYGG9NVFVzCMbNXEEZFBEqnEt7r1FDnEDXF7MtDBfPH1pnZfzMHPZIrNAUTkJ-41s9BGw3fgOFYwbZT7IWJDSGrFcpTn6xPSxJcdAK0uqf9nWi-Gy4i_bUMKb1NZmknEcACCAHkjctUTodbdh_PpuCOkeCOXvDDH9xarYTyrj-DiVHIBUoFvcOQvyu_1qWwp1NadyCbxs_WWujowQtcEhbrT8-v6bqKJJ6r-icye9uNFXtO-ZZgBH1MrybKRCrMFG_dzC9bsFix9unOLk7PjZeoBX2SXd7TvBXJOT1QSENCDqhNjbY8qCeFLNCmQiuUaFBDgx2KxuqDD4nvQjZPV-WhH95FB
     * results : [{"geometry":{"location":{"lat":28.6042127,"lng":77.3502997},"viewport":{"northeast":{"lat":28.6055616802915,"lng":77.3516486802915},"southwest":{"lat":28.60286371970849,"lng":77.34895071970848}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png","id":"c9e95fc4c31da2935a48841091afcfce085d3553","name":"Radisson Noida","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":4000,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/113880153675370456197/photos\">Nick Koo<\/a>"],"photo_reference":"CmRaAAAATI3KAD5GQyY37Z4fbI-ekAIOWwPzgyfJHtd7NDfVLcOUkQfIp7PO3O3FakLYL-tEppRSf4zpM36MEqqJalwJEaILnLo0rlkSnDCftsCEr6DJys30rhOVA9tunhco6ux0EhCf0uIXF1IMIrh08NXgkneeGhSONv7Wps_NCXiakAqbNdUjguH7Jg","width":3000}],"place_id":"ChIJEwBQJwvlDDkRJmVkx311l2E","rating":4.3,"reference":"CmRRAAAArEGvPmm-beEYqYXVIoYZJM5Zj8VresGNPaxSDfWNde2Gz3r7SXp4MfkLFmFlBzU_viMybzEYc1Q74hURH7M0-qBuNj1B2JmLaW_D5Jb465zGduCgQxmFqcApHtKF4ouQEhDJ9rck-1l9nGLdxsTLcvoyGhTr-a5jR9IPzHvXn68fccqj0j8Z8Q","scope":"GOOGLE","types":["spa","lodging","restaurant","food","point_of_interest","establishment"],"vicinity":"C Block, Block G, Sector 55, Noida"},{"geometry":{"location":{"lat":28.623536,"lng":77.35477999999999},"viewport":{"northeast":{"lat":28.6249080302915,"lng":77.3562920302915},"southwest":{"lat":28.6222100697085,"lng":77.35359406970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png","id":"649fda3a899d793bd3c943de21a776d198d946f0","name":"Park Ascent","photos":[{"height":413,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/112908964894109153132/photos\">Park Ascent<\/a>"],"photo_reference":"CmRaAAAAM6VYJ0zKepHzz984dREvS07-AZyYjhSbwgfMDHoAHdpUHi1jnWg3G0jNvHHRjk8Nm5d9FBo5hu4Z_9KdTmlS3Z-yMm9LvdBdJ5mSibpSin2R609_svo-bqCL5sXTrd6YEhD7VPgeXZ2XMk_BABi5m-vmGhQf5jXRIRUtgt02SKLroZmSCU9IvQ","width":960}],"place_id":"ChIJ-WOgdDjlDDkRPzPRIw__zH4","rating":4.1,"reference":"CmRRAAAAqOE-Ck4e7kBkPh_T_D2i2V8myXuHmYoG6yegHDm1QSFRyFaqWXlerbsFwtLSpqmUDrTh_d6lKm6hVuFMNALUIao-EeyGi_5JW7YeUymTGd3gf-LhTtFbgPy-T8wCKYMOEhC7SdEmbi5zCEbbJeFJgaANGhRzVDvB-tE05YWg-ofpC3spmSDR4A","scope":"GOOGLE","types":["bar","lodging","restaurant","food","point_of_interest","establishment"],"vicinity":"Plot No.126, Noida-Khoda Road, Opp IIM Lucknow-Noida Campus, Sector 62, Noida"},{"geometry":{"location":{"lat":28.606904,"lng":77.332994},"viewport":{"northeast":{"lat":28.6083393802915,"lng":77.33419538029152},"southwest":{"lat":28.6056414197085,"lng":77.3314974197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png","id":"234b5710328ad412e889549976fef7e539704236","name":"Red Fox Hotel, East Delhi","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":4000,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/101785229608774564949/photos\">Red Fox Hotel, East Delhi<\/a>"],"photo_reference":"CmRaAAAAw6Fs-TIonmYLASDSh8JZT1XY5eUEzqYm4P_0kJu91jRYbAOHLmBK4shXoLI159KhrFbSZyKpEw-vaTnfAh9rUhwP-3lrrMka2XtzKPAS3f6iXdcGQSxLc1UJZhcJlWELEhBD5RCF0-SvGCC1qz1wD_wqGhTUe55fOfAelPnnPppCulLEUD-FPg","width":3000}],"place_id":"ChIJSW4lHx7lDDkR2uhhO7q7SH8","rating":3.9,"reference":"CmRRAAAA2exSFRGWBPPxZRYAs7AdFjdWu6zbddD0Ph1jxwzEMDkEqEr3LOUXwAS1QFPIIoOjK3-a_SzsLHnuFM0uLQi0ajc1XlV5o-PC9lIh88lvx42xEkFZKL5W2jWVFrDO6FhuEhA_88X4hOUBs5B4Pd4C9CTPGhT8OYcs6Ae0eFNRfJtP16iU-ykq1w","scope":"GOOGLE","types":["lodging","restaurant","food","point_of_interest","establishment"],"vicinity":"Plot No. 6, Community Center, Mayur Vihar Phase III, Delhi"},{"geometry":{"location":{"lat":28.659056,"lng":77.29809},"viewport":{"northeast":{"lat":28.6604151302915,"lng":77.29922303029151},"southwest":{"lat":28.6577171697085,"lng":77.2965250697085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png","id":"b73cecc9b92a7446ff095e57c99745a037f9d91a","name":"Park Plaza Shahdara","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":606,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/112692890414116682407/photos\">Park Plaza Shahdara<\/a>"],"photo_reference":"CmRaAAAAYd3yRiQiHEw2feR62wa56vlQ2c6OYg9XxOvYrUptbxa5PANBZ8JRuKhqXH5Nwt_zyf3NA8x00D-PMwG1o6p5SMPe88YS5HEJlwKMGufKad3y2KGdl5Y4sgD_3s4zLJ9FEhBNB3UHT248ekgTzdegkLd1GhQ56KeSIoXdYPLfxVkB_560s8my9Q","width":1080}],"place_id":"ChIJs28LAX_7DDkRyHzGDbAs6YM","rating":3.9,"reference":"CmRSAAAAZ9sVi2p2wg8ikiNPb-RLsY-4WNJavPxxUrw-mahDi-RR-S57Q3ZUaWIZPePC_DhOXcbHFPbOd9VWNCeuO65RgsoBLU2cJukQKVn27-MbAohyLCuXt4aZSgMIG6WfnNbLEhDxWzC9nvpuPyXcG7evZaguGhRE9HaMKa_DPSGnXVrnb_VVU7Hu8w","scope":"GOOGLE","types":["lodging","restaurant","food","point_of_interest","establishment"],"vicinity":"Plot 32, Central Business District Shahdara Extension, Vishwas Nagar, Shahdara, Delhi"},{"geometry":{"location":{"lat":28.6391491,"lng":77.2949757},"viewport":{"northeast":{"lat":28.6407163302915,"lng":77.2965125802915},"southwest":{"lat":28.6380183697085,"lng":77.29381461970848}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"0b27a00843a8b516ae3b1781de64eeb7ed84d442","name":"Domino's Pizza","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":1080,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/107494248554163900605/photos\">Vishal Gajjar<\/a>"],"photo_reference":"CmRaAAAATBK3lna4-dWrp_a1X-cfKgI0FFMKnV08PeoHwLHiPM11RozQ_FDkWMgRCEmzNU7AxS05_34IBKe9PA1qQPZK6a4BmZ_vxgw7uNnn2P-gN1uloDqip1xaRKDf2eTcbjwYEhAuI1B6wiobnCnnCtufyN2YGhQNhziCFXUXbhLySXN4fIrPnf6Qmw","width":1080}],"place_id":"ChIJk3rGDlH7DDkRGG9DXASz0XM","price_level":1,"rating":3.9,"reference":"CmRRAAAAZGbPs_IDjthdoqhF-iY1vDi5SSUPmgq_RJdV3aLpYIKUfeft0uNg8-mHRAahRgd5aRecGXFEf2cfXxvGnt6BBj3KFk0AD2o8ZWxXcfLYssAzDr6ECe5LRIlTfSgoQ29NEhCxkmJB81nBBY4KoCLKzzBtGhS6yQAvXGx4CwI--YlXFnjmR-i2YQ","scope":"GOOGLE","types":["meal_delivery","meal_takeaway","restaurant","food","point_of_interest","establishment"],"vicinity":"30, Aditya Arcade, Preet Vihar, New Delhi"},{"geometry":{"location":{"lat":28.5938571,"lng":77.3388634},"viewport":{"northeast":{"lat":28.5952060802915,"lng":77.3402123802915},"southwest":{"lat":28.59250811970849,"lng":77.3375144197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"cbc514affd66c9f12d529ede95a5aaaeb4f90411","name":"Berco's","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":2848,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/111727828123794650007/photos\">Berco&#39;s Garden<\/a>"],"photo_reference":"CmRaAAAAKu6UNcDMxr-Nrkj6kt9SG4alKqHX3hSmojkG1QmiG0PmtZxUFAD6ZuiuTyqFJNxJBRF6P0ehS9RD6L7KOwfcEwUbWuVz13Xf7VVzsx6ki82XNBwvEjyHP2In684vNwMmEhA00MkOYbvknlhyMNV7S1YCGhR3XSJ-LI2RSAdPKFsxHS-IX9axwg","width":4288}],"place_id":"ChIJVVVVFQTlDDkRUr8LHq7AzzI","rating":4.1,"reference":"CmRRAAAAZPLDbRSBh_1P9AJWnKmxB5rkwVyoBhhfFlcDsPd6yME-cZTAWAI7dnJy69LrzGb9HJdStDHjL4OYbTS3JIBSOwKQdLQEPjBV9kGDq8hwkAPzsAQnuJm_b6Y8ZaLpDqZfEhCict4dXf0_W_2W_QwTbgzTGhRJQMPHDzbe1_l1DtkH9zQCB8J4jQ","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"O-1, Bahrat Ghar Complex, Sector 12, Noida"},{"geometry":{"location":{"lat":28.6412521,"lng":77.31696529999999},"viewport":{"northeast":{"lat":28.6426010802915,"lng":77.31831428029149},"southwest":{"lat":28.6399031197085,"lng":77.31561631970848}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png","id":"70de8c2ba186e156d0dad9ece726b4a5899a3f96","name":"Lemon Tree Hotel, East Delhi Mall","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":1360,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/103584864685579531135/photos\">Lemon Tree Hotel, East Delhi Mall<\/a>"],"photo_reference":"CmRaAAAAlbXKlQO2VQjREA707feeZ1Y8CXWMQLVgLtroRDKkhKSJVN6UkGrToPpZJg5l7LRk07D_-_Qqg0WwsPH819fLC6pRg83MOUZfQzbYBeNFyAFLCcoaEet9HyXAkLKix9mKEhCofAkboK2w13y7Eq3sSOz0GhQMxc8j4UNwwH0Yf7vzIqafUMdzdA","width":1363}],"place_id":"ChIJAQAAAKHThDkROOHqJK8SqEQ","rating":3.9,"reference":"CmRRAAAAO8XOE2Ndiclb2MfRlMlhg0_L-fUdvwMCmZ3xNXM2ODHfqz2fhN5HaUWGYMIvNfIWZ5UukSsdYESUxCmeM7_qreo3X3rc92LxrONQeLfEVnrtz9lQqA8tWqke4sSUXa4PEhDczWmk7JX3IKDV2jqWFPoPGhS8Qx3eQ6fedh3GwaewqAbAEx4WNw","scope":"GOOGLE","types":["lodging","restaurant","food","point_of_interest","establishment"],"vicinity":"Plot No. 1, Kaushambi;East Delhi Mall, Ghaziabad"},{"geometry":{"location":{"lat":28.5863454,"lng":77.34125019999999},"viewport":{"northeast":{"lat":28.58769438029151,"lng":77.34259918029149},"southwest":{"lat":28.5849964197085,"lng":77.33990121970848}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"ba24a9fc82912cf8862d7eb16fa71e38f2996100","name":"Subway","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":3024,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/113223866380634834350/photos\">Mohit Raj<\/a>"],"photo_reference":"CmRaAAAAhmLl5egZgB3RGVgjrc8hhCPkz6cbT8Q17AjhS1F3yG4UHekMKP5g9I5c08L-uyJgaN_23lrlitgSvxcGF_CQC-746761YMy4h7lu_31veW1zxHkf8_pawNic0BGHxCX7EhDtP8boVzzWe4zFZmtxh7oBGhQ7_c1bvb9zg-f7OOkJoEDlnyPAVw","width":4032}],"place_id":"ChIJiVZSq6nlDDkRr_6PpqTrk5o","price_level":1,"rating":3.8,"reference":"CmRSAAAAg7zlz7GPMVJZIpQXOi7PSOvedkuafGk2DiqEMVR3VVK9vNpbW4GDdBD6W9c8jhOlppKjjW-ba9qJ153Nc7117EReewUtIE3JDUAzlh7iAmnVhLU05pGdExTVzHs8q70QEhCccxgt8V_5FJeaUh3ZsnwMGhTSovs7vpXtH-seIKnDe-wA4dL_sA","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"Shop No. 301, Food Court Spice Mall, Sector 25 A, Noida"},{"geometry":{"location":{"lat":28.569514,"lng":77.324133},"viewport":{"northeast":{"lat":28.5708296802915,"lng":77.3256158802915},"southwest":{"lat":28.5681317197085,"lng":77.32291791970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"589b450632282ca32362e89632e09b9fa4cfd9b9","name":"Desi Vibes","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":933,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/104213128242812645444/photos\">Desi Vibes<\/a>"],"photo_reference":"CmRaAAAA1XS7E_7yEkHYlI6wxzNCE9ToapnSam15rsoYitAAve3ecDqqDmhavxlEf6epVLxBgXPHG946GHPhpsfqPvotksGVmw5B17fUi73gQpjeIQn8MEKGLv4UejfvA2zj9GKmEhAcbpZ6Ds6m1N3QjEmLt_AZGhRZfadvGf6HNyGkH79d_wEeOUSY2Q","width":1400}],"place_id":"ChIJVVVVxUjkDDkRkGQ-BI3uDRc","rating":4.2,"reference":"CmRRAAAABBs99P6fSMK39ZUd8Vi3_a3tYH7sxlzzAmPC4pVuEobv8MM2boxLa_PHd2M5iJedOXB_u_EOJaDA93YDjKsXL8ewb5Xyxd2ikTlISj2_2lI5b8zUR-Ri38djbITVzbKwEhBorWILPnZg3x9RxN_TlNlIGhSQYeHjt5rjpi0KhFdi2An1ma17XQ","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"G-50, Ist Floor, Opp. McDonald's, G Block, Pocket G, Sector 18, Noida"},{"geometry":{"location":{"lat":28.6746197,"lng":77.4421804},"viewport":{"northeast":{"lat":28.6759299302915,"lng":77.4436366802915},"southwest":{"lat":28.6732319697085,"lng":77.4409387197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"ab3e98b4f9e202830e3bfaef6bc6aabe0b8f9a0a","name":"Domino's Pizza","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":3000,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/105062727519440802559/photos\">Paritosh Singh<\/a>"],"photo_reference":"CmRaAAAAD0jrt37BTwC4t4hQQVioGX1UsSsoFrTI2X4dWvCMLp56GmrVGfgjdSXdm9UhECWs5mveumjRliBcDmSkzz62MoWpJDSlQLwJfYdK9JgYIj6rOs-Y3mSV_rhtJbBwaxnpEhC97sOWSNEFVJlJtZIY-WQhGhRs__goiKjqmi_yQooX5pbXTkdpzg","width":4000}],"place_id":"ChIJ_45lC7zxDDkR7I904W51CJI","price_level":1,"rating":4,"reference":"CmRSAAAA93eZu4q5IqKWTJYjEPjVFJOI1Yd_ocjOTI3UpR4EEXSIp4Kdf-LKCm984Fp5LkBQmwPDNKAmziRorHgjx6SvjNFCPfo-_bopF__UtubKCkJpXVup6Hz9mDIM551fENLxEhAvKyIW5Z_ebeNxuxbbnYWqGhRTlf5JYlUI60z95qaktjyYnP_g_g","scope":"GOOGLE","types":["meal_delivery","meal_takeaway","restaurant","food","point_of_interest","establishment"],"vicinity":"Shop No 7-8, Ground Floor, Advocate Chamber, RDC, Raj Nagar, Ghaziabad"},{"geometry":{"location":{"lat":28.5972001,"lng":77.3647598},"viewport":{"northeast":{"lat":28.5985490802915,"lng":77.36610878029151},"southwest":{"lat":28.5958511197085,"lng":77.3634108197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"d70e77201faad6022c01ddfd048b480fb2c6b6fe","name":"Pizza Hut","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":2592,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/115067936141537904067/photos\">Rammokaur<\/a>"],"photo_reference":"CmRaAAAAg9pW1tqMwt0LBbTJAt2V_WJ8p5fmm93yefmY2aA2e2qL95rQ_UPqCzTs_xFLhV-PdEgZzWHNFPlY3PROY59tq2mv4iDu0V-K0RPzOLVQQP1QtTwLDyG85yo7HlS_OnEQEhDV_WA5o6fNHmXnz2qRfJnwGhQ5bTEK08GPka35SrOAK-8cSNDVfg","width":4608}],"place_id":"ChIJVRkv03DlDDkRnBtFcKN_gHU","price_level":1,"rating":3.5,"reference":"CmRRAAAAM70sPoJ4dTZalQ7TbDJ7BsxxINU25qOQV6pwQdHWGRv9bRYwWLt-STxTF9fCGOuFtAIOwmPHFGly_KgtZOUD4MCkQtP80neQQTpia3kPcWIs7zFsAcVjV1D7i-RE3HgdEhAsIkxvHokmRGFaAl2ZpAp0GhQYQQHEcFTD6mMxOfRqYwHpTttXnQ","scope":"GOOGLE","types":["meal_delivery","meal_takeaway","restaurant","food","point_of_interest","establishment"],"vicinity":"C134, Gr Flr, Supertech Shopprix Mall, Sector 61, Noida"},{"geometry":{"location":{"lat":28.646451,"lng":77.319889},"viewport":{"northeast":{"lat":28.6477999802915,"lng":77.32123798029151},"southwest":{"lat":28.64510201970849,"lng":77.31854001970851}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"ea0038410c3fd666d1e6e3593a3f0f1ec08d40be","name":"Pizza Hut","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":1920,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/114873116926826087243/photos\">Ayush Rout<\/a>"],"photo_reference":"CmRaAAAAwSyBVaMAoNNCZ0hwwn_MXzk5PbstA4bXtKoh2Ffi5q3RLL6KHIdtigkEe_htpLaZ4FP7rk3jVq7E6SoY7AKpV1OHTJFUxNjrA2xxdjj7Po_m-PNk_eeb4dAkszhtu8NtEhCOasoM7aozR7UNzzxLfa-wGhR6LAqxstjOrXcQiCFBwQthzL7Fgg","width":1080}],"place_id":"ChIJhfNhodH6DDkRSuxVpmhSInc","price_level":1,"rating":2.8,"reference":"CmRRAAAAJplVOl5R6TwGMoNYCLJGjXTU4KPTY3hF_e2C28MQEL7NQ4Cu2-pPLv4O6iVA-ZlVTg84Z4pFWIKGWVwhL1aXpMtmlGnoZe-sjVTO5on8t_S0Azfhn_LIFKQlE3ScIe2BEhBRQe3AsFgQCDEbsj9Q7r0tGhQQ4smHDRjONf0cUZq15wUHJi_8LA","scope":"GOOGLE","types":["meal_takeaway","restaurant","food","point_of_interest","establishment"],"vicinity":"Pacific Mall, Food Court, Kaushambi, Ghaziabad"},{"geometry":{"location":{"lat":28.5765809,"lng":77.33509029999999},"viewport":{"northeast":{"lat":28.5777430302915,"lng":77.3366044802915},"southwest":{"lat":28.5750450697085,"lng":77.33390651970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"5da6ee0d076e13beb5c8884e82ab0886a5563d8d","name":"Gravity Restro-lounge","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":3096,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/100528639501702980062/photos\">Ranjan Shrivastava<\/a>"],"photo_reference":"CmRaAAAA2-Rxmyk8kCi0s3BO4ELx5rHS3FvO8uFSwtTEfFVwSFHAf2tNzqzP6CdJ2S082_2AREgbQ7AXW441d06scRconu6VNOviEslHjo8HIh0JRljutsw2T49HNnnXjiUFcOQfEhBFs91ZYImuHaNMo5UPCAKsGhQtg7sSsnH4P4crhFmdeDdet91Jug","width":4128}],"place_id":"ChIJSdaQSbLlDDkRNZ-WuL-Lmb8","rating":3.5,"reference":"CmRSAAAAdTVg8qcF9x2Onz8u0A87kSZTwE5KLUrowW5iH-L1aPchsLINeBYG7UPCJ2IP7np6PCKb4M4oF-Yk9Zf_dfzQMT8yzy4CiTbdV8LZHwZRbbM06pDONBSG0032Syai6Y0WEhCPII2xR6nHIePvoWkIZP0WGhTDhyuupx5ndh_PU9P-4yIIest01w","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"Gravity Restaurant Complex, No.401 & 402, Jaipuria Plaza, sector- 26, Noida"},{"geometry":{"location":{"lat":28.5801979,"lng":77.31527},"viewport":{"northeast":{"lat":28.58155548029151,"lng":77.3167831802915},"southwest":{"lat":28.5788575197085,"lng":77.31408521970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"76c8c9fa6a11df144fe5fb7abfb0698e2e940aaf","name":"Barbeque Nation - Noida - Hotel Savoy Suites","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":3024,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/115804946691345347202/photos\">Nishant Murlidharan<\/a>"],"photo_reference":"CmRaAAAA7xk3d2DdsKM85FHFEJsPgZjQTF7I7H4kL9cPrWo-5CMnAknvBG8vHX_CJ4wU25O7sp2aAycMpocbg-RWLMdcsi_h8K_tfBX35Ffw0un5YCIL2AmFeaayuQqXQytN0-y4EhCTbcJIGVg7_LoiRLHbOdU_GhQtxiRmeM1Cpjl712B06JL0PUcC0A","width":4032}],"place_id":"ChIJy3fL91vkDDkRE82DgeVeJBo","rating":4.4,"reference":"CmRRAAAANWow0nOLS_68Z8xXh3SU4z7mG1XfpQrLg37c46wgk02w-lhFMZQpFvEoFI-maJQ7rpBn2XMOOdQG7xDdkftWEvrBfhDSbLFoZNFlgJTFlen40N4FK44Wdtv9vNW4HiqYEhDj2bsLQlwpAiFTHmcN9F02GhT3jynib_67w7vf3kPZbRVZKG709g","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"A-79A, Ground Floor, Hotel Savoy Suites, DSC Marg, Sector 16, Noida"},{"geometry":{"location":{"lat":28.6846832,"lng":77.4530286},"viewport":{"northeast":{"lat":28.6860321802915,"lng":77.45437758029149},"southwest":{"lat":28.6833342197085,"lng":77.45167961970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"8e113395ec67de72622142e487cb2d54c0e0d753","name":"Fortune Inn Grazia - Restaurants in Ghaziabad","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":1836,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/107169769224692399397/photos\">Pankaj Sagar<\/a>"],"photo_reference":"CmRaAAAA8O2dTtmc3xCzLUmI36-S8iwdOD_zb194YsOl1Fbjnfbjp--EDyit12hrE1I40ot1eW_DMzRRLGxF502Vr9zl9-bD-L_Vaj7TfEe7dshmcQNeeka-htw3tf2qTegPraA3EhAOO3rqfAtT5-lD_8G1WxRAGhRIesMuwnf4ICxkhWSGWQZ2w5M2iw","width":3264}],"place_id":"ChIJVTfnZp7xDDkRYU58XHrOjgw","rating":4,"reference":"CmRRAAAATrpgTccf_PquYyYlIprvoHe08zZZ9UWCFtCJB46wTvGStg_E_lPgAHRCxSa1KG4bolPEUprNJzH1449B-X8d95lTSGSUbo3coMRSMIZoWKNK0wcOR6z2Rif1_IIg1rEREhA8tzH8UnEzwns3lZFbtuZ7GhS19N55PDBr4WqZ3WGZbbX6LCaRXw","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"Plot No.1, ALT Road, Sector-23, Sanjay Nagar District Centre, Ghaziabad"},{"geometry":{"location":{"lat":28.5810648,"lng":77.3267848},"viewport":{"northeast":{"lat":28.58241378029151,"lng":77.32813378029151},"southwest":{"lat":28.5797158197085,"lng":77.32543581970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"1a3d1826272aa9ae6cfc8a3139ae2af723458ce7","name":"Haldirams","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":3024,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110264253611052916488/photos\">Abhishek Chawla<\/a>"],"photo_reference":"CmRaAAAAwM8RaDt10N54105AiJW9I3mSo3OT0sd6-irEArnYmpvdbcL9WnPETlq82VKnab0ER7HuE1OhGqIaGH4cGg5AWlXYBp7SaLn70i1a6mgCnWKwPrahOoQZ4Pn1fm4ynnLxEhB5lZRiBP6kgDU2Bkjk99sgGhRfDcm62QeqhlHynGcYsiysQWpA-A","width":4032}],"place_id":"ChIJq5RXAKnlDDkR1XmXpzKXph8","rating":3.9,"reference":"CmRRAAAANRCcq-LTY4R8NO0PFJ1yByYN-HAHT1OkQWiP74uDjiiV2EpXRneGL6O_VzFLno210y7JX3rs1s4OzMoADtTDWS_KuKLZT65jQqldlEOF571jt9rpz7DTnGrEFPORKAxeEhCASw6jqxXXJ4qytzaaEBvoGhSgLWiRtrGzXOdk-CoPp0lrrquSnw","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"108-109, Ground Floor,, Spice World,, Sector-25 A, Noida"},{"geometry":{"location":{"lat":28.637905,"lng":77.36029599999999},"viewport":{"northeast":{"lat":28.6392539802915,"lng":77.3616449802915},"southwest":{"lat":28.6365560197085,"lng":77.3589470197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"e660e5459cf42ad9a881f092ff372a52bc4afd8b","name":"Domino's Pizza","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":4608,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/115924385842621852000/photos\">maneesh panwar<\/a>"],"photo_reference":"CmRaAAAApgqu33CeqRf5dEr2OR6yxjW-AnFN_e6UgoQ32RcsJQ9_FN3YLk17UMRaaf3o7g0bMS-yx0H9QMaa8P6VUV8pYtqzFsLYAt4J_fr6X3t3FdnRLCLcglYqzCvkJmbNTHzBEhAMXc8fdQZOzrTzVHFPRJsuGhQBTiKXGd-Ib-bPYRl8CA9K2Ts8lg","width":3456}],"place_id":"ChIJI9vLvLT6DDkR6IxankeLUQQ","price_level":1,"rating":3.7,"reference":"CmRRAAAAtSZSj2GQTkqrVAxGiTgDsXOMXL--fhHfVt4KUdsHvvVqCouhPT851zGOZz7yFXYvLaYx5Zz3ZzHt898RO_x2uwu6-UAMvEZFBx0O8aFC0fKT5vVjYKSJEbWCR4ypWl8AEhB8knpsZ1qNbpyA18stVgZ-GhQor9fbI4D6drQWh0o80vGbguCHaQ","scope":"GOOGLE","types":["meal_delivery","meal_takeaway","restaurant","food","point_of_interest","establishment"],"vicinity":"Ground Floor, Aditya City Center, Vaibhav Khand, Indirapuram, Ghaziabad"},{"geometry":{"location":{"lat":28.60095549999999,"lng":77.32254329999999},"viewport":{"northeast":{"lat":28.6019087302915,"lng":77.32407563029149},"southwest":{"lat":28.59921076970849,"lng":77.32137766970848}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"e1ec6627c4cf3a9692815a6598cbae6d83333346","name":"Domino's Pizza","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":4032,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/102409364098726675809/photos\">Entertainment<\/a>"],"photo_reference":"CmRaAAAAHqKTkWwXP9LS0HIOt9m9OB7vfLm3p2ff9yPoXafXgh9z9gwVIxgjk9pNau9aXqrMyXd5HN55LtISNrXW0xpve9AyOgVIJBrvgLHIi1c5rms68H7dFXMJPWllMHdTEIarEhBkoH0ccTVfjQHEFmMS3JLKGhSOaoYybaBZRfPIqqPlRQTZosmZpA","width":3024}],"place_id":"ChIJZyxADeXkDDkRUFQwT6p6NKU","price_level":1,"rating":3.8,"reference":"CmRSAAAAVRLQk75w1iwros4bRPm8HDcwqR6v2cTDOHXWrpYucu1Ne28Kc7XkCkEK_G7yGw02UThYTAIafH0n3r50tAtym-0j5FC8t2FfnxWrXhIAePt4wOpwLEQj_dw9CO2NH-2PEhCqGHQb4t1qXp7c64LE8KgKGhQeYYdn1VDAZxwdo9S0qZo_TUpwSQ","scope":"GOOGLE","types":["meal_delivery","meal_takeaway","restaurant","food","point_of_interest","establishment"],"vicinity":"Shop No. 1, 1st Floor, CSC Market, Near City Apartments, DALLUPURA/CHILLA, VASUNDHARA ENCLAVE, New Delhi"},{"geometry":{"location":{"lat":28.568925,"lng":77.324657},"viewport":{"northeast":{"lat":28.5702739802915,"lng":77.32600598029151},"southwest":{"lat":28.56757601970849,"lng":77.3233080197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"1918f49ed70541819d77f1dcf76803a288e3634f","name":"The Fortune Cookie|Fortune Cookie","opening_hours":{"open_now":true,"weekday_text":[]},"place_id":"ChIJV0yNqUjkDDkROADaYHo47uY","rating":3.8,"reference":"CmRSAAAAqXIIvhkgvdCMmGeO8OoBnbWClKZlmxHGW-TTXPhGbqdRYCEpoklBHzddZwhs0y_udysyE13RAaUg0LEKVoRh0uzyw_NhXeYPQmbDlsCi9cmsV2DHo0gbVfl51nAbyVDdEhDePjpclvbFc6RXTd799-iKGhQC0U0dn6yiawPpBI7QqMnONawOWQ","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"P-18, Sector 18, Noida"},{"geometry":{"location":{"lat":28.6283086,"lng":77.37568999999999},"viewport":{"northeast":{"lat":28.6296575802915,"lng":77.37703898029149},"southwest":{"lat":28.6269596197085,"lng":77.37434101970848}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"10ec66a6a0cf582994b75b733e698a57a7769d65","name":"Lemon Twist","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":5696,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/102833457885739341457/photos\">Anannya Fashion Gallery<\/a>"],"photo_reference":"CmRaAAAAN2ddSVpMoKrwr6T9GkKAUg0OGv9a9sMvgUAlDJC5QwyKq_5jFioXF0ZU0OjeEh9B_m0QKVQYn0lzhbw9RFMvhk-cVT1IwBqxePVYZweDSwfGyjFwGRn6T_N4ALk6gO4OEhAEgNYOW5gDbaQ6Nffuad5OGhQJaCSxOWtfUpFPz8UHyYGlU1L2vw","width":4272}],"place_id":"ChIJrZ9qn1flDDkR16tXZcyW62Y","rating":3.1,"reference":"CmRRAAAAnxJKJQ-wNbXNYI3Mh_56mKlK7lVGlEVYJPum3Beve4wZJZTpztSLgYxUndmzsUPI-3awBxb6KQZJ67kbXP2eT8JNSGX-U9huUVThRnbhUcF_1wRcZ5KS51MWUlNbJcafEhCtG4sFRN_oZs-dNtR0sDhyGhRXIQdwLzYFOV_5fPw5Ny9EpCTzug","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"H-1A/16, Sector - 63, Opp. CORENTHUM/J. P. Institute, Noida"}]
     * status : OK
     */

    private String next_page_token;
    private String status;
    private List<?> html_attributions;
    private List<ResultsBean> results;

    public String getNext_page_token() {
        return next_page_token;
    }

    public void setNext_page_token(String next_page_token) {
        this.next_page_token = next_page_token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<?> getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(List<?> html_attributions) {
        this.html_attributions = html_attributions;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean implements Serializable{
        /**
         * geometry : {"location":{"lat":28.6042127,"lng":77.3502997},"viewport":{"northeast":{"lat":28.6055616802915,"lng":77.3516486802915},"southwest":{"lat":28.60286371970849,"lng":77.34895071970848}}}
         * icon : https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png
         * id : c9e95fc4c31da2935a48841091afcfce085d3553
         * name : Radisson Noida
         * opening_hours : {"open_now":true,"weekday_text":[]}
         * photos : [{"height":4000,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/113880153675370456197/photos\">Nick Koo<\/a>"],"photo_reference":"CmRaAAAATI3KAD5GQyY37Z4fbI-ekAIOWwPzgyfJHtd7NDfVLcOUkQfIp7PO3O3FakLYL-tEppRSf4zpM36MEqqJalwJEaILnLo0rlkSnDCftsCEr6DJys30rhOVA9tunhco6ux0EhCf0uIXF1IMIrh08NXgkneeGhSONv7Wps_NCXiakAqbNdUjguH7Jg","width":3000}]
         * place_id : ChIJEwBQJwvlDDkRJmVkx311l2E
         * rating : 4.3
         * reference : CmRRAAAArEGvPmm-beEYqYXVIoYZJM5Zj8VresGNPaxSDfWNde2Gz3r7SXp4MfkLFmFlBzU_viMybzEYc1Q74hURH7M0-qBuNj1B2JmLaW_D5Jb465zGduCgQxmFqcApHtKF4ouQEhDJ9rck-1l9nGLdxsTLcvoyGhTr-a5jR9IPzHvXn68fccqj0j8Z8Q
         * scope : GOOGLE
         * types : ["spa","lodging","restaurant","food","point_of_interest","establishment"]
         * vicinity : C Block, Block G, Sector 55, Noida
         * price_level : 1
         */

        private GeometryBean geometry;
        private String icon;
        private String id;
        private String name;
        private OpeningHoursBean opening_hours;
        private String place_id;
        private double rating;
        private String reference;
        private String scope;
        private String vicinity;
        private int price_level;
        private List<PhotosBean> photos;
        private List<String> types;

        public GeometryBean getGeometry() {
            return geometry;
        }

        public void setGeometry(GeometryBean geometry) {
            this.geometry = geometry;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public OpeningHoursBean getOpening_hours() {
            return opening_hours;
        }

        public void setOpening_hours(OpeningHoursBean opening_hours) {
            this.opening_hours = opening_hours;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        public String getVicinity() {
            return vicinity;
        }

        public void setVicinity(String vicinity) {
            this.vicinity = vicinity;
        }

        public int getPrice_level() {
            return price_level;
        }

        public void setPrice_level(int price_level) {
            this.price_level = price_level;
        }

        public List<PhotosBean> getPhotos() {
            return photos;
        }

        public void setPhotos(List<PhotosBean> photos) {
            this.photos = photos;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public static class GeometryBean implements Serializable{
            /**
             * location : {"lat":28.6042127,"lng":77.3502997}
             * viewport : {"northeast":{"lat":28.6055616802915,"lng":77.3516486802915},"southwest":{"lat":28.60286371970849,"lng":77.34895071970848}}
             */

            private LocationBean location;
            private ViewportBean viewport;

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public ViewportBean getViewport() {
                return viewport;
            }

            public void setViewport(ViewportBean viewport) {
                this.viewport = viewport;
            }

            public static class LocationBean implements Serializable{
                /**
                 * lat : 28.6042127
                 * lng : 77.3502997
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class ViewportBean implements Serializable{
                /**
                 * northeast : {"lat":28.6055616802915,"lng":77.3516486802915}
                 * southwest : {"lat":28.60286371970849,"lng":77.34895071970848}
                 */

                private NortheastBean northeast;
                private SouthwestBean southwest;

                public NortheastBean getNortheast() {
                    return northeast;
                }

                public void setNortheast(NortheastBean northeast) {
                    this.northeast = northeast;
                }

                public SouthwestBean getSouthwest() {
                    return southwest;
                }

                public void setSouthwest(SouthwestBean southwest) {
                    this.southwest = southwest;
                }

                public static class NortheastBean implements Serializable{
                    /**
                     * lat : 28.6055616802915
                     * lng : 77.3516486802915
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class SouthwestBean implements Serializable{
                    /**
                     * lat : 28.60286371970849
                     * lng : 77.34895071970848
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }
        }

        public static class OpeningHoursBean implements Serializable{
            /**
             * open_now : true
             * weekday_text : []
             */

            private boolean open_now;
            private List<?> weekday_text;

            public boolean isOpen_now() {
                return open_now;
            }

            public void setOpen_now(boolean open_now) {
                this.open_now = open_now;
            }

            public List<?> getWeekday_text() {
                return weekday_text;
            }

            public void setWeekday_text(List<?> weekday_text) {
                this.weekday_text = weekday_text;
            }
        }

        public static class PhotosBean implements Serializable{
            /**
             * height : 4000
             * html_attributions : ["<a href=\"https://maps.google.com/maps/contrib/113880153675370456197/photos\">Nick Koo<\/a>"]
             * photo_reference : CmRaAAAATI3KAD5GQyY37Z4fbI-ekAIOWwPzgyfJHtd7NDfVLcOUkQfIp7PO3O3FakLYL-tEppRSf4zpM36MEqqJalwJEaILnLo0rlkSnDCftsCEr6DJys30rhOVA9tunhco6ux0EhCf0uIXF1IMIrh08NXgkneeGhSONv7Wps_NCXiakAqbNdUjguH7Jg
             * width : 3000
             */

            private int height;
            private String photo_reference;
            private int width;
            private List<String> html_attributions;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getPhoto_reference() {
                return photo_reference;
            }

            public void setPhoto_reference(String photo_reference) {
                this.photo_reference = photo_reference;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<String> getHtml_attributions() {
                return html_attributions;
            }

            public void setHtml_attributions(List<String> html_attributions) {
                this.html_attributions = html_attributions;
            }
        }
    }
}
