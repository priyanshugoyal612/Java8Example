package com.java8.custom.annotation.example2;

public class FinalMainMatch {

	public static void main(String[] args) {
		
		IndianTeam indianTeam = new IndianTeam();
		PakistanTeam pakistanTeam = new PakistanTeam();
		
		Class c1 =indianTeam.getClass();
		Team tm =(Team)c1.getAnnotation(Team.class);
		System.out.println(tm.position()+ " Name" + tm.name());
		
		Class c2 =pakistanTeam.getClass();
		Team tm2 =(Team)c2.getAnnotation(Team.class);
		System.out.println(tm2.position()+ " Name" + tm2.name());
		
		if(tm.position()>tm2.position())
		{
			System.out.println("Winner is  " + tm.name());
		}
		

	}

}
