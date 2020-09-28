# RmiServerExample
Demo RMI server for RMITaste tool
## Building and Running
 1. Build project using maven:
    ```bash
    mvn package
    ```
 2. Run command:
    ```bash
	# Run non-encrypted RMI server
    java -cp target/rmitaste.examples-1.0-SNAPSHOT-all.jar m0.rmitaste.example.server.BankServer
	
	# Run SSL RMI server
	# This example uses certificates(keystore.jks) that must be in the current directory
	java -cp target/rmitaste.examples-1.0-SNAPSHOT-all.jar m0.rmitaste.example.ssl.server.BankServer
	```

 3. The above example starts the RMI server on port 127.0.0.1:1099.
   ```bash
   nmap -sS -sV -p 1099 --script=rmi-dumpregistry.nse 127.0.0.1
   ```