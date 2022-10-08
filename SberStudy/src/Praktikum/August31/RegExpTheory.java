package Praktikum.August31;

public class RegExpTheory {
    /*
    Регулярные выражения нужны для поиска текста или для замены текста по какому-то паттерну

    Важно учитывать, что релярные выражения чувствительны к регистру.
    Также стоит помнить, что символы должны учитываться по возрастающей

    Никогда не использовать regexp, чтобы проверить корректность вводимого email, это путь вникуда

    1.
    Поиск слова
    regexp: джава
    Текст: Джава джава спринг
    Найдет - "джава"


    2.
    Поиск любого символа
    Regex: А.я
    Текст:
    Аня
    Ася
    Оля
    Ання
    Аля
    Валя
    . - найдет любой символ (один)
    Точка найдет вообще любой символ, включая цифры, спецсимволы, даже пробелы


    3.
    Найти точку, а не любой символ:
    Regex: .txt
    -> экранирование
    Regex: \.txt
    \. - точка (экранирование)


    4.
    Поиск по набору символов
    Поиск имен Анна и Алла в списке
    Regex:
      А..а
    Текст:
      Анна
      Алла
      аоикА74арплт
      Аркан
      А^&а
      Абба

    Если мы хотим найти именно Анну и Аллу, то вместо точки нужно использовать диапазон допустимых значений.
    Ставим квадратные скобки, внутри них перечисляем нужные символы:
    Regex: А[нл][нл]а
    Пример:
    [нл]        — только н и л
    [а-я]       — все строчные русские буквы от а до я (кроме ё)
    [А-Я]       — все заглавные русские буквы (кроме Ё)
    [А-Яа-яЁё]  — все русские буквы
    [a-z]       — все строчные латинские буквы
    [a-zA-Z]    — все английские буквы
    [0-9]       — любая цифра
    [В-Ю]       — буквы от В до Ю
    [А-ГО-Р]    — буквы от А до Г и от О до Р


    5.
    Спецсимволы
    Большинство символов в регулярном выражении представляют сами себя за исключением специальных символов:
    [ ] \ / ^ $ . | ? * + ( ) { }
    Для поиска именно одного из этих символов - необходимо экранировать символ (по аналогии с .)


    6.
    Исключения
    ^ внутри [] означает исключение:
    [^0-9]  — любой символ, кроме цифр
    [^ёЁ]  — любой символ, кроме буквы ё и Ё
    [^а-в8]  — любой символ, кроме букв а, б, в и цифры 8


    7.
    Перечисление вариантов
    Квадратные скобки [] помогают перечислить варианты для одного символа.
    Если мы хотим перечислить слова, то лучше использовать вертикальную черту — |.

    Regex:
      Оля|Олечка|Котик
    Можно использовать вертикальную черту и для одного символа.
    Можно использовать внутри слова — тогда вариативную букву берем в круглые скобки
    Regex:
      А(н|л)я
    Найдет:
    Аня
    Аля
    Круглые скобки обозначают группу символов.
    В этой группе у нас или буква н, или буква л.
    Скобки нужны, чтобы показать, где начинается и заканчивается группа.
    Иначе вертикальная черта применится ко всем символам — мы будем искать или Ан, или ля:

    Пример:
    А(н|л)я
    А[нл]я
    Эти 2 варианта вернут одно и то же
    Но для замены одной буквы лучше использовать [], так как сравнение с символьным классом выполняется проще, чем обработка группы с проверкой на все её
    возможные модификаторы


    8.
    Метасимволы

    В регулярных выражениях используются специальные метасимволы,
    которые заменяют собой конкретный диапазон значений:

    Символ  Эквивалент  Пояснение
       \d   [0-9]           Цифровой символ
       \D   [^0-9]          Нецифровой символ
       \s   [ \f\n\r\t\v]   Пробельный символ
       \S   [^ \f\n\r\t\v]  Непробельный символ
       \w                   Буквенный или цифровой символ или знак подчеркивания
       \W                   Любой символ, кроме буквенного или цифрового или знака подчеркивания


    9.
    Квантификаторы (количество повторений)
    квантификаторы — специальные символы в регулярных выражениях, которые указывают количество повторений текста.
    Примеры квантификаторов:
    ? - Ноль или одно
    * - Ноль или более
    + - Один или более

    Символ * часто используют с точкой — когда нам неважно, какой идет текст до интересующей нас фразы, мы заменяем его на .* — любой символ ноль или более раз.

    10.
    Точное количество повторений
    Если мы хотим применить квантификатор к группе символов или нескольким словам, их нужно взять в скобки.

    Квантификаторы применяются к символу или группе в скобках, которые стоят перед ним.
    Если нужно указать определенное количество повторений, то их надо записать внутри фигурных скобок:

    {n} - Ровно n раз
    {m,n} - От m до n включительно
    {m,} - Не менее m
    {,n} - Не более n

    Важно: вантификатор применяется к последнему символу!
    Regex: data{2}
    Найдет: dataa
    Не найдет: datadata

    Или группе символов, если они взяты в круглые скобки:
    Regex: (data){2}
    Найдет: datadata
    Не найдет: dataa

    11.
    Пример жадный/ленивый:
    Иногда квантификатор находит не совсем то, что нам нужно.
    Regex: <.*>
    Текст:
    <req> <query>Ан</query> <gender>FEMALE</gender>
    Ожидаем, что регулярное выражение найдет каждый тег по отдельности, в реальности же найдет всю строку:
    <req> <query>Ан</query> <gender>FEMALE</gender></req>

    В некоторых реализациях квантификаторам соответствует максимально длинная строка из возможных.
    Такие квантификаторы называют жадными. Чтобы изменить квантификатор на "ленивый" и заставить его
    вывести каждый из тегов по отдельности, нужно добавить к квантификаторую вопросительный знак.

    Жадный      Ленивый
       *             *?
       +             +?
      {n,}          {n,}?


    12.
    Позиция внутри строки

    Если мы хотим найти конкретную фразу (ограниченную началом и концом строки), а не слово,
    то используем следующие спецсимволы:
    ^ — начало текста (строки)
    $ — конец текста (строки)


     */
}