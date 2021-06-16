package CILab.UnitTesting;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        int length = myString.length();
    	if (length == 1 || length == 0) {return true;}    	
    	if (Character.isUpperCase(myString.charAt(0)) == true) {
    		if (length == 2) {return true;}
    		else if (Character.isUpperCase(myString.charAt(1)) == true) {
    			for (int i = 2; i < length; i++) {
    	    		if (Character.isUpperCase(myString.charAt(i)) == false) {
    	    			return false;
    	    		}
    	    	}
    		}
    		else {
    			for (int i = 2; i < length; i++) {
    	    		if (Character.isUpperCase(myString.charAt(i)) == true) {
    	    			return false;
    	    		}
    	    	}
    		}
    	}
    	else {
    		if (Character.isUpperCase(myString.charAt(1)) == true) {return false;}
    		else if (length == 2) {return true;}
    		else {
    			for (int i = 2; i < length; i++) {
    	    		if (Character.isUpperCase(myString.charAt(i)) == true) {
    	    			return false;
    	    		}
    	    	}
    		}
    	}
    	return true;
    }

}

