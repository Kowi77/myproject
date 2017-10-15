var $dropdowns = $('.dropdown');
$dropdowns.click(function() {
    if ( $(this).hasClass('active') ){
        $(this).toggleClass('active');
    } else {
        $dropdowns.removeClass('active');
        $(this).toggleClass('active');
    }
});

function getProduct(url) {
    $("#frame").html("");
    $("#frame").append("<h3>Параметры товара: </h3> <br/>");
    $.get(url, function (data) {
        $.each(data, function (key, value) {
            $("#frame").append(key + " --- " + value + "<br/>");
        });
    });
}






