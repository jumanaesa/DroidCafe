//warood khalid alzayer
//bshayer saod alsaffar
//dhay majed alzaher
//raghad wadia alshuwkh
//seema hussain hilal

package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;

public class MainActivity extends AppCompatActivity {

    Button btnpay;
     private ActionMode mActionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnpay = findViewById(R.id.button);

        btnpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlret();
            }
        });

        TextView textView = findViewById(R.id.textView);
        textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (mActionMode != null) return false;
                mActionMode =
                        MainActivity.this.startActionMode(mActionModeCallback);
                v.setSelected(true);
                return true;
            }


            });

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (mActionMode != null) return false;
                mActionMode =
                        MainActivity.this.startActionMode(mActionModeCallback);
                v.setSelected(true);
                return true;
            }




        });

        TextView textView3 = findViewById(R.id.textView3);
        textView3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (mActionMode != null) return false;
                mActionMode =
                        MainActivity.this.startActionMode(mActionModeCallback);
                v.setSelected(true);
                return true;
            }
        });

        ImageView article_text = findViewById(R.id.imageView);
        registerForContextMenu(article_text);

        ImageView article_text2 = findViewById(R.id.imageView2);
        registerForContextMenu(article_text2);

        ImageView article_text3 = findViewById(R.id.imageView3);
        registerForContextMenu(article_text3);

    }

    private ActionMode.Callback mActionModeCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            mode.getMenuInflater().inflate(R.menu.action_bar, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            switch (item.getItemId()) {
                case R.id.action_share:

                    return true;
                case R.id.action_copy:

                    return true;
                default:
                    return false;
            }
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            mActionMode = null;
        }
    };

    private void openAlret(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Pay");
        builder.setMessage("Confirm Your Order");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();








    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_home:
                showhome();
                return true;
            case R.id.action_settings:
                showsettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showhome() {
    }

    private void showsettings() {
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.context_edit:
                editNote();
                return true;
            case R.id.context_share:
                shareNote();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    private void shareNote() {
    }

    private void editNote() {
        
    }




}




