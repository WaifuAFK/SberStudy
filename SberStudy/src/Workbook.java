public class Workbook {
}
/*
Каждая программа должна иметь хотя бы один класс. -> Класс может содержать несколько методов + метод main обязательный.

Каждое предложение в java заканчивается символом ;

Обязательно наличие открывающей и закрывающей скобки {}

Java чувствительна к регистру, поэтому не получится написать Main вместо main




СПЕЦИАЛЬНЫЕ СИМВОЛЫ В JAVA:

{ } 	Открывающая и закрывающая фигурные скобки 	Обозначают блок, заключающий предложения
( ) 	Открывающая и закрывающая круглые скобки 	Используются в методах
[ ] 	Открывающая и закрывающая квадратные скобки 	Обозначают массив
// 	Двойной прямой слэш 	Предшествуют однострочному комментарию
" " 	Открывающая и закрывающая двойные кавычки 	Заключают строку (т.е. последовательность символов)
; 	Точка с запятой 	Помечает конец предложения






КАК ПРАВИЛЬНО КОММЕННТИРОВАТЬ:


В начало программы включайте резюме, объясняющее, что делает программа, ее ключевые функциональные возможности и все уникальные технические приемы, которые в ней используются.
В длинную программу также следует включать комментарии, которые предваряют каждый важный шаг и объясняют все, что трудно прочитать.
Важно сделать комментарии лаконичными, чтобы они не перегружали программу и не затрудняли ее прочтение.

В дополнение к однострочным комментариям (начинающимся с //) и блочным комментариям (начинающимся с /*) Java поддерживает комментарии специального типа, которые называются комментариями javadoc.
Комментарии javadoc начинаются с /** и заканчиваются */

