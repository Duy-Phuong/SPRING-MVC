package action;

import java.util.*;

import com.sun.javafx.collections.MappingChange.Map;

public class SampleAction {

    private  String[] sampleArray;
    {
     sampleArray =  new String[]{"item1","item2","item3"};
    }
    public String execute()
    {
     return "success";
    }
    public String[] getSampleArray() {
     return sampleArray;
    }
    public void setSampleArray(String[] sampleArray) {
     this.sampleArray = sampleArray;
    }
    
    private  List<String> sampleList = new ArrayList<String>();
    {
        sampleList.add("listItem1");
        sampleList.add("listItem2");
        sampleList.add("listItem3");
    }
 
    public List<String> getSampleList() {
     return sampleList;
    }
    public void setSampleList(List<String> sampleList) {
     this.sampleList = sampleList;
    }

    private HashMap<Integer, String> sampleMap = new HashMap<Integer, String>();
    private  String carMake;
    {
     sampleMap.put(new Integer(1), "one");
     sampleMap.put(new Integer(2), "two");
     sampleMap.put(new Integer(3), "three");
    }

    public HashMap<Integer, String> getSampleMap() {
     return sampleMap;
    }
    public void setSampleMap(HashMap<Integer, String> sampleMap) {
     this.sampleMap = sampleMap;
    }
    public String getCarMake() {
     return carMake;
    }
    public void setCarMake(String carMake) {
     this.carMake = carMake;
    }
    
    
    private  User user = new User();
    {
        user.setName("Eswar");
    }


    public String quote()
    {
        return "Don't think, just do";
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}