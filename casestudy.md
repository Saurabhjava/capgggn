# Estimated Duration : 2 hr
## Objective
### To Automate transactions of Game Selling

### Problem Statement ### 

DigitalCom is a leading retailer of game selling. 

Their Current Business need is to leverage opportunities in online trade across north and south zone. You need to develop an application using Java. Currently we are doing only the customer part


## Following are the broader task in customer portal

    1.	Register new user and authenticate 
    2.  View Game Details
    3.	Provide search option based on criteria


#### Classes & Interfaces

    Note : Add getters/setters/toString()/default Constructor/java8 features based on the need

___________________________________________________________________________________________________

    * interface IValidate 

        * Method
             boolean IsAuthenticated(String userid,String password)
___________________________________________________________________________________________________

    * class  User (should implement iValidate interface)

        * Attributes 
             userid : string
             password : string
            

        * Methods
            1) void addUser(String userid,String password)  
                -   this method is used to initialize user.

            2) public boolean IsAuthenticated(String userid,String password)
                -   this method should override IsAuthenticated method of interface

_______________________________________________________________________________________________

    *  class Game

        * Attributes
            gameName : string
            authorName : string
            price : float

________________________________________________________________________________________________

    *  class GameService

        * Attributes
           static games : ArrayList<Game>

         * Methods
             1) in the default constructor initilize the below Game objects in games list 

                    [{"SnowBird","Danny",300},
                    {"FreshFood","Ram",450},
                    {"Batsman","Kate",400},
                    {"Pokiman","Steeve",600},
                    {"YammyTommy","Narayan",350}]
            
            2) List<Game> viewAll()
                -   this method should return  list of games with the above data


            3) String authorSearch(String author) 
                -   this Method should get the authorname and returns the Gamename
                        Example 
                            authorSearch(“Ram”) Should return FreshFood
                            Display NOT FOUND, if the given author name doesn’t exist
       

____________________________________________________________________________________________________

    * class DigitalcomProcess

        -   This class should have main method and display the below menu 

            [use  while loop for repeated call and  switch case for choices]

        Main Menu - Choices

        1) RegisterUser
                -- to call the addUser method of User class

        2) ViewGames
                -- to call the viewAll method of GameService class

        3) searchByName
                -- to call the authorSearch method of GameService class

        4) Exit
                -- to come out of loop

        Note : Use Scanner to get the relevant inputs

____________________________________________________________________________________________________














