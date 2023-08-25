SQL> select power(2,3) from dual;

POWER(2,3)
----------
         8

SQL> select power(4,2) from dual;

POWER(4,2)
----------
        16

SQL> select floor(5.111) from dual;

FLOOR(5.111)
------------
           5

SQL> select floor(5.999)from dual;

FLOOR(5.999)
------------
           5

SQL> select mod(143,10) from dual;

MOD(143,10)
-----------
          3

SQL> select 143/10 from dual;

    143/10
----------
      14.3

SQL> select floor(143/10) from dual;

FLOOR(143/10)
-------------
           14

SQL> select floor(floor(5657/100)/10) from dual;

FLOOR(FLOOR(5657/100)/10)
-------------------------
                        5

SQL> select floor(78,10),mod(78/10),floor(78/10)+mod(78,10) from dual;
select floor(78,10),mod(78/10),floor(78/10)+mod(78,10) from dual
       *
ERROR at line 1:
ORA-00909: invalid number of arguments


SQL> select floor(78/10),mod(78/10),floor(78/10)+mod(78,10) from dual;
select floor(78/10),mod(78/10),floor(78/10)+mod(78,10) from dual
                    *
ERROR at line 1:
ORA-00909: invalid number of arguments


SQL> select floor(78/10),mod(78,10),floor(78/10)+mod(78,10) from dual;

FLOOR(78/10) MOD(78,10) FLOOR(78/10)+MOD(78,10)
------------ ---------- -----------------------
           7          8                      15

SQL> select floor(7889/1000),mod(7889,10) from dual;

FLOOR(7889/1000) MOD(7889,10)
---------------- ------------
               7            9

SQL> select mod((floor(768495/10000),10),floor(mod(768495,100),10) from dual;
select mod((floor(768495/10000),10),floor(mod(768495,100),10) from dual
                               *
ERROR at line 1:
ORA-00907: missing right parenthesis


SQL> select mod((floor(768495/10000)/10),floor(mod(768495,100),10) from dual;
select mod((floor(768495/10000)/10),floor(mod(768495,100),10) from dual
                                    *
ERROR at line 1:
ORA-00909: invalid number of arguments


SQL> select mod((floor(768495/10000)),10),floor(mod(768495,100),10) from dual;
select mod((floor(768495/10000)),10),floor(mod(768495,100),10) from dual
                                     *
ERROR at line 1:
ORA-00909: invalid number of arguments


SQL> select mod((floor(768495/10000)),10),floor(mod(768495,100)/10) from dual;

MOD((FLOOR(768495/10000)),10) FLOOR(MOD(768495,100)/10)
----------------------------- -------------------------
                            6                         9

SQL> select mod(floor(768495/10000),10),floor(mod(768495,100)/10) from dual;

MOD(FLOOR(768495/10000),10) FLOOR(MOD(768495,100)/10)
--------------------------- -------------------------
                          6                         9

SQL> select cell(50.001) from dual;
select cell(50.001) from dual
       *
ERROR at line 1:
ORA-00904: "CELL": invalid identifier


SQL> select cell(50.001)from dual;
select cell(50.001)from dual
       *
ERROR at line 1:
ORA-00904: "CELL": invalid identifier


SQL> select CELL(50.001)from dual;
select CELL(50.001)from dual
       *
ERROR at line 1:
ORA-00904: "CELL": invalid identifier


SQL> select CEILING(50.001)from dual;
select CEILING(50.001)from dual
       *
ERROR at line 1:
ORA-00904: "CEILING": invalid identifier


SQL> select ceil(50.001)from dual;

CEIL(50.001)
------------
          51

SQL> select cill(50.999) from dual;
select cill(50.999) from dual
       *
ERROR at line 1:
ORA-00904: "CILL": invalid identifier


SQL> select ceil(50.999) from dual;

CEIL(50.999)
------------
          51

SQL> select round(12345.1111) from dual;

ROUND(12345.1111)
-----------------
            12345

SQL> select round(12345.7988) from dual;

ROUND(12345.7988)
-----------------
            12346

SQL> select round(12345.7988,2) from dual;

ROUND(12345.7988,2)
-------------------
            12345.8

SQL>
SQL> select round(12345.7988,3) from dual;

ROUND(12345.7988,3)
-------------------
          12345.799

SQL> select trunc(12345.67678,3)from dual;

TRUNC(12345.67678,3)
--------------------
           12345.676

SQL> select trunc(12345.67678,4)from dual;

TRUNC(12345.67678,4)
--------------------
          12345.6767

SQL> select trunc(12345.67678,6)from dual;

TRUNC(12345.67678,6)
--------------------
          12345.6768