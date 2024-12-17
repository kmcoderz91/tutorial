# System Design
System Design is the core concept behind the design of any distributed system.

#### **Fundamentals**
1. Functional Requirements : These are the requirements that the end user specifically demands as basic facilities that the system should offer. All these functionalities need to be necessarily incorporated into the system as a part of the contract. These are represented or stated in the form of input to be given to the system, the operation performed and the output expected. They are basically the requirements stated by the user which one can see directly in the final product. e.g. These include features like data processing, authentication, and user interactions.
   1. Describes what the system should do.
   2. Focuses on the behavior and features of the system.
   3. Defines the actions and operations of the system.
   4. Easy to measure in terms of outputs or results.
2. Non-functional requirements : These are basically the quality constraints that the system must satisfy according to the project contract. The priority or extent to which these factors are implemented varies from one project to other. They are also called non-behavioral requirements. e.g. non-functional requirements specify how the system performs its tasks, focusing on attributes like performance, security, scalability, and usability.
   1. Describes how the system should perform,
   2. Focuses on the performance, usability, and other quality attributes.
   3. Defines constraints or conditions under which the system must operate.
   4. More difficult to measure, often assessed using benchmarks or SLAs.
3. Horizontal Scaling : we enhance the performance of the server by adding more machines to the network and sharing the processing and memory workload across multiple devices. We add more instances of the server to the existing pool of servers and distribute the load among these servers. 
   1. There is no need to change the server's capacity or replace the server. 
   2. Also, like vertical scaling, there is no downtime while adding more servers to the network.
4. Vertical scaling : upgrading the capacity of a single machine or moving to a new machine with more power is called vertical scaling. 
   1. You can add more power to your machine by adding better processors, increasing RAM, or other power-increasing adjustments. 
   2. Vertical scaling can be easily achieved by switching from small to bigger machines but remember that this involves downtime.
5. CAP Theorem : Consistency (among replicated copies), Availability (of the system for read and write operations) and Partition tolerance (in the face of the nodes in the system being partitioned by a network fault). The CAP theorem states that it is not possible to guarantee all three of the desirable properties – consistency, availability, and partition tolerance at the same time in a distributed system with data replication.
6. Microservices : Microservice is a small, loosely coupled distributed service. It has evolved as a solution to the scalability, independently deployable, and innovation challenges with Monolithic architecture. It allows you to take a large application and decompose or break it into easily manageable small components with narrowly defined responsibilities. It is considered the building block of modern applications. Microservices can be written in a variety of programming languages, and frameworks, and each service acts as a mini-application on its own.
7. Proxy Servers : Proxy servers act as intermediaries between client devices and servers. They improve performance by caching frequently requested content, provide security by filtering incoming traffic, and enable load balancing for efficient distribution of requests.
8. Redundancy : Intentional inclusion of extra components, systems, or resources to ensure continued functionality in the event of a failure. Redundancy aims to eliminate single points of failure, enhancing system reliability and fault tolerance. This can be achieved through techniques such as duplicating critical hardware components or having backup systems ready to take over seamlessly.
9. Replication : It involves creating and maintaining copies of data or entire systems across multiple locations. The primary goal of replication is to improve data availability, distribute the load, and enhance fault tolerance. In distributed databases, data replication ensures that if one server or node fails, another can take over with the same dataset. This redundancy of data contributes to resilience, reducing the risk of data loss and improving overall system performance.

#### **Procedure to Design Systems**
System design is the process of designing the architecture and components of a software system to meet specific business requirements. 
1. Understand the requirements : This involves talking to stakeholders and users, reviewing existing documentation, and analyzing the business processes that the system will support.
2. Define the system architecture : This involves identifying the major components of the system and the interfaces between them.
3. Choose the technology stack : This includes choosing the programming language, database, frameworks, and libraries that will be used to implement the system.
4. Design the modules : This involves defining the functions that each module will perform and the data that it will manipulate.
5. Plan for scalability : This involves identifying potential bottlenecks and designing the system to handle increased loads.
6. Consider security and privacy : This involves identifying potential security threats and designing the system to mitigate them.
7. Test and validate :  This involves creating test cases and scenarios that simulate real-world usage and verifying that the system meets the requirements.

#### **High-Level Design**
High-level design or HLD refers to the overall system
* System architecture
* Database design
* Brief description of systems, services, platforms, and relationships among modules.

