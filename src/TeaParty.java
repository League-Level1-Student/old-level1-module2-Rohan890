public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted){
		if(isWoman == false && isKnighted == true) {
			return "Hello Sir " + name;
		}
		else if(isWoman == false && isKnighted == false){
			return "Hello Mr. " + name;
		}
		else if(isWoman == true && isKnighted == true) {
			return "Hello Lady " + name;
		}
		else {
			return "Hello Ms. " + name;
		}
	}

}

