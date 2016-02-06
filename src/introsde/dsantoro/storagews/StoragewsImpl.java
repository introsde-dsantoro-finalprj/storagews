package introsde.dsantoro.storagews;

import java.util.Collection;

import javax.jws.WebService;

import introsde.dsantoro.adpws.Adpws;

import introsde.dsantoro.dbws.Activity;
import introsde.dsantoro.dbws.Dbws;
import introsde.dsantoro.dbws.Goal;
import introsde.dsantoro.dbws.Meal;
import introsde.dsantoro.dbws.Person;

@WebService(endpointInterface = "introsde.dsantoro.storagews.Storagews", serviceName="storagewsService")
public class StoragewsImpl implements Storagews {
	private Dbws dbws;
	private Adpws adpws;
	
	public StoragewsImpl(Dbws dbws, Adpws adpws) {
		this.dbws = dbws;
		this.adpws = adpws;
	}

	@Override
	public Person readPerson(Long id) {
		return dbws.readPerson(id);
	}

	@Override
	public Collection<Person> readPersonList() {
		return dbws.readPersonList();	
	}

	@Override
	public Person createPerson(Person person) {
		return dbws.createPerson(person);
	}

	@Override
	public Goal readGoal(Long id) {
		return dbws.readGoal(id);
	}

	@Override
	public Collection<Goal> readGoalList() {
		return dbws.readGoalList();
	}

	@Override
	public Goal createGoal(Goal goal, Person person) {
		return dbws.createGoal(goal, person);
	}

	@Override
	public Activity readActivity(Long id) {
		return dbws.readActivity(id);
	}

	@Override
	public Collection<Activity> readActivityList() {
		return dbws.readActivityList();
	}

	@Override
	public Activity createActivity(Activity activity, Person person) {
		return dbws.createActivity(activity, person);
	}

	@Override
	public Meal readMeal(Long id) {
		return dbws.readMeal(id);
	}

	@Override
	public Collection<Meal> readMealList() {
		return dbws.readMealList();
	}

	@Override
	public Meal createMeal(Meal meal, Person person) {
		return dbws.createMeal(meal, person);
	}

	@Override
	public Collection<Meal> searchMeals(String searchKey, int start, int quantity) {		
		return adpws.searchFoods(searchKey, start, quantity);
	}
}
