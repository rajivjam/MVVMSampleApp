# MVVMSampleApp

Very Simple application to demonstrate MVVM design pattern with DataBinding:

MVVM is one of the architectural patterns which enhances separation of concerns, it allows separating the user interface logic from the business (or the back-end) logic. Its target (with other MVC patterns goal) is to achieve the following principle “Keeping UI code simple and free of app logic in order to make it easier to manage”.

## MVVM has mainly the following layers:

### Model: 
This holds the data of the application. It cannot directly talk to the View. Generally, it’s recommended to expose the data to the ViewModel through Observables.

### View:
It represents the UI of the application devoid of any Application Logic. It observes the ViewModel.

### ViewModel: 
It acts as a link between the Model and the ViewModel. It’s responsible for transforming the data from the Model. It provides data streams to the View. It also uses hooks or callbacks to update the View. It’ll ask for the data from the Model.

In this application, I have demonstrated MVVM with DataBinding.

### To enable databinding you need to put below lines of code in app.gradel file:

```java
dataBinding{
        enabled = true
    }
```	

## How does this differ from MVP?

1. ViewModel replaces the Presenter in the Middle Layer.
2. The Presenter holds references to the View. The ViewModel doesn’t.
3. The Presenter updates the View using the classical way (triggering methods).
4. The ViewModel sends data streams.
5. The Presenter and View are in a 1 to 1 relationship.
6. The View and the ViewModel are in a 1 to many relationship.

