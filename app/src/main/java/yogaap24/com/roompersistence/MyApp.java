package yogaap24.com.roompersistence;

import android.app.Application;
import android.arch.persistence.room.Room;

public class MyApp extends Application {
    public static AppDatabase db ;
    @Override
    public void onCreate() {
        super.onCreate();
        db = Room. databaseBuilder (getApplicationContext(),
                AppDatabase.class,"siswa.db").allowMainThreadQueries().build();
    }
}