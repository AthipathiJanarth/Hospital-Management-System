/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author athipathi
 */
public class CommunityList {
    private ArrayList<Community> communityList=new ArrayList<Community>();

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }
     public boolean addCommunity(Community community) {
        return communityList.add(community);
    }
     public void updateCommunity(Community community) {
        int index = communityList.indexOf(community);
        communityList.set(index, community);
    }
}
