# Shopello: A small scale, groceries ordering app

##  Problem Statement:

In these days of lockdown that just doesn't seem to end, one of the most affected industries is the local grocery shops that are present in many, if not every colony/society. So, i thought what if we partner with these small scale shops and make the ordering process digital. From my personal experience,  in the lockdown, the local groceries shop opened on a particular day, during a particular period of time. The sheer rush in those shops made it very difficult to get the stuff you need as well as in these days of Covid, its very dangerous. So, if we could just make the orders online and the shopkeeper would create the packages accordingly and systematically and staggered, the consumers can come and pick up their own packed groceries. Now mind you, the scale of project will be limited to a particular colony only. We are focusing on the small scale businesses and this will be advantageous only in the case of a small colony or a society.

## Proposed solution:

We will be implementing an app where the person can login/register as a customer:

 ![Screenshot 2022-01-07 232852](D:\saman\downloads\Screenshot 2022-01-07 232852.png)

This is the login screen, if we want to register we click on the "No account yet? Create one" to open the register user functionality

![Screenshot 2022-01-07 232937](D:\saman\downloads\Screenshot 2022-01-07 232937.png)

Now, to log in we click on the "Already a member? Login"

This user will now be saved in a local database through which we will check the login credentials:

 ![](C:\Users\rprak\AppData\Roaming\Typora\typora-user-images\image-20220108001511230.png)

in case the login credentials do not match those in the database,it is as follows:

![Screenshot 2022-01-07 233026](D:\saman\downloads\Screenshot 2022-01-07 233026.png)

Now, we have also added a functionality for the Shop keeper to enter his products. These products will then be stored onto a database locally(for now as remote database can be implemented in the future). Using this data base we will show the list of the shops available:

​	![image-20220107234911356](C:\Users\rprak\AppData\Roaming\Typora\typora-user-images\image-20220107234911356.png)

When we enter these, we will be able to see the products available here through the database we have created:

![image-20220107234958460](C:\Users\rprak\AppData\Roaming\Typora\typora-user-images\image-20220107234958460.png)

Now we can add these product to our cart and can hence checkout and place our order:

![image-20220107235026112](C:\Users\rprak\AppData\Roaming\Typora\typora-user-images\image-20220107235026112.png)

When we place an order, we are going to implement as functionality where the particular shop keeper is notified about the order and he packs it up and ready for pick up

## Functionality and Concepts:

- So basically we have created different activities here which we switch through using intents.
- We do every database operation locally for now, remote database hosting can be implemented in the future.
- we have used SQlite in order to create a local database to hold the User registeration information.
- We have used RecyclerView in order to display the various shops and products
- We soon will implement the Navigation Libraries by converting all the separate activities into fragments in the end and applying a aesthetic navigation bar .
- The shop's product data makes use of Room Database and livedata in order to use and create the product's database.
- We have also implemented ViewModel library in various parts of our compiled code.
- On an average we have implemented about 5-6 screens which we for now navigate using intents but will soon convert to fragments using Navigation library.
- For each page, we have created an activity and its particular layout XML file and liked them according to the functionality that the page provides.
- We have also used the concept of Binding since it is safer, more efficient and of course, easier to use than the age old findViewById()
- PS: the UI is of course going to updated. This is just v1.0 :)

#### Link: https://github.com/Knight-Night-666/Android-Hackathon

## Future Scope:

- Online payment gateway can be implemented
- the app can be designed to work independently for different colonies
- We can host the database remotely for more efficiency and provide a superb user experience.
- and much much more.


