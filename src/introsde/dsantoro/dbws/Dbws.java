
package introsde.dsantoro.dbws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Dbws", targetNamespace = "http://dbws.dsantoro.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Dbws {


    /**
     * 
     * @param personId
     * @return
     *     returns introsde.dsantoro.dbws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.ReadPersonResponse")
    @Action(input = "http://dbws.dsantoro.introsde/Dbws/readPersonRequest", output = "http://dbws.dsantoro.introsde/Dbws/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.dsantoro.dbws.Person>
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPersonList", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.ReadPersonList")
    @ResponseWrapper(localName = "readPersonListResponse", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.ReadPersonListResponse")
    @Action(input = "http://dbws.dsantoro.introsde/Dbws/readPersonListRequest", output = "http://dbws.dsantoro.introsde/Dbws/readPersonListResponse")
    public List<Person> readPersonList();

    /**
     * 
     * @param person
     */
    @WebMethod
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.CreatePersonResponse")
    @Action(input = "http://dbws.dsantoro.introsde/Dbws/createPersonRequest", output = "http://dbws.dsantoro.introsde/Dbws/createPersonResponse")
    public void createPerson(
        @WebParam(name = "person", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Person> person);

    /**
     * 
     * @param mealId
     * @return
     *     returns introsde.dsantoro.dbws.Meal
     */
    @WebMethod
    @WebResult(name = "meal", targetNamespace = "")
    @RequestWrapper(localName = "readMeal", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.ReadMeal")
    @ResponseWrapper(localName = "readMealResponse", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.ReadMealResponse")
    @Action(input = "http://dbws.dsantoro.introsde/Dbws/readMealRequest", output = "http://dbws.dsantoro.introsde/Dbws/readMealResponse")
    public Meal readMeal(
        @WebParam(name = "mealId", targetNamespace = "")
        Long mealId);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.dsantoro.dbws.Meal>
     */
    @WebMethod
    @WebResult(name = "mealList", targetNamespace = "")
    @RequestWrapper(localName = "readMealList", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.ReadMealList")
    @ResponseWrapper(localName = "readMealListResponse", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.ReadMealListResponse")
    @Action(input = "http://dbws.dsantoro.introsde/Dbws/readMealListRequest", output = "http://dbws.dsantoro.introsde/Dbws/readMealListResponse")
    public List<Meal> readMealList();

    /**
     * 
     * @param meal
     * @param person
     */
    @WebMethod
    @RequestWrapper(localName = "createMeal", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.CreateMeal")
    @ResponseWrapper(localName = "createMealResponse", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.CreateMealResponse")
    @Action(input = "http://dbws.dsantoro.introsde/Dbws/createMealRequest", output = "http://dbws.dsantoro.introsde/Dbws/createMealResponse")
    public void createMeal(
        @WebParam(name = "meal", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Meal> meal,
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param activityId
     * @return
     *     returns introsde.dsantoro.dbws.Activity
     */
    @WebMethod
    @WebResult(name = "activity", targetNamespace = "")
    @RequestWrapper(localName = "readActivity", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.ReadActivity")
    @ResponseWrapper(localName = "readActivityResponse", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.ReadActivityResponse")
    @Action(input = "http://dbws.dsantoro.introsde/Dbws/readActivityRequest", output = "http://dbws.dsantoro.introsde/Dbws/readActivityResponse")
    public Activity readActivity(
        @WebParam(name = "activityId", targetNamespace = "")
        Long activityId);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.dsantoro.dbws.Activity>
     */
    @WebMethod
    @WebResult(name = "activityList", targetNamespace = "")
    @RequestWrapper(localName = "readActivityList", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.ReadActivityList")
    @ResponseWrapper(localName = "readActivityListResponse", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.ReadActivityListResponse")
    @Action(input = "http://dbws.dsantoro.introsde/Dbws/readActivityListRequest", output = "http://dbws.dsantoro.introsde/Dbws/readActivityListResponse")
    public List<Activity> readActivityList();

    /**
     * 
     * @param activity
     * @param person
     */
    @WebMethod
    @RequestWrapper(localName = "createActivity", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.CreateActivity")
    @ResponseWrapper(localName = "createActivityResponse", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.CreateActivityResponse")
    @Action(input = "http://dbws.dsantoro.introsde/Dbws/createActivityRequest", output = "http://dbws.dsantoro.introsde/Dbws/createActivityResponse")
    public void createActivity(
        @WebParam(name = "activity", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Activity> activity,
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param goalId
     * @return
     *     returns introsde.dsantoro.dbws.Goal
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "readGoal", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.ReadGoal")
    @ResponseWrapper(localName = "readGoalResponse", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.ReadGoalResponse")
    @Action(input = "http://dbws.dsantoro.introsde/Dbws/readGoalRequest", output = "http://dbws.dsantoro.introsde/Dbws/readGoalResponse")
    public Goal readGoal(
        @WebParam(name = "goalId", targetNamespace = "")
        Long goalId);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.dsantoro.dbws.Goal>
     */
    @WebMethod
    @WebResult(name = "goalList", targetNamespace = "")
    @RequestWrapper(localName = "readGoalList", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.ReadGoalList")
    @ResponseWrapper(localName = "readGoalListResponse", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.ReadGoalListResponse")
    @Action(input = "http://dbws.dsantoro.introsde/Dbws/readGoalListRequest", output = "http://dbws.dsantoro.introsde/Dbws/readGoalListResponse")
    public List<Goal> readGoalList();

    /**
     * 
     * @param goal
     * @param person
     */
    @WebMethod
    @RequestWrapper(localName = "createGoal", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.CreateGoal")
    @ResponseWrapper(localName = "createGoalResponse", targetNamespace = "http://dbws.dsantoro.introsde/", className = "introsde.dsantoro.dbws.CreateGoalResponse")
    @Action(input = "http://dbws.dsantoro.introsde/Dbws/createGoalRequest", output = "http://dbws.dsantoro.introsde/Dbws/createGoalResponse")
    public void createGoal(
        @WebParam(name = "goal", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Goal> goal,
        @WebParam(name = "person", targetNamespace = "")
        Person person);

}