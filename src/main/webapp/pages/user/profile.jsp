<!DOCTYPE html>
<html lang="en">
<head>
    <title>Page Title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            font-family: Arial, Helvetica, sans-serif;
            margin: 0;
        }

        /* Style the header */
        .header {
            padding: 80px;
            text-align: center;
            background: #1abc9c;
            color: white;
        }

        /* Increase the font size of the h1 element */
        .header h1 {
            font-size: 40px;
        }

        /* Style the top navigation bar */
        .navbar {
            overflow: hidden;
            background-color: #333;
        }

        /* Style the navigation bar links */
        .navbar a {
            float: left;
            display: block;
            color: white;
            text-align: center;
            padding: 14px 20px;
            text-decoration: none;
        }

        /* Right-aligned link */
        .navbar a.right {
            float: right;
        }

        /* Change color on hover */
        .navbar a:hover {
            background-color: #ddd;
            color: black;
        }

        /* Column container */
        .row {
            display: flex;
            flex-wrap: wrap;
        }

        /* Create two unequal columns that sits next to each other */
        /* Sidebar/left column */
        .side {
            flex: 30%;
            background-color: #f1f1f1;
            padding: 20px;
        }

        /* Main column */
        .main {
            flex: 70%;
            background-color: white;
            padding: 20px;
        }

        /* Fake image, just for this example */
        .fakeimg {
            background-color: #aaa;
            width: 100%;
            padding: 20px;
        }

        /* Footer */
        .footer {
            padding: 20px;
            text-align: center;
            background: #ddd;
        }

        /* Responsive layout - when the screen is less than 700px wide, make the two columns stack on top of each other instead of next to each other */
        @media screen and (max-width: 700px) {
            .row {
                flex-direction: column;
            }
        }

        /* Responsive layout - when the screen is less than 400px wide, make the navigation links stack on top of each other instead of next to each other */
        @media screen and (max-width: 400px) {
            .navbar a {
                float: none;
                width:100%;
            }
        }
    </style>
</head>
<body>

<div class="header">
    <h1>My Website</h1>
    <p>A website created by me.</p>
</div>

<div class="navbar">
    <a href="#">Link</a>
    <a href="#">Link</a>
    <a href="#">Link</a>
    <a href="#" class="right">Link</a>
</div>

<div class="row">
    <div class="side">
        <h2>About Me</h2>
        <h5>Photo of me:</h5>
        <div class="fakeimg" style="height:200px;">Image</div>
        <p>Some text about me in culpa qui officia deserunt mollit anim..</p>
        <h3>More Text</h3>
        <p>Lorem ipsum dolor sit ame.</p>
        <div class="fakeimg" style="height:60px;">Image</div><br>
        <div class="fakeimg" style="height:60px;">Image</div><br>
        <div class="fakeimg" style="height:60px;">Image</div>
    </div>
    <div class="main">
        <h2>TITLE HEADING</h2>
        <h5>Title description, Dec 7, 2017</h5>
        <div class="fakeimg" style="height:200px;">Image</div>
        <p>Some text..</p>
        <p>Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>
        <br>
        <h2>TITLE HEADING</h2>
        <h5>Title description, Sep 2, 2017</h5>
        <div class="fakeimg" style="height:200px;">Image</div>
        <p>Some text..</p>
        <p>Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>
    </div>
</div>

<div class="footer">
    <h2>Footer</h2>
</div>

</body>
</html>







<%--
<!DOCTYPE html>
<html>

&lt;%&ndash;
/*ПАНЕЛЬ ЗНАЧКОВ*/

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
    body {margin:0;}
    .icon-bar {
        width: 100%;
        background-color: #555;
        overflow: auto;
    }

    .icon-bar a {
        float: left;
        width: 20%;
        text-align: center;
        padding: 12px 0;
        transition: all 0.3s ease;
        color: white;
        font-size: 36px;
    }

    .icon-bar a:hover {
        background-color: #000;
    }

    .active {
        background-color: #4CAF50 !important;
    }
</style>
<body>

<div class="icon-bar">
    <a class="active" href="#"><i class="fa fa-home"></i></a>
    <a href="#"><i class="fa fa-search"></i></a>
    <a href="#"><i class="fa fa-envelope"></i></a>
    <a href="#"><i class="fa fa-globe"></i></a>
    <a href="#"><i class="fa fa-trash"></i></a>
</div>
&ndash;%&gt;

