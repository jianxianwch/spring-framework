package enums;

/**
 * @author: wangchaohui02
 * @date: 2018/11/27 23:02
 * @description:
 * @version: 1.0
 */
public enum Gender {

	MALE(1,"MALE"),
	FEMALE(2,"FEMALE");

	private int code;
	private String desc;

	Gender(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Gender fetchByCode(int code){
		for(Gender gender : values()){
			if(gender.code == code){
				return gender;
			}
		}
		return null;
	}
}
