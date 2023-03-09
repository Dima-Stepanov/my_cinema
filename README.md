[![Java CI with Maven](https://github.com/Dima-Stepanov/my_cinema/actions/workflows/maven.yml/badge.svg)](https://github.com/Dima-Stepanov/my_cinema/actions/workflows/maven.yml)
[![codecov](https://codecov.io/gh/Dima-Stepanov/my_cinema/branch/master/graph/badge.svg?token=yommck4YRp)](https://codecov.io/gh/Dima-Stepanov/my_cinema)

<img alt="logo.jpg" src="img/logo.jpg" title="Cinema Monitor"/>

<h1>Сервис кинотеатр</h1>

<h3>Описание проекта</h3>
Приложение представляет простой Web сервис по покупки билетов в кино, <br>
содержит справочник фильмов и справочник сеансов на эти фильмы, <br>
а так же представление кинозалов описание к ним. <br>
Пользователь имеет возможность зарегистрироваться или авторизоваться в приложении, <br>
выбрать и купить билет на фильм и просмотреть купленные билеты. <br>
**********************
<h3>Стек технологий</h3>
Java 17 <br>
PostgreSQL 14 <br>
Spring BOOT 2.7.4 <br>
Liqubase 4.15 <br>
H2 Database 2.1.210 <br>
Junit5 <br>
AsserJ <br>
Sql2o 1.6 <br>
Bootstrap 5.0.2 <br>
Thymeleaf 3.1 <br>

**********************
<h3>Требования к окружению</h3>
Java 17, Maven 3.8, PostgreSQL 14. Любой из доступных браузеров.
**********************
<h3>Запуск проекта</h3>

1. Создайте базу данных my_cinema при помощи консоли PostgreSQL или терминала pgAdmin:<br>
   """CREATE DATABASE my_cinema"""
2. Скопировать проект из репозитория по ссылке:
   <a href=https://github.com/Dima-Stepanov/my_cinema.git><b>Проект кинотеатр</b></a>
3. Перейдите в корень проекта и при помощи Maven соберите проект командой:<br>
   """mvn install -Pproduction -Dmaven.test.skip=true"""
4. После успешной сборки проекта перейдите в каталог собранного проекта <b>target</b> и запустите приложение
   командой:<br>
   """java -jar cinema-1.0.jar"""
5. В браузере перейдите по ссылке http://localhost:8080/index

**********************

<h3>Взаимодействие с приложением</h3>

1. Главная страница. Выводите общую информацию о ресурсе и ссылки на основное меню. <br>

![1_index.jpg](img%2F1_index.jpg) <br>

Рисунок 1. Главная страница <br>

2. Афиша. Выводите список фильмов. При выборе конкретного фильма пользователь переходит на список доступных сеансов по
   данному фильму. <br>

![2_films.jpg](img%2F2_films.jpg) <br>

Рисунок 2. Страница Афиша <br>

3. Сеансы. Выводите сеансы и связанные с ними фильмы. При выборе конкретного сеанса пользователь переходит на страницу
   покупки билета. <br>

![3_sessions.jpg](img%2F3_sessions.jpg)  <br>

Рисунок 3. Страница сеансов <br>

4. Страница покупки билета. Выводите информацию о сеансе и фильм. Также 2 выпадающих списка - один для указания ряда,
   другой для указания места, и кнопки "Купить", "Отменить".
   При нажатии на кнопку отмена происходит переход на страницу Афиша. 
   При нажатии кнопку купить происходит переход на
   страницу статуса покупки(успешно/не успешно). 
   Если пользователь не авторизован при нажатии на кнопку купить происходит переадресация на страницу авторизации.<br>

![4_halls_ticket.jpg](img%2F4_halls_ticket.jpg) <br>

Рисунок 4. Страница покупки билетов <br>

5. Страница с результатом успешной покупки билета. <br>

![4_halls_ticket.jpg](img%2F4_halls_ticket.jpg) <br>

Рисунок 5. Страница успешной покупки <br>

6. Страница с результатом неудачной покупки билета (билет уже купили). <br>

![6_status_404.jpg](img%2F6_status_404.jpg) <br>

Рисунок 6. Страница неудачной покупки <br>

7. Страница регистрации. <br>

![7_register.jpg](img%2F7_register.jpg) <br>

Рисунок 7. Страница регистрации <br>

8. Страница входа. <br>

![8_login.jpg](img%2F8_login.jpg) <br>

Рисунок 8. Страница входа <br>

**********************
<h3>Контакты</h3>
email: <b>haoos@inbox.ru</b> <br>
github.com: <a href=https://github.com/Dima-Stepanov><b>Dima-Stepanov<b></a>
