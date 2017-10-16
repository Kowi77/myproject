/*Ajax GET method for one product*/

function getProduct(url) {
    $("#frame").html("");
    $("#frame").append("<h2>Параметры товара: </h2> <br/>");
    $.get(url, function (data) {
        $.each(data, function (key, value) {
            if (key == "price")
                value = value + " руб."
            $("#frame").append("<p id='" + key + "'>" + message[key] + value + "</p><br/>");
        });
    });
}

/* Ajax GET method for category's list*/

function getProducts(url) {
    $("#frame").html("");
    $("#products").html("");
    $("#products").append("<h2>" + message[url] + "</h2> <br/>");
    $.get(url, function (data) {
        data.forEach(function (entry) {
            console.log("<a onclick=getProduct(" + url + "/" + entry.id + ")>")
            $("#products").append("<a onclick=getProduct('" + url + "/" + entry.id + "')>" + entry.name + " (" + entry.price + " руб.)</a><br/>");
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
message["cockbook"] = "Книги по кулинарии:";
message["programbook"] = "Книги по программированию:";
message["esotericbook"] = "Книги по эзотерике:";
message["cddisk"] = "CD диски:";
message["dvddisk"] = "DVD диски:";









