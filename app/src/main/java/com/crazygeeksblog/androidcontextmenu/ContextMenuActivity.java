package com.crazygeeksblog.androidcontextmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ContextMenuActivity extends AppCompatActivity {
    private TextView tvContextMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);
        tvContextMenu = (TextView) findViewById(R.id.tvContextMenu);
        registerForContextMenu(tvContextMenu);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
        menu.setHeaderTitle("Select Action");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        // Handle the menu item selection
        switch (item.getItemId()) {
            case R.id.menuAdd:
                Toast.makeText(getApplicationContext(),
                        "Add option selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menuEdit:
                Toast.makeText(getApplicationContext(),
                        "Edit option selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menuDelete:
                Toast.makeText(getApplicationContext(),
                        "Delete option selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menuCancel:
                Toast.makeText(getApplicationContext(),
                        "Cancel option selected", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }

}
