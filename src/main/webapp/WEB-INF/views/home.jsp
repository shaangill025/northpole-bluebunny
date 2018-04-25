<%@include file="/WEB-INF/views/template/header.jsp" %>



<!-- Carousel
================================================== -->
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img class="first-slide home-image"
                 src="<c:url value="/resources/images/car1.jpg" />"
                 alt="First slide">
        </div>
        <div class="item">
            <img class="second-slide home-image"
                 src="<c:url value="/resources/images/bb2.jpg" />"
                 alt="Second slide">
        </div>
        <div class="item">
            <img class="third-slide home-image"
                 src="<c:url value="/resources/images/car3.jpg" />"
                 alt="Third slide">
        </div>
    </div>
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
<!-- /.carousel -->


<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container marketing">

    <!-- Three columns of text below the carousel -->
    <div class="row">
        <div class="col-lg-4">
            <a class="btn btn-default" href="event">
                <img class="img-circle"
                     src="<c:url value="/resources/images/event.png" />"
                     alt="Generic placeholder image" width="140" height="140"></a>


            <h2>Special Events</h2>

            <p>North Pole Ice Cream can provide you with an ice cream push cart for your next big event.</p>

            <%--<p><a class="btn btn-default" href="<c:url value="/search/instrument" />" role="button">View details &raquo;</a></p>--%>

        </div>
        <!-- /.col-lg-4 -->
        <div class="col-lg-4">
            <a class="btn btn-default" href="<c:url value="/product/productList/all" />"
               role="button">
                <img class="img-circle"
                     src="<c:url value="/resources/images/wholesale.png" />"
                     alt="Generic placeholder image" width="140" height="140"></a>

            <h2>Warehouse</h2>

            <p>North Pole Ice Cream can provide the freezer and the product for your convenience store.</p>

            <%--<p><a class="btn btn-default" href="<c:url value="/search/record" />" role="button">View details &raquo;</a></p>--%>
        </div>
        <!-- /.col-lg-4 -->
        <div class="col-lg-4">
            <a class="btn btn-default" href="<c:url value="vendor" />"
               role="button">
                <img class="img-circle"
                     src="<c:url value="/resources/images/vendor.png" />"
                     alt="Generic placeholder image" width="140" height="140"></a>

            <h2>Street Vendor</h2>

            <p>North Pole Ice Cream has been providing customers with excellent products since 2003.</p>

            <%--<p><a class="btn btn-default" href="<c:url value="/search/accessory" />" role="button">View details &raquo;</a></p>--%>
        </div>
        <!-- /.col-lg-4 -->
    </div>

    <%@include file="/WEB-INF/views/template/footer.jsp" %>