#### **Storage options**
1. Block Storage
2. File Storage
3. Object Storage
4. Redundant Disk Arrays (RAID)

#### **Message Queues**
Message queues facilitate communication between distributed systems by allowing asynchronous communication. This decouples the components, enabling them to operate independently and improving system reliability.  It functions as a temporary storage and routing system for messages exchanged between different components, applications, or systems within a larger software architecture.
e.g. Kafka

#### **Design Patterns**
1. Bloom Filters : It is a space-efficient probabilistic data structure used to test whether a given element is a member of a set. It achieves this by using multiple hash functions to map elements to a bit array. While false positives are possible, false negatives are not. This makes Bloom filters valuable in scenarios where memory is constrained, and a slight risk of false positives is acceptable, such as in caching systems and network routing tables.
2. Consistent Hashing : It is a technique used in distributed systems to efficiently distribute data across a changing set of nodes. Unlike traditional hash functions, consistent hashing minimizes the impact of adding or removing nodes, ensuring that most keys remain mapped to the same nodes. This is particularly useful in scenarios like distributed caching and load balancing, where maintaining a stable mapping despite node changes is essential for performance and data integrity.
3. Quorum : It is a strategy to achieve consensus among a majority of nodes. It helps in ensuring that a certain number of nodes must agree on an operation for it to be considered successful. Quorums are crucial for maintaining data consistency and availability, especially in scenarios prone to network partitions. Variations like the "two-thirds" or "majority" quorum systems are common in databases, providing a balance between fault tolerance and system responsiveness.
4. Checksum : A checksum is a value derived from the data in a file or message, used to verify its integrity. Various algorithms, like CRC or Adler-32, calculate checksums, and if the checksum of the received data matches the calculated checksum, it indicates that the data is likely intact.
5. Merkle Trees : It is a hierarchical data structure that facilitates efficient verification of large datasets. It works by recursively hashing pairs of data until a single hash, known as the Merkle root, is obtained. If any part of the data changes, it only affects the path from the altered data to the root, simplifying verification.
6. Leader Election : It is a crucial concept in distributed systems where nodes must select a leader to coordinate and manage the distributed activities. Algorithms like Paxos and Raft are often employed for leader election, ensuring that one node takes charge while others follow. 

#### **Database**
1. Relational databases
2. Non-relational databases
##### **How to choose a Database**
1. How much data do you expect to store when the application is mature? 
2. How many users do you expect to handle simultaneously at peak load? 
3. What availability, scalability, latency, throughput, and data consistency does your application need? 
4. How often will your database schemas change? 
5. What is the geographic distribution of your user population? 
6. What is the natural “shape” of your data? 
7. Does your application need online transaction processing (OLTP), analytic queries (OLAP), or both? 
8. What ratio of reads to writes do you expect in production? 
9. What are your preferred programming languages? 
10. Do you have a budget? If so, will it cover licenses and support contracts?
##### **ACID Properties**
* Atomicity: By this, we mean that either the entire transaction takes place at once or doesn’t happen at all. There is no midway i.e. transactions do not occur partially.
* Consistency: This means that integrity constraints must be maintained so that the database is consistent before and after the transaction. It refers to the correctness of a database.
* Isolation: This property ensures that multiple transactions can occur concurrently without leading to the inconsistency of the database state. Transactions occur independently without interference.
* Durability: This property ensures that once the transaction has completed execution, the updates and modifications to the database are stored in and written to disk and they persist even if a system failure occurs.
##### **BASE Properties**
* Basically Available
* Soft State
* Eventually Consistent
BASE prioritizes excessive availability and performance over strict consistency.
##### **Sharding**
Sharding is a technique that splits a large database or dataset into smaller partitions, or shards, and stores them across multiple database servers. It's used to improve the performance and scalability of a system. (horizontal partitioning)
##### **Partitioning**
partitioning is the process of dividing a database into separate sections, or partitions, that can be stored, accessed, and managed independently. The goal of partitioning is to improve the performance, scalability, and availability of large databases.

#### **Low-Level Design**
It is a component-level design process that follows step by step refinement process. The input to LLD is HLD.  It provides us with the structure and behavior of class as different entities have different character sets. From this design, it is easy for a developer to write down logic and henceforth the actual code for it.

#### **UML Diagram**
1. Component Diagrams
2. Activity Diagrams
3. Use Case Diagram
4. Sequence diagram
5. Data Flow Diagram
6. Entity Relational Model
7. Package diagram

