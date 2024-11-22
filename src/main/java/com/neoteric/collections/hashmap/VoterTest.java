package com.neoteric.collections.hashmap;

import java.util.HashMap;

public class VoterTest {

    public static void main(String[] args) {
        HashMap<String,VoterCard> voterHashMap = new HashMap<>();

        // HashMap<Key,Value> reference = new HashMap();

        // Sowmya soumi = new Sowmya();
        // soumi.name = "";

        voterHashMap.put("a123",new VoterCard("a123","Krish"));
        voterHashMap.put("a124",new VoterCard("a124","Ashri"));
        voterHashMap.put("a125",new VoterCard("a125","Shriran"));
        voterHashMap.put("a126",new VoterCard("a126","Putty"));
        voterHashMap.put("a127",new VoterCard("a127","Krish"));


        System.out.println("");
    }

}
