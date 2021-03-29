package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {
	private final String name;
	private String nickname;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public FarmAnimal(String name) {
		this.name = name;
	}

	public String getName() {
		if (nickname != null){
			return name + " called " + nickname;
		} else {
			return name;
		}
	}

	public abstract String makeSound();


	public String getArticle() {
		return "a";
	}

	@Override
	public String toString() {
		return getArticle() + " " + getName();
	}
}