package www.ensch.submenus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String d1 = "submenu 1";
    String d2 = "submenu 2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.textView);
    }

    @Override
    public boolean  onCreateOptionsMenu(Menu menu){

        super.onCreateOptionsMenu(menu);


        SubMenu sub1= menu.addSubMenu(0,1,1,d1);
        sub1.setHeaderIcon(R.mipmap.ic_launcher);
        SubMenu sub2= menu.addSubMenu(0,2,2,d2);
        sub2.setHeaderIcon(R.mipmap.ic_launcher);

        MenuItem item3= sub1.add(0,3,3,"Option 3 " + d1);
        MenuItem item4= sub1.add(0,4,4,"Option 4 " + d1);
        MenuItem item5= sub1.add(0,5,5,"Option 5 " + d1);
        MenuItem item6= sub1.add(0,6,6,"Option 6 " + d1);

        MenuItem item7= sub2.add(0,7,7,"Option 7 " + d2);
        MenuItem item8= sub2.add(0,8,8,"Option 8 " + d2);
        MenuItem item9= sub2.add(0,9,9,"Option 9 " + d2);
        MenuItem item10= sub2.add(0,10,10,"Option 10 " + d2);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id= item.getItemId();
        if(id>2)
            tv.append("\n Usted puso: "+id);
        return true;
    }

}