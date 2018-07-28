package zhang.zhilong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import zhang.zhilong.alertdialog.AlertDialog;
import zhang.zhilong.alertdialog.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AlertDialog.Builder(this)
                .addDefaultAnimation()
                .setContentView(R.layout.layout_dialog)
                .show();
    }
}
