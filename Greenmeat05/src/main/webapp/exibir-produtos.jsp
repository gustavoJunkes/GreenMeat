<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css
<meta charset="ISO-8859-1">
<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/css/bootstrap.min.css/>
 <style><%@include file="/resources/css/css/bootstrap.min.css"%></style>
<style>


.col-md-4 {
    -webkit-box-flex: 0;
    -ms-flex: 0 0 33.2222%;
    flex: 0 0 18.333%;
    height: 8%;
    
    max-width: 18.000%;

 
}


 body {
    margin: 0;
    font-family: Roboto, -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";
    font-size: .7000rem;
    font-weight: 250;
    line-height: 1.000;
    color: #194f15;
    text-align: left;
    background-color: #194f15
    
}
.mb-2{
color:#194f15
}

.mt-50 {
    margin-top: 25px
}

.mb-50 {
    margin-bottom: 50px
}

.card {
    position: relative;
    display: -ms-flexbox;
    display: flex;
    -ms-flex-direction: column;
    flex-direction: column;
    min-width: 0;
    word-wrap: break-word;
    background-color: #green;
    background-clip: border-box ;
    border: 0px solid rgba(0, 0, 0, .0);
    border-radius: .1500rem;
    height: 50%;
}

.card-img-actions {
    position: relative
}

.card-body {
    -ms-flex: 1 1 auto;
    flex: 1 1 auto;
    padding: 1.rem;
    text-align: center;
       height: -40%;
    
}

.card-img {
    width: 120px
}

.star {
    color: grenn;
}

.bg-cart {
    background-color: grenn;
    color: #fff
}

.bg-cart:hover {
    color: #grenn;
}

.bg-buy {
    background-color: green;
    color: #fff;
    padding-right: 25px
}

.bg-buy:hover {
    color: #fff
}

a {
    text-decoration: none !important
}   </style>

<title>Insert title here</title>
</head>
<body>

