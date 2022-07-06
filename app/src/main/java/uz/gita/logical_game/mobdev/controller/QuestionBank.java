package uz.gita.logical_game.mobdev.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.logical_game.mobdev.model.Question;

public class QuestionBank {
    private static List<Question> brainList() {
        List<Question> questionList = new ArrayList<>();
        questionList.add(new Question("Daraxtning shoxida qarg’a o’tiribdi. Qarg’ani cho’chitib yubormasdan shoxni arralash uchun nima qilish kerak?",
                "Uxlatish kerak",
                "Bilmadim",
                "O'q otish kerak",
                "Qarg’aning o’zi uchib ketishini kutish.",
                "Qarg’aning o’zi uchib ketishini kutish.",
                ""));
        questionList.add(new Question("Undan qanchalik ko’p olaversangiz, u shunchalik kattalashib boraveradi. U nima?",
                "Chuqur",
                "Qarz",
                "Suv",
                "Havo",
                "Chuqur", ""));
        questionList.add(new Question("Qaysi yegulikni pishirishda qancha tuz solsa ham, u sho’r bo’lib ketmaydi?",
                "Olma",
                "Qaynatilgan tuxum",
                "Sasiska",
                "Makaron",
                "Qaynatilgan tuxum", ""));
        questionList.add(new Question("Kim o’tirgan holda yuradi?",
                "Chol",
                "Shaxmatchi",
                "Piyoda",
                "Haydovchi",
                "Shaxmatchi", ""));
        questionList.add(new Question("U savol emas, lekin unga javob berish kerak?",
                "Telefon",
                "Qo’ng’iroq yoki eshik jiringlashi",
                "Uyqi",
                "Bilmadim",
                "Qo’ng’iroq yoki eshik jiringlashi", ""));
        questionList.add(new Question("Nimani 10 daqiqadan ortiq ushlab turishning iloji yo’q, garchi u o’ta yengil bo’lsa ham",
                "Suv",
                "Havoni",
                "Nafasni",
                "Uyquni",
                "Nafasni", ""));
        questionList.add(new Question("Hamma narsani ko’rayotganda uni ko’rmaysiz. Hech narsani ko’rmaganda esa uni ko’ra olasiz. U nima?",
                "Uy",
                "Havo",
                "Qorong'ulik",
                "Sharpani",
                "Qorong’ulik.", ""));
        questionList.add(new Question("Qadimgi Rimliklarning fikricha, eng shafqatsiz xo’jayinlar – ular. Savol: ular kimlar?",
                "Qullar",
                "Jangchilar",
                "Ayollar",
                "Oqsochlar",
                "Qullar", ""));
        questionList.add(new Question("Bozorda ko’rmaysiz, ko’rsangiz ham olmaysiz, olsangiz ham kiymaysiz, kiysangiz ham ko’rmaysiz. U – ?",
                "Ko'ylak",
                "Kafan",
                "Ayoq kiyim",
                "Uchtasidan bittaso to'g'ri",
                "Kafan", ""));
        questionList.add(new Question("Hazil savol: Eng ko’p haqorat eshitadigan kishilar kimlar?",
                "Futbol hakamlari",
                "Footbolchilar",
                "Deputatlar",
                "Hammasi to'g'ri",
                "Hammasi to'g'ri", ""));
        questionList.add(new Question("Jiddiy savol: U eng arzon va eng qimmat mulk. Undan to’g’ri foydalanilsa dahoga aylanish mumkin. U nima?",
                "Pul",
                "Bilim",
                "Vaqt",
                "Sog'lik",
                "Vaqt", ""));
        questionList.add(new Question("Qiziqarli savol: Diyego, Manfrid va Sid qaysi davrda do’stlashadi?",
                "2021-yilda",
                "Muzlik davrida",
                "Tosh davrida",
                "Bilmadim",
                "Muzlik davrida", ""));
        questionList.add(new Question("Oson savol: Qaysi qushning ko’zlari miyasidan kattaroq bo’ladi?",
                "Tovuqniki",
                "Tuyaqush",
                "Burgut",
                "Lochin",
                "Tuyaqush", ""));
        questionList.add(new Question("Topishmoq: Dengiz ham emas, yer ham emas. Unda kema ham suzmaydi, odam ham yurmaydi?",
                "Botqoqlik",
                "Chol",
                "Rasmdagi Dengiz",
                "Ko'l",
                "Botqoqlik", ""));
        questionList.add(new Question("Topishmoq: Dengiz ham emas, yer ham emas. Unda kema ham suzmaydi, odam ham yurmaydi?",
                "Botqoqlik",
                "Chol",
                "Rasmdagi Dengiz",
                "Ko'l",
                "Botqoqlik", ""));
        questionList.add(new Question("1 U Geyms Kukda kichkina, Arnold Shvartsnegrda katta, Madonna va Kleopatrada umuman yo’q, Rim papasida bor, lekin uni ishlatmaydi. Gap nima haqida ketyapti?",
                "Mushaklar",
                "Sochlar",
                "Familya",
                "Pul",
                "Familiya", ""));
        questionList.add(new Question("Qadimgi Yunonistonda papka ko’targan kishilarni bir nom bilan atashganki biz ularni boshqacha nom bilan ataymiz. Savol: Yunon tilida papka ko’targan kishilar bizda nima deb ataladi?",
                "Ustozlar",
                "O'quvchi",
                "Buxgalter. Bu so’z yunon tilida papka ko’targan kishi ma’nosini bildiradi.",
                "Hisobchi",
                "Buxgalter. Bu so’z yunon tilida papka ko’targan kishi ma’nosini bildiradi.", ""));
        questionList.add(new Question("Psixologlarning fikricha qaysi oy eng shirin oy hisoblanadi?",
                "Asal oyi",
                "Fevral oyi",
                "Yanvar oyi",
                "Mart oyi",
                " Asal oyi", ""));
        questionList.add(new Question(
                "Antiqa savol: 1-b, 2-I, 3-u, 4-t, 5-b. Siz qolgan beshta harfni yozib bering.",
                "6-q,7-e,8-r,9-t,10-x.",
                "6-a,7-d,8-q,9-o,10-l.",
                "6-o,7-y,8-s,9-t,10-o’.",
                "6-h,7-r,8-t,9-e,10-j.",
                "6-o,7-y,8-s,9-t,10-o’.", ""));
        questionList.add(new Question(
                "Mantiqiy savol: Ali va Vali baliq ovlagani chiqishibdi. Ular o’g’illarini olvolishibdi. Valining o’g’lini ismi Mirvali ekan. Ali 4 ta, Vali 3 ta, Mirvali 6 ta baliq tutibdi. Savol: Alining o’g’lini ismi nima?",
                "Alining o’g’lini ismi Vali! Mirvali Valining o’g’li Vali esa Alining o’g’li.",
                "Ali",
                "Vali",
                "To'grisi anlamay qoldim",
                "Alining o’g’lini ismi Vali! Mirvali Valining o’g’li Vali esa Alining o’g’li.", ""));
        questionList.add(new Question(
                "Fransuzlarda “Tuxumdan olmagacha” degan ibora bor. Ular bu koni foyda ekani uchun ham bunga amal qilishadi. Savol: “Tuxumdan olmagacha” iborasida nima nazarda tutilmoqda?",
                "Tuxumni yeb orqasidan olma yeyish urf",
                "Tushlikni tuxumdan boshlab olmada tugatish kerak.",
                "Tuxum bilan olma zo'r ketsa kerakda",
                "Man unday qilmagan bo'lardim",
                "Tushlikni tuxumdan boshlab olmada tugatish kerak.", ""));
        questionList.add(new Question(
                "Qiziqarli fakt: u AQSHliklarda O. K. Y. tarzida berilsa yaponlarda Y. O. K. shaklida, bizda K. O. Y. ketma-ketlikda beriladi. Agar anglagan bo’lsangiz nimaning ketma-ketligi keltirilmoqda?",
                "Yashil,Qora,Oq",
                "Yaxshilik,Qorqmaslik,Kuchlilik",
                "Yo'l,Ko'cha,Ovloq",
                "Kun, oy, yil",
                "Kun, oy, yil", ""));
        questionList.add(new Question(
                "Shunday shahar borki o'n to'rt soniga A harfini qo'shib yozilsa, shaharni nomi kelib chiqadi. U qaysi shahar?",
                "XIVA",
                "Toshkent",
                "Andijon",
                "Buxoro",
                "XIVA", ""));
        questionList.add(new Question(
                "Yerdan osonlikcha ko’tarish mumkin,lekin uni uzoqqa otib bo’lmaydi. Bu nima?",
                "Paxta",
                "qush pati",
                "Yog'och",
                "qalam",
                "qush pati", ""));
        questionList.add(new Question(
                "Tuxumni balandlikdan tashlab yuborishdi. U pastga tomon 3 metr tushganda ham yorilmadi. Buning sababi nimada?",
                "Tuxum emas",
                "Yasama bo'lsa kerak",
                "Tuxum 10 metr balandlikdan tashlangandi. 3 metr o’tgach, sinishi uchun yana 7 metr masofa qolgandi.",
                "G'alatiku",
                "Tuxum 10 metr balandlikdan tashlangandi. 3 metr o’tgach, sinishi uchun yana 7 metr masofa qolgandi.", ""));
        questionList.add(new Question(
                "Yo’llari bor, yurib bo’lmaydi,\n" +
                        "yerlari bor – ekib bo’lmaydi,\n" +
                        "yam-yashil o’tloq bor – yulishni iloji yo’q,\n" +
                        "dengiz, daryo ko’llari bor, ammo suvi yo’q.",
                "Xarita",
                "Yo'l",
                "Taxta",
                "Globus",
                "Xarita", ""));
        questionList.add(new Question(
                "Ko’rganda quvonamiz, lekin baribir ko’zimizni olib qochamiz.",
                "Daraxt",
                "Kino",
                "Oy",
                "Quyosh",
                "Quyosh", ""));
        questionList.add(new Question(
                "Uning balandligi ham, eni va bo’yi ham yo’q, lekin uni o’lchasa bo’ladi. U nima?",
                "Suv",
                "Harorat",
                "Harorat, vaqt.",
                "vaqt",
                "Harorat, vaqt.", ""));
        questionList.add(new Question(
                "Garchi u yengil bo’lsa ham nimani 10 daqiqadan ortiq ushlab turib bo’lmaydi?",
                "Nafasni",
                "Issiq nonni",
                "pichoq",
                "sanchqi",
                "Nafasni", ""));
        questionList.add(new Question(
                "Dengiz tubida qanday tosh bo’lmaydi?",
                "oq tosh",
                "qora tosh",
                "to'rtburchak tosh",
                "Quruq tosh",
                "Quruq tosh", ""));
        questionList.add(new Question(
                "Men suvman va suv yuzida suzib yuribman. Men kimman?",
                "Suv",
                "Muz",
                "Yaproq",
                "Tomchi",
                "Muz", ""));
        questionList.add(new Question(
                "Qaysi so’z har doim xato bo’lib eshitiladi?",
                "Hey",
                "olma",
                "Xato",
                "Men bu",
                "Xato", ""));
        questionList.add(new Question(
                "Ular qanchalik ko’payib ketsa, vazni shunchalik kamayib boraveradi.",
                "G’ovak.",
                "Tuz",
                "Suv",
                "Havo",
                "G’ovak.", ""));
        questionList.add(new Question(
                "Qaysi oyda odamlar kam gapiradilar?",
                "Yanvar",
                "Fevral",
                "Iyul",
                "Sentabr",
                "Fevral", ""));
        questionList.add(new Question(
                "Qaysi oddiy odam oldida podshohlar ham boshlarini egishgan?",
                "Ustalar",
                "Hopizlar",
                "Sartaroshlar",
                "Qassaob",
                "Sartaroshlar", ""));
        questionList.add(new Question(
                "Hamma narsani ko’rayotganingizda uni ko’ra olmaysiz, hech narsani ko’rmaganingizda esa uni ko’ra olasiz. U nima?",
                "Kun",
                "Oy",
                "Quyosh",
                "Qorong’ulik",
                "Qorong’ulik", ""));
        questionList.add(new Question(
                "2+2*2 ning javobi necha bo’ladi?",
                "4",
                "6",
                "8",
                "12",
                "6", ""));
        questionList.add(new Question(
                "7 ta sham yonib turgan edi. Ulardan 3 tasini o’chirib qo’yishdi. Nechta sham qoldi?",
                "3 ta",
                "5 ta",
                "qolmaydi",
                "bilmadim zeriktirib yubording",
                "3 ta", ""));
        questionList.add(new Question(
                "1 dan 100 gacha sonlar orasida nechta 9 bor?",
                "10",
                "15",
                "20",
                "12",
                "20", ""));
        questionList.add(new Question(
                "Yomg’irda quyon qanday daraxt tagida turishi mumkin?",
                "Ho’l daraxt",
                "Quruq daraxt",
                "Daraxt tagidagi daraxt tagida",
                "keyingisi bormi",
                "Ho’l daraxt", ""));
        questionList.add(new Question(
                "Uni chap qo’l bilan ushlasa bo’ladi, o’ng qo’l bilan umuman ushlab bo’lmaydi.",
                "Chap qolni",
                "Oyoqni",
                "O’ng qo’lning tirsagi",
                "Burunni",
                "O’ng qo’lning tirsagi", ""));
        questionList.add(new Question(
                "Hazil: Kun va tun nima bilan tugaydi?",
                "N bilan",
                "Soat bilan",
                "Uyqi bilan",
                "Uxlab yotsam bilmasam buni",
                "N bilan", ""));
        questionList.add(new Question(
                "Qo’llarda 10 ta barmoq bor. 10 ta qo’lda nechta barmoq bor?",
                "60",
                "65",
                "50",
                "40",
                "50", ""));
        questionList.add(new Question(
                "1 kg tosh og’irmi, 1 kg paxta?",
                "Teng",
                "Tosh",
                "Paxta",
                "O'lchab ko'rmaganman",
                "Teng", ""));
        questionList.add(new Question(
                "Yog’ochni 12 bo’lakka bo’lish uchun uni necha marta arralash kerak?",
                "12",
                "13",
                "11",
                "8",
                "11", ""));
        questionList.add(new Question(
                "Hazil: Juda och qoringa nechta tuxum yeyish mumkin?",
                "2 ta",
                "1 ta, keyingilari to’q qoringa yeyiladi",
                "9 ta",
                "manga 4 ta yetadi",
                "1 ta, keyingilari to’q qoringa yeyiladi", ""));
        questionList.add(new Question(
                "Hazil: Erkak kishi o’zining bevasining singlisiga uylanishi mumkinmi?",
                "Ha",
                "Yo’q, o’zi vafot etgan kishi hech kimga uylana olmaydi.",
                "Bo'lsa bilmadim",
                "O'ylash kerak",
                "Yo’q, o’zi vafot etgan kishi hech kimga uylana olmaydi.", ""));
        questionList.add(new Question(
                "Qaysi o’simlik yig’ib olinganidan so’ng, uning 90% yoqib yuboriladi, 10% esa tashlab yuboriladi.",
                "Tamaki",
                "Isiriq",
                "Terak",
                "Kokat",
                "Tamaki", ""));
        questionList.add(new Question(
                "Professor kech soat sakkizda budelnikni 9 ga qo’yib uyquga yotdi. U necha soat uxlaydi?",
                "1 soat",
                "2 soat",
                "4 soat",
                "6 soat",
                "1 soat", ""));
        questionList.add(new Question(
                " Bu xarf deyarli dunyoning barcha alfavitlarida 1 xil yozilishi bilan rekord o’rnatgan. bu qaysi xarf?",
                "J",
                "I",
                "K",
                "O",
                "O", ""));
        Collections.shuffle(questionList);
        return questionList;
    }

