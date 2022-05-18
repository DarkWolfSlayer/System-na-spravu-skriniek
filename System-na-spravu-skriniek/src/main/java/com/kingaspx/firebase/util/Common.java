package com.kingaspx.firebase.util;


import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Common {
    
    public static void initFirebase(){

    FileInputStream refreshToken = null;
        try {
            refreshToken = new FileInputStream("credentials.json");
            FirebaseOptions options = FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(refreshToken))
                    .setDatabaseUrl("https:https://test-3a635-default-rtdb.europe-west1.firebasedatabase.app")
                    .build();
            FirebaseApp.initializeApp(options);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex){
            Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                refreshToken.close();
            } catch (IOException ex) {
                Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}