$(function () {
//color tr hover
    $('#table_date tr').hover(
        function () {
            $('#table_date tr:hover ').addClass('zebra');
        },
        function () {
            $('#table_date tr').removeClass('zebra');
        }
    );
    $('#table_date tr:first-child').hover(
        function () {
            $('#table_date tr').removeClass('zebra');
        }
    );
    /////////////////////////
    var site = 'gallery.html';

    $('.error404').click(function () {
        location.href = ('EROR404/eror404.html');
    });


    $('.header-logo').click(function () {
        location.href = 'index.html';
    });

    $('#hide').click(function () {
        $('.galery').toggle('slow');

    });

    $('.features').css('display', 'none');
    $('.features').fadeIn(1200);

    $('.cat-reference').css('display', 'none');
    $('.cat-reference').fadeIn(1200);

    $('.reviews').css('display', 'none');
    $('.reviews').fadeIn(1200);

    $('.popular-and-price').css('display', 'none');
    $('.popular-and-price').fadeIn(1200);

    $('.feedback').css('display', 'none');
    $('.feedback').fadeIn(1200);

    $('.page-footer').css('display', 'none');
    $('.page-footer').fadeIn(1200);

    $('.contener').css('display', 'none');
    $('.contener').fadeIn(1200);

    $('.page-header-gallery').css({
        'height': '0'
    });
    $('.page-header-gallery').animate({
        'height': '600px'
    }, 1500);
    $('.page-header').css({
        'height': '0'
    });
    $('.page-header').animate({
        'height': '600px'
    }, 1500);

});

function initMap() {
    var piramid = {lat: 53.909251, lng: 27.522853};
    var map = new google.maps.Map(document.getElementById('google'), {
        zoom: 15,
        center: piramid,
        zoomControl: false
    });
    var marker = new google.maps.Marker({
        position: piramid,
        map: map
    });
}

var FormElement = document.forms['INFO'];
FormElement.onsubmit = ValidateInfoForm;

function ValidateInfoForm() {
    var FormElement = document.forms['INFO'];

    var FIOElement = FormElement.elements['fullname'];
    var AgeElement = FormElement.elements['phone'];

    var FIOValue = FIOElement.value;
    var AgeValue = parseInt(AgeElement.value);

    if (FIOValue.length > 30) {
        alert('Введите пожалуйста ФИО не длиннее 30 символов!');
        FIOElement.focus();
        return false;
    }

    if (isNaN(AgeValue)) {
        alert('Введите пожалуйста в поле возраста корректную цифру!');

        AgeElement.focus();
        return false;
    }

    if (AgeValue < 16) {
        alert('Возраст должен быть не менее 16 лет!');
        AgeElement.focus();
        return false;
    }

    return true;
}
