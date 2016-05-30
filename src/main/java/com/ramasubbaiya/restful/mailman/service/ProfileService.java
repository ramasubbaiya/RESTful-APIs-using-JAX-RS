package com.ramasubbaiya.restful.mailman.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ramasubbaiya.restful.mailman.database.StaticDatabase;
import com.ramasubbaiya.restful.mailman.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = StaticDatabase.getProfiles();
	
	//Get All Profiles
	public  List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}
	
	//Get a Profile
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	//Add a Profile
	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() +1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	//Update a Profile
	public Profile updateProfile(Profile profile) {
		if(profile.getProfileName().isEmpty()) {
			return null;
		} 
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	//Delete a Profile
	public Profile deleteProfile(String profileName) {
		return profiles.remove(profileName);
	}
	
}
