<!DOCTYPE html>

<html lang="en">
    <head>
    <meta charset="utf-8"> 
	<meta name="viewport" content="width=device-width, initial-scale=1">	
	<meta name="author" content="sumit kumar"> 
	<style >
	
/*////////////////TOP NAV BAR////////////////*/

.top-bar{background-color:black;min-height:40px;padding-top:5px;padding-bottom: 0px;}
.top-bar .nav-text {
    color: #00BCD4;
    display: block;
    margin-top: 5px;
}
.top-bar .social{color:#FFF;display:inline-block;padding:5px;text-decoration: none;}

.top-bar .tools{margin:0px;padding:0px;list-style-type:none;}
.top-bar .tools li{list-style-type: none;display:inline-block;}
.top-bar .tools li a {
    display: block;
    text-decoration: none;
    color: #fff;
    padding-left: 15px;
    padding-top: 5px;
}

.navbar-brand {
    /* float: left; */
    height: 50px;
    padding: 3px 15px;
    font-size: 18px;
    line-height: 20px;
    position: absolute;
    z-index: 11;
    margin: 0 auto;
    right: 42%;
}


.navbar-inverse {
    background-color: #009688;
    border-color: #080808;
}

.navbar {
    position: relative;
    min-height: 50px;
    margin-bottom: 0px;
    border: 0px solid #000;;
    border-radius:0px;
   box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
}

.navbar-inverse .navbar-nav > li > a {
    color: #fff;
}
.nav > li > a {
    position: relative;
    display: block;
    padding: 15px 11px;}

.form-control{
    border-color:#fff;
    border-radius:0px;
    background-color:transparent;
}

.btn-default-1 {
    color: #fff;
    background-color: transparent;
    border-color: #fff;
    border-radius: 0px;
}

.cart-heart a{display:inline-block;color:#fff;font-size:20px;padding:5px;}

/*CROUSELE START///////////////////////////*/

.carousel-caption {
    position: absolute;
    right: 15%;
    bottom: 35px;
    width: 60%;
    left: 15%;
    z-index: 10;
    padding-top: 20px;
    padding-bottom: 20px;
    color: #fff;
    text-align: left;
    text-shadow: 0 1px 2px rgba(0, 0, 0, .6);
}

@media screen and (min-width:768px){
    .carousel-caption h3{font-size: 52px;} 
    .carousel-caption p{font-size: 32px;} 
    .carousel-caption{padding-bottom:160px;}
}


/*FOOTER START///////////////////*/

.footer {
    padding: 50px 0 20px 0;
    background-color: #35404f;
    color: #878c94;
}
.footer .title{text-align: left;color:#fff;font-size:25px;}


.footer .social-icon{padding:0px;margin:0px;}
.footer .social-icon a{display:inline-block;color:#fff;font-size:25px;padding:5px;}
.footer .acount-icon a{display:block;color:#fff;font-size:18px;padding:5px;text-decoration:none;}
.footer .acount-icon .fa{margin-right:25px;}


.footer .category a {
    text-decoration: none;
    color: #fff;
    display: inline-block;
    padding: 5px 20px;
    margin: 1px;
    border-radius:4px;
    margin-top: 6px;
    background-color: black;
    border: solid 1px #fff;
}

.footer .payment{margin:0px;padding:0px;list-style-type:none}
.footer .payment li{list-style-type:none}
.footer .payment li a {
    text-decoration: none;
    display: inline-block;
    color: #fff;
    float: left;
    font-size: 25px;
    padding: 10px 10px;
}
	
	
	
	
	
	
	
	</style>
	<title>Indus</title> 
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
	<link href="css/font-awesome.css" rel="stylesheet" type="text/css">
	<link href="css/style.css" rel="stylesheet" type="text/css">
	<script src="https://use.fontawesome.com/07b0ce5d10.js"></script>
    </head>

<body>
    
<%@include file="nav.jsp"%>
 
 


<!--=================CAROUSELE START====================-->
  
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
       <img src="http://diamondcreative.net/plus-v1.1/img/slider/slider_06.jpg" width="1366px" height="700px">
      <div class="carousel-caption hidden-xs">
        <h3>New Collection of INDUS</h3>
        <p>The atmosphere in Chania has a touch<br> of Florence and Venice.</p>
          <button class="btn btn-danger">READ MORE</button>
      </div>
    </div>

    <div class="item">
      <img src="http://diamondcreative.net/plus-v1.1/img/slider/slider_03.jpg" width="1366px" height="700px">
      <div class="carousel-caption hidden-xs">
        <h3>New Collection touch of Chania</h3>
        <p>The atmosphere in Chania has a touch By Indus<br> of Florence and Venice.</p>
        <button class="btn btn-danger">READ MORE</button>
      </div>
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
    
    
    
<!--   FOOTER START================== -->
    
    <footer class="footer">
    <div class="container">
        <div class="row">
        <div class="col-sm-3">
            <h4 class="title">INDUS INC.</h4>
            <p>World Biggest Ecommerce Portal.</p>
            <ul class="social-icon">
            <a href="#" class="social"><i class="fa fa-facebook" aria-hidden="true"></i></a>
            <a href="#" class="social"><i class="fa fa-twitter" aria-hidden="true"></i></a>
            <a href="#" class="social"><i class="fa fa-instagram" aria-hidden="true"></i></a>
            <a href="#" class="social"><i class="fa fa-youtube-play" aria-hidden="true"></i></a>
            <a href="#" class="social"><i class="fa fa-google" aria-hidden="true"></i></a>
            <a href="#" class="social"><i class="fa fa-dribbble" aria-hidden="true"></i></a>
            </ul>
            </div>
        <div class="col-sm-3">
            <h4 class="title">My Account</h4>
            <span class="acount-icon">          
            
            
            <a href="login"><i class="fa fa-user" aria-hidden="true"></i> Profile</a>
                  
          </span>
            </div>
        <div class="col-sm-3">
            <h4 class="title">Category</h4>
            <div class="category">
            <a href="displayProducts">men</a>
            <a href="#">women</a>
            <a href="#">boy</a>
            <a href="#">girl</a>
            <a href="#">bag</a>
            <a href="#">teshart</a>
            <a href="#">top</a>
            <a href="#">shos</a>
            <a href="#">glass</a>
            <a href="#">kit</a>
            <a href="#">baby dress</a>
            <a href="#">kurti</a>           
            </div>
            </div>
        <div class="col-sm-3">
            <h4 class="title">Payment Methods</h4>
            <p>Our Website Provides Various Payment Option.</p>
            <ul class="payment">
            <li><a href="#"><i class="fa fa-cc-amex" aria-hidden="true"></i></a></li>
            <li><a href="#"><i class="fa fa-credit-card" aria-hidden="true"></i></a></li>            
            <li><a href="#"><i class="fa fa-paypal" aria-hidden="true"></i></a></li>
            <li><a href="#"><i class="fa fa-cc-visa" aria-hidden="true"></i></a></li>
            </ul>
            </div>
        </div>
        <hr>
        
        <div class="row text-center"> © 2017. Designed By indus Inc.</div>
        </div>
        
        
    </footer>
    
    
    
    
    


<script src="js/jquery-3.1.1.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>