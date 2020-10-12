# sample-jaxws

http://localhost:9080/demo to trigger the jaxws call : jaxws client calls a remote endpoint (hosted on the current server) on https://localhost:9443/PersonService 

If the features defined in the server.xml are as : 

    <!-- Enable features EE6 -->
     <featureManager>
         <feature>jsp-2.2</feature> 
         <feature>cdi-1.0</feature> 
         <feature>jaxws-2.2</feature> 
         <feature>ejbLite-3.1</feature> 
         <feature>transportSecurity-1.0</feature> 
         <feature>jaxrs-1.1</feature> 
     </featureManager>


The jaxws calls fails (outboundSSLRef is not taken into account (truststore + tls level)

If the features defined in the server.xml are as : 

<!-- Enable features EE7 -->
<!-- Enable features EE7 -->
        <!--featureManager>
        <feature>jsp-2.3</feature>
        <feature>cdi-1.2</feature>
        <feature>jaxws-2.2</feature>
        <feature>ejbLite-3.2</feature>
        <feature>transportSecurity-1.0</feature>
        <feature>jaxrs-2.0</feature>
        </featureManager-->

The jaxws calls is ok : the truststore demo.jks which contains the local server certificate is taken into account.


 