    private static List<Question> mathList() {
        List<Question> questionList = new ArrayList<>();
        questionList.add(new Question(
                "Daraxtning 4 ta shoxi bor, har bir shoxida yana 4 tadan shoxchalari bor, bu shoxchalar ham yana 4 tadan mayda shoxchalarga bo’lingan va ularni har birida bittadan olma bor, barcha olmalar sonini hisoblang.",
                "4*3 = 12",
                "4*2*2 = 16",
                "4*4 *4 = 64",
                "4*5 = 20",
                "4*4 *4 = 64", ""));
        questionList.add(new Question(
                "Ilhom bozordan 1 kg. lik tarvuz olib keldi. Tarvuz 99% suvdan iborat edi. Ilhom tarvuzni quyoshda unutib qoldirdi va keyin tarvuz 98% suvdan iborat bo’lib qoldi. Savol: quyoshda qolib ketgandan keyin tarvuzning og’irligi necha kg bo’lgan?",
                "500g",
                "700g",
                "200g",
                "600g",
                "500g", ""));
        questionList.add(new Question(
                "1 ta bakteriya 1 sekundda 2 taga ko’payadi. O’sha 1 ta bakteriyani bir bonka (idish)ga solganimizda 1 soatda liq to’ldi. Qancha vaqtda bakteriya Bonka (idish)ni yarmiga keladi?",
                "20 minut",
                "50 minut",
                "59 minut 59 sekundda bonka yarim bo’ladi, 1 sekunddan keyin esa 2 taga ko’payib bonka to’ladi.",
                "60 minut 30 soniya",
                "59 minut 59 sekundda bonka yarim bo’ladi, 1 sekunddan keyin esa 2 taga ko’payib bonka to’ladi.", ""));
        questionList.add(new Question(
                "Sinfda 30 ta o’quvchi o’qiydi. Ulardan 20 tasi rus tilini biladi. 18 tasi ingliz tilini biladi. Savol: nechtasi har ikkala tilni biladi?",
                "12 ta rus, 8 ta ingliz, 10 har ikki tilni biladi.",
                "8 ta rus, 10 ta ingliz, 12 har ikki tilni biladi.",
                "12 ta rus, 10 ta ingliz, 8 har ikki tilni biladi.",
                "12 ta rus, 12 ta ingliz, 6 har ikki tilni biladi.",
                "12 ta rus, 10 ta ingliz, 8 har ikki tilni biladi.", ""));
        questionList.add(new Question(
                "Uzunligi 36 metr bo’lgan chitni sotuvchi har qaysi xaridorga 3 metrdan sotdi. Savol: sotuvchi chitni necha marta kesgan?",
                "2+3+5=10 marta kesilgan",
                "3+3+6=12 marta kesilgan",
                "1+2+4=7 marta kesilgan",
                "1+2+8=11 marta kesilgan",
                "1+2+8=11 marta kesilgan", ""));
        questionList.add(new Question(
                "Men bir son o’yladim. Uning yarmiga choragini qo’shsak , 18 hosil bo’ladi. Savol: Men qanday son o’ylabman?",
                "12",
                "24",
                "26",
                "28",
                "24", ""));
        questionList.add(new Question(
                "Beshta 1 yordamida 100 sonini qanday hosil qilish mumkin?",
                "111-11",
                "1111-1",
                "1+1111",
                "111+11",
                "111-11", ""));
        questionList.add(new Question(
                "Bir sutkada soatning minut strelkasi necha marta ustma-ust tushadi???",
                "7 marta",
                "10 marta",
                "13 marta",
                "12 marta",
                "12 marta", ""));
        questionList.add(new Question(
                "Bir qurbaqa 30 m quduqdan kunduz 3 metr yuqoriga, kechalari 2 metr pastga harakat etsa, quduqdan necha kunda chiqadi?",
                "28 kunda, chunki, oxirgi kuni orqaga harakat qilmaydi.",
                "30 kunda",
                "15 kunda",
                "23 kunda",
                "28 kunda, chunki, oxirgi kuni orqaga harakat qilmaydi.", ""));
        questionList.add(new Question(
                "Oson: Qanday sonni hech qanday matematik amal bajarmasdan cheksizlik belgisiga aylantirish mumkin?",
                "15",
                "10",
                "9",
                "8",
                "8", ""));
        questionList.add(new Question(
                "5 xonali sondan iborat parol qo’yilgan, Bu parolni ochish uchun necha xil variantda son terish kerak ?",
                "99999",
                "98765",
                "10000",
                "12220",
                "99999", ""));
        questionList.add(new Question(
                "Qanday soat sutkada ikki marta aniq vaqtni ko’rsatadi?",
                "Faqat ikki vaqtni korsatadigani",
                "Yngi soat",
                "buzuq soat",
                "O'lash kerak",
                "buzuq soat", ""));
        questionList.add(new Question(
                "Qanday 3ta sonning yig’indisi ularning ko’paytmasiga teng?",
                "1,2,3",
                "12,13,14",
                "4,5,6",
                "8,7,6",
                "1,2,3", ""));
        questionList.add(new Question(
                "Yo’lda ketma-ket qator qilib 10 ta ustun o’rnatilgan. Har bir ustundan keyingisigacha bo’lgan masofa 10 metrdan. Sportchi 1-ustundan 10-ustungacha yetib bordi va yana 1- ustunga qaytib keldi. Sportchi qancha yo’l bosgan?",
                "100 metr",
                "180 metr",
                "250 metr",
                "300 metr",
                "180 metr", ""));
        questionList.add(new Question(
                "Shunday ikki sonni topingki, ularning ko’paytmasi 28 bo’lib, kattasini kichkinaga bo’lganda ham 28 chiqsin!",
                "28 va 1",
                "24 va 3",
                "28 va 3",
                "28 va 12",
                "28 va 1", ""));
        questionList.add(new Question(
                "Savolim kulcha haqida. Kulchalarni tarqatganda har birimizga 1.5 tadan to’g’ri kelyapti. Lekin Oramizdan 1 kishi kulcha yemasa, har birimizga 2 tadan to’gri keladi. Biz necha kishimiz?",
                "Umumiy 10 kishi va 6 ta kulcha bor.",
                "Umumiy 6 kishi va 4 ta kulcha bor.",
                "Umumiy 6 kishi va 10 ta kulcha bor.",
                "Umumiy 12 kishi va 6 ta kulcha bor.",
                "Umumiy 4 kishi va 6 ta kulcha bor.", ""));
        questionList.add(new Question(
                "To’rtta besh raqami va arifmetik ishoralar yordamida 100 hosil qiling!",
                "(5*5-5)*5",
                "(5*5+5)*5",
                "(5*5*5)-5",
                "(5*5+5)-5",
                "(5*5-5)*5", ""));
        questionList.add(new Question(
                "Mahsulotning narhini 50% ga oshirib 50% ga tushirilsa. Bahosi o’zgaradimi?",
                "100 so’mlik narsani 70%ga oshiramiz = 150so’m, 150so’mni 30% ga kamaytirsak 75so’m.",
                "100 so’mlik narsani 60%ga oshiramiz = 150so’m, 150so’mni 40% ga kamaytirsak 75so’m.",
                "100 so’mlik narsani 20%ga oshiramiz = 150so’m, 150so’mni 80% ga kamaytirsak 75so’m.",
                "100 so’mlik narsani 50%ga oshiramiz = 150so’m, 150so’mni 50% ga kamaytirsak 75so’m.",
                "100 so’mlik narsani 50%ga oshiramiz = 150so’m, 150so’mni 50% ga kamaytirsak 75so’m.", ""));
        questionList.add(new Question(
                "1,2,3,4,5 raqamlar orasiga arifmetik amallar ishoralarini shunday qo’yingki natijada 100 hosil bo’lsin!",
                "(1*2+3)*4*5",
                "(1*2-3)-4*5",
                "(1*2*3)+4*5",
                "(1*2/3)-4+5",
                "(1*2+3)*4*5", ""));
        questionList.add(new Question(
                "Menda 10 sum bor, sizda 15 sum bor. Pulimiz teng bo’lishi uchun necha pul berasiz menga?",
                "2,5 sum.",
                "2 sum.",
                "5 sum.",
                "6 sum.",
                "2,5 sum.", ""));
        questionList.add(new Question(
                "Yilda eng kalta oy qaysi?",
                "Fevral",
                "Mart",
                "Aprel",
                "May",
                "May", ""));
        questionList.add(new Question(
                "Akasi 12 yosh 7 oylik.  U  singlisidan  3 yosh  5 oy  katta  bo’lsa,  singlisi  necha  yoshda?",
                "9 yosh  2 oy",
                "10 yosh  4 oy",
                "8 yosh  3 oy",
                "6 yosh  5 oy",
                "9 yosh  2 oy", ""));

        Collections.shuffle(questionList);
        return questionList;
    }

