/**
 * Cinemality
 * This application is created to allow the user to look up any any
 * information they would want for a movie they intend to buy, rent,
 * or watch in a theater. A user will be able to search for movies
 * by name, or category and compare prices across multiple online
 * stores to see which one has the best pricing. Additionally, the
 * application will also be able to provide the location of nearby
 * movie theaters, and their showtimes. This application is intended
 * to be the only app you will need when it comes to watching or
 * buying a movie
 *
 * @author Ryan Tran
 * @author Akshay Goel
 * @author Bryce Anderson
 *
 * This is the main activity that holds the sign-in screen.
 * This screen is loaded when the application starts
 */

package group1.tcss450.uw.edu.tcss450group1project;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
