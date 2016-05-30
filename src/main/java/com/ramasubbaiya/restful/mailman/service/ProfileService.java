package com.ramasubbaiya.restful.mailman.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ramasubbaiya.restful.mailman.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = new HashMap<>();
	
	//Get All Profiles
	public  List<Profile> getAllProfiles() {
		return new ArrayList<>(profiles.values());
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
		if(profiles.containsValue(profile.getProfileName())){
			profiles.put(profile.getProfileName(), profile);
		} else {
			return null;
		}
		return profile;
	}
	
	//Delete a Profile
	public Profile deleteProfile(String profileName) {
		return profiles.remove(profileName);
	}
	
}