    private static List<Question> infoList() {
        List<Question> questionList = new ArrayList<>();
        questionList.add(new Question(
                "Axbrotlashtirish to‘g‘risida”gi O‘zbekiston Respublikasi qonunining asosiy maqsadi",
                "Axborotlashtirish sohasidagi munosabatlarni tartibga solish",
                "Axborot erkinligi prinsipi va kafolatlariga rioya etilishini ta’minlash",
                "Elektron tijorat sohasidagi munosabatlarni tartibga solish",
                "Telekommunikatsiyalarni yaratish, ishlatish va rivojlantirish sohasidagi ijtimoiy munosabatlarni tartibga solish",
                "Axborotlashtirish sohasidagi munosabatlarni tartibga solish", ""));
        questionList.add(new Question(
                "Axborotning semantik ifodalanishi",
                "axborotning moddiylik qiymati",
                "axborotning mazmundorligi va sintaksis jihatlari",
                "ma’lumotlarni yetarliligi",
                "axborotning mazmundorligi (mazmuniy) hajmi",
                "axborotning mazmundorligi (mazmuniy) hajmi", ""));
        questionList.add(new Question(
                "Axborot texnologiyalarning asosiy tamoyillari bular",
                "berilganlar o’zgarishi va masala qo’yilishining jarayonga moslashuvi",
                "interfaollik, boshqa dastur maxsulotlar bilan integrallashuvi",
                "interfaollik, boshqa dastur maxsulotlar bilan integrallashuvi",
                "berilganlar o’zgarishi va masala qo’yilishining jarayonga moslashuvi",
                "interfaollik, boshqa dastur maxsulotlar bilan integrallashuvi", ""));
        questionList.add(new Question(
                "Siklik algoritm qaysi algoritm turiga kiradi",
                "chiziqli algoritm",
                "tarmoqlanuvchi algoritm",
                "takrorlanuvchi algoritm",
                "rekkurent algoritm",
                "takrorlanuvchi algoritm", ""));
        questionList.add(new Question(
                "Algoritmning uzlukliylik xossasi qaysi",
                "Aniqlik",
                "Ommaviylik",
                "Natijaviylik",
                "Diskretlik",
                "Diskretlik", ""));
        questionList.add(new Question(
                "Axborot texnologiyalarining asosiy tashkil etuvchisi nima?",
                "berilganlar bazasi",
                "turli hisobotlar",
                "qaror qabul qilish",
                "turli hisobotlar, qaror qabul qilish",
                "berilganlar bazasi", ""));
        questionList.add(new Question(
                "Axborot texnologiyalari nechta asosiy elementlardan iborat?",
                "4 ta",
                "5 ta",
                "8 ta",
                "10 ta",
                "4 ta", ""));
        questionList.add(new Question(
                "Ta’lim jarayonida namoyish etish usulidan foydalanish asosiy materialning nimasiga bog‘liq",
                "mazmuniga",
                "shakliga",
                "xarakteriga -mazmuni, shakli va hajmiga",
                "hajmiga",
                "xarakteriga -mazmuni, shakli va hajmiga", ""));
        questionList.add(new Question(
                "Model deganda nimani tushunasiz",
                "Axborotni ifodalovchi xodisa va voqealar",
                "Asosiy obektlarini bog’lovchi qonunlarni ifodalash",
                "Biror ob’ekt yoki ob’ektlar tizimining obrazi yoki namunasidir",
                "Biror ob’ekt yoki ob’ektlar to’plamini rasmi",
                "Biror ob’ekt yoki ob’ektlar to’plamini rasmi", ""));
        questionList.add(new Question(
                "Fayl o’zgaruvchisi bilan asosiy fayl orasida aloqa o’rnatadigan maxsus funksiyani ko’rsating.",
                "reset",
                "append",
                "close",
                "assign",
                "append", ""));
        questionList.add(new Question(
                "Har qanday sinf boshqa sinf asosida yaratilishi bu-..?",
                "inkopsulatsiya",
                "polumorfizm",
                "vorislik",
                "To’g’ri javob yo’q",
                "vorislik", ""));
        questionList.add(new Question(
                "Dasturlash tillari shartli ravishda necha guruhga ajratiladi",
                "8",
                "5",
                "4",
                "2",
                "2", ""));
        questionList.add(new Question(
                "O`rta darajadagi dasturlash tillari boshqacha qanday ataladi?",
                "tarnslyatorlar",
                "operatorlar",
                "mnemokodlar ",
                "assemblerlar",
                "assemblerlar", ""));
        questionList.add(new Question(
                "Dasturlash tili deb nimaga aytiladi?",
                "kompyuter buyruqlari",
                "algoritm turi ",
                "IKS",
                "kompyuter tushunadigan til",
                "kompyuter tushunadigan til", ""));
        questionList.add(new Question(
                "Diskreptor yoki teg so‘zlari qaysi tiliga tegishli",
                "HTML",
                "Beysik",
                "Paskal",
                "C++",
                "", ""));
        questionList.add(new Question(
                "Koʻpgina axborotlarni oʻzida jamlagan Internet sahifalari yigʻindisi qanday nomlanadi",
                "Gipermatn",
                "Veb hujjat",
                "HTML",
                "Veb sayt",
                "Veb sayt", ""));
        Collections.shuffle(questionList);
        return questionList;
    }