/*

По правилам красивого кода, необходимо ставить пробелы в бинарных операциях, чтобы тебя не били другие программисты: System.out.println(3 + 4 * 4); - вот так выглядит красиво





ОШИБКИ ПРОГРАММИРОВАНИЯ:

- Синтаксические (обнаруживает компилятор) - легко исправить и найти
- ошибки во время выполнения (возникает во время выполенения и аварийно завершают программу) -  найти и исправить сложнее, но компилятор показывает, что не так
- Логические (программа просто работает не так, как предполагалось) - временами вообще хер найдешь





МЕТОДИИКА РАЗРАБОТКИ ПРОГРАММЫ - поэтапный процесс, который упрощает жизнь разработчику. Состоит из 6 этапов:

1. Постановка задачи

Определение требований задачи заставляет ясно и однозначно поставить задачу и получить четкое представление о том, что требуется для ее решения.
Ваша цель — устранить несущественные аспекты и сосредоточиться на основной проблеме. Эта цель может быть не так легко достигнута, как это кажется изначально.
Вам может понадобиться дополнительная информация от человека, который поставил эту задачу.


2. Анализ задачи включает в себя определение:

    входных данных задачи, т. е. данных, которые необходимо обработать;
    выходных данных задачи, т. е. желаемых результатов;
    всех дополнительных требований или ограничений относительно решения задачи.

На этом этапе также необходимо определить требуемый формат, в котором должны отображаться результаты (например, в виде таблицы с определенными заголовками столбцов),
и создать список переменных задачи и их взаимосвязей. Эти взаимосвязи могут быть выражены в виде формул.

Внимательно прочитайте постановку задачи, во-первых, чтобы получить четкое представление о решаемой проблеме, и, во-вторых, чтобы определить входные и выходные данные.
Вам может быть полезно подчеркивать фразы в постановке задачи, которые идентифицируют входные и выходные данные, как показано далее.

Вычислите и отобразите общую стоимость яблок в рублях, если известна масса яблок в килограммах и стоимость яблок в рублях за килограмм.

Затем обобщите информацию, содержащуюся в подчеркнутых фразах:

Входные данные задачи:

     масса яблок (в кг);
     стоимость яблок (в руб. за 1 кг).

Выходные данные задачи:

     общая стоимость яблок (в руб.).

В некоторых ситуациях для получения этих взаимосвязей может потребоваться сделать определенные допущения или упрощения.
Этот процесс моделирования задачи путем извлечения существенных переменных и их взаимосвязей называется абстракцией.


3. Проектирование (разработка алгоритма)

Разработка алгоритма для решения задачи требует создания списка шагов, называемого алгоритмом для решения задачи, а затем — проверки того, что алгоритм действительно решает задачу.
Алгоритмы могут быть написаны на естественных языках или в псевдокоде (естественный язык, смешанный с некоторым языком программирования).
Написание алгоритма часто является самой сложной частью процесса решения задачи. Не пытайтесь сразу проработать решение до мелочей; вместо этого, приучайте себя использовать нисходящее проектирование.
При нисходящем проектировании (также называемом «разделяй и властвуй») сначала перечисляются основные шаги или подзадачи, которые необходимо решить.
Затем вы решаете исходную задачу, решая каждую из ее подзадач. Большинство компьютерных алгоритмов состоит по крайней мере из следующих подзадач.

Общий алгоритм для решения задачи программирования:

-     Получить (от пользователя) данные.
-     Выполнить вычисления.
-     Отобразить результаты.

Как только вы сформулируете подзадачи, вы можете решить каждую из них по отдельности. Например, шаг выполнения вычислений может потребоваться разбить на более подробный список шагов посредством процесса,
называемого пошаговым уточнением.

Проверка «за столом» является важной частью разработки алгоритма, которая часто игнорируется. Чтобы проверить алгоритм «за столом», необходимо тщательно выполнить каждый шаг
алгоритма (или его уточнения) аналогично компьютеру и убедиться, что алгоритм действительно работает. Вы сэкономите время и усилия, если обнаружите ошибки в алгоритме на этапе проектирования,
а не тестирования готовой программы.

Алгоритм решения задачи с уточнением:

1. Получить (от пользователя) стоимость яблок в руб. за 1 кг и массу яблок в кг.
2. Вычислить общую стоимость яблок в руб.
    2.1. Общая стоимость яблок в руб. = стоимость яблок в руб. за 1 кг × масса яблок в кг
3. Отобразить общую стоимость яблок в руб.


4. Реализация алгоритма (кодирование)

Реализация алгоритма заключается в написании его в виде программы. Необходимо преобразовать каждый шаг алгоритма в одно или несколько предложений на языке программирования.


5. Тестирование программы.

Тестирование и верификация готовой программы требуются для проверки ее работоспособности. Не полагайтесь на один единственный тест.
Запустите программу несколько раз, используя разные наборы данных, чтобы убедиться, что она работает правильно для каждой ситуации, предусмотренной в алгоритме.

6. Сопровождение и обновление программы.

Сопровождение и обновление программы включает в себя модификацию программы для исправления ранее не обнаруженных ошибок и поддержки ее в актуальном состоянии по мере изменения нормативной или корпоративной документации.

Необходимо использовать методику разработки программы, если вы хотите создавать программы, которые легко читать, понимать и поддерживать.




Заметка:

ольшинство программ этого курса выполняются в три этапа: ввод (Input), обработка (Process) и вывод (Output), все вместе называемые IPO.
На этапе ввода программа получает входные данные от пользователя; на этапе обработки с использованием входных данных создаются выходные данные; на этапе вывода выходные данные отображаются.





ИДЕНТИФИКАТОРЫ:

Идентификаторы — это имена, которые однозначно определяют в программе такие элементы, как классы, методы и переменные.

Как вы видели в предыдущей программе, ComputeAverage, main, input, number1, number2, number3 и так далее — это имена сущностей, которые появляются в программе. В терминологии программирования такие имена называются идентификаторами. Все идентификаторы должны соответствовать следующим правилам:

    Идентификатор — это последовательность символов, состоящая из букв, цифр, символов подчеркивания (_) и символов доллара ($).
    Идентификатор может начинаться с буквы, символа подчеркивания (_) или символа доллара ($). Идентификатор НЕ может начинаться с цифры.
    Идентификатор НЕ может быть ключевым словом (список ключевых слов в Java см. в разделе «Справочники» этого курса).
    Идентификатор НЕ может иметь значение true, false или null.
    Идентификатор может быть любой длины.

Например, $2, CompureArea, area, radius и print являются допустимыми идентификаторами, в то время как 2A и d+4 — недопустимыми. Компилятор Java обнаруживает недопустимые идентификаторы и сообщает о синтаксических ошибках.




ПЕРЕМЕННЫЕ:

Переменные используются для представления значений, которые могут быть изменены в программе.
Переменные предназначены для представления данных определенного типа. Чтобы использовать переменную, необходимо объявить ее, указав компилятору ее имя, а также тип данных, которые она может хранить.
Объявление переменной предписывает компилятору выделить соответствующее место в памяти для переменной на основе ее типа данных.

Примеры объявления переменных:

int count; // объявление count как целочисленной переменной
double radius; // объявление radius как переменной типа double
double interestRate; // объявление interestRate (процентная ставка) как переменной типа double

Каждая переменная имеет область видимости. Область видимости переменной — это часть программы, в которой можно ссылаться на эту переменную.





ПРИСВАИВАНИЕ:

Предложение с присваиванием назначает значение переменной. Предложение с присваиванием может использоваться в Java в качестве выражения.
После объявления переменной ей можно присвоить значение с помощью оператора присваивания. В Java в качестве оператора присваивания используется символ равенства (=).

Синтаксис предложения с присваиванием:

переменная = выражение;

Выражение включает в себя значения, переменные и операторы, которые все вместе вычисляют его значение. Например, рассмотрим следующий код:

y = 1; // присваивает 1 переменной y
radius = 1.0; // присваивает 1.0 переменной radius
x = 5 * (3 / 2); // присваивает значение выражения 5 * (3 / 2) переменной x
x = y + 1; // присваивает результат сложения y и 1 переменной x
area = radius * radius * 3.14159; // вычисляет площадь круга

В выражении с обеих сторон оператора присваивания можно использовать одну и ту же переменную, например:

x = x + 1;

Если одно и то же значение присваивается нескольким переменным, то можно использовать следующий синтаксис:

i = j = k = 1;

что эквивалентно

k = 1;
j = k;
i = j;

В предложении с присваиванием тип данных переменной слева от оператора присваивания должен быть совместим с типом данных значения справа.
Например, предложение int x = 1.0; будет недопустимым, так как невозможно переменной x типа int присвоить значение типа double (1.0) без приведения типов.





ИМЕНОВАННЫЕ КОНСТАНТЫ:

Именованная константа — это идентификатор, представляющий постоянное значение.

Значение переменной может меняться во время выполнения программы, а именованная константа (или просто константа) представляет постоянное значение, которое никогда не меняется.
Константа в Java также известна как final (результирующая) переменная. В программе ComputeArea число Пи является константой. Если вы его часто используете и не хотите каждый раз вводить 3.14159,
то вы можете объявить константу для ПИ

Синтаксис объявления константы:

final ТипДанных ИМЯ_КОНСТАНТЫ = значение;

Константа должна быть объявлена и инициализирована в одном и том же предложении. В Java слово final является ключевым словом для объявления константы. По традиции, все буквы в константе — заглавные.

Существует три преимущества при использовании констант:

    нет необходимости многократно вводить одно и то же значение, если оно используется несколько раз;
    если требуется изменить постоянное значение (например, с 3.14159 на 3.14 для PI), то необходимо изменить его только в одном месте исходного кода;
    описательное имя константы облегчает чтение программы.





СОГЛАШЕНИЕ ПО ИМЕНОВАНИЮ:

Соблюдение соглашения по именованию в Java упрощает чтение программ и позволяет избежать ошибок.

Убедитесь, что для переменных, констант, классов и методов в программе выбраны описательные и однозначно интерпретируемые имена. Как упоминалось ранее, имена чувствительны к регистру.

-    Используйте строчные буквы для именования переменных и методов, например, radius и area — имена переменных, print() — имя метода. Если имя состоит из нескольких слов, объедините их в одно, сделав первое слово строчными буквами, а каждое последующее слово начав с заглавной буквы, например, numberOfStudents — имя переменной. Этот стиль именования известен как camelCase (букв. «верблюжий регистр»), поскольку заглавные буквы в имени напоминают горбы верблюда.
-    Начинайте с заглавной буквы каждое слово в имени класса, например, ComputeArea и System — имена классов.
-    Делайте заглавной каждую букву в имени константы и используйте подчеркивания между словами, например, PI и MAX_VALUE — имена констант.

Важно соблюдать соглашение по именованию, чтобы облегчить чтение программ.







ЧИСЛОВЫЕ ТИПЫ ДАННЫХ:

byte 	от -27 до 27 - 1 (от -128 до 127) 	8 бит (со знаком)

short 	от -215 до 215 - 1 (от -32768 до 32767)   16 бит (со знаком)

int   от -231 до 231 - 1 (от ‑2147483648 до 2147483647)  32 бита (со знаком)

long 	от -263 до 263 - 1 (от -9223372036854775808 до 9223372036854775807) 	64 бита (со знаком)

float

Отрицательные:
от -3.4028235E+38
до -1.4E-45

Положительные:
от 1.4E-45
до 3.4028235E+38

32 бита (IEEE 754)

double

Отрицательные:
от -1.7976931348623157E+308
до -4.9E-324

Положительные:
от 4.9E-324
до 1.7976931348623157E+308

64 бита (IEEE 754)






ВВОД ЧИСЕЛ ДЛЯ РАЗНЫХ ТИПОВ С КЛАВИАТУРЫ:


Считывание чисел с клавиатуры

Вы уже знаете, как использовать метод nextDouble() из класса Scanner для считывания с клавиатуры значения типа double.
Точно так же можно использовать методы, перечисленные в следующей таблице, для считывания чисел типов данных byte, short, int, long и float.

nextByte() 	считывает целое число типа byte
nextShort() 	считывает целое число типа short
nextInt() 	считывает целое число типа int
nextLong() 	считывает целое число типа long
nextFloat() 	считывает число с плавающей точкой типа float
nextDouble() 	считывает число с плавающей точкой типа double


Далее приведены примеры считывания с клавиатуры значений различных типов данных:

 1 Scanner input = new Scanner(System.in);
 2 System.out.print("Введите значение типа byte: ");
 3 byte byteValue = input.nextByte();
 4
 5 System.out.print("Введите значение типа short: ");
 6 short shortValue = input.nextShort();
 7
 8 System.out.print("Введите значение типа int: ");
 9 int intValue = input.nextInt();
10
11 System.out.print("Введите значение типа long: ");
12 long longValue = input.nextLong();
13
14 System.out.print("Введите значение типа float: ");
15 float floatValue = input.nextFloat();

При вводе значения с неверным диапазоном или форматом произойдет ошибка во время выполнения. Например, если ввести значение 128 для строчки №3, то произойдет ошибка, так как 128 выходит за пределы
диапазона значений целочисленного типа данных byte.




Предложения if:

Предложение if — это структура выбора, позволяющая программе описывать альтернативные пути своего выполнения.

Синтаксис одновариантного предложения if:

if (boolean-выражение) {
  предложение(я);
}



Фигурные скобки блоков могут быть опущены, если они содержат одно-единственное предложение. Например, следующие предложения эквивалентны:

if (i > 0) {
  System.out.println("i - положителен");
}

if (i > 0)
  System.out.println("i - положителен");


Одновариантное предложение if выполняет действие, если условие истинное (true), а если условие ложное (false),
то это действие не выполняется. Но что, если вы хотите предпринять альтернативное действие, когда условие ложное?
Можно использовать двухвариантное предложение if-else. Действия, определяемые двухвариантным предложением if-else,
отличаются в зависимости от того, является ли условие истинным или ложным.

Синтаксис двухвариантного предложения if-else:

if (boolean-выражение) {
  предложение(я) в случае true;
} else {
  предложение(я) в случае false;
}


    Распространенные ошибки в структурах выбора — это пропущенные фигурные скобки, завершение предложения if в неподходящем месте,
    принятие == за = и висящие else.
    Распространенные «подводные камни» — это повторяющиеся предложения в предложениях if-else и проверка на равенство значений
    типа double.



Появляющиеся вместе символы ? и : называются условным оператором, также известным как тернарный (трехместный) оператор,
потому что он использует три операнда. Условный оператор является единственным тернарным оператором в Java.
Он представлен в другом стиле, в отличие от явного if в предложении.

Синтаксис условного оператора:

boolean-выражение ? выражение1 : выражение2
 */





