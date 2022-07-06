package uz.gita.logical_game.mobdev.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.logical_game.mobdev.model.Question;

public class AppController {
    private static AppController appController;
    private Question[] logic;
    private Question[] math;
    private Question[] information;

    public static AppController getInstance() {
        if (appController == null) {
            appController = new AppController();
        }
        return appController;
    }

    private List<Question> list = new ArrayList<>();


    private AppController() {
        loadData();
    }

    private void loadData() {
        logic = new Question[]{
                new Question("Daraxtning shoxida qarg’a o’tiribdi. Qarg’ani cho’chitib yubormasdan shoxni arralash uchun nima qilish kerak?",
                        "Uxlatish kerak",
                        "Bilmadim",
                        "O'q otish kerak",
                        "Qarg’aning o’zi uchib ketishini kutish.",
                        "Qarg’aning o’zi uchib ketishini kutish.",
                        ""

                ),
                new Question( "Undan qanchalik ko’p olaversangiz, u shunchalik kattalashib boraveradi. U nima?",
                        "Chuqur",
                        "Qarz",
                        "Suv",
                        "Havo",
                        "Chuqur",""),
                new Question( "Qaysi yegulikni pishirishda qancha tuz solsa ham, u sho’r bo’lib ketmaydi?",
                        "Olma",
                        "Qaynatilgan tuxum",
                        "Sasiska",
                        "Makaron",
                        "Qaynatilgan tuxum",""),
                new Question( "Kim o’tirgan holda yuradi?",
                        "Chol",
                        "Shaxmatchi",
                        "Piyoda",
                        "Haydovchi",
                        "Shaxmatchi",""),
                new Question( "U savol emas, lekin unga javob berish kerak?",
                        "Telefon",
                        "Qo’ng’iroq yoki eshik jiringlashi",
                        "Uyqi",
                        "Bilmadim",
                        "Qo’ng’iroq yoki eshik jiringlashi",""),
                new Question( "Nimani 10 daqiqadan ortiq ushlab turishning iloji yo’q, garchi u o’ta yengil bo’lsa ham",
                        "Suv",
                        "Havoni",
                        "Nafasni",
                        "Uyquni",
                        "Nafasni",""),
                new Question( "Hamma narsani ko’rayotganda uni ko’rmaysiz. Hech narsani ko’rmaganda esa uni ko’ra olasiz. U nima?",
                        "Uy",
                        "Havo",
                        "Qorong'ulik",
                        "Sharpani",
                        "Qorong’ulik.",""),
                new Question( "Qadimgi Rimliklarning fikricha, eng shafqatsiz xo’jayinlar – ular. Savol: ular kimlar?",
                        "Qullar",
                        "Jangchilar",
                        "Ayollar",
                        "Oqsochlar",
                        "Qullar",""),
                new Question( "Bozorda ko’rmaysiz, ko’rsangiz ham olmaysiz, olsangiz ham kiymaysiz, kiysangiz ham ko’rmaysiz. U – ?",
                        "Ko'ylak",
                        "Kafan",
                        "Ayoq kiyim",
                        "Uchtasidan bittaso to'g'ri",
                        "Kafan",""),
                new Question( "Hazil savol: Eng ko’p haqorat eshitadigan kishilar kimlar?",
                        "Futbol hakamlari",
                        "Footbolchilar",
                        "Deputatlar",
                        "Hammasi to'g'ri",
                        "Hammasi to'g'ri",""),
                new Question( "Jiddiy savol: U eng arzon va eng qimmat mulk. Undan to’g’ri foydalanilsa dahoga aylanish mumkin. U nima?",
                        "Pul",
                        "Bilim",
                        "Vaqt",
                        "Sog'lik",
                        "Vaqt",""),
                new Question( "Qiziqarli savol: Diyego, Manfrid va Sid qaysi davrda do’stlashadi?",
                        "2021-yilda",
                        "Muzlik davrida",
                        "Tosh davrida",
                        "Bilmadim",
                        "Muzlik davrida",""),
                new Question("Oson savol: Qaysi qushning ko’zlari miyasidan kattaroq bo’ladi?",
                        "Tovuqniki",
                        "Tuyaqush",
                        "Burgut",
                        "Lochin",
                        "Tuyaqush",""),
                new Question( "Topishmoq: Dengiz ham emas, yer ham emas. Unda kema ham suzmaydi, odam ham yurmaydi?",
                        "Botqoqlik",
                        "Chol",
                        "Rasmdagi Dengiz",
                        "Ko'l",
                        "Botqoqlik",""),
                new Question( "Oddiy savol: Nimaning 5 ta barmog’I bor, tirnoqlari yo’q?",
                        "Mushuk",
                        "Dilfin",
                        "Qo'lqop",
                        "Topa olmayman",
                        "Qo'lqop",""),
                new Question("1 U Geyms Kukda kichkina, Arnold Shvartsnegrda katta, Madonna va Kleopatrada umuman yo’q, Rim papasida bor, lekin uni ishlatmaydi. Gap nima haqida ketyapti?",
                        "Mushaklar",
                        "Sochlar",
                        "Familya",
                        "Pul",
                        "Familiya",""),
                new Question("Qadimgi Yunonistonda papka ko’targan kishilarni bir nom bilan atashganki biz ularni boshqacha nom bilan ataymiz. Savol: Yunon tilida papka ko’targan kishilar bizda nima deb ataladi?",
                        "Ustozlar",
                        "O'quvchi",
                        "Buxgalter. Bu so’z yunon tilida papka ko’targan kishi ma’nosini bildiradi.",
                        "Hisobchi",
                        "Buxgalter. Bu so’z yunon tilida papka ko’targan kishi ma’nosini bildiradi.",""),
                new Question("Psixologlarning fikricha qaysi oy eng shirin oy hisoblanadi?",
                        "Asal oyi",
                        "Fevral oyi",
                        "Yanvar oyi",
                        "Mart oyi",
                        " Asal oyi",""),
                new Question(
                        "Antiqa savol: 1-b, 2-I, 3-u, 4-t, 5-b. Siz qolgan beshta harfni yozib bering.",
                        "6-q,7-e,8-r,9-t,10-x.",
                        "6-a,7-d,8-q,9-o,10-l.",
                        "6-o,7-y,8-s,9-t,10-o’.",
                        "6-h,7-r,8-t,9-e,10-j.",
                        "6-o,7-y,8-s,9-t,10-o’.",""),
                new Question(
                        "Mantiqiy savol: Ali va Vali baliq ovlagani chiqishibdi. Ular o’g’illarini olvolishibdi. Valining o’g’lini ismi Mirvali ekan. Ali 4 ta, Vali 3 ta, Mirvali 6 ta baliq tutibdi. Savol: Alining o’g’lini ismi nima?",
                        "Alining o’g’lini ismi Vali! Mirvali Valining o’g’li Vali esa Alining o’g’li.",
                        "Ali",
                        "Vali",
                        "To'grisi anlamay qoldim",
                        " Alining o’g’lini ismi Vali! Mirvali Valining o’g’li Vali esa Alining o’g’li.",""),
                new Question(
                        "Fransuzlarda “Tuxumdan olmagacha” degan ibora bor. Ular bu koni foyda ekani uchun ham bunga amal qilishadi. Savol: “Tuxumdan olmagacha” iborasida nima nazarda tutilmoqda?",
                        "Tuxumni yeb orqasidan olma yeyish urf",
                        " Tushlikni tuxumdan boshlab olmada tugatish kerak.",
                        "Tuxum bilan olma zo'r ketsa kerakda",
                        "Man unday qilmagan bo'lardim",
                        "Tushlikni tuxumdan boshlab olmada tugatish kerak.",""),
                new Question(
                        "Qiziqarli fakt: u AQSHliklarda O. K. Y. tarzida berilsa yaponlarda Y. O. K. shaklida, bizda K. O. Y. ketma-ketlikda beriladi. Agar anglagan bo’lsangiz nimaning ketma-ketligi keltirilmoqda?",
                        "Yashil,Qora,Oq",
                        "Yaxshilik,Qorqmaslik,Kuchlilik",
                        "Yo'l,Ko'cha,Ovloq",
                        " Kun, oy, yil",
                        " Kun, oy, yil",""),
                new Question(
                        "Shunday shahar borki o'n to'rt soniga A harfini qo'shib yozilsa, shaharni nomi kelib chiqadi. U qaysi shahar?",
                        "XIVA",
                        "Toshkent",
                        "Andijon",
                        "Buxoro",
                        "XIVA",""),
                new Question(
                        "Yerdan osonlikcha ko’tarish mumkin,lekin uni uzoqqa otib bo’lmaydi. Bu nima?",
                        "Paxta",
                        "qush pati",
                        "Yog'och",
                        "qalam",
                        "qush pati",""),
                new Question(
                        "Tuxumni balandlikdan tashlab yuborishdi. U pastga tomon 3 metr tushganda ham yorilmadi. Buning sababi nimada?",
                        "Tuxum emas",
                        "Yasama bo'lsa kerak",
                        "Tuxum 10 metr balandlikdan tashlangandi. 3 metr o’tgach, sinishi uchun yana 7 metr masofa qolgandi.",
                        "G'alatiku",
                        "Tuxum 10 metr balandlikdan tashlangandi. 3 metr o’tgach, sinishi uchun yana 7 metr masofa qolgandi.",""),
                new Question(
                        "Yo’llari bor, yurib bo’lmaydi,\n" +
                                " yerlari bor – ekib bo’lmaydi,\n" +
                                " yam-yashil o’tloq bor – yulishni iloji yo’q,\n" +
                                " dengiz, daryo ko’llari bor, ammo suvi yo’q.",
                        "Xarita",
                        "Yo'l",
                        "Taxta",
                        "Globus",
                        "Xarita",""),
                new Question(
                        "Ko’rganda quvonamiz, lekin baribir ko’zimizni olib qochamiz.",
                        "Daraxt",
                        "Kino",
                        "Oy",
                        "Quyosh",
                        "Quyosh",""),
                new Question(
                        "Uning balandligi ham, eni va bo’yi ham yo’q, lekin uni o’lchasa bo’ladi. U nima?",
                        "Suv",
                        "Harorat",
                        "Harorat, vaqt.",
                        "vaqt",
                        "Harorat, vaqt.",""),
                new Question(
                        "Garchi u yengil bo’lsa ham nimani 10 daqiqadan ortiq ushlab turib bo’lmaydi?",
                        "Nafasni",
                        "Issiq nonni",
                        "pichoq",
                        "sanchqi",
                        "Nafasni",""),
                new Question(
                        "Dengiz tubida qanday tosh bo’lmaydi?",
                        "oq tosh",
                        "qora tosh",
                        "to'rtburchak tosh",
                        "Quruq tosh",
                        "Quruq tosh",""),
                new Question(
                        "Men suvman va suv yuzida suzib yuribman. Men kimman?",
                        "Suv",
                        "Muz",
                        "Yaproq",
                        "Tomchi",
                        "Muz",""),
                new Question(
                        "Qaysi so’z har doim xato bo’lib eshitiladi?",
                        "Hey",
                        "olma",
                        "Xato",
                        "Men bu",
                        "Xato",""),
                new Question(
                        "Ular qanchalik ko’payib ketsa, vazni shunchalik kamayib boraveradi.",
                        "G’ovak.",
                        "Tuz",
                        "Suv",
                        "Havo",
                        "G’ovak.",""),
                new Question(
                        "Qaysi oyda odamlar kam gapiradilar?",
                        "Yanvar",
                        "Fevral",
                        "Iyul",
                        "Sentabr",
                        "Fevral",""),
                new Question(
                        "Qaysi oddiy odam oldida podshohlar ham boshlarini egishgan?",
                        "Ustalar",
                        "Hopizlar",
                        "Sartaroshlar",
                        "Qassaob",
                        "Sartaroshlar",""),
                new Question(
                        "Hamma narsani ko’rayotganingizda uni ko’ra olmaysiz, hech narsani ko’rmaganingizda esa uni ko’ra olasiz. U nima?",
                        "Kun",
                        "Oy",
                        "Quyosh",
                        "Qorong’ulik",
                        "Qorong’ulik",""),
                new Question(
                        "2+2*2 ning javobi necha bo’ladi?",
                        "4",
                        "6",
                        "8",
                        "12",
                        "6",""),
                new Question(
                        "7 ta sham yonib turgan edi. Ulardan 3 tasini o’chirib qo’yishdi. Nechta sham qoldi?",
                        "3 ta",
                        "5 ta",
                        "qolmaydi",
                        "bilmadim zeriktirib yubording",
                        "3 ta",""),
                new Question(
                        "1 dan 100 gacha sonlar orasida nechta 9 bor?",
                        "10",
                        "15",
                        "20",
                        "12",
                        "20",""),
                new Question(
                        "Yomg’irda quyon qanday daraxt tagida turishi mumkin?",
                        "Ho’l daraxt",
                        "Quruq daraxt",
                        "Daraxt tagidagi daraxt tagida",
                        "keyingisi bormi",
                        "Ho’l daraxt",""),
                new Question(
                        "Uni chap qo’l bilan ushlasa bo’ladi, o’ng qo’l bilan umuman ushlab bo’lmaydi.",
                        "Chap qolni",
                        "Oyoqni",
                        "O’ng qo’lning tirsagi",
                        "Burunni",
                        "O’ng qo’lning tirsagi",""),
                new Question(
                        "Hazil: Kun va tun nima bilan tugaydi?",
                        "N bilan",
                        "Soat bilan",
                        "Uyqi bilan",
                        "Uxlab yotsam bilmasam buni",
                        "N bilan",""),
                new Question(
                        "Qo’llarda 10 ta barmoq bor. 10 ta qo’lda nechta barmoq bor?",
                        "60",
                        "65",
                        "50",
                        "40",
                        "50",""),
                new Question(
                        "1 kg tosh og’irmi, 1 kg paxta?",
                        "Teng",
                        "Tosh",
                        "Paxta",
                        "O'lchab ko'rmaganman",
                        "Teng",""),
                new Question(
                        "Yog’ochni 12 bo’lakka bo’lish uchun uni necha marta arralash kerak?",
                        "12",
                        "13",
                        "11",
                        "8",
                        "11",""),
                new Question(
                        "Hazil: Juda och qoringa nechta tuxum yeyish mumkin?",
                        "2 ta",
                        "1 ta, keyingilari to’q qoringa yeyiladi",
                        "9 ta",
                        "manga 4 ta yetadi",
                        "1 ta, keyingilari to’q qoringa yeyiladi",""),
                new Question(
                        "Hazil: Erkak kishi o’zining bevasining singlisiga uylanishi mumkinmi?",
                        "Ha",
                        "Yo’q, o’zi vafot etgan kishi hech kimga uylana olmaydi.",
                        "Bo'lsa bilmadim",
                        "O'ylash kerak",
                        "Yo’q, o’zi vafot etgan kishi hech kimga uylana olmaydi.",""),
                new Question(
                        "Qaysi o’simlik yig’ib olinganidan so’ng, uning 90% yoqib yuboriladi, 10% esa tashlab yuboriladi.",
                        "Tamaki",
                        "Isiriq",
                        "Terak",
                        "Kokat",
                        "Tamaki",""),
                new Question(
                        "Professor kech soat sakkizda budelnikni 9 ga qo’yib uyquga yotdi. U necha soat uxlaydi?",
                        "1 soat",
                        "2 soat",
                        "4 soat",
                        "6 soat",
                        "1 soat",""),
                new Question(
                        " Bu xarf deyarli dunyoning barcha alfavitlarida 1 xil yozilishi bilan rekord o’rnatgan. bu qaysi xarf?",
                        "J",
                        "I",
                        "K",
                        "O",
                        "O","")
        };

        math = new Question[]{
                new Question(
                        "Daraxtning 4 ta shoxi bor, har bir shoxida yana 4 tadan shoxchalari bor, bu shoxchalar ham yana 4 tadan mayda shoxchalarga bo’lingan va ularni har birida bittadan olma bor, barcha olmalar sonini hisoblang.",
                        "4*3 = 12",
                        "4*2*2 = 16",
                        "4*4 *4 = 64",
                        "4*5 = 20",
                        "4*4 *4 = 64",""),
                new Question(
                        "Ilhom bozordan 1 kg. lik tarvuz olib keldi. Tarvuz 99% suvdan iborat edi. Ilhom tarvuzni quyoshda unutib qoldirdi va keyin tarvuz 98% suvdan iborat bo’lib qoldi. Savol: quyoshda qolib ketgandan keyin tarvuzning og’irligi necha kg bo’lgan?",
                        "500g",
                        "700g",
                        "200g",
                        "600g",
                        "500g",""),
                new Question(
                        "1 ta bakteriya 1 sekundda 2 taga ko’payadi. O’sha 1 ta bakteriyani bir bonka (idish)ga solganimizda 1 soatda liq to’ldi. Qancha vaqtda bakteriya Bonka (idish)ni yarmiga keladi?",
                        "20 minut",
                        "50 minut",
                        "59 minut 59 sekundda bonka yarim bo’ladi, 1 sekunddan keyin esa 2 taga ko’payib bonka to’ladi.",
                        "60 minut 30 soniya",
                        "59 minut 59 sekundda bonka yarim bo’ladi, 1 sekunddan keyin esa 2 taga ko’payib bonka to’ladi.",""),
                new Question(
                        "Sinfda 30 ta o’quvchi o’qiydi. Ulardan 20 tasi rus tilini biladi. 18 tasi ingliz tilini biladi. Savol: nechtasi har ikkala tilni biladi?",
                        "12 ta rus, 8 ta ingliz, 10 har ikki tilni biladi.",
                        "8 ta rus, 10 ta ingliz, 12 har ikki tilni biladi.",
                        "12 ta rus, 10 ta ingliz, 8 har ikki tilni biladi.",
                        "12 ta rus, 12 ta ingliz, 6 har ikki tilni biladi.",
                        "12 ta rus, 10 ta ingliz, 8 har ikki tilni biladi.",""),
                new Question(
                        "Uzunligi 36 metr bo’lgan chitni sotuvchi har qaysi xaridorga 3 metrdan sotdi. Savol: sotuvchi chitni necha marta kesgan?",
                        "2+3+5=10 marta kesilgan",
                        "3+3+6=12 marta kesilgan",
                        "1+2+4=7 marta kesilgan",
                        "1+2+8=11 marta kesilgan",
                        "1+2+8=11 marta kesilgan",""),
                new Question(
                        "Men bir son o’yladim. Uning yarmiga choragini qo’shsak , 18 hosil bo’ladi. Savol: Men qanday son o’ylabman?",
                        "12",
                        "24",
                        "26",
                        "28",
                        "24",""),
                new Question(
                        "Beshta 1 yordamida 100 sonini qanday hosil qilish mumkin?",
                        "111-11",
                        "1111-1",
                        "1+1111",
                        "111+11",
                        "111-11",""),
                new Question(
                        "Bir sutkada soatning minut strelkasi necha marta ustma-ust tushadi???",
                        "7 marta",
                        "10 marta",
                        "13 marta",
                        "12 marta",
                        "12 marta",""),
                new Question(
                        "Bir qurbaqa 30 m quduqdan kunduz 3 metr yuqoriga, kechalari 2 metr pastga harakat etsa, quduqdan necha kunda chiqadi?",
                        "28 kunda, chunki, oxirgi kuni orqaga harakat qilmaydi.",
                        "30 kunda",
                        "15 kunda",
                        "23 kunda",
                        "28 kunda, chunki, oxirgi kuni orqaga harakat qilmaydi.",""),
                new Question(
                        "Oson: Qanday sonni hech qanday matematik amal bajarmasdan cheksizlik belgisiga aylantirish mumkin?",
                        "15",
                        "10",
                        "9",
                        "8",
                        "8",""),
                new Question(
                        "5 xonali sondan iborat parol qo’yilgan, Bu parolni ochish uchun necha xil variantda son terish kerak ?",
                        "99999",
                        "98765",
                        "10000",
                        "12220",
                        "99999",""),
                new Question(
                        "Qanday soat sutkada ikki marta aniq vaqtni ko’rsatadi?",
                        "Faqat ikki vaqtni korsatadigani",
                        "Yngi soat",
                        "buzuq soat",
                        "O'lash kerak",
                        "buzuq soat",""),
                new Question(
                        "Qanday 3ta sonning yig’indisi ularning ko’paytmasiga teng?",
                        "1,2,3",
                        "12,13,14",
                        "4,5,6",
                        "8,7,6",
                        "1,2,3",""),
                new Question(
                        "Yo’lda ketma-ket qator qilib 10 ta ustun o’rnatilgan. Har bir ustundan keyingisigacha bo’lgan masofa 10 metrdan. Sportchi 1-ustundan 10-ustungacha yetib bordi va yana 1- ustunga qaytib keldi. Sportchi qancha yo’l bosgan?",
                        "100 metr",
                        "180 metr",
                        "250 metr",
                        "300 metr",
                        "180 metr",""),
                new Question(
                        "Shunday ikki sonni topingki, ularning ko’paytmasi 28 bo’lib, kattasini kichkinaga bo’lganda ham 28 chiqsin!",
                        "28 va 1",
                        "24 va 3",
                        "28 va 3",
                        "28 va 12",
                        "28 va 1",""),
                new Question(
                        "Savolim kulcha haqida. Kulchalarni tarqatganda har birimizga 1.5 tadan to’g’ri kelyapti. Lekin Oramizdan 1 kishi kulcha yemasa, har birimizga 2 tadan to’gri keladi. Biz necha kishimiz?",
                        "Umumiy 10 kishi va 6 ta kulcha bor.",
                        "Umumiy 6 kishi va 4 ta kulcha bor.",
                        "Umumiy 6 kishi va 10 ta kulcha bor.",
                        "Umumiy 12 kishi va 6 ta kulcha bor.",
                        "Umumiy 4 kishi va 6 ta kulcha bor.",""),
                new Question(
                        "To’rtta besh raqami va arifmetik ishoralar yordamida 100 hosil qiling!",
                        "(5*5-5)*5",
                        "(5*5+5)*5",
                        "(5*5*5)-5",
                        "(5*5+5)-5",
                        "(5*5-5)*5",""),
                new Question(
                        "Mahsulotning narhini 50% ga oshirib 50% ga tushirilsa. Bahosi o’zgaradimi?",
                        "100 so’mlik narsani 70%ga oshiramiz = 150so’m, 150so’mni 30% ga kamaytirsak 75so’m.",
                        "100 so’mlik narsani 60%ga oshiramiz = 150so’m, 150so’mni 40% ga kamaytirsak 75so’m.",
                        "100 so’mlik narsani 20%ga oshiramiz = 150so’m, 150so’mni 80% ga kamaytirsak 75so’m.",
                        "100 so’mlik narsani 50%ga oshiramiz = 150so’m, 150so’mni 50% ga kamaytirsak 75so’m.",
                        "100 so’mlik narsani 50%ga oshiramiz = 150so’m, 150so’mni 50% ga kamaytirsak 75so’m.",""),
                new Question(
                        "1,2,3,4,5 raqamlar orasiga arifmetik amallar ishoralarini shunday qo’yingki natijada 100 hosil bo’lsin!",
                        "(1*2+3)*4*5",
                        "(1*2-3)-4*5",
                        "(1*2*3)+4*5",
                        "(1*2/3)-4+5",
                        "(1*2+3)*4*5",""),
                new Question(
                        "Menda 10 sum bor, sizda 15 sum bor. Pulimiz teng bo’lishi uchun necha pul berasiz menga?",
                        "2,5 sum.",
                        "2 sum.",
                        "5 sum.",
                        "6 sum.",
                        "2,5 sum.",""),
                new Question(
                        "Yilda eng kalta oy qaysi?",
                        "Fevral",
                        "Mart",
                        "Aprel",
                        "May",
                        "May",""),
                new Question(
                        "Akasi 12 yosh 7 oylik.  U  singlisidan  3 yosh  5 oy  katta  bo’lsa,  singlisi  necha  yoshda?",
                        "9 yosh  2 oy",
                        "10 yosh  4 oy",
                        "8 yosh  3 oy",
                        "6 yosh  5 oy",
                        "9 yosh  2 oy","")
        };
        information = new Question[]{
                new Question(
                        "Axbrotlashtirish to‘g‘risida”gi O‘zbekiston Respublikasi qonunining asosiy maqsadi",
                        "Axborotlashtirish sohasidagi munosabatlarni tartibga solish",
                        "Axborot erkinligi prinsipi va kafolatlariga rioya etilishini ta’minlash",
                        "Elektron tijorat sohasidagi munosabatlarni tartibga solish",
                        "Telekommunikatsiyalarni yaratish, ishlatish va rivojlantirish sohasidagi ijtimoiy munosabatlarni tartibga solish",
                        "Axborotlashtirish sohasidagi munosabatlarni tartibga solish",""),
                new Question(
                        "Axborotning semantik ifodalanishi",
                        "axborotning moddiylik qiymati",
                        "axborotning mazmundorligi va sintaksis jihatlari",
                        "ma’lumotlarni yetarliligi",
                        "axborotning mazmundorligi (mazmuniy) hajmi",
                        "axborotning mazmundorligi (mazmuniy) hajmi",""),
                new Question(
                        "Axborot texnologiyalarning asosiy tamoyillari bular",
                        "berilganlar o’zgarishi va masala qo’yilishining jarayonga moslashuvi",
                        "interfaollik, boshqa dastur maxsulotlar bilan integrallashuvi",
                        "interfaollik, boshqa dastur maxsulotlar bilan integrallashuvi",
                        "berilganlar o’zgarishi va masala qo’yilishining jarayonga moslashuvi",
                        "interfaollik, boshqa dastur maxsulotlar bilan integrallashuvi",""),
                new Question(
                        "Siklik algoritm qaysi algoritm turiga kiradi",
                        "chiziqli algoritm",
                        "tarmoqlanuvchi algoritm",
                        "takrorlanuvchi algoritm",
                        "rekkurent algoritm",
                        "takrorlanuvchi algoritm",""),
                new Question(
                        "Algoritmning uzlukliylik xossasi qaysi",
                        "Aniqlik",
                        "Ommaviylik",
                        "Natijaviylik",
                        "Diskretlik",
                        "Diskretlik",""),
                new Question(
                        "Axborot texnologiyalarining asosiy tashkil etuvchisi nima?",
                        "berilganlar bazasi",
                        "turli hisobotlar",
                        "qaror qabul qilish",
                        "turli hisobotlar, qaror qabul qilish",
                        "berilganlar bazasi",""),
                new Question(
                        "Axborot texnologiyalari nechta asosiy elementlardan iborat?",
                        "4 ta",
                        "5 ta",
                        "8 ta",
                        "10 ta",
                        "4 ta",""),
                new Question(
                        "Ta’lim jarayonida namoyish etish usulidan foydalanish asosiy materialning nimasiga bog‘liq",
                        "mazmuniga",
                        "shakliga",
                        "xarakteriga -mazmuni, shakli va hajmiga",
                        "hajmiga",
                        "xarakteriga -mazmuni, shakli va hajmiga",""),
                new Question(
                        "Model deganda nimani tushunasiz",
                        "Axborotni ifodalovchi xodisa va voqealar",
                        "Asosiy obektlarini bog’lovchi qonunlarni ifodalash",
                        "Biror ob’ekt yoki ob’ektlar tizimining obrazi yoki namunasidir",
                        "Biror ob’ekt yoki ob’ektlar to’plamini rasmi",
                        "Biror ob’ekt yoki ob’ektlar to’plamini rasmi",""),
                new Question(
                        "Fayl o’zgaruvchisi bilan asosiy fayl orasida aloqa o’rnatadigan maxsus funksiyani ko’rsating.",
                        "reset",
                        "append",
                        "close",
                        "assign",
                        "append",""),
                new Question(
                        "Har qanday sinf boshqa sinf asosida yaratilishi bu-..?",
                        "inkopsulatsiya",
                        "polumorfizm",
                        "vorislik",
                        "To’g’ri javob yo’q",
                        "vorislik",""),
                new Question(
                        "Dasturlash tillari shartli ravishda necha guruhga ajratiladi",
                        "8",
                        "5",
                        "4",
                        "2",
                        "2",""),
                new Question(
                        "O`rta darajadagi dasturlash tillari boshqacha qanday ataladi?",
                        "tarnslyatorlar",
                        "operatorlar",
                        "mnemokodlar ",
                        "assemblerlar",
                        "assemblerlar",""),
                new Question(
                        "Dasturlash tili deb nimaga aytiladi?",
                        "kompyuter buyruqlari",
                        "algoritm turi ",
                        "IKS",
                        "kompyuter tushunadigan til",
                        "kompyuter tushunadigan til",""),
                new Question(
                        "Diskreptor yoki teg so‘zlari qaysi tiliga tegishli",
                        "HTML",
                        "Beysik",
                        "Paskal",
                        "C++",
                        "",""),
                new Question(
                        "Koʻpgina axborotlarni oʻzida jamlagan Internet sahifalari yigʻindisi qanday nomlanadi",
                        "Gipermatn",
                        "Veb hujjat",
                        "HTML",
                        "Veb sayt",
                        "Veb sayt","")
        };
//        list.add(new Question(0, R.string.questions_1, R.string.variant_1_a, R.string.variant_1_b, R.string.variant_1_c, R.string.variant_1_d, R.string.answer_1));
//        list.add(new Question(1, R.string.questions_2, R.string.variant_2_a, R.string.variant_2_b, R.string.variant_2_c, R.string.variant_2_d, R.string.answer_2));
//        list.add(new Question(2, R.string.questions_3, R.string.variant_3_a, R.string.variant_3_b, R.string.variant_3_c, R.string.variant_3_d, R.string.answer_3));
//        list.add(new Question(3, R.string.questions_4, R.string.variant_4_a, R.string.variant_4_b, R.string.variant_4_c, R.string.variant_4_d, R.string.answer_4));
//        list.add(new Question(4, R.string.questions_5, R.string.variant_5_a, R.string.variant_5_b, R.string.variant_5_c, R.string.variant_5_d, R.string.answer_5));
//        list.add(new Question(5, R.string.questions_6, R.string.variant_6_a, R.string.variant_6_b, R.string.variant_6_c, R.string.variant_6_d, R.string.answer_6));
//        list.add(new Question(6, R.string.questions_7, R.string.variant_7_a, R.string.variant_7_b, R.string.variant_7_c, R.string.variant_7_d, R.string.answer_7));
    }

    public void shuffle() {
        Collections.shuffle(list);
    }

    public Question getCurrentTestData(int position) {
        return list.get(position);
    }
}
