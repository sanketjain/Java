# **Java EE - EJB (Enterprise Java Beans)**
<!-- TOC -->

- [**Java EE - EJB (Enterprise Java Beans)**](#java-ee---ejb-enterprise-java-beans)
        - [What is Java EE?](#what-is-java-ee)
        - [JAVA EE vs JAVA SE](#java-ee-vs-java-se)
        - [Who should use this?](#who-should-use-this)
        - [Application server vs Web server:](#application-server-vs-web-server)
        - [Java EE Specification & JPA Specification:](#java-ee-specification--jpa-specification)
    - [**EJB's (3.x)**](#ejbs-3x)
        - [History EJB](#history-ejb)
        - [What is EJB?](#what-is-ejb)
        - [EJB 2.x Strengths:](#ejb-2x-strengths)
        - [EJB 2.x weaknesses:](#ejb-2x-weaknesses)
        - [EJB 3.0 Strengths:](#ejb-30-strengths)
        - [New features in EJB 3.0:](#new-features-in-ejb-30)
        - [New features in EJB 3.1:](#new-features-in-ejb-31)
    - [EJB's within JAVA EE environment:](#ejbs-within-java-ee-environment)
    - [EJB development concepts:](#ejb-development-concepts)
        - [1. Types of EJB's:](#1-types-of-ejbs)
            - [SessionBean:](#sessionbean)
            - [MessageDrivenBean:](#messagedrivenbean)
            - [Entity Beans(but they are gone - Legacy):](#entity-beansbut-they-are-gone---legacy)
            - [Catagory-Related Annotations:](#catagory-related-annotations)
            - [EJB client Access modes](#ejb-client-access-modes)
            - [Instance management (What the container is doing in the background):](#instance-management-what-the-container-is-doing-in-the-background)
            - [EJB Access:](#ejb-access)
            - [EJB instantiation:](#ejb-instantiation)
            - [EJB lifecycle:](#ejb-lifecycle)
        - [EJB Development elements:](#ejb-development-elements)
            - [Elements of EJB:](#elements-of-ejb)
            - [Development:](#development)
            - [Creating a session bean:](#creating-a-session-bean)
            - [Accessing Session beans:](#accessing-session-beans)
        - [JNDI (This is part of the JAVA SE):](#jndi-this-is-part-of-the-java-se)
            - [Finding EJB in JNDI uses 4 key concepts](#finding-ejb-in-jndi-uses-4-key-concepts)
            - [Configuring InitialContext:](#configuring-initialcontext)
            - [After JNDI path:](#after-jndi-path)
                - [Simple servlet JNDI Example:](#simple-servlet-jndi-example)
                - [Problems with JNDI:](#problems-with-jndi)
                - [Using DI or IOC to access EJB's:](#using-di-or-ioc-to-access-ejbs)
                - [Working with DI:](#working-with-di)
                - [DI annotations:](#di-annotations)

<!-- /TOC -->
### What is Java EE?
1. Java Enterprise Edition
2. Business level applications   c
3. Platform is for numerous tools
4. API access for multi-tier and transcational systems

### JAVA EE vs JAVA SE    
1. Build upon Java SE.
2. SE is the base language, EE is an extension which allows a web, client, business login in one place, information tiers, with separate sets of tolls in each tier

### Who should use this?
1. Webservices 
2. Data access using JPA/JTA
3. Persistent entities 
4. EJB's
5. Professional and enterprise level development

### Application server vs Web server:
On J2EE perspective, the main difference betwn webserver and app server is support of EJB(.ear). We can run a war in web server like tomcat.

- Web server is more for servlet and JSP containers
- App server supports:
    - Connection pooling
    - Transaction management
    - Clustering
    - Load balancing
    - Persistence
    - Messaging
- Logical difference: Webserver it to provide http protocol level service while app server provides the support for webservices and expose the business login services. eg: EJB
- App server is more heavy in terms of resources.
- Eg: Oracle Weblogic, IBM Websphere, JBoss(Redhat), Glassfish(sun), TomEE,...

### Java EE Specification & JPA Specification:
 Specifications means a set of rules simply put they contain the interfaces. They dont provide any implementations.
 All the JEE(app) servers needs to provide the implemenations for these interfaces. If we are using EJB or JPA or JMS, we need to get the jars for their implemenations.
 eg: JPA is specification - Hibernate, EclipseLink, iBatis, Spring data,.. are the implemenations.

----

## **EJB's (3.x)**
### History EJB
Reusable middleware was hard to create prior to EJB.

### What is EJB?
- Enterprise Java Bean:
    - A Reusable component
    - A Java object
    - An encapsulation of enterprise business login and executed in a container(app server).
- EJB container provide:
    - Middlware piece of s/w
    - Pooling, transacaiton management, .... 
    - Security
    - Naming and directory services --> Configuration
    - many more
- Four major releases for EJB:
    - EJB 1.0 -> All java based; Cumbersome
    - 2.0 -> Java based + xml; Tedious
    - 2.1 -> Java based + xml; Slightly better than previous
    - 3.0 -> Java based + xml + Annotation; Easier
    - 3.1 -> Java based + xml + Annotation; Easier than prior one
### EJB 2.x Strengths:
- Clean separation of business services
- Persistence supports ORM
- MOM capabilities
- Improvement in performance

### EJB 2.x weaknesses:
- ORM is very complex
- Programming model is complex
- Deployment model overly complex

### EJB 3.0 Strengths:
- Simplified Programming
- Simplified Deployment
- Annotations are added
- Persistence is better

### New features in EJB 3.0:
- Annotations instead of deployment descriptors(ejb-jar.xml)
- Callback methods and listeners
- Whole lifecycle is changed
- Interceptors - To separate the common code 
- Dependency injection - No need of using much of JNDI in the app
- JPA(Use to be Entity beans) is spearated out as an independent component.

### New features in EJB 3.1:
- No interfaces
- singleton session Beans
- Just write the implementation and server will be able to find out what is needed.

## EJB's within JAVA EE environment:
```sequence
Client tier -> Web container -> EJB container -> EIS(DB/Msg service/..) Tier
```

## EJB development concepts:
1. Types of EJB's
2. EJB Client Access modes
3. EJB lifecycle management(how server creates)
4. EJB development elements

### 1. Types of EJB's:
- Designed to provide`
    - DB abstraction
    - REusable business logic component
    - Workflow components
    - Transportable implementation
- Exists as API in javax.ejb
    - interfaces will be here but less concerned today as we r going to use annotations
- Types(3 main categories):
    - Business logic --> SessionBean
    - Workflow logic --> MessageDrivenBean
    - Persistence logic --> JPA Entity
      (Historically known as entity beans and as part of JPA separated)
- We can specify everythign with annotations  

#### SessionBean:
- Reusable business logic component
- can be used to manage the state across client interactions.
    - Three Types
        - Stateless
        - Stateful --> This SB holds the client state data
        - Singleton --> This is introduced as part of 3.1  
        
#### MessageDrivenBean:
- Reusable Workflow logic components
        - Rely on JMS
        - Supports transactions 
- More close to Stateless Session Bean
        - MDB have no client oriented state
        - No disctinction across client or bean
- No direct client access
- Asynchronous interactions  

#### Entity Beans(but they are gone - Legacy):
- Persistence model for EJB's
- Focused on automatic persistence of java object into DB(ORM)
- Types:
    - Bean managed persistence
    - Container managed persistence
    - JPA entities

#### Catagory-Related Annotations:
Create java class and apply annotations

|Bean Type | Annotation|
---------|----------
| Session Bean | `@Stateless` |
               | `@Stateful`
               | `@Singleton`
| MessageDriven| `@MessageDriven`
| JPA Entities | `@Entity`
               | `@EntityManager`

#### EJB client Access modes
- Mostly for session beans.
- 3 types of access modes:
    - Local client access (default (cannot be accessed in the network)) (for every EJB)
	- Remote client access (we can access this over the network(external app))(Only for session beans)
	- Webservice client access (just behaves like a webservice)(goes for Message driven and also session bean)

> Access modes are scpecified by the annotations  
> `@Local`  
> `@Remote`  
> `@LocalBean`  
> `@WebService`

#### Instance management (What the container is doing in the background):
Two management modes:
- Container managed ---> EJB container will manage the life and death of these beans. Widely used
	- How many instances to create or when to create or how to access those instances
	- Transactions, Roles, Security, persistence
- Bean managed --> Developer has to manage everything (from life till death)
	- Transactions, persistence, may be security

#### EJB Access:
* EJB instance access is completely controlled by the container.
* There is no direct access for the client to the EJB
* Container will automatically create a proxy for the EJB
	* Proxy means a look a-like object of the EJB which we created. May be a replica or may be a reference of the object
	* Client ---> Proxy --> EJB --> Proxy --> client 
* We don’t have to create the proxy
* Biggest advantage here -  implement the security
* We can have multiple instances of EJB's which can actually help us when we are dealing huge load
* The client cannot really access the constructor of the EJB which we wrote

#### EJB instantiation:
Using the JNDI lookup is the best way of instatiating an EJB from the proxy.  
It internally create a EJBObject --> proxy

#### EJB lifecycle:
 Lifecycle of instance is managed by container  
Lifecycle is as follows:
- `Do-not-exist` --> no bean instance created in memory
- `Post-construct/Not-ready` --> bean instance exists but it's not ready for use (not ready for client interaction)
- `Ready` --> bean instance exists, and initialized and ready to have the client interaction
- `pre-removal` --> bean instance is about to be removed.
	- When server shutdown or if any error occurs or we manually killed it
	- This is where we can cleanup some of the resources which are open
- As the server is shutdown, which means the bean is removed  
> We have callback methods to know about the transition of the different states in the lifecycle,  
> * `ejbActivate()`  
> * `ejbPassivate()`

### EJB Development elements:
#### Elements of EJB:
- Each EJB is implemented by:
	- Home interface which is deprecated for 3.0
	- Business Interface  & 2 xml's (if 2.x)
	- Implementation for above itnerface
- EJB is defined using the meta-data
	- Tells container how to really manage the EJB
	- Using annotations
    - Using xml's (`ejb-jar.xml` and `Server specific xml`)
- Key description elements
	- EJB Type
	- EJB Name
	- EJB JNDI name
	- Security information
	- Transaction info  
#### Development:
> 1. Write the client
> 2. Write EJB  
>	a. Interfaces (may be depending on versions/But we prefer to write this)  
>	b. Implementation  
> 3. Define the configuration
>	a. Annonations
>	b. Create xml's (deployment descriptors)
> 4. Compile & package
> 5. Generate client access classes
> 6. Deploy and Test
	
#### Creating a session bean:
Steps:
1. Define business logic interface and annotate

```java 
@Local//( or @Remote - BAsed on the client access mode needed)
public interface Calculator{
    public int addition(int a, int b);  //depending on your requirements
}
```
2. Implement the session bean and annotate:
    - Must be a top level class
	- Must be a `public` class
	- Must not be a `abstract class` or `final` class
	- Should have a no-arg constructor
	- Must give implementations for all the methods listed out in the interface
	- Can have any local variables or instance level and all other internal methods

```java
@Stateless //Can use @Stateful or @Singleton as needed by requirements
public class LocalCalculatorBean implements LocalCalculator{
    public int addition(int a, int b){
	    Kasjhdf;
	    Klajsdf;
	    Return 1;
    }
}
```
#### Accessing Session beans:
Client EJB interactions:
- A java EE app client
- A java EE component (JSP,Servlets,EJB,JSF)
- Any Java Object
- A java application
  1. Finds a proxy to interact with EJB using  
    a. JNDI (Java Naming Directory Interface)  
	b. Dependency injection
  2. Steps for interaction  
	    - Declare a reference for EJB's interface  
	    - Get EJB "instance"  
	        - Using JNDI for remote clients or legacy EJB's  
		    - Using DI for local clients or app clients   
        - Invoke methods of interface 
  3. We cannot call a constructor

### JNDI (This is part of the JAVA SE):

> A naming service associates names with objects. An association between a `name` and an `object` is called a `binding`, and a set of such bindings is called a `context`. 
A name in a context can be bound to another context that uses the same naming conventions; the bound context is called a `subcontext`. 
For eg: in a filesystem, a directory (such as `/temp`) is a context that contains bindings between filenames 
and objects that the system can use to manipulate the files (often called file `handles`). 
If a directory contains a binding for another directory (`e.g., /temp/javax`), 
the subdirectory is a subcontext.
> `JNDI` represents a context in a naming system using the `javax.naming.Context` interface. 
This is the key interface for interacting with naming services. 
A Context cannot go up a level, tell you its absolute pathname, or even tell you its own name. 
When you think of a Context, think of an object that encapsulates its children as data and has methods that perform operations on that data, not on the Context itself.

#### Finding EJB in JNDI uses 4 key concepts  
- Context
- Initial context
- Path & name
- Search (which means lookup)
1. JNDI is a standard API to interact with Naming & Directory services
2. Ability to look things up in "`registry`"
3. Used in enterprises to locate EJB's , JMS queues, Datasources or webservices
4. It’s a tree structure
    - Like a folder structure of our Desktop file system
	- Supports lookups, events and complex searching
	- `@Stateless(mappedName = "beanName")`
5. JNDI supports multiple contexts
	- Local context - an app can obtain access to its resources - EJB's, Datasources
	- Remote context - an app can also obtain access to remote app servers - remote EJB's
6. Mostly Dependency injection works in local context

#### Configuring InitialContext:

Now the `javax.naming.Initialcontext implements Context` serves as an entry point to a naming system.   
To use JNDI to access objects in a naming system, first create an `InitialContext` object  
While creating InitialContext object, we need two important elements.
- JNDI service provider which is also called as factory `java.naming.factory.initial`
- Protocol and the provider URL `java.naming.provider.url`   

We can set these things into `InitialContext` by preparing a `Properties` object. 
And also there are constants given for these keys in `Context` interface.  
Eg: `Context c = new InitialContext();`  
This might need some more fundamental keys like security authentication keys. This depends on provider and our jndi settings.  
Below are some of the sample properties needed,
```java
java.naming.factory.initial=com.sun.jndi.ldap.LdapCtxFactory
java.naming.provider.url=ldap://192.168.1.20/o=Planetary,c=US
java.naming.security.authentication=simple
java.naming.security.principal=cn=kris
java.naming.security.credentials=secret
```	
- Control programatically    

```java
    HashTable env = new HashTable();
    env.put("java.naming.factory.initial", "….");
    env.put("java.naming.provider.url","…..");
    Context c = new InitialContext(env);
```
- Externalize config in `jndi.properties`
- EJB container defines its own "naming" scheme.
	- Varied by app server vendor
	- Path and entry name could be overridden.
	
#### After JNDI path:
```java
public class Main{
    Static RemoteCalc calculator;
    PSVM(){
	 Context c;
	 String jndiPath = "com.calculator.ejb3.RemoteCalc";
	 try{
	    c= new InitialContext();
	    Calculator = (RemoteCalculator) c.lookup(jndiPath);
	    int sum = calculator.add(5,5);
	 }catch(){
            
	 }
    }
}
```
##### Simple servlet JNDI Example:
- Represents a servlet controller
- Java app uses JNDI to find the ejb
- Uses local reference to invoke the operations
- In the `init()` method

```java
Context context = new IC();
calculator=(RemoteCalculator) context.lookup(jndiurl);
```		
##### Problems with JNDI:
- Keeping track of JNDI path
- Keep track of bean name.

##### Using DI or IOC to access EJB's:
- DI or IOC means `Dependency injection` or `Injection of Control`
- Container can automatically "inject" references based on annotations (or may be a xml configuration if it is spring)

##### Working with DI:
- Removes JNDI lookups. 
- DI can be used to inject
- `@EJB`, `@Resource`, `@PersistenceContext`, `@EntityManager`
- Not only in EJB's but also web-tier
- App client contains clients

##### DI annotations:
`@EJB` -->  can give info such as EJB's name or mapped name   
`@Resource` --> for non-EJB's. Things like ServletContext or DataSource

```java
//Sample
ServletName extends HttpServlet{
	@EJB
	private RemoteCalc calculator;
	
	doGet(){
		Int sum = calculator.multiply(5,6);
	}
}

Properties p = new Properties();
p.put(Context.PROVIDER_URL, "t3://localhost:7001");
p.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");

```
Check on the CreateTupleQuery

