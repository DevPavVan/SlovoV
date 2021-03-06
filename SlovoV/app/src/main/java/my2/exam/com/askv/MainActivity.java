package my2.exam.com.askv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;




public class MainActivity extends AppCompatActivity {
       private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
            initToolbar();

      /*  Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        if (toolbar != null){
            setSupportActionBar(toolbar);
            getSupportActionBar() .setDisplayHomeAsUpEnabled(true);
        }*/
        initializeNavigationDrawer(toolbar);


    }
        public void OnClik(View view){
                Intent intent = new Intent(this, Bible.class);
                startActivity(intent);
        }
        public void ONclik(View view){
                setContentView(R.layout.agg37);
        }

        private void initToolbar() {
                toolbar = (Toolbar) findViewById(R.id.toolbar);
                toolbar.setTitle(R.string.app_name);
                toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                                return false;
                        }
                });
                toolbar.inflateMenu(R.menu.menu_main);



        }




        private void initializeNavigationDrawer(final Toolbar toolbar) {
            new DrawerBuilder()
                    .withActivity(this)
                    .withToolbar(toolbar)
                    .withDisplayBelowToolbar(true)
                    .withActionBarDrawerToggleAnimated(true)
                    .addDrawerItems
                            (new PrimaryDrawerItem()
                                            .withName(R.string.item1),
                                    new SectionDrawerItem()
                                            .withName(R.string.item2),
                                    new SectionDrawerItem()
                                            .withName(R.string.item3),
                                    new SectionDrawerItem()
                                            .withName(R.string.item4),
                                    new SectionDrawerItem()
                                            .withName(R.string.item5),
                                    new SectionDrawerItem()
                                            .withName(R.string.item6),
                                    new SectionDrawerItem()
                                            .withName(R.string.item7),
                                    new SectionDrawerItem()
                                            .withName(R.string.item8),
                                    new SectionDrawerItem()
                                            .withName(R.string.item9),
                                    new SectionDrawerItem()
                                            .withName(R.string.item10),
                                    new SectionDrawerItem()
                                            .withName(R.string.item11),
                                    new SectionDrawerItem()
                                            .withName(R.string.item12),
                                    new SectionDrawerItem()
                                            .withName(R.string.item13),
                                    new SectionDrawerItem()
                                            .withName(R.string.item14),
                                    new SectionDrawerItem()
                                            .withName(R.string.item15),
                                    new SectionDrawerItem()
                                            .withName(R.string.item16),
                                    new SectionDrawerItem()
                                            .withName(R.string.item17),
                                    new SectionDrawerItem()
                                            .withName(R.string.item18),
                                    new SectionDrawerItem()
                                            .withName(R.string.item19),
                                    new SectionDrawerItem()
                                            .withName(R.string.item20),
                                    new SectionDrawerItem()
                                            .withName(R.string.item21),
                                    new SectionDrawerItem()
                                            .withName(R.string.item22),
                                    new SectionDrawerItem()
                                            .withName(R.string.item23),
                                    new SectionDrawerItem()
                                            .withName(R.string.item24),
                                    new SectionDrawerItem()
                                            .withName(R.string.item25),
                                    new SectionDrawerItem()
                                            .withName(R.string.item26),
                                    new SectionDrawerItem()
                                            .withName(R.string.item27),
                                    new SectionDrawerItem()
                                            .withName(R.string.item28),
                                    new SectionDrawerItem()
                                            .withName(R.string.item29),
                                    new SectionDrawerItem()
                                            .withName(R.string.item30),
                                    new SectionDrawerItem()
                                            .withName(R.string.item31),
                                    new SectionDrawerItem()
                                            .withName(R.string.item32),
                                    new SectionDrawerItem()
                                            .withName(R.string.item33),
                                    new SectionDrawerItem()
                                            .withName(R.string.item34),
                                    new SectionDrawerItem()
                                            .withName(R.string.item35),
                                    new SectionDrawerItem()
                                            .withName(R.string.item36),
                                    new SectionDrawerItem()
                                            .withName(R.string.item37),
                                    new SectionDrawerItem()
                                            .withName(R.string.item38),
                                    new SectionDrawerItem()
                                            .withName(R.string.item39),
                                    new SectionDrawerItem()
                                            .withName(R.string.item40),
                                    new SectionDrawerItem()
                                            .withName(R.string.item41),
                                    new SectionDrawerItem()
                                            .withName(R.string.item42),
                                    new SectionDrawerItem()
                                            .withName(R.string.item43),
                                    new SectionDrawerItem()
                                            .withName(R.string.item44),
                                    new SectionDrawerItem()
                                            .withName(R.string.item45),
                                    new SectionDrawerItem()
                                            .withName(R.string.item46),
                                    new SectionDrawerItem()
                                            .withName(R.string.item47),
                                    new SectionDrawerItem()
                                            .withName(R.string.item48),
                                    new SectionDrawerItem()
                                            .withName(R.string.item49),
                                    new SectionDrawerItem()
                                            .withName(R.string.item50),
                                    new SectionDrawerItem()
                                            .withName(R.string.item51),
                                    new SectionDrawerItem()
                                            .withName(R.string.item52),
                                    new SectionDrawerItem()
                                            .withName(R.string.item53),
                                    new SectionDrawerItem()
                                            .withName(R.string.item54),
                                    new SectionDrawerItem()
                                            .withName(R.string.item55),
                                    new SectionDrawerItem()
                                            .withName(R.string.item56),
                                    new SectionDrawerItem()
                                            .withName(R.string.item57),
                                    new SectionDrawerItem()
                                            .withName(R.string.item58),
                                    new SectionDrawerItem()
                                            .withName(R.string.item59),
                                    new SectionDrawerItem()
                                            .withName(R.string.item60),
                                    new SectionDrawerItem()
                                            .withName(R.string.item61),
                                    new SectionDrawerItem()
                                            .withName(R.string.item62),
                                    new SectionDrawerItem()
                                            .withName(R.string.item63),
                                    new SectionDrawerItem()
                                            .withName(R.string.item64),
                                    new SectionDrawerItem()
                                            .withName(R.string.item65),
                                    new SectionDrawerItem()
                                            .withName(R.string.item66)


                            )
                    .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                                                       @Override
                                                       public boolean onItemClick(AdapterView<?> adapterView, View view, int i, long l, IDrawerItem iDrawerItem) {

                                                           setContentView(R.layout.bible);
                                                           initToolbar();
                                                         /*  Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
                                                           if (toolbar != null){
                                                               setSupportActionBar(toolbar);
                                                               getSupportActionBar() .setDisplayHomeAsUpEnabled(true);
                                                           }*/
                                                           initializeNavigationDrawer(toolbar);
                                                           return false;
                                                       }
                                                   }
                    )


                    .build();
                //Это навигатор

    }




    /*There is no more Drawer.Result. To create a drawer use the new DrawerBuilder instead of the Drawer. The result is now a Drawer.
    There is no more AccountHeader.Result. To create a drawer use the new AccountHeaderBuilder instead of the AccountHeader. The result is now a AccountHeader.
            new Drawer() --> new DrawerBuilder(), Drawer.Result --> Drawer, new AccountHeader() --> new AccountHeaderBuilder(), AccountHeader.Result --> AccountHeader
    The onDrawerItemClick listener now returns a boolean defining if the event was consumed*/



}
