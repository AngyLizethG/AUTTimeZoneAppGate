#AUTTimeZoneAppGate
Se realiza la automatización de pruebas para el servicio de http://api.geonames.org/timezoneJSON?formatted=true&lat=&lng=1&username=, para validar y verificar el correcto funcionamiento de las funciones:
Validación de parámetros de entrada latitud y longitud
Validar usuarios validos 
Validar información de coordenadas según parámetros de entrada latitud y longitud
Objetivo: de la automatización el mejorar los tiempos de certificación de los servicios. 
Información técnica: Construida con patrón de diseño screenplay,  para entendimiento en los reportes se utiliza BDD, Cucumber y serenity con el gestor de dependencias Maven, los consumos de los servicios se realizan con rest assured. 

#Pre-requisitos 
Para la ejecución de este proyecto debemos tener presente que debemos tener instalado el JDK de java y las variables de entorno, las cuales son:
1.	JAVA_HOME: Descarga el JDK de Java y adjuntamos la ruta en donde se encuentra la carpeta, en mi caso la tengo en C:\Program Files\Java\jre1.8.0_281
java version "1.8.0_281"
2.	Configurar en las variable de entorno en el path, en el cual se debe agregar el apache-maven se adjunta la ruta en donde se encuentre la carpeta, en mi caso la tengo en la variable MAVEN  home:  D:\Maven oficial\apache-maven-3.6.3-bin\apache-maven-3.6.3\bin
3. el proyecto se puede abrir en Intellij o Eclipse.
4. Descargar las dependencias establecidas en el archivo POM.

#Ejecutando las pruebas 
Para la ejecución del proyecto debe tener presente que la variable de entornos se encuentre bien configuradas, adicional debe tener las dependencias descargadas que se encuentra en el archivo POM.
Las pruebas se pueden ejecutar por medio de la clase:
•	serviceTimeZoneRuner
 Los cuales están ubicados en ./AUT_TimeZone/src/test/java/geonames/org/certification/runners/serviceTimeZoneRuner.java
Para observar las evidencias de las pruebas debemos ejecutar las pruebas y luego ingresar a la ruta target\site\serenity, allí buscamos el primer archivo index HTML que encontramos en la carpeta.
