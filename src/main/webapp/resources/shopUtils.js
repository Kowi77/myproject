/*var $dropdowns = $('.dropdown');
$dropdowns.click(function() {
    if ( $(this).hasClass('active') ){
        $(this).toggleClass('active');
    } else {
        $dropdowns.removeClass('active');
        $(this).toggleClass('active');
    }
});*/

/*Ajax GET method for one product*/

function getProduct(url) {
    $("#frame").html("");
    $("#frame").append("<h2>Параметры товара: </h2> <br/>");
    $.get(url, function (data) {
        $.each(data, function (key, value) {
            $("#frame").append("<p id='" + key + "'>" + message[key] + value + "</p><br/>");
        });
    });
}

/* Message hardcode data*/

var message = [];
message["name"] = "Наименование: ";
message["price"] = "Цена: ";
message["barcode"] = "Штрихкод: ";
message["pages"] = "Количество страниц: ";
message["language"] = "Язык программирования: ";
message["minAge"] = "Минимальный возраст: ";
message["ingridient"] = "Основной ингридиент: ";
message["type"] = "Тип диска: ";
message["content"] = "Содержимое диска: ";