    private static List<Question> historyList() {
        List<Question> questionList = new ArrayList<>();
        questionList.add(new Question(
                "Tarix fanidaodamning kelibchiqishi va rivojlanishi qaysi ma’lumotlarga asoslanibo‘rganiladi?",
                "arxeologiya va etnografiya",
                "arxeologiya va antropologiya",
                "antropologiya va lingvistika",
                "antropologiya va etnografiya",
                "arxeologiya va antropologiya",
                ""
        ));
        questionList.add(new Question(
                "Quyidagilarning qaysi biri O‘rta Osiyo tarixiga oid eng qadimgi manba hisoblanadi?",
                "«Avesto» kitobi",
                "Gerodotning «Tarix» asari",
                "Hindlarning «Rigveda» kitobi",
                "Strabonning «Geografiya» asari",
                "«Avesto» kitobi",
                ""
        ));
        questionList.add(new Question(
                "Ibtidoiy jamoa tuzumining qaysi davrida kamon va o‘q ixtiro qilingan?",
                "Eneolitda",
                "Paleolitda",
                "Mezolitda",
                "Ilk paleolitda",
                "Mezolitda",
                ""
        ));
        questionList.add(new Question(
                "O‘rta Osiyo tarixida quyidagilardan qaysi biri qadimiyroq?",
                "Samarqanddagi Siyobcha yodgorligi",
                "Kulolchilik charxining paydo bo‘lishi",
                "Selungur manzilgohi",
                "Sapollarga naqsh tushirilishi",
                "Selungur manzilgohi",
                ""
        ));
        questionList.add(new Question(
                "Rossiyaning O‘rta Osiyoga qiziqishi kim davridan boshlandi?",
                "Petr I",
                "Ekaterina I",
                "Ekaterina II",
                "Aleksanr I",
                "Petr I",
                ""
        ));
        questionList.add(new Question(
                "O‘zbekiston tarixining eng qadimgi bo‘limini aniqlang",
                "ibtidoiy san’at tarixi",
                "ishlab chiqarish xo‘jaliklari tarixi",
                "ma’naviy madaniyat tarixi ",
                "ibtidoiy, diniy tasavvurlar tarixi",
                "ibtidoiy, diniy tasavvurlar tarixi",
                ""
        ));
        questionList.add(new Question(
                "Quyidagi tarixchilardan qaysi biri milodiy I asrda yashagan?",
                "Ktesiy",
                "Kursiy Ruf ",
                "Arrian",
                "Strabon",
                "Arrian",
                ""
        ));
        questionList.add(new Question(
                "Qaysi qadimgi tarixchi Amudaryoni Araks deb nomlagan?",
                "Gerodot",
                "Kursiy Ruf",
                "Ktesiy",
                "Arrian",
                "Arrian",
                ""
        ));
        questionList.add(new Question(
                "Quyida keltirilgan shaxslardan qaysi biri Kushon davlati podshosi bo‘lgan?",
                "Antiox",
                "Vima Kadfiz",
                "Demetriy",
                "Kserks",
                "Vima Kadfiz",
                ""
        ));
        questionList.add(new Question(
                "Markaziy Osiyo davlatlari qachon arab halifaligiga qo‘shib olindi",
                "715-718 yil",
                "708 yil",
                "674 yil",
                "780 yi",
                "715-718 yil",
                ""
        ));
        questionList.add(new Question(
                "O‘zbekistonda quyidagi konlarning qaysi biridan oltin qazib olinmaydi?",
                "Marjonbuloq, Muruntov",
                "Qalmoqqir, Muruntov",
                "Uchquduq, Zarafshon",
                "Ohangaron, Shorg‘un",
                "Ohangaron, Shorg‘un",
                ""
        ));
        questionList.add(new Question(
                "Somoniylar davlatiga asos solgan kishi kim?",
                "Axmad ibn asad",
                "Ismoil ibn Axmad",
                "Nux ibn Asad",
                "Axmad ibn Ismoil",
                "Nux ibn Asad",
                ""
        ));
        questionList.add(new Question(
                "Kuyidagi qaysi asar somoniylar davlati tarixiga oiddir?",
                "Siyosatnoma",
                "Xudud al olam",
                "Buxoro tarixi",
                "SHoxnoma",
                "Buxoro tarixi",
                ""
        ));
        questionList.add(new Question(
                "Buxoroda Maxmud Tarobiy boshchiligidagi qo`zg`olon qachon bo`lib o`tdi?",
                "1225 yilda",
                "1241 yilda",
                "1238 yilda",
                "1239 yilda",
                "1238 yilda",
                ""
        ));
        questionList.add(new Question(
                "60-yillarda O`zbekistonga boshka respublikalardan ko`plab ishchi texnik kadrlarning okib kelishining asosiy sababi nimada edi?",
                "O`zbekistondagi sharoitga zid ravishda ko`plab sanoat korxonalarining kurilishi",
                "O`zbekiston axolisining kamligi",
                "Ishchilar uchun turli imtiyozlarning mavjudligi",
                "Ish xakining balandligi",
                "O`zbekistondagi sharoitga zid ravishda ko`plab sanoat korxonalarining kurilishi",
                ""
        ));
        questionList.add(new Question(
                "80-yillarda milliy daromad usish sur’atlarining pasayib ketishi asosiysababi nimada?",
                "Ilmiy-texnik yutuklarning ishlab chiqarish ga sust tatbik kilinishi;",
                "Sanoat korxonalarining rekonstruksiya kilinishi",
                "Moddiy manfaatdorlikning yukligi",
                "Mutaxassislarning etishmasligi",
                "Ilmiy-texnik yutuklarning ishlab chiqarish ga sust tatbik kilinishi;",
                ""
        ));
        questionList.add(new Question(
                "1951 yilda noxak millatchilikda ayblangan yozuvchilarni kursating",
                "M. SHayxzoda, Mirmuxsin",
                "SHukrullo, I.Sultonov",
                "I.Sultonov, Mirmuxsin",
                "M.SHayxzoda, SHukrullo",
                "M.SHayxzoda, SHukrullo",
                ""
        ));
        questionList.add(new Question(
                "Tariximizda shaxsga sig`inish mafkurasining usib borishi nechanchi yillarga to`g`ri keladi?",
                "1920 yillarning boshlariga",
                "1920 yillarning oxiriga",
                "1930 yillarga",
                "1940 yillarga",
                "1930 yillarga",
                ""
        ));
        questionList.add(new Question(
                "Eftaliylardavridak′aysidavlatx′ukumdorlariˇuzsaroylariniUˇrtaOsiyodankeltirilganranglishishalarbilanbezatganlar?",
                "Xitoy imperatorlari",
                "Eron shax′anshoxlari",
                "Vizantiya imperatorlari",
                "Xindiston rojalari",
                "Xitoy imperatorlari",
                ""
        ));
        questionList.add(new Question(
                "Qoraxoniylar davlati asoschisini aniqlang",
                "Xorun Bug‘roxon",
                "Abdulkarim Sotuq Bug‘roxon",
                "Ibrohim Bo‘ritegin",
                "Nasr Eloqxon",
                "Xorun Bug‘roxon",
                ""
        ));

        Collections.shuffle(questionList);
        return questionList;
    }

