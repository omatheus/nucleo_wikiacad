

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,900" rel="stylesheet">
        <!-- Icon font -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
        <!-- Bootstrap Css -->
        <link href="css/bootstrap.css" rel="stylesheet" />
        <!-- Custom Css -->
        <link href="css/custom.css" rel="stylesheet" />
        <!-- Icon -->
        <link href="imgs/title-logo-wikiacad.png" rel="icon" type="image/ico">
        <title>Wikiacad - Home</title>
    </head>
    <body>
        <div class="overlay"></div>
        <header>
            <img class="background" src="imgs/cropped-header.jpg" href="#">
            <a href="#"><img class="logo" src="imgs/logo-wikiacad-v2.png"></a>
            <nav class="navbar navbar-light bg-faded">
                <button class="navbar-toggler hidden-lg-up" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">&#9776;</button>
                <form class="responsive form-inline pull-xs-right">
                    <button class="btn btn-warning" type="submit">Register</button>
                    <button class="btn btn-success" type="submit">  Login</button>
                </form>
                <div class="collapse navbar-toggleable-md" id="navbarResponsive">
                    <ul class="nav navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="home.html">Artigos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="about-wiki.html">Sobre a Wikiacad</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="http://example.com" id="supportedContentDropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Categorias</a>
                            <div class="dropdown-menu" aria-labelledby="supportedContentDropdown">
                                <a class="dropdown-item" href="#">Sociedade e Tecnologia</a>
                                <a class="dropdown-item" href="#">Comunicação e Expressão</a>
                                <a class="dropdown-item" href="#">Adicional</a>
                            </div>
                        </li>
                    </ul>
                    <form class="form-inline fixed pull-xs-right">
                        <button class="btn btn-outline-warning" type="submit">Register</button>
                        <a class="btn btn-success" href="login.html">Login</a>
                    </form>
                </div>
            </nav>
        </header>
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12 page-title">
                    <h1>
                        <a href="" id="page-title"> Artigos </a>
                        <a href="javascript:;">
                            <i class="fa fa-search" aria-hidden="true"></i>
                        </a>
                    </h1>      
                    <form id="form-search-bar">
                        <input autofocus id="search-bar" class="form-control" type="text" placeholder="Search">
                    </form>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-10 offset-lg-1">



                    <!--C-->



                    <div class="card card-block">
                        <div class="post-preview">
                            <a href="post.html">
                                <h2 class="post-preview-title">Nunc varius nunc sit amet lacus imperdiet, ac condimentum risus mattis.</h2>
                                <h3 class="post-preview-subtitle">Nulla eu libero augue.</h3>
                            </a>
                            <p class="post-preview-meta">
                                Posted by <a href="profile.html">Samuel Monteiro</a> on October 04, 2016
                            </p>
                            <div class="post-content">
                                <h2 class="post-subcontent">Primeiro e segundo paragrafo
                                    <h3 class="post-second-subcontent">Primeiro paragrafo</h3>
                                </h2>
                                <p>
                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras fringilla leo sem, eleifend laoreet turpis ornare sed. Nunc varius nunc sit amet lacus imperdiet, ac condimentum risus mattis. Phasellus id nibh venenatis, pellentesque arcu sit amet, molestie ex. Cras in diam in mi aliquet vehicula eget sit amet felis. Phasellus euismod in est quis aliquet. Integer tempor ex vitae sollicitudin dignissim. Donec eu malesuada ligula. Nulla eu libero augue.
                                </p>
                            </div>
                            <div class="post-button">
                                <a href="#" role="button" class="btn btn-link">Continue Lendo...</a>
                            </div>
                            <div id="tag-options">
                                <a href="#"><span class="tag tag-pill tag-default">
                                        <i class="fa fa-thumbs-up"></i>
                                    </span></a>
                                300
                            </div>
                        </div>
                    </div>


                    <!--C-->   


                    ${wa2revista}
                    
                </div>
            </div>
        </div>
        <section class="footer" id="footer">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <ul>
                            <a href="#"><li><i class="fa fa-facebook fa-lg"></i></li></a>
                            <a href="#"><li><i class="fa fa-twitter fa-lg"></i></li></a>
                            <a href="#"><li><i class="fa fa-linkedin fa-lg"></i></li></a>
                            <a href="#"><li><i class="fa fa-pinterest fa-lg"></i></li></a>
                        </ul>
                        <p>samuel.pinho@fatec.sp.gov.br</p>
                        <p>2016 WikiAcad.com.br. All copyright reserved<br /></p>
                    </div>
                </div>
            </div>
        </section>
    </body>
    <!-- jQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js" integrity="sha384-THPy051/pYDQGanwU6poAc/hOdQxjnOEXzbT+OuUAFqNqFjL+4IGLBgCJC3ZOShY" crossorigin="anonymous"></script>
    <!-- Tether -->
    <script src="//cdnjs.cloudflare.com/ajax/libs/tether/1.3.1/js/tether.min.js"></script>
    <!-- Bootstrap Javascipt -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/js/bootstrap.min.js" integrity="VjEeINv9OSwtWFLAtmc4JCtEJXXBub00gtSnszmspDLCtC0I4z4nqz7rEFbIZLLU" crossorigin="anonymous"></script>
    <!-- Custom Javascript -->
    <script type="text/javascript" src="js/custom.js"></script>
</html>
