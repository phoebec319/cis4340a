public class R02_XP00_J {
    // defective code
    public void deleteFile(){
    File someFile = new File(”someFileName.txt”);
    // Do something with someFile
    someFile.delete();
    }
    // fixed code
    public void deleteFile( ) {
        File someFile = new File (”someFileName.txt”) ;
        // Do something with someFile
        if ( !someFile.delete()) {
        // Handle failure to delete the file
        }
    }        
}