/*ЗНАЧОК МЕНЮ*/
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        .container {
            display: inline-block;
            cursor: pointer;
        }

        .bar1, .bar2, .bar3 {
            width: 35px;
            height: 5px;
            background-color: #333;
            margin: 6px 0;
            transition: 0.4s;
        }

        .change .bar1 {
            -webkit-transform: rotate(-45deg) translate(-9px, 6px);
            transform: rotate(-45deg) translate(-9px, 6px);
        }

        .change .bar2 {opacity: 0;}

        .change .bar3 {
            -webkit-transform: rotate(45deg) translate(-8px, -8px);
            transform: rotate(45deg) translate(-8px, -8px);
        }
    </style>
</head>

<body>

<p>Click on the Menu Icon to transform it to "X":</p>
<div class="container" onclick="myFunction(this)">
    <div class="bar1"></div>
    <div class="bar2"></div>
    <div class="bar3"></div>
</div>

<script>
    function myFunction(x) {
        x.classList.toggle("change");
    }
</script>

</body>
</html>


&lt;%&ndash;
/*НАВИГАЦИЯ*/
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body {
            margin: 0;
            font-family: Arial, Helvetica, sans-serif;
        }

        .topnav {
            overflow: hidden;
            background-color: #333;
        }

        .topnav a {
            float: left;
            color: #f2f2f2;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
            font-size: 17px;
        }

        .topnav a:hover {
            background-color: #ddd;
            color: black;
        }

        .topnav a.active {
            background-color: #4CAF50;
            color: white;
        }
    </style>
</head>
<body>

<div class="topnav">
    <a class="active" href="#home">Home</a>
    <a href="#news">News</a>
    <a href="#contact">Contact</a>
    <a href="#about">About</a>
</div>

<div style="padding-left:16px">
    <h2>Top Navigation Example</h2>
    <p>Some content..</p>
</div>

</body>
</html>

&ndash;%&gt;

    /*ПАНЕЛЬ ПОИСКА*/
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        * {box-sizing: border-box;}

        body {
            margin: 0;
            font-family: Arial, Helvetica, sans-serif;
        }

        .topnav {
            overflow: hidden;
            background-color: #e9e9e9;
        }

        .topnav a {
            float: left;
            display: block;
            color: black;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
            font-size: 17px;
        }

        .topnav a:hover {
            background-color: #ddd;
            color: black;
        }

        .topnav a.active {
            background-color: #2196F3;
            color: white;
        }

        .topnav input[type=text] {
            float: right;
            padding: 6px;
            margin-top: 8px;
            margin-right: 16px;
            border: none;
            font-size: 17px;
        }

        @media screen and (max-width: 600px) {
            .topnav a, .topnav input[type=text] {
                float: none;
                display: block;
                text-align: left;
                width: 100%;
                margin: 0;
                padding: 14px;
            }
            .topnav input[type=text] {
                border: 1px solid #ccc;
            }
        }
    </style>
</head>
<body>

<div class="topnav">
    <a class="active" href="#home">Home</a>
    <a href="#about">About</a>
    <a href="#contact">Contact</a>
    <input type="text" placeholder="Search..">
</div>

<div style="padding-left:16px">
    <h2>Responsive Search Bar</h2>
    <p>Navigation bar with a search box inside of it.</p>
    <p>Resize the browser window to see the responsive effect.</p>
    <p>For more examples on how to add a submit button and icon inside the search bar, go back to the tutorial.</p>
</div>

</body>
</html>


/*НАВЕДЕНИЕ С ПОМОЩЬЮ КНОПОК*/
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        #mySidenav a {
            position: absolute;
            left: -80px;
            transition: 0.3s;
            padding: 15px;
            width: 100px;
            text-decoration: none;
            font-size: 20px;
            color: white;
            border-radius: 0 5px 5px 0;
        }

        #mySidenav a:hover {
            left: 0;
        }

        #about {
            top: 20px;
            background-color: #4CAF50;
        }

        #blog {
            top: 80px;
            background-color: #2196F3;
        }

        #projects {
            top: 140px;
            background-color: #f44336;
        }

        #contact {
            top: 200px;
            background-color: #555
        }
    </style>
</head>
<body>

<div id="mySidenav" class="sidenav">
    <a href="#" id="about">About</a>
    <a href="#" id="blog">Blog</a>
    <a href="#" id="projects">Projects</a>
    <a href="#" id="contact">Contact</a>
</div>

<div style="margin-left:80px;">
    <h2>Hoverable Sidenav Buttons</h2>
    <p>Hover over the buttons in the left side navigation to open them.</p>
</div>

</body>
</html>
--%>
