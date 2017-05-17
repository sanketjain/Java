# JPA 

### Java Persistence API
 - We don't need any app server to deploy to run our jpa applications
 - its just like a basic java app
 - Its an ORM specification
 - Sample implementations are Eclipselink, Hibernate, iBatis, MyBatis,…
 - Direct relationship between java object and the database table
 - You can also create the table form jpa app itself
 - Without any implementaion you cannot use JPA by itself

#### Annotations used:
	
| S. No | **Annotation** | **Description** |
------:|:------------|:-----------------
1. | `@Entity`  | You are saying that the given class is an entity or a table
2. | `@Table` | This is to change the properties of the table after using the `@Entity` annotation
3. | `@Column` | Once the class is noted as an Entity, all the properties in that class are columns of that table but if any of the properties of any columns needs to be changed then use this annotation
4. | `@Id` | To make any property  in the class as a primary key for that class(entity)
5. | `@SequenceGenerator` | Is the annotation which is used for generating or creating a sequence in the database with the provided name and initial values.
6. | `@GeneratedValue` | Is used to generate an automatic primary key value(auto generated primary keys) or by using a sequence.  
7. | `@Temporal` | Temporal is to create a `DATE` column in the database with a complete timestamp by default but a type can be specified(means if we want a `DATE` or `TIME` specifically and not together)
8. | `@Lob` | Large object | If the variable is a `char[]`, then it creates a `CLOB` and if it is a `byte[]` then it creates a `BLOB` in the database
9. | `@SecondaryTable` | To create a second table out of the same entity, use it in `@Column` annotation in `'table'` attribute
10.  | `@PrimaryKeyJoinColumn` | Which column we want to use as the primary key column for the secondary table from the primary table(This has to be used in the `@SecondaryTable` annotation with attribute '`pkJoinColumns`')
11. | `@Embeddable` | To use this class in some other entities for eg: User's address or Employer's address or Office address or so and so
12. | `@Embedded` | To use `AttributeOverrides` and also to include Address into User entity
13. | `@AttributeOverrides`
14. | `@AttributeOverride` | (use `@Column` annotation also in conjunction with this)
15. | `@OneToOne` | is used to establish a One to One relationship between two entities(two classes(two tables))
15.a. | `@JoinColumn` | On the main table
15.b. | `mappedBy` | attribute on the secondary table(if needed)
16. | `@OneToMany`
17. | `@ManyToOne`
18. | `@ManyToMany`
19. | `@JoinTable` |(  `joinColumns`, `inverseJoinColumns`, `name` )
20. | `@NamedQuery`| An annotation used in JPQL(refer below)
	
 #### JPQL(Java Persitence query Language)

```java
1. Query
2. TypedQuery
3. CriteriaAPI  
    a. CriteriaBuilder  
	b. CriteriaQuery  
	c. Root  
	d. CriteriaQuery.multiSelect, select, from, orderBy, having,  
	e. Root.join  
	f. Join API  
	g. Aggregate functions  
	h. `@NamedQuery` |(manager.createNamedQuery)  
```


### Implementation

1. Setup database - Prefer Postgres - [Postgres Download](https://www.postgresql.org/download/windows/)