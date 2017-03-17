<%--
  Created by IntelliJ IDEA.
  User: stasi
  Date: 17.03.2017
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>The Great Keksby</title>
    <link rel="shortcut icon" href="img/icon.png" type="image/png">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/media.css">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script src="js/script.js"></script>
</head>
<body>

<div class="page-header" id="head">
    <div class="header-top contener">
        <div class="header-logo first-btn position">
            <img src="img/logo.png" alt="The Great Keksby" width="205" height="55">
        </div>
        <ul class="main-nav position">
            <li><a href="index.jsp#a1">Магазин</a></li>
            <li><a href="gallery.jsp">Галерея</a></li>
            <li><a href="index.jsp#a3">Отзывы</a></li>
        </ul>
        <a class="position first-btn error404 adapt1">Заказать</a>
    </div>
    <div class="promo">
        <a href="#">Аксессуары для котов<br> Коллекция FW15</a>
    </div>
</div>

<div class="contener">
    <div class="features">
        <ul>
            <li class="feature-item feature-choice">
                <h2 class="feature-title">Выбор</h2>
                <p>Ваш питомец оценит широту нашего ассортимента аксессуаров.</p>
            </li>
            <li class="feature-item feature-quality">
                <h2 class="feature-title">Качество</h2>
                <p>Наши товары не сломаются на второй день. Только на третий.</p>
            </li>
            <li class="feature-item feature-safety">
                <h2 class="feature-title">Безопасность</h2>
                <p>Все изготовлено из натуральных материалов, безопасных для котов.</p>
            </li>
        </ul>
    </div>

</div>

<div class="cat-reference">
    <div class="contener">
        <div class="cat">
            <h2 class="section-title">Немного теории</h2>
            <a class="btn last-btn error404" href="#" title="Открыть справочник">Справочник</a>
        </div>
        <dl>

            <div class="abstract">
                <dt>
                <h3 class="reference-title">Окрас кошек и котов</h3>
                <i class="reference-source">источник: <a target="_blank"
                                                         href="https://ru.wikipedia.org">wikipedia</a></i>
                </dt>
                <dd>
                    <img src="img/article-1.jpg" alt="Окрас кошек и котов" width="100" height="100">
                    <p>Окрас шерсти, кожи и глаз кошки обусловлен присутствием в них пигмента меланина. Меланин
                        находится в
                        теле волоса в виде микроскопических гранул, которые различаются по форме, размеру и количеству,
                        что
                        и вызывает различия в окрасе.</p>
                </dd>
            </div>
            <div class="abstract">
                <dt>
                <h3 class="reference-title">Кошкин дом</h3>
                <i class="reference-source">источник: <a target="_blank"
                                                         href="http://kotmur.spb.ru">kotmur.spb.ru</a></i>
                </dt>
                <dd>
                    <img src="img/article-2.jpg" alt="Кошкин дом" width="100" height="100">
                    <p>Нужен ли кошке Кошкин дом? Свой отдельный, обособленный от пространства городской квартиры Кошкин
                        дом? Да, нужен! Нужен особый Кошкин дом, обустроенный по ее вкусу с лесенкой, с когтеточкой, с
                        замкнутым, своим, отдельным уголком в ее, кошкином, доме.</p>
                </dd>
            </div>
        </dl>

    </div>
</div>

<div class="contener">
    <div class="reviews">
        <div class="rev">
            <a name=a3></a>
            <h2 class="section-title">Довольные коты</h2>
            <a class="btn last-btn rev_btn error404" href="#" title="Посмотреть все отзывы">Все отзывы</a>
        </div>

        <div class="reviews-list">
            <div class="rev">
                <blockquote class="review-item">
                    <p>Спасибо Кексу за давно напрашивающуюся идею! Набрал себе очков на все случаи жизни: для чтения и
                        для
                        вечеринки с котанами B-)</p>
                    <cite class="review-author">Барсик, г. Москва</cite>
                </blockquote>
                <blockquote class="review-item">
                    <p>Я просто не могу без шоппинга и теперь не нужно тащить хозяйку в магазин, заказываю все
                        аксессуары на
                        сайте у Кекса он-лайн!</p>
                    <cite class="review-author">Мурка, г. Санкт-Петербург</cite>
                </blockquote>
            </div>
        </div>
    </div>
</div>

