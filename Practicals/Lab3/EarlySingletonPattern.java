class EarlySingleObject{

    // create static object and Instantiate it
    // since the object is initialized early, it is called early initialization
    private static EarlySingleObject object = new EarlySingleObject();

    // Make the constructor private so that the object cannot be instantiated. 
    // It can only be accessed through getInstance()
    private EarlySingleObject(){}

    // return the private object
    public static EarlySingleObject getInstance(){
        return object;
    }

    public void displayMessage(){
        System.out.println("Object is instantiated");
    }
}


public class EarlySingletonPattern{
    public static void main(String[] args) {

        // since the constructor is private, the statement below gives error 
        // EarlySingleObject object = new EarlySingleObject();
        
        // getInstance() is static, so it doesn't need any object to be initialized for it to be called
        EarlySingleObject object = EarlySingleObject.getInstance();
        object.displayMessage();
    }
}
