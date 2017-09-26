package xyz.michaelobi.mvp.app.player;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import xyz.michaelobi.mvp.R;
import xyz.michaelobi.mvp.databinding.DemoActivityBinding;

/**
 * MVP
 * Michael Obi
 * 26 09 2017 8:33 PM
 */

public class DemoActivity extends AppCompatActivity implements DemoContract.View {

    private DemoActivityBinding viewBinding;
    private DemoContract.Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = DataBindingUtil.setContentView(this, R.layout.demo_activity);
        presenter = new DemoPresenter();
        presenter.attachView(this);
        viewBinding.setPresenter(presenter);
    }

    @Override
    public void setNumber(int number) {
        viewBinding.tvNumber.setText(String.valueOf(number));
    }
}
