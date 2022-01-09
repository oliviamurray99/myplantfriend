package com.example.appone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;

Spinner spinner;
ImageView imageView;
TextView textView;

Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ctx = this;

        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_main2();

            }

            private void openActivity_main2() {
                Intent intent = new Intent(ctx, MainActivity2.class );
                startActivity(intent);
            }
        });







         spinner = (Spinner) findViewById(R.id.spinner);
         imageView=findViewById(R.id.imageView2);
         textView=(TextView) findViewById(R.id.textView);
         textView.setMovementMethod(new ScrollingMovementMethod());
         final String str[] ={"Cucumber", "Tomatoes","Green Peas","Basil","Kale"};




        ArrayAdapter<String> myAdapter=new ArrayAdapter<String> (MainActivity.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.names) );
        myAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line );
        spinner.setAdapter(myAdapter);
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(str[0].equals(spinner.getItemAtPosition(i).toString())) {
                    imageView.setImageResource(R.drawable.cucumber);
                    String html="<b>Description: </b>\n" +
                            "<p>This variety of garden vegetable is the cucumber. Cucumbers need an abundance of nutrition and water, as they are warm weather plants. They typically take around 60 days to harvest, however the end result is very rewarding. The three categories of cucumbers are slicing, picking and specialty cucumbers, leaving you with a variety of options to choose from. Cucumbers make a great addition to any garden!<p>\n" +
                            "\n" +
                            "<b>Sunlight:</b> " +
                            "<p>Cucumbers will grow best in full sunlight. If the cucumber does not have enough sunlight they will produce a lower yield as well as a low fruit set. At least 8 hours of sun a day is good. <p>\n" +
                            "\n" +
                            "<b>Potting Location:</b>" +
                            "<p>A growing site such as the ground or a trellis is a good spot to grow your cucumbers. Just make sure the location has adequate drainage and fertile soil.<p>\n" +
                            "\n" +
                            "<b>Temperature:</b> " +
                            "<p>Cucumbers like a warm, humid environment to grow in.<p>\n" +
                            "\n" +
                            "<b>Watering Instructions:</b> " +
                            "<p>Cucumbers need to be receiving an inch of water every week. <p> \n";
                    textView.setText(HtmlCompat.fromHtml(html,HtmlCompat.FROM_HTML_MODE_LEGACY) );
                }
                else if(str[1].equals(spinner.getItemAtPosition(i).toString())) {
                    imageView.setImageResource(R.drawable.tomatoes);
                    String html="<b>Description</b>: \n" +
                            "<p>This variety of garden vegetable is the heirloom tomato. This tomato comes in a diverse range of sizes, shapes and colours and is also quite rich in flavor. These tomatoes serve as fantastic additions in a sandwich or even a salad as they have a nice sweet and tangy taste.<p> \n" +
                            "\n" +
                            "<b>Sunlight:</b> \n" +
                            " <p>The heirloom tomatoes need to be planted in a spot with at least 6 hours of sunlight a day.<p> \n" +
                            "\n" +
                            "<b>Potting Location:</b> \n" +
                            " <p>A raised bed/pot/container is essential as the soil maintains a warmer temperature in these environments.<p>\n" +
                            "\n" +
                            "<b>Temperature: </b>\n" +
                            "<p>Temperature needs to be above 16 degrees for the tomato to grow.<p>\n" +
                            "\n" +
                            "<b>Watering Instructions:</b> \n " +
                            "<p>Water 2 times a day, preferably when there is still sunlight. Tomatoes need 1-2 inches of water a week.<p>\n";


                     textView.setText(HtmlCompat.fromHtml(html,HtmlCompat.FROM_HTML_MODE_LEGACY) );

//                    textView.setText( "Description: \n" +
//                            "This variety of garden vegetable is the heirloom tomato. This tomato comes in a diverse range of sizes, shapes and colours and is also quite rich in flavor. These tomatoes serve as fantastic additions in a sandwich or even a salad as they have a nice sweet and tangy taste. \n" +
//                            "\n" +
//                            "Care Instructions:" +
//                            "\n" +
//                            "Sunlight: The heirloom tomatoes need to be planted in a spot with at least 6 hours of sunlight a day. \n" +
//                            "\n" +
//                            "Potting Location: A raised bed/pot/container is essential as the soil maintains a warmer temperature in these environments. \n" +
//                            "\n" +
//                            "Temperature: Temperature needs to be above 16 degrees for the tomato to grow\n" +
//                            "\n" +
//                            "Watering Instructions: Water 2 times a day, preferably when there is still sunlight. Tomatoes need 1-2 inches of water a week.\n");
                }
                else if(str[2].equals(spinner.getItemAtPosition(i).toString())) {
                    imageView.setImageResource(R.drawable.greenpeas);
                    String html="<b>Description:</b> \n" +
                            "<p>This variety of garden vegetable is the green pea. The green pea is a cool season, frost hardy vegetable. These peas can be harvested and eaten both with the shell and without the shell, but either way they make a great addition to a salad or even in a stir fry. <p>\n" +
                            "\n" +
                            "<b>Sunlight</b>: " +
                            "<p>Green peas are best grown in a trellis with moderately light shade. <p>\n" +
                            "\n" +
                            "<b>Potting Location</b>: " +
                            "<p>When growing green peas, make sure to put mulch around the plants, to prevent the soil from getting too hot and too much moisture from building up. In addition, planting the peas in a well drained pot is a good option if they are not being planted directly into a garden.<p>\n" +
                            "\n" +
                            "<b>Temperature</b>: " +
                            "<p>These green peas grow best at 7 degrees celsius(45 degrees Fahrenheit) or higher. The key to success with these peas is making sure there is NO frost in sight before you start planting them.<p>\n" +
                            "\n" +
                            "<b>Watering Instructions</b>: " +
                            "<p>Green peas need no more than 1 inch of water per week. However they cannot thrive in dry soil, so make sure the plant is being watered enough so that it is moist at all times. <p>\n";

                    textView.setText(HtmlCompat.fromHtml(html,HtmlCompat.FROM_HTML_MODE_LEGACY) );
                }
                else if(str[3].equals(spinner.getItemAtPosition(i).toString())) {
                    imageView.setImageResource(R.drawable.basil);
                    String html="<b>Description: </b>\n" +
                            "<p>This variety of garden vegetable is the basil plant. This plant is a warm weather, and quite fragrant herb that is used in many dishes all over the world. The basil plant is quite easy to add to any garden, as it grows in the summer and has low maintenance. <p> \n" +
                            "\n" +
                            "<b>Sunlight:</b> " +
                            "<p>The basil plant needs to be grown in a spot that has at least 8 hours of sun everyday, however it can grow well in areas of partial sun too. <p>\n" +
                            "\n" +
                            "<b>Potting Location:</b> " +
                            "<p>A raised bed or container is a good location to plant your basil in, as these locations allow for better drainage. If your basil is going to be used for cooking, make sure to plant far away from any streets and use clean soil, free of any insecticides.<p> \n" +
                            "\n" +
                            "<b>Temperature:</b> " +
                            "<p>In order to plant basil outside, a temperature of 10 degrees celsius(or 50 degrees fahrenheit) should be reached. <p>\n" +
                            "\n" +
                            "<b>Watering Instructions:</b>" +
                            "<p> Similarity to several of the other garden vegetables, basil needs around 1 inch of water a week. Water deeply at least once a week to keep the soil moist and the roots growing well.<p> \n" +
                            "\n";

                    textView.setText(HtmlCompat.fromHtml(html,HtmlCompat.FROM_HTML_MODE_LEGACY) );
                }
                else if(str[4].equals(spinner.getItemAtPosition(i).toString())) {
                        imageView.setImageResource(R.drawable.kale3);
                    String html="<b>Description:</b> \n" +
                            "<p>This variety of garden vegetable is the kale plant. This descendant of the cauliflower family, is a very tough and hardy vegetable as it can stand very cold temperatures. The cool weather that this plant grows in brings out the sweet, yet slightly nutty flavor of this green. This leafy green is full of nutrients and will make a great, healthy addition to any meal.<p> \n" +
                            "\n" +
                            "<b>Sunlight: </b>" +
                            "<p>Kale grows best in full sun, however it can also do well in partial sun. The kale plant really only needs a few short hours of sunlight a day.<p> \n" +
                            "\n" +
                            "<b>Potting Location:</b> " +
                            "<p>Kale is grown quite well in potting beds, gardening beds or simple containers. You can plant your kale seeds either indoors, or they can be directly planted into your garden. <p>\n" +
                            "\n" +
                            "<b>Temperature:</b> " +
                            "<p>Kale is a vegetable that thrives in colder temperatures compared to other vegetables. For kale to grow the temperature needs to be around 13–24°C or 55–75°F. For a fall harvest, you would want to plant your kale 6-8 weeks before the first fall frost. <p>\n" +
                            "\n" +
                            "<b>Watering/feeding Instructions:</b>" +
                            "<p>In order for kale to thrive, it needs to be well watered and fed. If you dont get lots of rain in your area, you will need to give your kale plant around 1-1.5 inches of water per week. In addition, your kale plant should be fed with continuous release plant food. <p>\n";

                    textView.setText(HtmlCompat.fromHtml(html,HtmlCompat.FROM_HTML_MODE_LEGACY) );

                    }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}