REM *******************************************
REM *********  start the registry  ************
REM *******************************************
REM start rmiregistry  -J-Djava.rmi.server.codebase="file:/C:/Users/xyz/Documents/rmi/target/jar/api/compute.jar"
start CMD /C "C:\Program Files\Hiawatha\bin\Hiawatha.bat"
start rmiregistry  -J-Djava.rmi.server.codebase="http://127.0.0.1/rmi/api/deliver.jar"

REM *******************************************
REM *********   start the server   ************
REM *******************************************
REM java  -Djava.security.policy=server.policy  -Djava.rmi.server.codebase="http://example.com/rmi/" -Djava.rmi.server.hostname=82.xxx.xxx.126  -cp C:\wwwroot\rmi\api\deliver.jar;.\target\classes\server  engine.DeliverEngine
REM java  -Djava.security.policy=server.policy  -Djava.rmi.server.hostname=82.xxx.xxx.126  -cp C:\wwwroot\rmi\api\deliver.jar;.\target\classes\server  engine.DeliverEngine
java  -Djava.security.policy=server.policy  -Djava.rmi.server.hostname=192.168.1.101  -cp C:\wwwroot\rmi\api\deliver.jar;.\target\classes\server  engine.DeliverEngine
