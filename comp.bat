SET SRC_ROOT=.
IF NOT EXIST target\classes\api\nul MKDIR target\classes\api
javac -d target\classes\api  %SRC_ROOT%\api\act\UsagerBean.java %SRC_ROOT%\api\act\Deliver.java

IF NOT EXIST C:\wwwroot\rmi\api MKDIR C:\wwwroot\rmi\api
jar cvf C:\wwwroot\rmi\api\deliver.jar -C ./target/classes/api act 

REM **************************
REM *** compilation du serveur ***
REM **************************
IF NOT EXIST target\classes\server\nul MKDIR target\classes\server
javac -d target\classes\server -cp C:\wwwroot\rmi\api\deliver.jar %SRC_ROOT%\server\engine\DeliverEngine.java