    private static List<Question> sportList() {
        List<Question> questionList = new ArrayList<>();
        questionList.add(new Question("Amerikaning Tampa Bay Rays beysbol jamoasi o'z uy o'yinlarini qayerda o'tkazadi?",
                "Tropikana maydoni",
                "Yankee Stadium",
                "Wembley Stadium",
                "Singapore National Stadium",
                "Tropikana maydoni",
                ""
        ));
        questionList.add(new Question("Birinchi marta 1907 yilda bo'lib o'tgan, Vaterlo kubogi qaysi sport turida bahslashadi?",
                "Suzish",
                "Yugurish",
                "Basketbool",
                "Yashil toj idishlari",
                "Yashil toj idishlari",
                ""
        ));
        questionList.add(new Question("2001 yilda BBCning \"Yilning Sport kishisi\" kim bo'lgan?",
                "Jordon",
                "Devid Bekxem",
                "Messi",
                "Ranoldo",
                "Devid Bekxem",
                ""
        ));
        questionList.add(new Question("1930 yilda Hamdo'stlik o'yinlari qayerda bo'lib o'tdi?",
                "New York",
                "Brazilya",
                "Hamilton, Kanada",
                "Xitoy",
                "Hamilton, Kanada",
                ""
        ));
        questionList.add(new Question("\"Suv polosi\" jamoasida nechta futbolchi bor?",
                "7 ta",
                "5 ta",
                "10 ta",
                "6 ta",
                "7 ta",
                ""
        ));
        questionList.add(new Question("Neil Adams qaysi sport turidan ustun edi?",
                "Judo",
                "Sambo",
                "Kurash",
                "O'q otish",
                "Judo",
                ""
        ));
        questionList.add(new Question("1982 yilda Ispaniya chempionatida qaysi davlat G'arbiy Germaniyani 3-1 hisobida mag'lubiyatga uchratgan?",
                "Argentina",
                "Rassiya",
                "Brazilya",
                "Italiya",
                "Italiya",
                ""
        ));
        questionList.add(new Question("Bredford Siti futbol klubining laqabi nima?",
                "Yashil maxluq",
                "Bantamlar",
                "Nemis mashinasi",
                "Qizillar",
                "Bantamlar",
                ""
        ));
        questionList.add(new Question("1993, 1994 va 1996 yillarda Amerika futbol superkubogini qaysi jamoa yutgan?",
                "Dallas kovboylari",
                "Penn State Nittany sherlari",
                "Burgutlar",
                "Regbini bilmas ekanman",
                "Dallas kovboylari",
                ""
        ));
        questionList.add(new Question("2000 va 2001 yillarda \"Derbi\" ni nima yutdi?",
                "Qizillar",
                "Dallas kovboylari",
                "Penn State Nittany sherlari",
                "Rapid Ranger",
                "Rapid Ranger",
                ""
        ));
        questionList.add(new Question("Qaysi tennischi Mariya Sharapovani 2012-6, 3: 6 hisobida mag'lubiyatga uchratgan 0 yilgi \"Ayollar xonimlari\" musobaqasida g'olib chiqqan?",
                "Victoria Azarenka",
                "Bjorn Borg",
                "Roger Federer",
                "Jimmy Connors",
                "Victoria Azarenka",
                ""
        ));
        questionList.add(new Question("2003 yilda regbi bo'yicha Jahon chempionatida Avstraliyani 20-17 hisobida mag'lub etgan Angliya uchun qo'shimcha vaqtni kim kiritdi?",
                "Pete Sampras",
                "Roger Federer",
                "Jonni Uilkinson",
                "Michael Chang",
                "Jonni Uilkinson",
                ""
        ));
        questionList.add(new Question("Jeyms Naismit 1891 yilda qanday sport o'yinini ixtiro qildi?",
                "Suzish",
                "Tennis",
                "Valebool",
                "Basketbol",
                "Basketbol",
                ""
        ));
        questionList.add(new Question("Superkubokning final o'yinida vatanparvarlar necha marta ishtirok etishgan?",
                "11",
                "12",
                "2",
                "4",
                "11",
                ""
        ));
        questionList.add(new Question("Wimbledon-2017 finalda Venera Uilyamni hayratda qoldirib, 14-urug 'tomonidan qo'lga kiritildi. U kim?",
                "Ilie Nastase",
                "Jim Courier",
                "Garbiñe Muguruza",
                "Arthur Ashe",
                "Garbiñe Muguruza",
                ""
        ));
        questionList.add(new Question("Olimpiya o'yinlarida parvoz qiladigan jamoada nechta futbolchi bor?",
                "3 ta",
                "2 ta",
                "12 ta",
                "4 ta",
                "4 ta",
                ""
        ));
        questionList.add(new Question("2020 yilga kelib, Snukerning Jahon chempionatida g'olib bo'lgan so'nggi uelslik kim?",
                "Mark Uilyams",
                "Ken Rosewall",
                "Rafael Nada",
                "Boris Becker",
                "Mark Uilyams",
                ""
        ));
        questionList.add(new Question("Beysbolning qaysi Amerika shahrining asosiy ligasi jamoasi kardinallar nomi bilan atalgan?",
                "Ivan Lendl",
                "Sit Louis",
                "John McEnroe",
                "Yevgeny Kafelnikov",
                "Sit Louis",
                ""
        ));
        questionList.add(new Question("Sinxron suzish Olimpiya o'yinlarida beshta oltin medal bilan qaysi davlat 2000 yildan beri o'yinlarga qaytadan kirganidan beri ustunlik qilmoqda?",
                "Korea",
                "Xitoy",
                "USA",
                "Rossiya",
                "Rossiya",
                ""
        ));
        questionList.add(new Question("Kanadalik Konnor MakDavid qaysi sport turida ko'tarilgan yulduz?",
                "Muzli xokkey",
                "Tennis",
                "Gimnastika",
                "Suzish",
                "Muzli xokkey",
                ""
        ));

        Collections.shuffle(questionList);
        return questionList;
    }

