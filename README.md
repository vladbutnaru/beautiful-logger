# beautiful-logger
Beautiful JAVA Logging library to simplify logging all across your Java application

##USAGE##
In order to use the library, you have to include it in your Java project buildpath. Simply add the .jar file into your lib folder of the project.

```javascript
import ro.vladbutnaru.beautifullogger.BeautifulLogger;

```

The methods in the library accepts a string to be printed out on the console/output and a class that generates the log, so that it knows who is the invoker.

There are multiple levels of logging available for you to choose from:
* **Action**
```javascript
BeautifulLogger.logAction("test",MainClass.class);

```
* **Error**
```javascript
BeautifulLogger.logError("test",MainClass.class);

```
* **Warning** 
```javascript
BeautifulLogger.logWarning("test",MainClass.class);

```
* **Attention**
```javascript
BeautifulLogger.logAttention("test",MainClass.class);

```
* **Info**
```javascript
BeautifulLogger.logInfo("test",MainClass.class);

```
* **Standard**
```javascript
BeautifulLogger.logStandard("test",MainClass.class);

```

##LICENCE##
You may use Beautiful Logger in all your Java applications without any restraints or constraints.

