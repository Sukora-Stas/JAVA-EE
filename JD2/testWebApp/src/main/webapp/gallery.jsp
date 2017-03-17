<%--
  Created by IntelliJ IDEA.
  User: stasi
  Date: 17.03.2017
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Gallery</title>
    <link rel="shortcut icon" href="img/icon.png" type="image/png">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/gallery.css">
    <link rel="stylesheet" href="css/media.css">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script src="js/script.js"></script>
    <style>

    </style>
</head>
<body>
<div class="page-header-gallery">
    <div class="header-top contener">
        <div class="header-logo first-btn position">
            <img src="img/logo.png" alt="The Great Keksby" width="205" height="55">
        </div>
        <ul class="main-nav position">
            <li><a href="index.jsp#a1">Магазин</a></li>
            <li><a href="gallery.jsp">Галерея</a></li>
            <li><a href="index.jsp#a3">Отзывы</a></li>
        </ul>
        <a id="test" class="position first-btn error404 adapt1">Заказать</a>
    </div>
    <div class="promo">
        <a>Галерея<br> Коллекции FW15</a>
    </div>
</div>


<div class="contener">
    <div class="body">
        <article class="gallery">

            <div id="myCorusel" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#myCorusel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCorusel" data-slide-to="1"></li>
                    <li data-target="#myCorusel" data-slide-to="2"></li>
                    <li data-target="#myCorusel" data-slide-to="3"></li>
                    <li data-target="#myCorusel" data-slide-to="4"></li>
                    <li data-target="#myCorusel" data-slide-to="5"></li>
                    <li data-target="#myCorusel" data-slide-to="6"></li>
                    <li data-target="#myCorusel" data-slide-to="7"></li>
                    <li data-target="#myCorusel" data-slide-to="8"></li>
                    <li data-target="#myCorusel" data-slide-to="9"></li>
                    <li data-target="#myCorusel" data-slide-to="10"></li>
                    <li data-target="#myCorusel" data-slide-to="11"></li>
                    <li data-target="#myCorusel" data-slide-to="12"></li>
                    <li data-target="#myCorusel" data-slide-to="13"></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <div class="item active"><img src="img/9.jpg"></div>
                    <div class="item"><img src="img/8.jpg"></div>
                    <div class="item"><img src="img/glasses-1.jpg" title="Котик" alt="Some alt"></div>
                    <div class="item"><img src="img/glasses-2.jpg" title="Котик" alt="Some alt"></div>
                    <div class="item"><img src="img/glasses-3.jpg" title="Котик" alt="Some alt"></div>
                    <div class="item"><img src="img/header-bg.jpg" title="Котик" alt="Some alt"></div>
                    <div class="item"><img src="img/1.jpg" title="Котик" alt="Some alt"></div>
                    <div class="item"><img src="img/2.jpg" title="Котик" alt="Some alt"></div>
                    <div class="item"><img src="img/e3.jpg" title="Котик" alt="Some alt"></div>
                    <div class="item"><img src="img/4.jpg" title="Котик" alt="Some alt"></div>
                    <div class="item"><img src="img/5.jpg" title="Котик" alt="Some alt"></div>
                    <div class="item"><img src="img/6.jpg" title="Котик" alt="Some alt"></div>
                    <div class="item"><img src="img/7.jpg" title="Котик" alt="Some alt"></div>
                    <div class="item"><img src="img/8.jpg" title="Котик" alt="Some alt"></div>
                </div>

                <!-- Controls -->
                <a class="left carousel-control" href="#myCorusel" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCorusel" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </article>

    </div>

    <div class="galery">
        <img src="img/glasses-1.jpg" title="Котик" alt="Some alt">
        <img src="img/glasses-2.jpg" title="Котик" alt="Some alt">
        <img src="img/glasses-3.jpg" title="Котик" alt="Some alt">
        <img src="img/header-bg.jpg" title="Котик" alt="Some alt">
        <img src="img/1.jpg" title="Котик" alt="Some alt">
        <img src="img/2.jpg" title="Котик" alt="Some alt">
        <img src="img/e3.jpg" title="Котик" alt="Some alt">
        <img src="img/4.jpg" title="Котик" alt="Some alt">
        <img src="img/5.jpg" title="Котик" alt="Some alt">
        <img src="img/6.jpg" title="Котик" alt="Some alt">
        <img src="img/7.jpg" title="Котик" alt="Some alt">
        <img src="img/8.jpg" title="Котик" alt="Some alt">
        <img src="img/9.jpg" title="Котик" alt="Some alt">
    </div>
</div>


<div class="page-footer">
    <div class="contener">
        <div class="footer-top FT">
            <div class="header-logo first-btn position">
                <img src="img/logo.png" alt="The Great Keksby" width="205" height="55">
            </div>
            <a id="hide" class="first-btn foot_btn hide-btn">Показать галерею</a>
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
        <div class="map">
            <div id="google"></div>

            <script async defer
                    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDDPQgUJIDDMxDS1hjPaQa-pvE_ghN0uXI&callback=initMap"></script>
        </div>
        <div class="footer-bottom">
            <b>Сукора Станислав Игоревич &copy<br>
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
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>
</body>
</html>
