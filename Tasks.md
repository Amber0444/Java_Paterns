Паттерн flyWeight
ProjectMovieHouse\src\main\java\Movies\Screening.java

В Screening есть двумерный массив SeatList, он показывает какие места заняты а каике нет, у него может быть два состояние FreeSeat и BusySeat, и чтобы показать что место забронировано я просто меня FreeSeat на BusySeat, то есть используется всего два объектов которые сменяют друг друга.