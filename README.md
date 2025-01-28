# Learning GraphQl
Learning different concepts of GraphQl taking a small example of Creating Bank Accounts. 

### Grahpql Schema used:

BankAccount:

     id: ID! -> field of type ID and which is mandatory
    
     name: String 
    
     currency: Currency

Currency:

      USD
  
      INR
  
      ....


### Installation and Running application

1. Start the Mongo
  
     --> Open MongoCompass app and starting the server.
   
     --> Test the connection with mongosh in the command line. 
3. mvn clean install -> to install the the dependencies mentioned in the pom.xml file
4. mvn spring:boot run -> to run the spring boot application.

### Testing

We can test this using postman or Graphiql(graphql playground)

#### In postman: 

  Create a new Collection with Graphql environment. 
    
  localhost:8080/graphql is the endpoint that can be used. 
    
#### In local Browser:

  Go to localhost:8080/graphiql. 
  
  We can query here directly. 