<div >
    <div class="row">
        <div class="col-md-4 mt-2">
            <div class="card">
                <div class="card-body">
                    <div class="card-img-actions"> <img src="https://res.cloudinary.com/dxfq3iotg/image/upload/v1562074043/234.png" class="card-img img-fluid" width="96" height="350" alt=""> </div>
                </div>
                <div class="card-body bg-light text-center">
                    <div class="mb-2">
                        <h6 class="font-weight-semibold mb-2"> <a href="#" class="text-default mb-2" data-abc="true">Toshiba Notebook with 500GB HDD & 8GB RAM</a> </h6> <a href="#" class="text-muted" data-abc="true">Laptops & Notebooks</a>
                    </div>
                    <h3 class="mb-0 font-weight-semibold">$250.99</h3>
                    <div> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> </div>
                    <div class="text-muted mb-3">34 reviews</div> <button type="button" class="btn bg-cart"><i class="fa fa-cart-plus mr-2"></i> Add to cart</button>
                </div>
            </div>
        </div>
        <div class="col-md-4 mt-2">
            <div class="card">
                <div class="card-body">
                    <div class="card-img-actions"> <img src="https://res.cloudinary.com/dxfq3iotg/image/upload/v1562074043/234.png" class="card-img img-fluid" width="96" height="350" alt=""> </div>
                </div>
                <div class="card-body bg-light text-center">
                    <div class="mb-2">
                        <h6 class="font-weight-semibold mb-2"> <a href="#" class="text-default mb-2" data-abc="true">Toshiba Notebook with 500GB HDD & 8GB RAM</a> </h6> <a href="#" class="text-muted" data-abc="true">Laptops & Notebooks</a>
                    </div>
                    <h3 class="mb-0 font-weight-semibold">$250.99</h3>
                    <div> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> </div>
                    <div class="text-muted mb-3">34 reviews</div> <button type="button" class="btn bg-cart"><i class="fa fa-cart-plus mr-2"></i> Add to cart</button>
                </div>
            </div>
        </div>
        <div class="col-md-4 mt-2">
            <div class="card">
                <div class="card-body">
                    <div class="card-img-actions"> <img src="https://res.cloudinary.com/dxfq3iotg/image/upload/v1562074043/234.png" class="card-img img-fluid" width="90" height="350" alt=""> </div>
                </div>
                <div class="card-body bg-light text-center">
                    <div class="mb-2">
                        <h6 class="font-weight-semibold mb-2"> <a href="#" class="text-default mb-2" data-abc="true">Toshiba Notebook with 500GB HDD & 8GB RAM</a> </h6> <a href="#" class="text-muted" data-abc="true">Laptops & Notebooks</a>
                    </div>
                    <h3 class="mb-0 font-weight-semibold">$250.99</h3>
                    <div> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> </div>
                    <div class="text-muted mb-3">34 reviews</div> <button type="button" class="btn bg-cart"><i class="fa fa-cart-plus mr-2"></i> Add to cart</button>
                </div>
            </div>
        </div>
        <div class="col-md-4 mt-2">
            <div class="card">
                <div class="card-body">
                    <div class="card-img-actions"> <img src="https://res.cloudinary.com/dxfq3iotg/image/upload/v1562074043/234.png" class="card-img img-fluid" width="96" height="350" alt=""> </div>
                </div>
                <div class="card-body bg-light text-center">
                    <div class="mb-2">
                        <h6 class="font-weight-semibold mb-2"> <a href="#" class="text-default mb-2" data-abc="true">Toshiba Notebook with 500GB HDD & 8GB RAM</a> </h6> <a href="#" class="text-muted" data-abc="true">Laptops & Notebooks</a>
                    </div>
                    <h3 class="mb-0 font-weight-semibold">$250.99</h3>
                    <div> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> </div>
                    <div class="text-muted mb-3">34 reviews</div> <button type="button" class="btn bg-cart"><i class="fa fa-cart-plus mr-2"></i> Add to cart</button>
                </div>
            </div>
        </div>
        <div class="col-md-4 mt-2">
            <div class="card">
                <div class="card-body">
                    <div class="card-img-actions"> <img src="https://res.cloudinary.com/dxfq3iotg/image/upload/v1562074043/234.png" class="card-img img-fluid" width="96" height="350" alt=""> </div>
                </div>
                <div class="card-body bg-light text-center">
                    <div class="mb-2">
                        <h6 class="font-weight-semibold mb-2"> <a href="#" class="text-default mb-2" data-abc="true">Toshiba Notebook with 500GB HDD & 8GB RAM</a> </h6> <a href="#" class="text-muted" data-abc="true">Laptops & Notebooks</a>
                    </div>
                    <h3 class="mb-0 font-weight-semibold">$250.99</h3>
                    <div> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> </div>
                    <div class="text-muted mb-3">34 reviews</div> <button type="button" class="btn bg-cart"><i class="fa fa-cart-plus mr-2"></i> Add to cart</button>
                </div>
            </div>
        </div>
        <div class="col-md-4 mt-2">
            <div class="card">
                <div class="card-body">
                    <div class="card-img-actions"> <img src="https://res.cloudinary.com/dxfq3iotg/image/upload/v1562074043/234.png" class="card-img img-fluid" width="96" height="350" alt=""> </div>
                </div>
                <div class="card-body bg-light text-center">
                    <div class="mb-2">
                        <h6 class="font-weight-semibold mb-2"> <a href="#" class="text-default mb-2" data-abc="true">Toshiba Notebook with 500GB HDD & 8GB RAM</a> </h6> <a href="#" class="text-muted" data-abc="true">Laptops & Notebooks</a>
                    </div>
                    <h3 class="mb-0 font-weight-semibold">$250.99</h3>
                    <div> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> </div>
                    <div class="text-muted mb-3">34 reviews</div> <button type="button" class="btn bg-cart"><i class="fa fa-cart-plus mr-2"></i> Add to cart</button>
                </div>
            </div>
        </div>
    </div>
</div>










</body>
</html>