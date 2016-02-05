package introsde.dsantoro.storagews;

import java.util.Collection;

import javax.jws.WebService;

import introsde.dsantoro.dbws.Dbws;

@WebService(endpointInterface = "introsde.dsantoro.storagews.Storagews", serviceName="storagewsService")
public class StoragewsImpl implements Storagews {
	private Dbws dbws;
	
	public StoragewsImpl(Dbws dbws) {
		this.dbws = dbws;
	}

	@Override
	public introsde.dsantoro.dbws.Person readPerson(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<introsde.dsantoro.dbws.Person> readPersonList() {
		return dbws.readPersonList();
	}

	@Override
	public introsde.dsantoro.dbws.Person createPerson(introsde.dsantoro.dbws.Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public introsde.dsantoro.dbws.Goal readGoal(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<introsde.dsantoro.dbws.Goal> readGoalList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public introsde.dsantoro.dbws.Goal createGoal(introsde.dsantoro.dbws.Goal goal,
			introsde.dsantoro.dbws.Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public introsde.dsantoro.dbws.Activity readActivity(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<introsde.dsantoro.dbws.Activity> readActivityList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public introsde.dsantoro.dbws.Activity createActivity(introsde.dsantoro.dbws.Activity activity,
			introsde.dsantoro.dbws.Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public introsde.dsantoro.dbws.Meal readMeal(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<introsde.dsantoro.dbws.Meal> readMealList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public introsde.dsantoro.dbws.Meal createMeal(introsde.dsantoro.dbws.Meal meal,
			introsde.dsantoro.dbws.Person person) {
		// TODO Auto-generated method stub
		return null;
	}

}
