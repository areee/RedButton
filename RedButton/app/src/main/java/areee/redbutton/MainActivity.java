package areee.redbutton;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private TextView clickCounter;
    private ImageButton redButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickCounter = (TextView)findViewById(R.id.clickCounter);
        redButton = (ImageButton)findViewById(R.id.redButton);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onRedButtonClick(View view) {
        String text = (String)clickCounter.getText();

        int newCounter = Integer.parseInt(text);

        if(newCounter>1){
            newCounter--;


        }else{

            Toast.makeText(this,R.string.you_won_text,Toast.LENGTH_LONG).show();

            newCounter=100;
        }

        String returnNewCounter = ""+newCounter;

        clickCounter.setText(returnNewCounter);


//        Drawable redButtonBackground = redButton.getBackground();

//        redButton.setBackground(getDrawable(R.drawable.red_button_2));

    }
}
