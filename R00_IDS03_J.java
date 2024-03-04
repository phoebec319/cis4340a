public class R00_IDS03_J{
    // defective code
    if (loginSuccessful){
        logger.severe(”User login succeeded for: ” + username);
        } e l s e {
        logger.severe(”User login failed for: ” + username);
        }
    // fixed code
    if(loginSuccessful){
        logger.severe(”User login succeeded for:” + sanitizeUser(username));
    }else{
        logger.severe(”User login failed for:” + sanitizeUser(username));
    }
    public String sanitizeUser(Stringusername){
        return Pattern.matches(”[A−Za−z0−9]+”, username))
            ? username : ”unauthorizeduser”;
    }
}
