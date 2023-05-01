# DY-Jewelry
Java project 


# Project Overview 

Users can create an account with a username, email address, and password. The users information is protected by the security measures that were implemented throughout the project. 
The JavaBook/ Dy project was created so users can sign in  and have immediate  access to all of their information about jewelry on the David Yurman site. Once Users have logged in, they will then be able to utilize the search bar, and look for key pieces of jewelry they are interested in.

<hr> 

# Technologies Used 

GitHub

Google 

Java 

 Springboot
 
MYSQL

Postgress

Maven

Intelli

Apple notes 


<hr> 

# User Stories 
1. As a user I should be able to go on to the site to create an account 

2. As a user I should be able to have access to all the jewelry I have liked on the site in one place 

3. As a user I should be able to go on to the DY site, and search for key pieces of Jewelry.

4. As a user I should be able to go on to the DY site and sort things by price 

5. As a user I should be able to go to  the DY site and sort things by metal type (gold/silver)

6. As a user I should be able to go to the DY site and filter through the jewelry I want to see 

7. As a user I should be able to go to the DY site and filter through the different gems 

8. As a user I should be able to select one gem type, and only find gems that reflect what I have typed in the search bar 

9. As a user I should be able to search multiple things in the search bar at once so I can narrow down the exact type of pieces I am looking for. 

10.  As a customer, I want to be able to filter search results by metal type, stone type
and price range so that I can quickly find the products I'm interested in and
make a purchase.

Acceptance criteria:
*The search filter options for metal type, stone type, and price range are clearly visible on the search page.

*The search filter options update the search results in real-time as the user selects them.

*The search filter options provide accurate results and do not include products that do not
meet the selected criteria.

<hr>  

 # ERD Diagram 
 
 
 <img width="601" alt="Screenshot 2023-04-28 at 12 03 06 PM" src="https://user-images.githubusercontent.com/97572760/235390533-0a9a6553-5ef9-4ef1-96c4-ec6085f64020.png">

<img width="596" alt="Screenshot 2023-04-30 at 8 22 07 PM" src="https://user-images.githubusercontent.com/97572760/235390569-59484666-7c72-499d-965f-c61844ee68fc.png">


<img width="596" alt="Screenshot 2023-04-30 at 8 22 07 PM" src="https://user-images.githubusercontent.com/97572760/235390590-6b5a2ad9-ad23-46b1-b3b1-a4d264ff2b76.png">


 # Relationships 
 
The username (foreign key) is connected to the user_id (foreign key) with a one to many relationship 

The Id (foreign key) is connected to the ID (primary) with a one to many relationship 

The users id(primary key) is connected to the jewelry user_id (foreign key) with a one to many relationship 

