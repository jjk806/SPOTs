package com.spots.dto;

public class UserInfo {
	private int uid;
	private String email;
	private String password;
	private String birthday;
	private char skill;
	private String position_uid;
	private char ckMail;
	private int win;
	private int lose;
	private int draw;
	private int warning;
	private int team_uid;

	public UserInfo() {}

	
	public UserInfo(String email, String password, String birthday, char skill, String position_uid) {
		super();
		this.email = email;
		this.password = password;
		this.birthday = birthday;
		this.skill = skill;
		this.position_uid = position_uid;
	}

	

	public UserInfo(int uid, String email, String password, String birthday, char skill, String position_uid,
			char ckMail, int win, int lose, int draw, int warning, int team_uid) {
		super();
		this.uid = uid;
		this.email = email;
		this.password = password;
		this.birthday = birthday;
		this.skill = skill;
		this.position_uid = position_uid;
		this.ckMail = ckMail;
		this.win = win;
		this.lose = lose;
		this.draw = draw;
		this.warning = warning;
		this.team_uid = team_uid;
	}


	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public char getSkill() {
		return skill;
	}

	public void setSkill(char skill) {
		this.skill = skill;
	}

	public String getPosition_uid() {
		return position_uid;
	}

	public void setPosition_uid(String position_uid) {
		this.position_uid = position_uid;
	}

	public char getCkMail() {
		return ckMail;
	}

	public void setCkMail(char ckMail) {
		this.ckMail = ckMail;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public int getWarning() {
		return warning;
	}

	public void setWarning(int warning) {
		this.warning = warning;
	}

	public int getTeam_uid() {
		return team_uid;
	}

	public void setTeam_uid(int team_uid) {
		this.team_uid = team_uid;
	}

	@Override
	public String toString() {
		return "UserInfo [uid=" + uid + ", email=" + email + ", password=" + password + ", birthday=" + birthday
				+ ", skill=" + skill + ", position_uid=" + position_uid + ", ckMail=" + ckMail + ", win=" + win
				+ ", lose=" + lose + ", draw=" + draw + ", warning=" + warning + ", team_uid=" + team_uid + "]";
	}
	
	
	
}
