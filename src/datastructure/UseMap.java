package datastructure;

import databases.ConnectToSqlDB;

import java.util.*;

public class UseMap {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<String, List<String>> archive = new HashMap<String, List<String>>();

		List<String> Work1 = new ArrayList<String>();
		List<String> Work2 = new ArrayList<String>();
		List<String> Work3 = new ArrayList<String>();
		List<String> Work4 = new ArrayList<String>();
		List<String> Work5 = new ArrayList<String>();
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		System.out.println("=====================I think its working====================");

		Work1.add("1");
		Work1.add("WORK:do the work");

		Work2.add("2");
		Work2.add("WORK:work is donne");

		Work3.add("3");
		Work3.add("WORK:work in progress");

		Work4.add("4");
		Work4.add("WORK:work hard");

		Work5.add("5");
		Work5.add("WORK:don't work");

		String ID = Work1.get(0).toString();
		String ID2 = Work2.get(0).toString();
		String ID3 = Work3.get(0).toString();
		String ID4 = Work4.get(0).toString();
		String ID5 = Work5.get(0).toString();


		for (String s:Work1){
			archive.put(ID, new ArrayList<>());
			archive.get(ID).add(s);
		}

		for (String s:Work2){
			archive.put(ID2,new ArrayList<String>());
			archive.get(ID2).add(s);
		}

		for (String s:Work3){
			archive.put(ID3,new ArrayList<String>());
			archive.get(ID3).add(s);
		}

		for (String s:Work4){
			archive.put(ID4,new ArrayList<String>());
			archive.get(ID4).add(s);
		}
		for (String s:Work5){
			archive.put(ID5,new ArrayList<String>());
			archive.get(ID5).add(s);
		}

		Iterator<Map.Entry<String, List<String>>> itr = archive.entrySet().iterator();
		//loops through archive using for each
		for(String s:archive.keySet()){
		    System.out.println(archive.get(s).get(0).toString());
		 }

		//USING FOR EACH LOOP
		System.out.println("FOR EACH LOOP");
		for(Map.Entry <String, List<String>> entry : archive.entrySet()){
			System.out.println("Key = " + entry.getKey() +
					", Value = " + entry.getValue());
		}
		//USING WHILE LOOP
		System.out.println();
		System.out.println("WHILE LOOP");
		while(itr.hasNext()){
			Map.Entry <String, List<String>> entry= itr.next();
			System.out.println("Key = " + entry.getKey() +
					", Value = " + entry.getValue());
		}

		connectToSqlDB.insertDataFromMapToSqlTable(archive,"MAP","ID","map_words");
		List<String> letters  = connectToSqlDB.readDataBase("MAP", "map_words");
		System.out.println(letters);



	}

}
