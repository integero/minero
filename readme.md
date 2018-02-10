## technical task
### only in russian (from http://forum.vingrad.ru/topic-12295.html)
Создайте приложение похожее на Windows Miner. 
Задание может быть выполнено на любом из следующих языков:
Delphi, C++ Builder, Visual C++, Java, C#.

В случае Visual C++ разрешается использование MFC. Запрещается использовать Grid или любой другой подобный класс. В этом задании мы оцениваем качество Вашего кода, поэтому одна из главных Ваших задач – правильно построить внутренний дизайн программы, и сделать код как можно более читабельным  и красивым. 
(Читабельный код -  это необязательно код, в котором много комментариев. Хороший код - это грамотно написанный код, где правильно построены классы, продумано взаимодействие между ними. Код, который не содержит повторяющегося текста. Код, из которого понятно, что делают методы Вашей программы. Код, который средний программист, который не писал Ваш код, может понять в течение 20-30 секунд. Хороший код можно легко изменить, чтобы добавить новые возможности, и он останется и т.д).
Разработайте структуру классов, опишите, для чего нужен каждый из них и как классы будут взаимодействовать между собой. Ваш код должен быть таким, чтобы  его можно было легко модифицировать и расширять. 

Например, представьте себе, что в будущем Вам потребуется рисовать изображение мин по-другому (например, сделать мины нескольких типов), или изменить логику игры так, чтобы взрыв происходил лишь после 3 ошибки, или так, чтобы при попадании на мину взрыв происходил с вероятностью 1/3. Или, возможно, потребуется изменить способ ввода информации в программу (использовать клавиатуру вместо мыши или, не дай бог, управление голосом &#61514; ).  
Не надо реализовывать все эти возможности, просто подумайте заранее о возможности расширения функциональности и заложите её в программу изначально. 
Подумайте о том, чтобы сразу обеспечить возможность изменения логики игры, путем наследования нового класса от Вашего класса, отвечающего за логику. Подумайте и о том, чтобы сразу обеспечить возможность внешнего вида игрового поля, путем наследования нового класса от Вашего класса, отвечающего за рисование.
Если Ваша программа спроектирована хорошо, то сделать указанные изменения будет легко. 

Рекомендации:

Поле игры должно быть отдельным классом, компонентой, контролом. Этот компонент должен содержать события (Delhi, C++ Builder, C#), function pointer (Visual C++) или Listeners (Java) или Visual C++. Иными словами, отделить объект, реализующий минное  поле, от кода основной программы, чтобы получить возможность многократного использования данного класса без изменения его кода.

Не используйте стандартные классы, такие как Grid или Button для реализации поля игры. Все приведенные языки имеют в своих стандартных библиотеках классы, от которых удобно наследоваться и самим отработать все действия пользователя.

Не спешите сразу кодировать. Вначале все продумайте и нарисуйте классы и их взаимодействие на бумаге (если у Вас есть Rational Rose - воспользуйтесь им. Это только приветствуется). Мы понимаем, что задание несложное, но, к сожалению, большинство кандидатов приносят код, от которого волосы дыбом встают.
