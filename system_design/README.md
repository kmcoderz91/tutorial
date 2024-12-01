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
1. Bloom Filters
2. Consistent Hashing
3. Quorum
4. Checksum
5. Merkle Trees
6. Leader Election

