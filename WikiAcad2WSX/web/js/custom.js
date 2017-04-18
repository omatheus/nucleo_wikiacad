var width = $(window).width();
$(window).on("load scroll resize", function(e) {

  if ($(window).scrollTop() >= 205) {
     $('.page-title').addClass('fixed-title');
  }
  else {
     $('.page-title').removeClass('fixed-title');
  }

  $(".post-content p").addClass("text-justify");
  if(width <= 992) {
    $("#profile-image").addClass("m-x-auto");
  } else if(width > 992) {
    $("#profile-image").removeClass("m-x-auto");
  }

});

$(".fa-search").click(function() {
  if ($("#form-search-bar").hasClass("displayed")) {
    $("#form-search-bar").removeClass("displayed");
    $("#page-title").removeClass("undisplayed");
  } else {
    $("#form-search-bar").addClass("displayed");
    $("#page-title").addClass("undisplayed");
    $("#search-bar").focus();
  }
});

$("#search-bar").blur(function() {
  if($("#form-search-bar").hasClass("displayed")) {
    window.setTimeout(function() {
      $("#form-search-bar").removeClass("displayed");
      $("#page-title").removeClass("undisplayed");
    }, 100);
  }
});