<div class="popular-and-price">
    <div class="contener">
        <div class="rev">
            <a name=a1></a>
            <h2 class="section-title">Популярные товары</h2>
            <a class="btn last-btn rev_btn error404" href="#" title="Посмотреть все товары">Каталог</a>
        </div>
        <div class="popular-items">
            <div class="catalog-item">
                <img src="img/glasses-1.jpg" alt="очки «Классика жанра»" title="очки «Классика жанра»" width="306"
                     height="206">
                <div class="item">
                    <h3>Очки «Классика жанра»</h3>
                    <b>300 р.</b>
                </div>
                <div class="i_btn">
                    <a class="btn item_btn error404" href="#">Описание</a>
                    <a class="btn item_btn error404" href="#">Купить</a>
                </div>
            </div>
            <div class="catalog-item">
                <img src="img/glasses-2.jpg" alt="очки «Жалюзи»" width="306" height="206">
                <div class="item">
                    <h3>Очки «Жалюзи»</h3>
                    <b>400 р.</b>
                </div>
                <div class="i_btn">
                    <a class="btn item_btn error404" href="#">Описание</a>
                    <a class="btn item_btn error404" href="#">Купить</a>
                </div>
            </div>
            <div class="catalog-item">
                <img src="img/glasses-3.jpg" alt="очки «Базилис»" width="306" height="206">
                <div class="item">
                    <h3>Очки «Базилис»</h3>
                    <b>500 р.</b>
                </div>
                <div class="i_btn">
                    <a class="btn item_btn error404" href="#">Описание</a>
                    <a class="btn item_btn error404" href="#">Купить</a>
                </div>
            </div>

        </div>
        <a name=a2></a>
        <h2 class="section-title">Прайс-лист на услуги</h2>

        <table class="price-list" id="table_date">

            <tr>
                <th class="price-number">№</th>
                <th>Название услуги</th>
                <th>Кто оказывает</th>
                <th>Сколько стоит</th>
            </tr>
            <tr>
                <td class="price-number">1.</td>
                <td class="price-name">Стрижка</td>
                <td>Грумер</td>
                <td>500 руб.</td>
            </tr>
            <tr>
                <td class="price-number">2.</td>
                <td class="price-name">Заточка когтей</td>
                <td>Грумер</td>
                <td>300 руб.</td>
            </tr>
            <tr>
                <td class="price-number">3.</td>
                <td class="price-name">Накрутка усов</td>
                <td>Грумер</td>
                <td>100 руб.</td>
            </tr>
            <tr>
                <td class="price-number">4.</td>
                <td class="price-name">Подбор аксессуаров</td>
                <td>Стилист</td>
                <td>1550 руб.</td>
            </tr>
        </table>
    </div>
</div>

<div class="feedback">
    <div class="contener">
        <div class="feeb">
            <h2 class="section-title feeb-sect">Остались вопросы?</h2>
            <p class="feedback-tip">Свяжитесь с нами и мы развеем оставшиеся у вас сомнения!</p>
        </div>

        <form name="INFO" class="feedback-form" action="http://fe.it-academy.by/TestForm.php" method="post">

            <div class="feedback-form-group pos">
                <label for="fullname">Представьтесь, пожалуйста:</label>
                <input type="text" name="fullname" id="fullname" placeholder="Фамилия Имя Отчество">
            </div>

            <div class="feedback-form-group-align">
                <div class="feedback-form-group">
                    <label for="phone">Контактный телефон:</label>
                    <input type="text" name="phone" id="phone" placeholder="8 (XXX) XXX-XX-XX">
                </div>

                <div class="feedback-form-group left-m">
                    <label for="email">Электронная почта:</label>
                    <input type="EMAIL" name="email" id="email" placeholder="E-mail">
                </div>
            </div>

            <div class="checkbox-area">
                <label>
                    <input type="checkbox" name="subscription" checked>
                    Я согласен получать спам и смс на телефон
                </label>
            </div>

            <div class="feedback-form-group">
                <label for="topic">Тема обращения:</label>
                <select name="topic" id="topic">
                    <option value="1">Условия доставки</option>
                    <option value="2">Возврат товара</option>
                    <option value="3">Жалоба в Роспотребнадзор</option>
                </select>
            </div>

            <div class="feedback-form-group last-poz">
                <label for="message">Текст обращения:</label>
                <textarea name="message" id="message" placeholder="Введите текст вашего обращения"></textarea>
            </div>

            <input type="submit" class="btn fee-btn item_btn" value="Отправить">
        </form>
    </div>
</div>

<div class="page-footer">
    <div class="contener">
        <div class="footer-top">
            <div class="header-logo first-btn position">
                <img src="img/logo.png" alt="The Great Keksby" width="205" height="55">
            </div>
            <a class="first-btn foot_btn error404" href="#">Заказать</a>
        </div>

        <div class="footer-middle">
            <div class="footer-menu">
                <h3>Магазин</h3>
                <ul>
                    <li><a href="#" class="error404">Домики</a></li>
                    <li><a href="#" class="error404">Одежда</a></li>
                    <li><a href="#" class="error404">Очки</a></li>
                </ul>
            </div>
            <div class="footer-menu">
                <h3>Отзывы</h3>
                <ul>
                    <li><a href="#" class="error404">Показать</a></li>
                    <li><a href="#" class="error404">Оставить</a></li>
                </ul>
            </div>
            <div class="footer-menu">
                <h3>Прайс-лист</h3>
                <ul>
                    <li><a href="#" class="error404">Скачать прайс</a></li>
                </ul>
            </div>
        </div>
        <div class="map map2">
            <div id="google"></div>

            <script async defer
                    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDDPQgUJIDDMxDS1hjPaQa-pvE_ghN0uXI&callback=initMap"></script>
        </div>
        <div class="footer-bottom">
            <b>Сукора Станислав Игоревич &copy;<br>
                <a href="http://www.it-academy.by/" target="_blank"> FD-36-16-26 IT-Academy</a></b>
            <div class="footer-social">


                <a href="https://www.linkedin.com/in/stanislav-sukora-20282312a" target="_blank"><b><i
                        class="fa fa-linkedin-square fa-2x" aria-hidden="true"></i></b></a>
                <a href="https://github.com/Sukora-Stas" target="_blank"><b><i class="fa fa-github-square fa-2x"
                                                                               aria-hidden="true"></i></b></a>
                <a href="https://vk.com/id109307571" target="_blank"><b><i class="fa fa-vk fa-2x"
                                                                           aria-hidden="true"></i></b></a>
                <a href="https://www.facebook.com/stasiksukora" target="_blank"><b><i
                        class="fa fa-facebook-official fa-2x"
                        aria-hidden="true"></i></b></a>
                <a href="https://www.instagram.com/stassukora1/" target="_blank"><b><i class="fa fa-instagram fa-2x"
                                                                                       aria-hidden="true"></i></b></a>
            </div>

        </div>
    </div>
</div>

</body>
</html>
