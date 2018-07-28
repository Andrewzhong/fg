<%--
  Created by IntelliJ IDEA.
  User: zhongxiaowa
  Date: 2018/7/19
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <title>哀牢山主页面测试</title>
    <link rel="stylesheet" href="http://js.arcgis.com/3.11/dijit/themes/nihilo/nihilo.css">
    <link href='http://js.arcgis.com/3.11/esri/css/esri.css' rel='stylesheet'/>
</head>
<body class="nihilo">
<div class="navbar navbar-default">
    <ul class="nav navbar-nav">
        <li>
            <a id="signin-elem" href="#">Sign In</a>
        </li>
        <li>
            <a id="measurement-toggle" href="#">Measure</a>
        </li>
    </ul>
</div>
<div id="map-div"></div>
<div id="measurement-div"></div>
<div id="basemap-div"></div>
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
<!--根据ArcGIS API for Java Script 建立一个以地图为底层元素建立一个相应的-->