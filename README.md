# Home Handy

This is the app to connect servicemen to consumer for our Hackathon BVP 4.0 [https://hackbvp.netlify.app/].Based on the topic commerce . 
The motivation behind the themes for this online hackathon is the current COVID-19 situation.

## Home Handy



This app is to provide employment to the migrant workers due covid those migrated to other places for shelter .We intend to connect our app with Aarogya Setu
API to ensure safety of everyone.
As stated by the govt. API will be out shortly.



## Screenshots


## Frontend concept##
<<<<<<<<<<
Using simple layout ,constrain layout all the fragments of the activities are designed . We have first the splash screen for initializing some process. we have used animation 
then on front page consists of 2 button with some text view ,and image view (logo  of app)
for consumer side 
used Grid view to display the list of services provided by the various servicers where each service act as a button which on clicking show the list of a number of seervicers
near your area and there names sorted by the distance of their current location from the user location along with their phone number. we also built an interface for the registration
of servicer with their address, name, phone number, adhaar number and the service they wanna provide.

we made 15 fragments for front-end of the app-

activity_main.xml:-this includes the front page of the app having an icon with 2 buttons each of them point to a different Fraagment layout based on usre choice

activity_maps.xml:-this includes the front-end interface for api of google maps to get the loction of both servicer and user

activity_splashscreenactivity.xml:-includes the animation presented when the app opens

fragment_after_registration.xml:-this is the last page of app which includes 2 buttons at the bottom for editing your location and editing you data

fragment_customer_info.xml:-this file is used to get the information from the user and save the location in firebase

fragment_front_page.xml:this is the front page of the of the app

fragment_list.xml:-this shows the list of various servicers of desired seervice which are available near you sorted with their distance from the user 

fragment_login_sinup_1.xml:this page is sign up page which recieves email id and password from the user and store them in the firebase

fragment_register_account.xml:this page includes 2 buttons for signup and login 

fragment_servicer1.xml:-this page gets data from the user and stores it in firebase

fragment_servicer2.xml:-this page also gets data from the user in the form of name and phone number and store them in firebase(an online databse to store data)

fragment_servicer3.xml:-this page get adhaar number from the user and store it and then verify it at UIDAI

fragment_sign_up.xml:-this page gets login details from userand store it at firebase and authenticate it to login

fragment_types_of_services.xml:-It is a gridview based fragments wtih a number of image buttons each response to a list if workers near you

fragment_types_services_vendor.xml:this page is used to get and store servicers data

 ## Backend concept##
<<<<<<<<<<
we broadly concluded our backend work with three main activites 
one mainActivity.ky 
one Splashscreenactivity.kt
one MainActivity.kt

Splashscreenactivity :: animation in starting some things are intialized 	
mainActivity :: many fragments are there for navigation components made on navigation graph, through which we can navigate on whole app 
made logics of each button 

MainActivity.kt:: this activity includes almost all the fragments of the app it also includes the firebase for authentication and storing data

MapsActivity.kt:: this activity basically include the calling of google maps api and retrieve the data (latitude and logitude) of the user using gps

Splashscreenactivity.kt:: We have Intialise animations and other stuffs for better and more interactive functioning

We also use data Binding for smoother functioning of app