    private static List<Question> movieList() {
        List<Question> questionList = new ArrayList<>();
        questionList.add(new Question("Godfather birinchi yilda qaysi yilda chiqarilgan?",
                "1973",
                "1971",
                "1970",
                "1972",
                "1972",
                ""
        ));
        questionList.add(new Question(" Qaysi aktyor Filadelfiya (1993) va Forrest Gump (1994) filmlari uchun eng yaxshi aktyor Oskar mukofotiga sazovor bo'lgan?",
                "Tom Hanks",
                "Tonny Kroos",
                "Jim kerry",
                "Jekki Chan",
                "Tom Hanks",
                ""
        ));
        questionList.add(new Question("Alfred Xitkok 1927-1976 yillarda - 33, 35 yoki 37 yillarda suratga olingan filmlarida nechta o'z-o'zini ko'rsatuvchi kinolar yaratgan?",
                "41",
                "39",
                "38",
                "37",
                "37",
                ""
        ));
        questionList.add(new Question("1982 yilda qaysi film kino muxlislari tomonidan yosh, otasiz shahar atrofidagi o'g'il va yo'qolgan, mehribon va boshqa sayyoradan mehmonlar o'rtasidagi muhabbatni tasvirlashi uchun katta qabul qilindi?",
                "bilmadim",
                "Va erdan tashqari",
                "Savol xato eamsmi",
                "Kinoni bilmas ekanman",
                "Va erdan tashqari",
                ""
        ));
        questionList.add(new Question("1964 yilgi Meri Poppins filmida Meri Poppins qaysi aktrisada o'ynagan?",
                "Julie Andrews",
                "Tom Hanks",
                "Jim kerry",
                ".....",
                "Julie Andrews",
                ""
        ));
        questionList.add(new Question("1963 yilda Charlz Bronsonning qaysi klassik filmi paydo bo'ldi?",
                "Arvoh",
                "Forsaj",
                "Qasoskorlar",
                "Buyuk qochish",
                "Buyuk qochish",
                ""
        ));
        questionList.add(new Question("Sandra Bullock 1995 yil qaysi filmda Angela Bennett - Kurash Ernest Xeminguey, Tarmoqmi yoki 28 kunlik obrazini ijro etgan?",
                "Smit",
                "Bob",
                "Edi",
                "Jon",
                "Net",
                ""
        ));
        questionList.add(new Question("Qaysi Yangi Zelandiyalik ayol rejissyor ushbu filmlarni suratga olgan - \"Kesilgan\" (2003), \"Suv \u200B\u200Bkundaligi\" (2006) va \"Yorqin yulduz\" (2009)?",
                "Jim Courier",
                "Ilie Nastase",
                "Manuel Orantes",
                "Jane Campion",
                "Jane Campion",
                ""
        ));
        questionList.add(new Question("2003 yilda Nemoni topish filmida Nemo qahramoni uchun qaysi aktyor ovoz bergan?",
                "Tom Hanks",
                "Julie Andrews",
                "Aleksandr Gould",
                "Jane Campion",
                "Aleksandr Gould",
                ""
        ));
        questionList.add(new Question("\"Britaniyadagi eng zo'ravon mahbus\" deb nomlangan qaysi mahbus 2009 yil filmining mavzusi bo'lgan?",
                "Charlz Bronson",
                "Jane Campion",
                "Aleksandr Gould",
                "Tom Hanks",
                "Charlz Bronson",
                ""
        ));
        questionList.add(new Question("Krisian Beyl rolini o'ynagan qaysi 2008 filmida: \"Men seni o'ldirmaydigan narsaga ishonaman, shunchaki sizni ... notanish qiladi\" deb aytilganmi?",
                "Charlz Bronson",
                "Dark Knight",
                "Aleksandr Gould",
                "Jane Campion",
                "Dark Knight",
                ""
        ));
        questionList.add(new Question("KillBill Vol I & II filmida Tokio jinoyatchisi boshlig'i O-Ren Ishii rolini o'ynagan amerikalik aktrisa.",
                "Lucy Liu",
                "Dark Knight",
                "Charlz Bronson",
                "Shakiri",
                "Lucy Liu",
                ""
        ));
        questionList.add(new Question("Xyu Jekman qaysi filmda Kristian Beyl o'ynagan qahramonga raqib sehrgar sifatida rol o'ynagan?",
                "Prestij",
                "Lucy Liu",
                "Dark Knight",
                "Campion",
                "Prestij",
                ""
        ));
        questionList.add(new Question("Kinorejissyor, \"Bu ajoyib hayot\" filmi bilan mashhur bo'lgan Frenk Kapra qaysi O'rta Osiyoda tug'ilgan?",
                "Italiya",
                "Xitoy",
                "Yaponiya",
                "USA",
                "Italiya",
                ""
        ));
        questionList.add(new Question("Liend Rojdestvoning qaysi filmdagi aktyori Silvester Stallone bilan birga \"Expendables\" filmida rol o'ynagan?",
                "Jeyson Statham",
                "Mickey Rourke",
                "Karen Gillan",
                "Ellen Page",
                "Jeyson Statham",
                ""
        ));
        questionList.add(new Question("\"9½ hafta\" filmida qaysi amerikalik aktyor Kim Bassinger bilan birga o'ynagan?",
                "Jeyson Statham",
                "Karen Gillan",
                "Ellen Page",
                "Mickey Rourke",
                "Mickey Rourke",
                ""
        ));
        questionList.add(new Question("\"Qasoskorlar: Cheksiz urush\" filmida \"Doktor Kim\" ning qaysi sobiq aktrisasi tumanlik rolini o'ynagan?",
                "Karen Gillan",
                "Mickey Rourke",
                "Ellen Page",
                "Smit",
                "Karen Gillan",
                ""
        ));
        questionList.add(new Question("2007 yil \"Juno\" filmida Maykl Cera qarshisida Juno MacGuff rolini kim ijro etgan?",
                "Ellen Page",
                "Jon",
                "Karen Gillan",
                "Ellen Page",
                "Ellen Page",
                ""
        ));
        questionList.add(new Question("2015-yillarda mo'ynali buyumlar savdosi ekspeditsiyasida chegarachilar va ayiq tomonidan haydalgandan so'ng omon qolish uchun kurashgan 1820 yilgi filmning nomi nima?",
                "Qizil halqa",
                "Revenant",
                "O'lim bog'i",
                "Havfli uy",
                "Revenant",
                ""
        ));
        questionList.add(new Question("Kris Xemsworth va Daniel Bryul rolini o'ynagan qaysi film Jeyms Xunt va Niki Lauda o'rtasidagi raqobatning 1-formulasini tasvirlaydi?",
                "bob",
                "smit",
                "revenant",
                "kamich",
                "kamich",
                ""
        ));

        Collections.shuffle(questionList);
        return questionList;
    }

