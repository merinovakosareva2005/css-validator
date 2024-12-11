<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>literature-for-dummies-main</title>
</head>
<body>
    <header class="header">
    <a><img class="header__logo" alt="Логотип"></a>
    <nav class="header__menu">
        <ul class="menu">
            <li class="menu__item menu__item--active"> 
                 <a class="menu__link" href="#">Главная</a>  
            </li> 
           <li class="menu__item">
            <a class="menu__link" href="#">Каталог заданий</a>
            </li> 
           <li class="menu__item">
            <a class="menu__link" href="#">Источники</a>
            </li> 
           <li class="menu__item">
            <a class = "menu__link" href="#">Регистрация и вход</a>
            </li> 
           <li class="menu__item">
            <a class="menu__link" href="#">Отзывы</a>
            </li> 
           <li class="menu__item">
            <a class="menu__link" href="#">Окно заявок</a>
            </li> 
        </ul>
    </nav>
    <a button type="button"> Войти</button>
    <input type="search" name="search" placeholder="Поиск по темам">
</header>
    <main class="main"> 
        <section>
            <ul> 
                <li> 
                    <img src="images/Frame 9.png" alt="Значок 1" width="247" height="247"> 
                </li>
                <li>
                    <img src="images/Frame 9.png" alt="Значок 2" width="247" height="247">
                </li>
                <li>
                    <img src="images/Frame 9.png" alt="Значок 3" width="247" height="247">
                </li>
            </ul>
        </section>
        <section>
            <div class="text"> 
                <h2>Популярные учебные материалы</h2>
                <a href="#" target="_blank">Ссылки</a>
                <p>Романтизм</p>
                <p>О течениях</p>
                <p>Ю. Манн "Поэтика Гоголя"</p>
                <p>О классицизме</p>
                <p>А.С.Пушкин</p>
            </div>
        </section>
        <section> 
            <ul>
                <li> <a href="#">Отзывы</a></li>
                <li> <a href="#">Окно заявок</a></li>
                <!--Тут форма-->
            </ul>
        </section>
        <footer class="footer">
            <p>Связь</p>
        </footer>
        <section>
            <form action="/literature-for-dummies-main/">
                <h1>Вход в личный кабинет</h1>
                <input type="email" name="email" placeholder="Электронная почта" readonly>
                <input type="password" name="password" placeholder="Пароль" readonly>
                <button>Войти</button>
            </form>
        </section>
    </main>
</body>
</html>
