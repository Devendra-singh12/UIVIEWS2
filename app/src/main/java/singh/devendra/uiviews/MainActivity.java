package singh.devendra.uiviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
{
    //   button, imageButton, checkBox, radioGroup,
    //   radioButton, toggleButton, switch
    //   radioGroup
    // add comment
         // backward compatibility

    private Button button;
    private ImageButton imageButton;
    private CheckBox checkBox;
    private RadioGroup radioGroup;
    private RadioButton radioButton1, radioButton2;
    private Switch aSwitch;
    private ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button2);
        imageButton = findViewById(R.id.imageButton);
        checkBox = findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radioGroup);
        radioButton1 = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        aSwitch = findViewById(R.id.switch1);
        toggleButton = findViewById(R.id.toggleButton);

        imageButton.setOnClickListener(new View.OnClickListener()
        {
            @Override // annotation
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "hellloo", Toast.LENGTH_SHORT).show();

            }
        });

         checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
         {
             @Override
             public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
             {
                 if (isChecked)
                 {
                     char gender = 'M';
                 }

             }
         });

         radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId)
             {
                 if (checkedId == R.id.radioButton)
                 {
                     Toast.makeText(MainActivity.this, "Singh", Toast.LENGTH_SHORT).show();
                 }

             }
         });
         aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
             {

             }
         });
         toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

             }
         });
    }

    public void method1(View view)
    {
        switch (view.getId())
        {
            case R.id.button2:
                Toast.makeText(this, "DEV", Toast.LENGTH_SHORT).show();
                break;
        }
      //  Toast.makeText(this, "Devendra" + "Singh" ,Toast.LENGTH_LONG).show();
    }
}