    private static List<Question> mixedList() {
        List<Question> questionList = new ArrayList<>();
        questionList.add(new Question("Titanik Atlantika okeanida, Sautgemptondan ilk safarida 15 aprelda qaysi yili cho'kdi?",
                "1912",
                "1913",
                "1920",
                "1910",
                "1912",
                ""
        ));
        questionList.add(new Question("1958 yilda suratga olingan va sotilgan birinchi \"Carry On\" filmining sarlavhasi nima?",
                "Uyga yo'l yoq",
                "Qayta tirilish",
                "Urush bu o'lim",
                "Serjantni olib boring",
                "Serjantni olib boring",
                ""
        ));
        questionList.add(new Question("Janubiy Koreyadagi eng yirik texnologiya kompaniyasining nomi nima?",
                "Mi",
                "Iphone",
                "Samsung",
                "Lg",
                "Samsung",
                ""
        ));
        questionList.add(new Question("1970-yillarda Showaddywaddy pop guruhida qaysi qo'shiqchi qatnashgan?",
                "Deyv Bartram",
                "Jamie Oliver",
                "Tom Hanks",
                "Karen Gillan",
                "Deyv Bartram",
                ""
        ));
        questionList.add(new Question("Hozir taniqli televizion oshpaz sakkiz yoshida ota-onasining \"Kriketchilar\" pabida, Klaveringda, Essexda oshpazlik qilishni boshladi?",
                "Jamie Oliver",
                "Jeyson Statham",
                "Mickey Rourke",
                "Jon Smit",
                "Jamie Oliver",
                ""
        ));
        questionList.add(new Question("2012 yanvar kuni Lakeside Country Club-da bo'lib o'tgan BDO Jahon chempionatida qaysi gollandiyalik dart o'yinchisi Frimley Green?",
                "Lucy Liu",
                "Jane Campion",
                "Julie Andrews",
                "Xristian Kist",
                "Xristian Kist",
                ""
        ));
        questionList.add(new Question("Xans Kristian Oersted 1825 yilda qaysi metalni kashf etgan?",
                "kumush",
                "aluminiy",
                "oltin",
                "mis",
                "aluminiy",
                ""
        ));
        questionList.add(new Question("Portugaliyaning poytaxti nima?",
                "Washington",
                "Andorra",
                "Lissabon",
                "Toshkent",
                "Lissabon",
                ""
        ));
        questionList.add(new Question("Inson tanasi kuniga qancha nafas oladi?",
                "Kuniga 20,000",
                "Kuniga 10,000",
                "Kuniga 1,000",
                "Kuniga 100,000",
                "Kuniga 20,000",
                ""
        ));
        questionList.add(new Question("1841 yildan 1846 yilgacha Buyuk Britaniyaning Bosh vaziri kim edi?",
                "Jonni Uilkinson",
                "Sit Louis",
                "Mark Uilyams",
                "Robert Peel",
                "Robert Peel",
                ""
        ));
        questionList.add(new Question("Kumush uchun kimyoviy belgi nima?",
                "Ag",
                "H",
                "O",
                "P",
                "Ag",
                ""
        ));
        questionList.add(new Question("1934 yilda yo'l xavfsizligini yaxshilash uchun kim mushukning ko'zlarini ixtiro qildi?",
                "Persi Shou",
                "Piter Durand",
                "Smit",
                "Alex",
                "Persi Shou",
                ""
        ));
        questionList.add(new Question("Dunyodagi eng kichkina qush nima?",
                "Boy qush",
                "To'ti",
                "Tuya qush",
                "Bee Hummingbird",
                "Bee Hummingbird",
                ""
        ));
        questionList.add(new Question("Professionallar safida \"Bodi\" va \"Doyl\" rollarini kim ijro etgan?",
                "Deyv Bartram va Jamie Oliver",
                "Lyuis Kollinz va Martin Shou",
                "Dark Knight va Lucy Liu",
                "Persi Shou va Smitlar",
                "Lyuis Kollinz va Martin Shou",
                ""
        ));
        questionList.add(new Question("Barbie-ning to'liq ismi, qo'g'irchoq nima?",
                "Barbara Millisent Roberts",
                "Barbara",
                "Millisent",
                "Roberts",
                "Barbara Millisent Roberts",
                ""
        ));
        questionList.add(new Question("Pol Hunn 118.1 dekibel chastotada qayd etilgan rekord nimaga ega?",
                "eng pas tovush",
                "tezlikni",
                "Eng baland tovush",
                "oqimni",
                "Eng baland tovush",
                ""
        ));
        questionList.add(new Question("Al Capone-ning vizitkasida nima ish bilan shug'ullanganligi ko'rsatilgan?",
                "Ishlatilgan mebel sotuvchisi",
                "Usta",
                "Duradgon",
                "Shifokor",
                "Ishlatilgan mebel sotuvchisi",
                ""
        ));
        questionList.add(new Question("Ninachining hayoti qanday?",
                "3 soat",
                "2 kun",
                "12 soat",
                "24 soat",
                "24 soat",
                ""
        ));
        questionList.add(new Question("Birinchi Tonka yuk mashinasi qaysi yilda ishlab chiqarilgan - 1945, 1947 yoki 1949?",
                "1944",
                "1947",
                "1946",
                "1948",
                "1947",
                ""
        ));
        questionList.add(new Question("1810 yilda oziq-ovqatni saqlash uchun qalayni kim ixtiro qildi?",
                "Xristian Kist",
                "Deyv Bartram",
                "Piter Durand",
                "Lissabon",
                "Piter Durand",
                ""
        ));

        Collections.shuffle(questionList);
        return questionList;
    }

    public static List<Question> getQuestion(String selectedTopicName) {
        switch (selectedTopicName) {
            case "Mantiqiy": {
                return brainList();
            }
            case "Matematik": {
                return mathList();
            }
            case "I Texnalogiya": {
                return infoList();
            }
            case "Tarix": {
                return historyList();
            }
            case "Sport": {
                return sportList();
            }
            case "Kinok": {
                return movieList();
            }
            default: {
                return mixedList();
            }
        }
    }
}
